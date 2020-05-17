package com.ftn.carDiagnostic.proba;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Scanner;

import org.drools.core.ClassObjectFilter;
import org.kie.api.KieServices;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;
import org.kie.api.runtime.rule.FactHandle;

import com.ftn.carDiagnostic.model.AudioSymptom;
import com.ftn.carDiagnostic.model.ElectricalPartsFix;
import com.ftn.carDiagnostic.model.SmellSymptom;
import com.ftn.carDiagnostic.model.VisualSymptom;
import com.ftn.carDiagnostic.model.FluidParts;
import com.ftn.carDiagnostic.model.FluidPartsFix;
import com.ftn.carDiagnostic.model.MechanicalPartsFix;
public class Proba {

	public static void main(String[] args) {
		// testClassifyItem()
		test();
	}

	public static void test() {
		Scanner input = new Scanner(System.in);
		System.out.println("=================================");
		System.out.println("Bootstrapping the Rule Engine ...");
		// Bootstrapping a Rule Engine Session
		KieServices ks = KieServices.Factory.get();
		KieContainer kContainer = ks.getKieClasspathContainer();
		KieSession kSession = kContainer.newKieSession("rulesSession");
		// KieSession kSession = kContainer.newKieSession("test-session2");

		VisualSymptom vs= menu(input);

		ElectricalPartsFix epf = new ElectricalPartsFix();
		MechanicalPartsFix mpf = new MechanicalPartsFix();
		epf.TestFixes();

		kSession.insert(vs);
		kSession.insert(epf);
		kSession.insert(mpf);
		System.out.println("Facts in session: " + kSession.getFactCount());
		int fired = kSession.fireAllRules();
		System.out.println("No of rules fired: " + fired);
		System.out.println("Facts in session: " + kSession.getFactCount());
		

		VisualSymptom vs1= menu(input);
		kSession.insert(vs1);
		int fired1 = kSession.fireAllRules();
		System.out.println("No of rules fired: " + fired1);
		System.out.println("Posle 2 " + kSession.getFactCount());
		
		input.close();

        
        
        
	}
	//test
	public static VisualSymptom menu(Scanner input) {
		System.out.println("Choose symptom: \n");
		System.out.println("1.visual symptom");
		System.out.println("2.audio symptom");
		System.out.println("3.smell symptom");
		
		int option = input.nextInt();
		VisualSymptom vs = new VisualSymptom();
		AudioSymptom as = new AudioSymptom();
		if (option == 1) {
			vs = visualSymptomMenu(input);
		}
		
		return vs;
	}

	public static VisualSymptom visualSymptomMenu(Scanner input) {
		System.out.println("Choose symptom: \n");
		System.out.println("1.headlightNotWorking");
		System.out.println("2.taillightNotWorking");
		System.out.println("3.electricWindowNotWorking");
		System.out.println("4.oilPuddleUnderCar");
		System.out.println("5.fluidPuddle");
		System.out.println("6.whiteSmoke");
		System.out.println("7.blueSmoke");
		System.out.println("8.blackSmoke");
		System.out.println("9.batteryDashLight");
		System.out.println("x.More to be added on app frontend impl...");

		
		int option = input.nextInt();
		VisualSymptom vs = new VisualSymptom();

		if (option == 1) {
			vs.setHeadlightNotWorking(true);
		} else if (option == 2) {
			vs.setTaillightNotWorking(true);
		} else if (option == 3) {
			vs.setElectricWindowNotWorking(true);
		} else if (option == 4) {
			vs.setOilPuddleUnderCar(true);
		} else if (option == 5) {
			vs.setFluidPuddle(true);
		} else if (option == 6) {
			vs.setWhiteSmoke(true);
		} else if (option == 7) {
			vs.setBlueSmoke(true);
		} else if (option == 8) {
			vs.setBlackSmoke(true);
		} else if (option == 9) {
			vs.setBatteryDashLight(true);
		}

		return vs;
	}

	public static AudioSymptom audioSymptomMenu(Scanner input) {
		System.out.println("Choose symptom: \n");
		System.out.println("1.grinding");
		System.out.println("2.roaring");
		System.out.println("3.squealing");
		System.out.println("4.whistling");
		System.out.println("5.knocking");
		System.out.println("6.ticking");

		int option = input.nextInt();
		AudioSymptom as = new AudioSymptom();
		if (option == 1) {
			System.out.println("In progress");
		} else if (option == 2) {
			System.out.println("In progress");
		} else if (option == 3) {
			System.out.println("In progress");
		} else if (option == 4) {
			System.out.println("In progress");
		} else if (option == 5) {
			System.out.println("In progress");
		} else if (option == 6) {
			System.out.println("In progress");
		}
		return as;
	}

	public static SmellSymptom smellSymptomMenu(Scanner input) {
		System.out.println("Izaberite simptom:\n");
		System.out.println("1.burningSmell");
		System.out.println("2.rottenEggSmell");
		System.out.println("3.sweetSmell");
		System.out.println("4.wetOldSocksSmell");
		
		int option = input.nextInt();
		SmellSymptom ss = new SmellSymptom();
		System.out.println("In progress");
		return ss;
	}

}
