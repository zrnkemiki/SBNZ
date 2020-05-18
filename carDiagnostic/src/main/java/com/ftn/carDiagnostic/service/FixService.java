package com.ftn.carDiagnostic.service;

import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ftn.carDiagnostic.model.symptoms.VisualSymptom;

@Service
public class FixService {

	private final KieContainer kieContainer;
	
	@Autowired
	public FixService(KieContainer kieContainer) {
		this.kieContainer = kieContainer;
	}
	
	public String getFixForVisualSymptom(VisualSymptom visualSymptom) {
		KieSession kieSession = kieContainer.newKieSession("ruleSession");
		kieSession.insert(visualSymptom);
		kieSession.fireAllRules();
		kieSession.dispose();
		
		// srediti da pravilo vraca objekat Fix
		
		return "";
	}
}
