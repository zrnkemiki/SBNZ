package com.ftn.carDiagnostic.service;

import java.util.ArrayList;
import java.util.List;

import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
		kSession.setGlobal("appointments", new ArrayList<String>());
	}
	
	
	public Appointment findById(Long id) {
		return appointmentRepository.findById(id).orElse(null);
	}
	
	
	
	public void insertAppointment(Appointment appointment) {
		kSession.insert(appointment);
		int fired = kSession.fireAllRules();
		System.out.println("[inserAppointment() in AppointmentService] Number of rules fired: " + fired);
		
		List<String> appts = null;
		try {
			appts = (ArrayList<String>) kSession.getGlobal("appointments");
			for (String app : appts) {
				System.out.println(app);
			}
		} catch (Exception e) {
		
		}

	}
	
}
