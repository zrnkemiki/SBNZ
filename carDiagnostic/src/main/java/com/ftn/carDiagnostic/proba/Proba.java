package com.ftn.carDiagnostic.proba;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

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
        
        
        System.out.println("Izaberite simptom:\n");
        System.out.println("1.Ne radi mi far.");
        System.out.println("2.Ne radi mi elektricni prozor.");
        System.out.println("3.Automobil ne moze da upali.");
        
        Scanner input = new Scanner(System.in);
        int option = input.nextInt();
        
        VisualSymptoms vs = new VisualSymptoms();
        if(option == 1) {
            vs.setHeadlightNotWorking(true);
        }
        else if(option == 2) {
            vs.setElectricWindowNotWorking(true);
        }
        else if(option ==3) {

            vs.setEngineStartProblem(true);
        }
        
        ElectricalPartsFix epf = new ElectricalPartsFix();
        epf.TestFixes();
        
        kSession.insert(vs);
        kSession.insert(epf);
        
        int fired = kSession.fireAllRules();
        System.out.println("No of rules fired: " + fired);
        
        
        
        
        
        
        
	}
	
	
}
