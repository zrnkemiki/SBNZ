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
@Table(name = "fluidpartsfix")
public class FluidPartsFix {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	@ElementCollection
	private List<String> oilFix;
	@ElementCollection
	private List<String> brakeFluidFix;
	@ElementCollection
	private List<String> coolantFix;
	@ElementCollection
	private List<String> washerFluidFix;
	@ElementCollection
	private List<String> transmissionFluidFix;
	@ElementCollection
	private List<String> freonFix;
	
	public void GenerateFixes() {
		this.oilFix = new ArrayList<String>();
		this.brakeFluidFix = new ArrayList<String>();
		this.coolantFix = new ArrayList<String>();
		this.washerFluidFix = new ArrayList<String>();
		this.transmissionFluidFix = new ArrayList<String>();
		this.freonFix = new ArrayList<String>();
		
		
		this.oilFix.add("Check oil level on level surface");
		this.oilFix.add("Use oil with more density");
		this.oilFix.add("Oil replacement");
		this.brakeFluidFix.add("Check brake fluid humidity %");
		this.brakeFluidFix.add("Brake fluid replacement");
		
		this.coolantFix.add("Check coolant freezing temperature");
		this.coolantFix.add("Coolant replacement");
		
		this.washerFluidFix.add("Top-up washer fluid");
		this.transmissionFluidFix.add("Transmission fluid replacement");
		this.freonFix.add("Check for freon leakage");
		this.freonFix.add("Freon gas replacement");
		
		
		
		
	}
	
	public FluidPartsFix() {
		super();
		// TODO Auto-generated constructor stub
	}
	public FluidPartsFix(Long id, List<String> oilFix, List<String> brakeFluidFix, List<String> coolantFix,
			List<String> washerFluidFix, List<String> transmissionFluidFix, List<String> freonFix) {
		super();
		this.id = id;
		this.oilFix = oilFix;
		this.brakeFluidFix = brakeFluidFix;
		this.coolantFix = coolantFix;
		this.washerFluidFix = washerFluidFix;
		this.transmissionFluidFix = transmissionFluidFix;
		this.freonFix = freonFix;
	}
	public List<String> getOilFix() {
		return oilFix;
	}
	public void setOilFix(List<String> oilFix) {
		this.oilFix = oilFix;
	}
	public List<String> getBrakeFluidFix() {
		return brakeFluidFix;
	}
	public void setBrakeFluidFix(List<String> brakeFluidFix) {
		this.brakeFluidFix = brakeFluidFix;
	}
	public List<String> getCoolantFix() {
		return coolantFix;
	}
	public void setCoolantFix(List<String> coolantFix) {
		this.coolantFix = coolantFix;
	}
	public List<String> getWasherFluidFix() {
		return washerFluidFix;
	}
	public void setWasherFluidFix(List<String> washerFluidFix) {
		this.washerFluidFix = washerFluidFix;
	}
	public List<String> getTransmissionFluidFix() {
		return transmissionFluidFix;
	}
	public void setTransmissionFluidFix(List<String> transmissionFluidFix) {
		this.transmissionFluidFix = transmissionFluidFix;
	}
	public List<String> getFreonFix() {
		return freonFix;
	}
	public void setFreonFix(List<String> freonFix) {
		this.freonFix = freonFix;
	}
	
}
