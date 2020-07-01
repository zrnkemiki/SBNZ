package com.ftn.carDiagnostic.controller;

import java.io.File;
import java.io.FileOutputStream;
import java.security.Principal;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ftn.carDiagnostic.model.User;
import com.ftn.carDiagnostic.model.symptoms.AudioSymptom;
import com.ftn.carDiagnostic.model.symptoms.FeelingSymptom;
import com.ftn.carDiagnostic.model.symptoms.SmellSymptom;
import com.ftn.carDiagnostic.model.symptoms.VisualSymptom;
import com.ftn.carDiagnostic.service.SymptomService;
import com.ftn.carDiagnostic.service.UserServiceImpl;


@RestController
@RequestMapping(value = "/symptom")
@Transactional
public class SymptomController {
	
	private List<String> alerts;
	private FileOutputStream fop = null;
	private File file;

	private final SymptomService symptomService;
	
	@Autowired
	UserServiceImpl userService;

	@Autowired
	public SymptomController(SymptomService symptomService) {
		this.symptomService = symptomService;
	}
	

	@PostMapping(value = "/visual-symptom" ,consumes = "application/json")
	public ResponseEntity<List<String>> addVisualSymptom(@RequestBody VisualSymptom visualSymptom, Principal principal) {
		User user = userService.getLoggedUser();
		List<String> fixes = symptomService.insertVisualSymptom(visualSymptom);

		if (fixes != null) {
			for (String fix : fixes) {
				System.out.println(fix);
			}
		}
		System.out.println("Ovo je za front povratne vrednosti" + fixes);
		
		return new ResponseEntity<>(fixes, HttpStatus.OK);		
	}
	
	@PostMapping(value = "/audio-symptom" ,consumes = "application/json")
	public ResponseEntity<List<String>> addAudioSymptom(@RequestBody AudioSymptom audioSymptom, Principal principal) {
		
		return null;
		
	}
	
	@PostMapping(value = "/smell-symptom" ,consumes = "application/json")
	public ResponseEntity<List<String>> addSoundSymptom(@RequestBody SmellSymptom smellSymptom, Principal principal) {
		return null;
	}
	
	@PostMapping(value = "/feeling-symptom" ,consumes = "application/json")
	public ResponseEntity<List<String>> addFeelingSymptom(@RequestBody FeelingSymptom feelingSymptom, Principal principal) {
		return null;
	}
	
}
