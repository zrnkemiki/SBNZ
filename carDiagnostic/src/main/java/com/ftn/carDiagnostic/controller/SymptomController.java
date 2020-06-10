package com.ftn.carDiagnostic.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ftn.carDiagnostic.model.symptoms.VisualSymptom;
import com.ftn.carDiagnostic.proba.Proba;

@RestController
@RequestMapping(value = "/visual-symptom")
public class SymptomController {
	

	@PostMapping(consumes = "application/json")
	public ResponseEntity<List<String>> addVehicle(@RequestBody VisualSymptom visualSymptom) {
		//VisualSymptom vs = new VisualSymptom();
		//NapravitiDTO
		//vs.setHeadlightNotWorking(true);
		Proba proba = new Proba();
		@SuppressWarnings("static-access")
		List<String> fixes = proba.test1(visualSymptom);
		
		System.out.println("Ovo je za front povratne vrednosti" + fixes);
		
		

	
		

		
		
		
		return new ResponseEntity<>(fixes, HttpStatus.OK);
		
	}
	
}
