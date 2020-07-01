package com.ftn.carDiagnostic.controller;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ftn.carDiagnostic.dto.ReservationDTO;
import com.ftn.carDiagnostic.service.AppointmentService;

@RestController
public class AppointmentController {

	@Autowired
	private AppointmentService appointmentService;
	
/*	
	@PostMapping("/make-appointment")
	public ResponseEntity<?> addAppointment(@RequestBody AppointmentDTO appointmentDTO) {
		Appointment apt = DTOConverter.dtoToAppointment(appointmentDTO);
		
		appointmentService.insertAppointment(apt);
		
		return new ResponseEntity<>(HttpStatus.OK);
	}
*/
	
	
	@PostMapping("/available-appointments")
	public ResponseEntity<?> getAvailableAppointments(@RequestBody ReservationDTO reservationDTO) {
		
		appointmentService.getAvailables(reservationDTO);
		return null;
		
	}
	
	@GetMapping("/proba")
	public ResponseEntity<?> proba() {
		ReservationDTO dto = new ReservationDTO();
		dto.setFix("Headlight replacement");
		dto.setDate(new Date());
		
		appointmentService.getAvailables(dto);
		return ResponseEntity.ok("ok");
	}
}
