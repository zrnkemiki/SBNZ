package com.ftn.carDiagnostic.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.ftn.carDiagnostic.model.symptoms.VisualSymptom;
import com.ftn.carDiagnostic.service.FixService;

@RestController
public class FixController {

	@Autowired
	private FixService fixService;
	
	@RequestMapping(
			value = "/getVisualFix",
			method = RequestMethod.POST)
	public String getFixForVisualSymptom(@RequestBody VisualSymptom visualSymptom) {
		String fix = fixService.getFixForVisualSymptom(visualSymptom);
		return fix;
	}
}
