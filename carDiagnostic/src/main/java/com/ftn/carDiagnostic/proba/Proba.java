package com.ftn.carDiagnostic.proba;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.kie.api.KieServices;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;

import com.ftn.carDiagnostic.model.fix.AirFlowPartsFix;
import com.ftn.carDiagnostic.model.fix.ElectricalPartsFix;
import com.ftn.carDiagnostic.model.fix.MechanicalPartsFix;
import com.ftn.carDiagnostic.model.symptoms.AudioSymptom;
import com.ftn.carDiagnostic.model.symptoms.FeelingSymptom;
import com.ftn.carDiagnostic.model.symptoms.SmellSymptom;
import com.ftn.carDiagnostic.model.symptoms.VisualSymptom;

public class Proba {
/*
	public static void main(String[] args) {
		// testClassifyItem()
		test();
	}
	*/
	/* Ovo je samo testna klasa koju koristimo kako bi pravili potrebne objekte, ubacivali ih u bazu znanja i
	 * proveravali da li se pravila okidaju kako treba, odnosno da li kao povratnu vrednost dobijamo odgovarajucu popravku
	 * 
	 * Sistem funkcionise po principu: Korisnik unosi Simptom -> Simptom se setuje -> Pravilo -> Problem -> Pravilo -> Popravka -> Korisnik
	 * 
	 * Napomena** Trenutno aplikacija funkcionise da na osnovu samo jednog simptoma setuje problem, kasnije ce biti dodata dodatna pitanja korisniku,
	 * o simptomima itd kako bi aplikacija sto precizinije dosla do problema.
	 * 
	 * Trenutno su implementirane dve grupe pravila, prilikom cega izvrsavanje pravila iz prve grupe, okida pravila iz druge grupe.
	 * 
	 * U nastavku je dat deo koda za konzolnu aplikaciju, i mogucnost prikaza i testiranja dosadasnje implementacije.
	 */

	/*
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
			System.out.println("4. Feeling symptom");
			System.out.println("0. Exit");

			option = input.nextInt();
			VisualSymptom vs = new VisualSymptom();
			AudioSymptom as = new AudioSymptom();
			SmellSymptom ss = new SmellSymptom();
			FeelingSymptom fs = new FeelingSymptom();
			if (option == 1) {
				vs = visualSymptomMenu(input);
				kSession.insert(vs);
			} else if (option == 2) {
				as = audioSymptomMenu(input);
				kSession.insert(as);
			} else if (option == 3) {
				ss = smellSymptomMenu(input);
				kSession.insert(ss);
			} else if (option == 4) {
				fs = feelingSymptomMenu(input);
				kSession.insert(fs);
			}

			// VisualSymptom vs = menu(input);

			ElectricalPartsFix epf = new ElectricalPartsFix();
			MechanicalPartsFix mpf = new MechanicalPartsFix();
			AirFlowPartsFix apf = new AirFlowPartsFix();
			// MechanicalPartsFix mpf = new MechanicalPartsFix();
			epf.TestFixes();
			mpf.TestFixes();
			apf.TestFixes();

			
			kSession.insert(epf);
			kSession.insert(mpf);
			kSession.insert(apf);
			// kSession.insert(mpf);
			int fired = kSession.fireAllRules();
			System.out.println("No of rules fired: " + fired);
			System.out.println("=-=-=-=-=-=-=-=-=END-=-=-=-=-=-=-=-=-\n");
		}
		

	}
*/
	
	public static List<String> test1(VisualSymptom vs) {
		System.out.println("Bootstrapping the Rule Engine ...");
		// Bootstrapping a Rule Engine Session
		KieServices ks = KieServices.Factory.get();
		//KieContainer kContainer = ks.getKieClasspathContainer();
		KieContainer kContainer = ks.newKieClasspathContainer();
		KieSession kSession = kContainer.newKieSession("rulesSession");
		// KieSession kSession = kContainer.newKieSession("test-session2");
		kSession.setGlobal("fixes", new ArrayList<String>());
		System.out.println("Ovo je ulazni podatak:" + vs.isHeadlightNotWorking());
		
		
				
		kSession.insert(vs);
		

		// VisualSymptom vs = menu(input);

		ElectricalPartsFix epf = new ElectricalPartsFix();
		MechanicalPartsFix mpf = new MechanicalPartsFix();
		AirFlowPartsFix apf = new AirFlowPartsFix();
		// MechanicalPartsFix mpf = new MechanicalPartsFix();
		epf.TestFixes();
		mpf.TestFixes();
		apf.TestFixes();

		
		kSession.insert(epf);
		kSession.insert(mpf);
		kSession.insert(apf);
		// kSession.insert(mpf);
		int fired = kSession.fireAllRules();
		System.out.println("No of rules fired: " + fired);
		System.out.println("=-=-=-=-=-=-=-=-=END-=-=-=-=-=-=-=-=-\n");
		
        List<String> fixes = (ArrayList<String>) kSession.getGlobal("fixes");
        return fixes;
		
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
		System.out.println("9. Engine won't start");

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
			vs.setEngineStartProblem(true);
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
			as.setGrinding(true);;
		} else if (option == 2) {
			System.out.println("In progress!");
		} else if (option == 3) {
			System.out.println("In progress!");
		} else if (option == 4) {
			as.setWhistling(true);
		} else if (option == 5) {
			as.setKnocking(true);
		} else if (option == 6) {
			as.setTicking(true);
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
		System.out.println("1. Poor Braking");
		System.out.println("2. Bouncing");
		System.out.println("3. Shaking");
		System.out.println("4. Long Starting");
		System.out.println("5. Twitching");
		System.out.println("6. Ride is uncomfortable");
		System.out.println("7. Poor engine Performance");

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
			fs.setRidesUncomfortable(true);
		} else if (option == 7) {
			System.out.println("In progress");
		}
		return fs;
	}

}
