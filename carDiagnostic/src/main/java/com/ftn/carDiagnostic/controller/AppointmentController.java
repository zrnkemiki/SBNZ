package com.ftn.carDiagnostic.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ftn.carDiagnostic.dto.AppointmentDTO;
import com.ftn.carDiagnostic.helper.DTOConverter;
import com.ftn.carDiagnostic.model.Appointment;
import com.ftn.carDiagnostic.service.AppointmentService;

@RestController
public class AppointmentController {

	@Autowired
	private AppointmentService appointmentService;
	
	
	@PostMapping("/make-appointment")
	public ResponseEntity<?> addAppointment(@RequestBody AppointmentDTO appointmentDTO) {
		Appointment apt = DTOConverter.dtoToAppointment(appointmentDTO);
		appointmentService.insertAppointment(apt);
		
		return new ResponseEntity<>(HttpStatus.OK);
	}
}
