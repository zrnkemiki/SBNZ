package com.ftn.carDiagnostic.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.apache.commons.lang.time.DateUtils;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ftn.carDiagnostic.dto.AppointmentDTO;
import com.ftn.carDiagnostic.dto.ReservationDTO;
import com.ftn.carDiagnostic.helper.DTOConverter;
import com.ftn.carDiagnostic.model.Appointment;
import com.ftn.carDiagnostic.model.User;
import com.ftn.carDiagnostic.repository.AppointmentRepository;

@Service
public class AppointmentService {

	@Autowired
	private AppointmentRepository appointmentRepository;
	
	@Autowired
	private CarService carService;
	
	
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
	
	public List<Appointment> findByStartDateBetween(Date dateStart, Date dateEnd) {
		return appointmentRepository.findByStartTimeBetween(dateStart, dateEnd);
		//return appointmentRepository.findByStartTImeBetweenOrderByStartTime(dateStart, dateEnd);
	}
	
	
	public AppointmentDTO getAvailables(ReservationDTO resDTO) {
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
		
		// nadji sve koji su vec zakazani za taj dan
		Date startDate = DTOConverter.makeStartDate(resDTO.getDate());
		Date endDate = DTOConverter.makeEndDate(resDTO.getDate());
		List<Appointment> booked = findByStartDateBetween(startDate, endDate);
		
		int timeNeededInt = Integer.parseInt(timeNeeded.get(0));
		
		List<Date> available = new ArrayList<Date>();
		List<Date> allTimes = DTOConverter.availableTimesForDate(startDate);
		// ako su slobodni svi termini u danu
		if (booked.isEmpty()) {
			available = allTimes;
		// ako nisu
		} else {
			Date startApp = null;
			Date endApp = null;
			
			for (Date t : allTimes) {
				startApp = t;
				endApp = DateUtils.addHours(startApp, timeNeededInt);
				for (Appointment app : booked) {
					if (startApp.before(app.getStartTime()) && endApp.before(app.getStartTime())) {
						available.add(startApp);
					} else if (startApp.after(app.getEndTime()) && endApp.after(app.getEndTime())) {
						available.add(startApp);
					}
				}
			}
		}
		AppointmentDTO dto = new AppointmentDTO();
		dto.setAvailable(available);
		dto.setAppointmentDuration(timeNeededInt);
		return dto;
	}
	
	
	public void makeAppointment(User loggedUser, AppointmentDTO dto) {
		Appointment newApt = new Appointment();
		newApt.setUser(loggedUser);
		newApt.setStartTime(dto.getChosenDate());
		Date endTime = DateUtils.addHours(dto.getChosenDate(), dto.getAppointmentDuration());
		newApt.setEndTime(DTOConverter.setSecondsToZero(endTime));
		
		Appointment saved = appointmentRepository.save(newApt);
		
		
	}
	
}
