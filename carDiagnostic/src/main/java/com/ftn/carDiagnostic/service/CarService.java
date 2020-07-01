package com.ftn.carDiagnostic.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ftn.carDiagnostic.model.Car;
import com.ftn.carDiagnostic.repository.CarRepository;
@Service
public class CarService {
	
	@Autowired
	private CarRepository carRepository;

	public Car saveCar(Car car) {
		carRepository.save(car);
		return car;
	}
	
	public Car getCar(Long id) {
		return carRepository.findById(id).orElse(null);
	}
	
	public List<Car> findAll(){
		return carRepository.findAll();
	}



}
