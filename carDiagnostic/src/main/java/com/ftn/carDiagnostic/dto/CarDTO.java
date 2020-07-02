package com.ftn.carDiagnostic.dto;

public class CarDTO {
	private String brand;
	private String model;
	private String year;
	private String engineType;
	private String milage;
	
	
	public CarDTO(String brand, String model, String year, String engineType, String milage) {
		super();
		this.brand = brand;
		this.model = model;
		this.year = year;
		this.engineType = engineType;
		this.milage = milage;
	}


	public CarDTO() {
		super();
		// TODO Auto-generated constructor stub
	}


	public String getBrand() {
		return brand;
	}


	public void setBrand(String brand) {
		this.brand = brand;
	}


	public String getModel() {
		return model;
	}


	public void setModel(String model) {
		this.model = model;
	}


	public String getYear() {
		return year;
	}


	public void setYear(String year) {
		this.year = year;
	}


	public String getEngineType() {
		return engineType;
	}


	public void setEngineType(String engineType) {
		this.engineType = engineType;
	}


	public String getMilage() {
		return milage;
	}


	public void setMilage(String milage) {
		this.milage = milage;
	}
	
	
}
