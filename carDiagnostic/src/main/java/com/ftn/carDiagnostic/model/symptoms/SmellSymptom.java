package com.ftn.carDiagnostic.model.symptoms;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.ftn.carDiagnostic.model.CarState;
@Entity
@Table(name = "smellsymptom")
public class SmellSymptom {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private boolean burningSmell;
	private boolean rottenEggSmell;
	private boolean sweetSmell;
	private boolean wetOldSocksSmell;
	@Enumerated(EnumType.STRING)
	private CarState carState;
	
	
	public boolean isBurningSmell() {
		return burningSmell;
	}
	public void setBurningSmell(boolean burningSmell) {
		this.burningSmell = burningSmell;
	}
	public boolean isRottenEggSmell() {
		return rottenEggSmell;
	}
	public void setRottenEggSmell(boolean rottenEggSmell) {
		this.rottenEggSmell = rottenEggSmell;
	}
	public boolean isSweetSmell() {
		return sweetSmell;
	}
	public void setSweetSmell(boolean sweetSmell) {
		this.sweetSmell = sweetSmell;
	}
	public boolean isWetOldSocksSmell() {
		return wetOldSocksSmell;
	}
	public void setWetOldSocksSmell(boolean wetOldSocksSmell) {
		this.wetOldSocksSmell = wetOldSocksSmell;
	}
	public CarState getCarState() {
		return carState;
	}
	public void setCarState(CarState carState) {
		this.carState = carState;
	}
	
	
}
