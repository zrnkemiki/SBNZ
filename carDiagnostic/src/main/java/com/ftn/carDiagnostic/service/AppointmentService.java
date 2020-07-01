package com.ftn.carDiagnostic.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.apache.commons.lang.time.DateUtils;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ftn.carDiagnostic.dto.ReservationDTO;
import com.ftn.carDiagnostic.helper.DTOConverter;
import com.ftn.carDiagnostic.model.Appointment;
import com.ftn.carDiagnostic.repository.AppointmentRepository;

@Service
public class AppointmentService {

	@Autowired
	private AppointmentRepository appointmentRepository;
	
	private final KieContainer kieContainer;
	private final KieSession kSession;
	
	@Autowired
	public AppointmentService(KieContainer kieContainer) {
		this.kieContainer = kieContainer;
		kSession = kieContainer.newKieSession("rulesSession");
		kSession.setGlobal("timeNeeded", new ArrayList<String>());
		
	}
	
	
	public Appointment findById(Long id) {
		return appointmentRepository.findById(id).orElse(null);
	}
	
	public List<Appointment> findByDateBetween(Date dateStart, Date dateEnd) {
		return appointmentRepository.findByDateBetween(dateStart, dateEnd);
	}
	
	
	public void getAvailables(ReservationDTO resDTO) {
		kSession.insert(resDTO);
		int fired = kSession.fireAllRules();
		System.out.println("[getAvailables() in AppointmentService] Number of rules fired: " + fired);
		
		List<String> timeNeeded = null;
		try {

			timeNeeded = (ArrayList<String>) kSession.getGlobal("timeNeeded");
			System.out.println("Time needed for fixing [" + resDTO.getFix() + "]: " + timeNeeded.get(0));
			
		} catch (Exception e) {
			System.out.println("ERROR in [getAvailables() in AppointmentService]: " + e.getMessage());
		}
		
		// nadji sve koji su vec zakazani i probaj da uglavis ovaj termin
		Date startDate = DTOConverter.makeStartDate(resDTO.getDate());
		Date endDate = DTOConverter.makeEndDate(resDTO.getDate());
		List<Appointment> booked = findByDateBetween(startDate, endDate);
		
		int timeNeededInt = Integer.parseInt(timeNeeded.get(0));
		
		List<Date> available = new ArrayList<Date>();
		
		// ako su slobodni svi termini u danu
		if (booked.isEmpty()) {
			available = DTOConverter.availableTimesForDate(startDate);
		}
		
		// ako ima zauzetih termina --> uglavi 
		Date forCheck = startDate;
		for (int i = 0; i < booked.size(); i++) {
			Date afterTimeNeeded = DateUtils.addHours(forCheck, timeNeededInt);
			if (afterTimeNeeded.before(booked.get(i).getDate())) {
				//available.add(e)
			}
		}
	}
	
	
}
