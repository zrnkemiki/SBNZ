package com.ftn.carDiagnostic.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ftn.carDiagnostic.dto.LoginDTO;
import com.ftn.carDiagnostic.model.Log;
import com.ftn.carDiagnostic.model.User;
import com.ftn.carDiagnostic.model.UserStatus;
import com.ftn.carDiagnostic.model.fix.ElectricalPartsFix;
import com.ftn.carDiagnostic.model.symptoms.VisualSymptom;

import exceptions.UserDoesntExistException;

@Service
public class SymptomService {
	
	private final KieContainer kieContainer;
	private final KieSession kSession;
	private List<String> fixes;
	private List<String> logs;

	
	@Autowired
	public SymptomService(KieContainer kieContainer) {
		this.kieContainer = kieContainer;
		kSession = kieContainer.newKieSession("rulesSession");
		kSession.setGlobal("fixes", new ArrayList<String>());
	}
	
	@Autowired
	private ElectricalPartsFixService electricalPartsFixService;
	
	@Autowired
	private UserServiceImpl userService;
	
	
	@SuppressWarnings("unchecked")
	public List<String> insertSymptom(VisualSymptom vs) {
		vs.setExecutionTime(new Date());
		/*
		//For filling database
		ElectricalPartsFix test = new ElectricalPartsFix();
		test.GenerateFixes();
		electricalPartsFixService.saveEPF(test);
		*/
		
		ElectricalPartsFix epf = electricalPartsFixService.getEPF(1L);
		

		
		kSession.insert(epf);
		
		kSession.insert(vs);
		
		
		int fired = kSession.fireAllRules();
		System.out.println("Number of rules fired: " + fired);
		
		
		List<String> fixes = (ArrayList<String>) kSession.getGlobal("fixes");
        
		return fixes;
		
	}


	public void insertLog(Log log, LoginDTO loginDTO) {
		kSession.insert(log);
		int fired = kSession.fireAllRules();
		System.out.println("Number of rules fired: " + fired);
		try {
			logs = (ArrayList<String>) kSession.getGlobal("fixes");
			if(logs.size() != 0) {
				User currentUser = userService.getUserByUsername(loginDTO.getUsername());
				currentUser.setUserStatus(UserStatus.DEACTIVATED);
				userService.saveUser(currentUser);
				userService.sendDeactivationMail(currentUser);
			}
			for (String logTemp : logs) {
				System.out.println(logTemp);
			}
		} catch (Exception e) {
		
			
		}
		logs.clear();
			
	}


}
