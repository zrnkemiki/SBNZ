package com.ftn.carDiagnostic.controller;

import java.security.Principal;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ftn.carDiagnostic.dto.ReservationDTO;
import com.ftn.carDiagnostic.model.User;
import com.ftn.carDiagnostic.service.AppointmentService;
import com.ftn.carDiagnostic.service.UserService;

@RestController
@RequestMapping("/appointment")
public class AppointmentController {

	@Autowired
	private AppointmentService appointmentService;
	
	@Autowired
	private UserService userService;
	
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
		
		List<Date> available = appointmentService.getAvailables(reservationDTO);
		return new ResponseEntity<List<Date>>(available, HttpStatus.OK);
	}
	
	@PostMapping("/make-appointment")
	public ResponseEntity<?> makeAppointment(@RequestBody Date startDate, Principal principal) {
		User loggedUser = userService.getLoggedUser();
		return null;
		
	}
	
	
	@GetMapping("/proba")
	public ResponseEntity<?> proba() {
		ReservationDTO dto = new ReservationDTO();
		dto.setFix("Headlight replacement");
		dto.setDate(new Date());
		
		List<Date> ret = appointmentService.getAvailables(dto);
		for (Date d : ret) {
			System.out.println(d);
		}
		return ResponseEntity.ok("ok");
	}
}
