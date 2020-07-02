package com.ftn.carDiagnostic.dto;

import java.util.Date;


public class ReservationDTO {

	private String fix;
	private Date date;
	
	public ReservationDTO() {
		
	}

	public ReservationDTO(String fix, Date date) {
		super();
		this.fix = fix;
		this.date = date;
	}

	public String getFix() {
		return fix;
	}

	public void setFix(String fix) {
		this.fix = fix;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}
	
	
}
