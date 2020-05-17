package com.ftn.carDiagnostic.model.fix;

import java.util.List;

public class FuelInjectionPartsFix {

	private List<String> fuelPump;
	private List<String> fuelFilter;
	private List<String> nozzleFix;
	private List<String> sparkPlugFix;
	
	
	public FuelInjectionPartsFix() {
		
	}


	public List<String> getFuelPump() {
		return fuelPump;
	}


	public void setFuelPump(List<String> fuelPump) {
		this.fuelPump = fuelPump;
	}


	public List<String> getFuelFilter() {
		return fuelFilter;
	}


	public void setFuelFilter(List<String> fuelFilter) {
		this.fuelFilter = fuelFilter;
	}


	public List<String> getNozzleFix() {
		return nozzleFix;
	}


	public void setNozzleFix(List<String> nozzleFix) {
		this.nozzleFix = nozzleFix;
	}


	public List<String> getSparkPlugFix() {
		return sparkPlugFix;
	}


	public void setSparkPlugFix(List<String> sparkPlugFix) {
		this.sparkPlugFix = sparkPlugFix;
	}
	
	
}
