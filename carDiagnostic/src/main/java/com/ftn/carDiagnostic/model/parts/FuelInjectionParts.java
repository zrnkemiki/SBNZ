package com.ftn.carDiagnostic.model.parts;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.ftn.carDiagnostic.model.CarComponentsProblem;
@Entity
@DiscriminatorValue("fuel_injection_parts")
public class FuelInjectionParts extends CarComponentsProblem {

	
	private boolean fuelPump;
	private boolean fuelFilter;
	private boolean nozzle;
	private boolean sparkPlug;
	
	
	
	public FuelInjectionParts() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public FuelInjectionParts(boolean fuelPump, boolean fuelFilter, boolean nozzle, boolean sparkPlug) {
		super();
		this.fuelPump = fuelPump;
		this.fuelFilter = fuelFilter;
		this.nozzle = nozzle;
		this.sparkPlug = sparkPlug;
	}


	public boolean isFuelPump() {
		return fuelPump;
	}
	public void setFuelPump(boolean fuelPump) {
		this.fuelPump = fuelPump;
	}
	public boolean isFuelFilter() {
		return fuelFilter;
	}
	public void setFuelFilter(boolean fuelFilter) {
		this.fuelFilter = fuelFilter;
	}
	public boolean isNozzle() {
		return nozzle;
	}
	public void setNozzle(boolean nozzle) {
		this.nozzle = nozzle;
	}
	public boolean isSparkPlug() {
		return sparkPlug;
	}
	public void setSparkPlug(boolean sparkPlug) {
		this.sparkPlug = sparkPlug;
	}

	
}
