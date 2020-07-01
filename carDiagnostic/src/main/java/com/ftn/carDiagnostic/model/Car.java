package com.ftn.carDiagnostic.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "car")
public class Car {
	

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String brand;
	private String model;
	private String year;
	private String engineType;
	private String milage;
	@ManyToMany(cascade = CascadeType.ALL)
	private List<CarComponentsProblem> problemHistory; 
	//Svi problemi koji su se pojavljivali cuvace se u problemHistory radi kasnije implementacije nekih kompleksnijih pravila.
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
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
	public List<CarComponentsProblem> getProblemHistory() {
		return problemHistory;
	}
	public void setProblemHistory(List<CarComponentsProblem> problemHistory) {
		this.problemHistory = problemHistory;
	}
}
