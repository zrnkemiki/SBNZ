package com.ftn.carDiagnostic.repository;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ftn.carDiagnostic.model.Appointment;

@Repository
public interface AppointmentRepository extends JpaRepository<Appointment, Long> {

	List<Appointment> findByStartTimeBetween(Date dateBegin, Date dateEnd);
	
	List<Appointment> findByStartTimeBetweenOrderByStartTime(Date dateBegin, Date dateEnd);
	
}
