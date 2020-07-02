package com.ftn.carDiagnostic.dto;

import java.util.Date;
import java.util.List;

public class AppointmentDTO {

	private List<Date> available;
	private Date chosenDate;
	private int appointmentDuration;
	
	public AppointmentDTO() {
		
	}

	public AppointmentDTO(List<Date> available, Date chosenDate, int appointmentDuration) {
		super();
		this.available = available;
		this.chosenDate = chosenDate;
		this.appointmentDuration = appointmentDuration;
	}

	public List<Date> getAvailable() {
		return available;
	}

	public void setAvailable(List<Date> available) {
		this.available = available;
	}

	public Date getChosenDate() {
		return chosenDate;
	}

	public void setChosenDate(Date chosenDate) {
		this.chosenDate = chosenDate;
	}

	public int getAppointmentDuration() {
		return appointmentDuration;
	}

	public void setAppointmentDuration(int appointmentDuration) {
		this.appointmentDuration = appointmentDuration;
	}
	
	
}
