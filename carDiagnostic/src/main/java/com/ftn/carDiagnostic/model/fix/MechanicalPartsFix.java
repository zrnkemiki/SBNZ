package com.ftn.carDiagnostic.model.fix;

import java.util.ArrayList;
import java.util.List;

public class MechanicalPartsFix {
	private List<String> shockAbsorberFix;
	private List<String> brakeDiscFix;
	private List<String> stabilizerFix;
	private List<String> brakePadsFix;
	
	public void TestFixes() {
		this.shockAbsorberFix = new ArrayList<String>();
		this.brakeDiscFix = new ArrayList<String>();;
		this.stabilizerFix = new ArrayList<String>();;
		this.brakePadsFix = new ArrayList<String>();;
		
		this.shockAbsorberFix.add("Check shock absorber for oil leakage");
		this.shockAbsorberFix.add("Check shock absorber is straight");
		this.brakeDiscFix.add("Check brake discs for damage");
		this.brakeDiscFix.add("Replace brake discs");
		this.stabilizerFix.add("Check stabilizer is tight");
		this.stabilizerFix.add("Check for bends"); //Prebaci problem na electric window motor!
		this.brakePadsFix.add("Check brake pads wear");
		this.brakePadsFix.add("Replace brake pads");
	}
	
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
