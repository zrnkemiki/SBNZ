package com.ftn.carDiagnostic.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ftn.carDiagnostic.model.Log;
import com.ftn.carDiagnostic.model.fix.ElectricalPartsFix;
import com.ftn.carDiagnostic.model.symptoms.AudioSymptom;
import com.ftn.carDiagnostic.model.symptoms.FeelingSymptom;
import com.ftn.carDiagnostic.model.symptoms.SmellSymptom;
import com.ftn.carDiagnostic.model.symptoms.VisualSymptom;

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
	
	
	@SuppressWarnings("unchecked")
	public List<String> insertVisualSymptom(VisualSymptom vs) {
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
	
	public List<String> insertAudioSymptom(AudioSymptom as) {
		kSession.insert(as);
		int fired = kSession.fireAllRules();
		System.out.println("[SymptomService insertAudioSymptom()] Number of rules fired: " + fired);
		List<String> fixes = (ArrayList<String>) kSession.getGlobal("fixes");
		return fixes;
	}
	
	public List<String> insertSmellSymptom(SmellSymptom ss) {
		kSession.insert(ss);
		int fired = kSession.fireAllRules();
		System.out.println("[SymptomService insertSmellSymptom()] Number of rules fired: " + fired);
		List<String> fixes = (ArrayList<String>) kSession.getGlobal("fixes");
		return fixes;
	}
	
	public List<String> insertFeelSymptom(FeelingSymptom fs) {
		kSession.insert(fs);
		int fired = kSession.fireAllRules();
		System.out.println("[SymptomService insertFeelingSymptom()] Number of rules fired: " + fired);
		List<String> fixes = (ArrayList<String>) kSession.getGlobal("fixes");
		return fixes;
	}


	public List<String> insertLog(Log log) {
		kSession.insert(log);
		int fired = kSession.fireAllRules();
		System.out.println("Number of rules fired: " + fired);
		try {
			logs = (ArrayList<String>) kSession.getGlobal("fixes");
			for (String logTemp : logs) {
				System.out.println(logTemp);
			}
		} catch (Exception e) {
		
		}
		return logs;
		
	}


}
