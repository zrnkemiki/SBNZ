package com.ftn.carDiagnostic.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import com.ftn.carDiagnostic.dto.CarDTO;

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
	@ManyToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	private List<CarComponentsProblem> problemHistory; 
	//Svi problemi koji su se pojavljivali cuvace se u problemHistory radi kasnije implementacije nekih kompleksnijih pravila.
	
	public Car(Long id, String brand, String model, String year, String engineType, String milage,
			List<CarComponentsProblem> problemHistory) {
		super();
		this.id = id;
		this.brand = brand;
		this.model = model;
		this.year = year;
		this.engineType = engineType;
		this.milage = milage;
		this.problemHistory = problemHistory;
	}
	
	
	
	public Car() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Car(CarDTO carDTO) {
		this.brand = carDTO.getBrand();
		this.model = carDTO.getModel();
		this.year = carDTO.getYear();
		this.engineType = carDTO.getEngineType();
		this.milage = carDTO.getMilage();
	}
	
	
	



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
