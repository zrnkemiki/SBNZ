package com.ftn.carDiagnostic.proba;


import java.util.ArrayList;
import java.util.List;

import org.kie.api.KieServices;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;

import com.ftn.carDiagnostic.model.ElectricalPartsFix;
import com.ftn.carDiagnostic.model.VisualSymptoms;

public class Proba {
	
	public static void main(String[] args) {
		//testClassifyItem()
		test();
	}
	



	public static void test() {
		System.out.println( "Bootstrapping the Rule Engine ..." );
        // Bootstrapping a Rule Engine Session
        KieServices ks = KieServices.Factory.get();
        KieContainer kContainer = ks.getKieClasspathContainer();
        KieSession kSession =  kContainer.newKieSession("rulesSession");
        //KieSession kSession =  kContainer.newKieSession("test-session2");
        
        
        
        
        VisualSymptoms vs = new VisualSymptoms();
        vs.setHeadlightNotWorking(true);
        //vs.setTaillightNotWorking(true);
        vs.setElectricWindowNotWorking(true);
        vs.setEngineStartProblem(true);
        
        ElectricalPartsFix epf = new ElectricalPartsFix();
        epf.TestFixes();
        
        kSession.insert(vs);
        kSession.insert(epf);
        
        int fired = kSession.fireAllRules();
        System.out.println(fired);
        
        
        
        
        
        
        
	}
	
	
}
