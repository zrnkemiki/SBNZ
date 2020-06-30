package com.ftn.carDiagnostic.dto;

public class AppointmentDTO {

	private String userId;
	private String date;
	
	public AppointmentDTO() {
		
	}

	public AppointmentDTO(String userId, String date) {
		super();
		this.userId = userId;
		this.date = date;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}
	
	
}
