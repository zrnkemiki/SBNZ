package com.ftn.carDiagnostic.model.fix;

import java.util.List;

import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "fuelinjectionpartsfix")
public class FuelInjectionPartsFix {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	@ElementCollection
	private List<String> fuelPump;
	@ElementCollection
	private List<String> fuelFilter;
	@ElementCollection
	private List<String> nozzleFix;
	@ElementCollection
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
