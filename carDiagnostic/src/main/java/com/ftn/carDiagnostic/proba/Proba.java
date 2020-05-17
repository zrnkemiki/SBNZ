package com.ftn.carDiagnostic.proba;

import java.util.Scanner;

import org.kie.api.KieServices;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;

import com.ftn.carDiagnostic.model.fix.ElectricalPartsFix;
import com.ftn.carDiagnostic.model.symptoms.AudioSymptom;
import com.ftn.carDiagnostic.model.symptoms.FeelingSymptom;
import com.ftn.carDiagnostic.model.symptoms.SmellSymptom;
import com.ftn.carDiagnostic.model.symptoms.VisualSymptom;

public class Proba {

	public static void main(String[] args) {
		// testClassifyItem()
		test();
	}

	public static void test() {
		Scanner input = new Scanner(System.in);
		System.out.println("\n=================================");
		System.out.println("Bootstrapping the Rule Engine ...");
		// Bootstrapping a Rule Engine Session
		KieServices ks = KieServices.Factory.get();
		KieContainer kContainer = ks.getKieClasspathContainer();
		KieSession kSession = kContainer.newKieSession("rulesSession");
		// KieSession kSession = kContainer.newKieSession("test-session2");
		int option = -1;
		while (option != 0) {
			System.out.println("=-=-=-=-=-=--=START=-=-=-=-=-=-=-");

			System.out.println("Please choose symptom type: \n");
			System.out.println("1. Visual symptom");
			System.out.println("2. Audio symptom");
			System.out.println("3. Smell symptom");
			System.out.println("0. Exit");

			option = input.nextInt();
			VisualSymptom vs = new VisualSymptom();
			AudioSymptom as = new AudioSymptom();
			SmellSymptom ss = new SmellSymptom();
			FeelingSymptom fs = new FeelingSymptom();
			if (option == 1) {
				vs = visualSymptomMenu(input);
			} else if (option == 2) {
				as = audioSymptomMenu(input);
			} else if (option == 3) {
				ss = smellSymptomMenu(input);
			} else if (option == 4) {
				fs = feelingSymptomMenu(input);
			}

			// VisualSymptom vs = menu(input);

			ElectricalPartsFix epf = new ElectricalPartsFix();
			// MechanicalPartsFix mpf = new MechanicalPartsFix();
			epf.TestFixes();

			kSession.insert(vs);
			kSession.insert(epf);
			// kSession.insert(mpf);
			int fired = kSession.fireAllRules();
			System.out.println("No of rules fired: " + fired);
			System.out.println("=-=-=-=-=-=-=-=-=END-=-=-=-=-=-=-=-=-\n");
		}

	}

	public static VisualSymptom visualSymptomMenu(Scanner input) {
		System.out.println("Choose visual symptom: \n");
		System.out.println("1. Headlight Not Working");
		System.out.println("2. Taillight Not Working");
		System.out.println("3. Electric Window Not Working");
		System.out.println("4. Oil Puddle Under The Car");
		System.out.println("5. Fluid Puddle");
		System.out.println("6. White Smoke On Exhaust");
		System.out.println("7. Blue Smoke On Exhaust");
		System.out.println("8. Black Smoke On Exhaust");
		System.out.println("9. Battery Light is ON on the dash board");

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
			// TO-DO
		} else if (option == 5) {
			vs.setFluidPuddle(true);
			// TO-DO
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
		System.out.println("1. grinding");
		System.out.println("2. roaring");
		System.out.println("3. squealing");
		System.out.println("4. whistling");
		System.out.println("5. knocking");
		System.out.println("6. ticking");

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
		System.out.println("1. burningSmell");
		System.out.println("2. rottenEggSmell");
		System.out.println("3. sweetSmell");
		System.out.println("4. wetOldSocksSmell");

		int option = input.nextInt();
		SmellSymptom ss = new SmellSymptom();
		if (option == 1) {
			System.out.println("In progress");
		} else if (option == 2) {
			System.out.println("In progress");
		} else if (option == 3) {
			System.out.println("In progress");
		} else if (option == 4) {
			System.out.println("In progress");
		}
		return ss;
	}

	public static FeelingSymptom feelingSymptomMenu(Scanner input) {
		System.out.println("Izaberite simptom:\n");
		System.out.println("1. PoorBraking");
		System.out.println("2. Bouncing");
		System.out.println("3. Shaking");
		System.out.println("4. LongStarting");
		System.out.println("5. Twitching");
		System.out.println("6. RidesUncomfortable");
		System.out.println("7. PoorPerformance");

		int option = input.nextInt();
		FeelingSymptom fs = new FeelingSymptom();
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
		} else if (option == 7) {
			System.out.println("In progress");
		}
		return fs;
	}

}
