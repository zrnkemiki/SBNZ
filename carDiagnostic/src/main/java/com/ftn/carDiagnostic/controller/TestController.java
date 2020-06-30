package com.ftn.carDiagnostic.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ftn.carDiagnostic.model.fix.ElectricalPartsFix;
import com.ftn.carDiagnostic.model.fix.MechanicalPartsFix;
import com.ftn.carDiagnostic.service.ElectricalPartsFixService;
import com.ftn.carDiagnostic.service.MechanicalPartsFixService;

@RestController
public class TestController {
	
	@Autowired
	ElectricalPartsFixService eservice;
	
	@Autowired
	MechanicalPartsFixService mservice;
	
	
	@GetMapping(value = "fillDB")
	public void fillDB() {
		ElectricalPartsFix epf = new ElectricalPartsFix();
		epf.GenerateFixes();
		
		System.out.println(epf.getBatteryFix().get(0));
		
		MechanicalPartsFix mpf = new MechanicalPartsFix();
		mpf.GenerateFixes();
		
		epf = eservice.saveEPF(epf);
		mpf = mservice.saveMPF(mpf);
	}

}
