package com.ftn.carDiagnostic.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ftn.carDiagnostic.model.Car;
import com.ftn.carDiagnostic.model.fix.ElectricalPartsFix;
@Repository
public interface CarRepository extends JpaRepository<Car, Long>{

	@SuppressWarnings("unchecked")
	Car save(Car car);
}
