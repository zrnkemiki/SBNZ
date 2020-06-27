package com.ftn.carDiagnostic.controller;

import java.io.File;
import java.io.FileOutputStream;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ftn.carDiagnostic.model.symptoms.VisualSymptom;
import com.ftn.carDiagnostic.service.VisualSymptomService;


@RestController
@RequestMapping(value = "/visual-symptom")
@Transactional
public class SymptomController {
	
	private List<String> alerts;
	FileOutputStream fop = null;
	File file;

	private final VisualSymptomService visualSymptomService;

	@Autowired
	public SymptomController(VisualSymptomService visualSymptomService) {
		this.visualSymptomService = visualSymptomService;
	}
	

	@PostMapping(consumes = "application/json")
	public ResponseEntity<List<String>> addVisualSymptom(@RequestBody VisualSymptom visualSymptom) {
		System.out.println("Usao u add visual symptom controller");
		List<String> fixes = visualSymptomService.insertSymptom(visualSymptom);

		if (fixes != null) {
			for (String fix : fixes) {
				System.out.println(fix);
			}
		}
		
	
		
		System.out.println("Ovo je za front povratne vrednosti" + fixes);
		
		
		
		return new ResponseEntity<>(fixes, HttpStatus.OK);
		
	}
	
}
