package com.ftn.carDiagnostic.model.fix;

import java.util.List;

public class MechanicalPartsFix {
	private List<String> shockAbsorberFix;
	private List<String> brakeDiscFix;
	private List<String> stabilizerFix;
	private List<String> brakePadsFix;
	
	public MechanicalPartsFix() {
		
	}

	public MechanicalPartsFix(List<String> shockAbsorberFix, List<String> brakeDiscFix, List<String> stabilizerFix,
			List<String> brakePadsFix) {
		super();
		this.shockAbsorberFix = shockAbsorberFix;
		this.brakeDiscFix = brakeDiscFix;
		this.stabilizerFix = stabilizerFix;
		this.brakePadsFix = brakePadsFix;
	}

	public List<String> getShockAbsorberFix() {
		return shockAbsorberFix;
	}

	public void setShockAbsorberFix(List<String> shockAbsorberFix) {
		this.shockAbsorberFix = shockAbsorberFix;
	}

	public List<String> getBrakeDiscFix() {
		return brakeDiscFix;
	}

	public void setBrakeDiscFix(List<String> brakeDiscFix) {
		this.brakeDiscFix = brakeDiscFix;
	}

	public List<String> getStabilizerFix() {
		return stabilizerFix;
	}

	public void setStabilizerFix(List<String> stabilizerFix) {
		this.stabilizerFix = stabilizerFix;
	}

	public List<String> getBrakePadsFix() {
		return brakePadsFix;
	}

	public void setBrakePadsFix(List<String> brakePadsFix) {
		this.brakePadsFix = brakePadsFix;
	}
	
	
}
