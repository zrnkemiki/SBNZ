package com.ftn.carDiagnostic.controller;

import java.security.Principal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ftn.carDiagnostic.model.Car;
import com.ftn.carDiagnostic.model.User;
import com.ftn.carDiagnostic.service.CarService;
import com.ftn.carDiagnostic.service.UserServiceImpl;

@RestController
@RequestMapping(value = "/car")
public class CarController {
	
	@Autowired
	CarService carService;
	
	@Autowired
	UserServiceImpl userService;
	
	@GetMapping(value = "/getByUser/{param}", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<?> getVehicle(@PathVariable("param") String id, Principal principal) {
		User u = userService.getUserByUsername(id);
		Car car = carService.getCar(u.getCarId());
		return new ResponseEntity<>(car, HttpStatus.OK);
	}

}
