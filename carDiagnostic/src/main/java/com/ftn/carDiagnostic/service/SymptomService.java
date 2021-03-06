package com.ftn.carDiagnostic.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ftn.carDiagnostic.dto.LoginDTO;
import com.ftn.carDiagnostic.model.Car;
import com.ftn.carDiagnostic.model.CarComponentsProblem;
import com.ftn.carDiagnostic.model.Log;
import com.ftn.carDiagnostic.model.User;
import com.ftn.carDiagnostic.model.UserStatus;
import com.ftn.carDiagnostic.model.fix.AirFlowPartsFix;
import com.ftn.carDiagnostic.model.fix.ElectricalPartsFix;
import com.ftn.carDiagnostic.model.fix.FluidPartsFix;
import com.ftn.carDiagnostic.model.fix.FuelInjectionPartsFix;
import com.ftn.carDiagnostic.model.fix.MechanicalPartsFix;
import com.ftn.carDiagnostic.model.parts.FuelInjectionParts;
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
		kSession.setGlobal("problems", new ArrayList<CarComponentsProblem>());
	}

	@Autowired
	private ElectricalPartsFixService electricalPartsFixService;

	@Autowired
	private MechanicalPartsFixService mechanicalPartsFixService;

	@Autowired
	private AirFlowPartsFixService airFlowPartsFixService;

	@Autowired
	private FluidPartsFixService fluidPartsFixService;

	@Autowired
	private FuelInjectionPartsFixService fluidInjectionPartsFixService;

	@Autowired
	private UserServiceImpl userService;

	@Autowired
	private CarService carService;

	@SuppressWarnings("unchecked")
	public List<String> insertVisualSymptom(VisualSymptom vs, User user) {
		vs.setExecutionTime(new Date());
		Car car = user.getCar();
		insertFixesSession();
		kSession.insert(car);
		kSession.insert(vs);
		kSession.getAgenda().getAgendaGroup("visual-symptom").setFocus();
		int fired = kSession.fireAllRules();
		System.out.println("Number of rules fired: " + fired);

		List<String> fixes = (ArrayList<String>) kSession.getGlobal("fixes");
		List<CarComponentsProblem> problems = (ArrayList<CarComponentsProblem>) kSession.getGlobal("problems");

		for (CarComponentsProblem carComponentsProblem : problems) {
			carComponentsProblem.setDate(new Date());
			car.getProblemHistory().add(carComponentsProblem);
		}

		carService.saveCar(car);

		return fixes;

	}

	@SuppressWarnings("unchecked")
	public List<String> insertAudioSymptom(AudioSymptom as, User user) {
		Car car = user.getCar();
		insertFixesSession();
		kSession.insert(car);
		kSession.insert(as);
		kSession.getAgenda().getAgendaGroup("audio-symptom").setFocus();
		int fired = kSession.fireAllRules();
		System.out.println("Number of rules fired: " + fired);

		List<String> fixes = (ArrayList<String>) kSession.getGlobal("fixes");
		List<CarComponentsProblem> problems = (ArrayList<CarComponentsProblem>) kSession.getGlobal("problems");

		for (CarComponentsProblem carComponentsProblem : problems) {
			carComponentsProblem.setDate(new Date());
			car.getProblemHistory().add(carComponentsProblem);
		}

		carService.saveCar(car);

		return fixes;
	}
	@SuppressWarnings("unchecked")
	public List<String> insertSmellSymptom(SmellSymptom ss, User user) {
		Car car = user.getCar();
		insertFixesSession();
		kSession.insert(car);
		kSession.insert(ss);
		kSession.getAgenda().getAgendaGroup("smell-symptom").setFocus();
		int fired = kSession.fireAllRules();
		System.out.println("Number of rules fired: " + fired);

		List<String> fixes = (ArrayList<String>) kSession.getGlobal("fixes");
		List<CarComponentsProblem> problems = (ArrayList<CarComponentsProblem>) kSession.getGlobal("problems");

		for (CarComponentsProblem carComponentsProblem : problems) {
			carComponentsProblem.setDate(new Date());
			car.getProblemHistory().add(carComponentsProblem);
		}

		carService.saveCar(car);

		return fixes;
	}

	@SuppressWarnings("unchecked")
	public List<String> insertFeelSymptom(FeelingSymptom fs, User user) {
		Car car = user.getCar();
		insertFixesSession();
		kSession.insert(car);
		kSession.insert(fs);
		kSession.getAgenda().getAgendaGroup("feeling-symptom").setFocus();
		int fired = kSession.fireAllRules();
		
		System.out.println("Number of rules fired: " + fired);

		List<String> fixes = (ArrayList<String>) kSession.getGlobal("fixes");
		List<CarComponentsProblem> problems = (ArrayList<CarComponentsProblem>) kSession.getGlobal("problems");

		for (CarComponentsProblem carComponentsProblem : problems) {
			carComponentsProblem.setDate(new Date());
			car.getProblemHistory().add(carComponentsProblem);
		}

		carService.saveCar(car);

		return fixes;
	}

	@SuppressWarnings("unchecked")
	public void insertLog(Log log, LoginDTO loginDTO) {
		insertFixesSession();
		kSession.insert(log);
		int fired = kSession.fireAllRules();
		System.out.println("Number of rules fired: " + fired);
		try {
			logs = (ArrayList<String>) kSession.getGlobal("fixes");
			if (logs.size() != 0) {
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

	public void insertFixesSession() {
		AirFlowPartsFix afpf = airFlowPartsFixService.getAFPF(2L);
		ElectricalPartsFix epf = electricalPartsFixService.getEPF(1L);
		FluidPartsFix fpf = fluidPartsFixService.getFPF(3L);
		FuelInjectionPartsFix fipf = fluidInjectionPartsFixService.getFIPF(4L);
		MechanicalPartsFix mpf = mechanicalPartsFixService.getMPF(1L);

		kSession.insert(afpf);
		kSession.insert(epf);
		kSession.insert(fpf);
		kSession.insert(fipf);
		kSession.insert(mpf);
	}

}
