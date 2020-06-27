package com.ftn.carDiagnostic.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ftn.carDiagnostic.model.fix.ElectricalPartsFix;
import com.ftn.carDiagnostic.model.symptoms.VisualSymptom;

@Service
public class VisualSymptomService {
	
	private final KieContainer kieContainer;
	private final KieSession kSession;

	
	@Autowired
	public VisualSymptomService(KieContainer kieContainer) {
		this.kieContainer = kieContainer;
		kSession = kieContainer.newKieSession("rulesSession");
		kSession.setGlobal("fixes", new ArrayList<String>());
	}
	
	@Autowired
	ElectricalPartsFixService electricalPartsFixService;
	
	
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


}
