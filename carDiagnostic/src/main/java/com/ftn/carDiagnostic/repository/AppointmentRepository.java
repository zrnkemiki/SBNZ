package com.ftn.carDiagnostic.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ftn.carDiagnostic.model.Appointment;

@Repository
public interface AppointmentRepository extends JpaRepository<Appointment, Long> {

	
}
