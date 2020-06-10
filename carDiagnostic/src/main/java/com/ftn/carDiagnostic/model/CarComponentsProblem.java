package com.ftn.carDiagnostic.model;

import java.util.Date;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;


@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name="car_components_problem", discriminatorType = DiscriminatorType.STRING)
public abstract class CarComponentsProblem {
	
	//Abstraktna klasa koju nasledjuju ostale klase koje sadrze delove automobila prema tipu dela
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
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
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	
	
}
