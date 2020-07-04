package com.ftn.carDiagnostic.model.fix;

import java.util.ArrayList;
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
	private List<String> fuelPumpFix;
	@ElementCollection
	private List<String> fuelFilterFix;
	@ElementCollection
	private List<String> nozzleFix;
	@ElementCollection
	private List<String> sparkPlugFix;
	
	public void GenerateFixes() {
		this.fuelPumpFix = new ArrayList<String>();
		this.fuelFilterFix = new ArrayList<String>();
		this.nozzleFix = new ArrayList<String>();
		this.sparkPlugFix = new ArrayList<String>();
		
		this.fuelPumpFix.add("Clean fuel pump filter");
		this.fuelPumpFix.add("Fuel pump replacement");
		
		this.fuelFilterFix.add("Fuel filter replacement");
		
		this.nozzleFix.add("Use Nozzle cleaner liquid");
		this.nozzleFix.add("Nozzle replacement");
		
		this.sparkPlugFix.add("Sparkplug replacement");
		
	}
	
	
	
	public FuelInjectionPartsFix(Long id, List<String> fuelPump, List<String> fuelFilter, List<String> nozzleFix,
			List<String> sparkPlugFix) {
		super();
		this.id = id;
		this.fuelPumpFix = fuelPump;
		this.fuelFilterFix = fuelFilter;
		this.nozzleFix = nozzleFix;
		this.sparkPlugFix = sparkPlugFix;
	}


	public FuelInjectionPartsFix() {
		
	}


	public List<String> getFuelPump() {
		return fuelPumpFix;
	}


	public void setFuelPump(List<String> fuelPump) {
		this.fuelPumpFix = fuelPump;
	}


	public List<String> getFuelFilter() {
		return fuelFilterFix;
	}


	public void setFuelFilter(List<String> fuelFilter) {
		this.fuelFilterFix = fuelFilter;
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
