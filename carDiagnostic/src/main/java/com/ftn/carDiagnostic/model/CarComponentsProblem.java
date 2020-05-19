package com.ftn.carDiagnostic.model;

import java.util.Date;

public abstract class CarComponentsProblem {
	
	//Abstraktna klasa koju nasledjuju ostale klase koje sadrze delove automobila prema tipu dela

	private Date date;
	private int milage;
	private String description;
	private String status; //pending || solved
	
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public int getMilage() {
		return milage;
	}
	public void setMilage(int milage) {
		this.milage = milage;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	
	
}
