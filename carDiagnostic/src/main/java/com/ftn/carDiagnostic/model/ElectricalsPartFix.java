package com.ftn.carDiagnostic.model;

import java.util.ArrayList;
import java.util.List;

public class ElectricalsPartFix {
	private List<String> headlightFix;
	private List<String> taillightFix;
	private List<String> electricWindowsFix;
	private List<String> batteryFix;
	
	public ElectricalsPartFix(List<String> headlightFix, List<String> taillightFix, List<String> electricWindowsFix,
			List<String> batteryFix) {
		super();
		this.headlightFix = headlightFix;
		this.taillightFix = taillightFix;
		this.electricWindowsFix = electricWindowsFix;
		this.batteryFix = batteryFix;
	}

	public ElectricalsPartFix() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public void testFixes() {
		this.headlightFix = new ArrayList<String>();
		this.taillightFix = new ArrayList<String>();;
		this.electricWindowsFix = new ArrayList<String>();;
		this.batteryFix = new ArrayList<String>();;
		
		this.headlightFix.add("Check fuse");
		this.headlightFix.add("Check contact");
		this.electricWindowsFix.add("Check fuse");
		this.electricWindowsFix.add("Check contact");
		this.electricWindowsFix.add("Check motor"); //Prebaci problem na electric window motor!
	}

	public List<String> getHeadlightFix() {
		return headlightFix;
	}

	public void setHeadlightFix(List<String> headlightFix) {
		this.headlightFix = headlightFix;
	}

	public List<String> getTaillightFix() {
		return taillightFix;
	}

	public void setTaillightFix(List<String> taillightFix) {
		this.taillightFix = taillightFix;
	}

	public List<String> getElectricWindowsFix() {
		return electricWindowsFix;
	}

	public void setElectricWindowsFix(List<String> electricWindowsFix) {
		this.electricWindowsFix = electricWindowsFix;
	}

	public List<String> getBatteryFix() {
		return batteryFix;
	}

	public void setBatteryFix(List<String> batteryFix) {
		this.batteryFix = batteryFix;
	}
	
	
	
	
}
