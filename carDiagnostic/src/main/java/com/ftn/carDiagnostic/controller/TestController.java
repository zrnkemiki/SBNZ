package com.ftn.carDiagnostic.controller;

import java.security.Principal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.ftn.carDiagnostic.model.Car;
import com.ftn.carDiagnostic.model.CarComponentsProblem;
import com.ftn.carDiagnostic.model.User;
import com.ftn.carDiagnostic.model.fix.ElectricalPartsFix;
import com.ftn.carDiagnostic.model.fix.MechanicalPartsFix;
import com.ftn.carDiagnostic.model.parts.ElectricalParts;
import com.ftn.carDiagnostic.security.TokenUtils;
import com.ftn.carDiagnostic.service.CarService;
import com.ftn.carDiagnostic.service.ElectricalPartsFixService;
import com.ftn.carDiagnostic.service.MechanicalPartsFixService;
import com.ftn.carDiagnostic.service.UserServiceImpl;

@RestController
public class TestController {
	
	@Autowired
	ElectricalPartsFixService eservice;
	
	@Autowired
	MechanicalPartsFixService mservice;
	
	@Autowired
	CarService carService;
	
	@Autowired
	UserServiceImpl userService;
	
	@Autowired
	TokenUtils tokenutils;
	
	
	@GetMapping(value = "fillDB")
	public void fillDB() {
		ElectricalPartsFix epf = new ElectricalPartsFix();
		epf.GenerateFixes();
		
		System.out.println(epf.getBatteryFix().get(0));
		
		MechanicalPartsFix mpf = new MechanicalPartsFix();
		mpf.GenerateFixes();
		
		epf = eservice.saveEPF(epf);
		mpf = mservice.saveMPF(mpf);
		
		Car car = new Car();
		car.setBrand("Audi");
		car.setEngineType("2.0 TDI");
		car.setMilage("100000");
		car.setYear("2015");
		car.setModel("A4");
		
		List<CarComponentsProblem> problemi = new ArrayList<CarComponentsProblem>();
		
		ElectricalParts headlight = new ElectricalParts();
		headlight.setHeadlight(true);
		headlight.setDate(new Date());
		headlight.setMilage(98000);
		
		ElectricalParts taillight = new ElectricalParts();
		taillight.setTailLight(true);
		taillight.setDate(new Date());
		taillight.setMilage(95000);
		
		problemi.add(headlight);
		problemi.add(taillight);
		
		car.setProblemHistory(problemi);
		
		carService.saveCar(car);
		
	}
	
	@GetMapping(value = "getCar")
	public void getCar() {
		Car car = carService.getCar(2L);
		List<CarComponentsProblem> problemi = car.getProblemHistory();
		for (CarComponentsProblem carComponentsProblem : problemi) {
			System.out.println(carComponentsProblem);
		}
		
		ElectricalParts novi = new ElectricalParts();
		novi.setBattery(true);
		novi.setDate(new Date());
		novi.setMilage(80000);
		
		car.getProblemHistory().add(novi);
		
		carService.saveCar(car);
		
		System.out.println("SACUVAO-------------------------------------");
		
		Car car1 = carService.getCar(2L);
		List<CarComponentsProblem> problemi1 = car1.getProblemHistory();
		for (CarComponentsProblem carComponentsProblem : problemi1) {
			ElectricalParts ep = (ElectricalParts) carComponentsProblem;
			System.out.println(ep.isBattery());
			System.out.println(ep.isHeadlight());
			System.out.println(ep.isTailLight());
		}
		
		
		
	}
	

	

}
