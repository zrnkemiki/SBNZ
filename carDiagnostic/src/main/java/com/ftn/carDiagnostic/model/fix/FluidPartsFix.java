package com.ftn.carDiagnostic.model.fix;

import java.util.List;

import javax.persistence.ElementCollection;
import javax.persistence.Entity;
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
	@ElementCollection(targetClass = String.class)
	private List<String> oilFix;
	@ElementCollection(targetClass = String.class)
	private List<String> brakeFluidFix;
	@ElementCollection(targetClass = String.class)
	private List<String> coolantFix;
	@ElementCollection(targetClass = String.class)
	private List<String> washerFluidFix;
	@ElementCollection(targetClass = String.class)
	private List<String> transmissionFluidFix;
	@ElementCollection(targetClass = String.class)
	private List<String> freonFix;
	
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
