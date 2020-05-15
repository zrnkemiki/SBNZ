package com.ftn.carDiagnostic.model;

public class ElectricalParts extends CarComponentsProblem {

	private boolean headlight;
	private boolean tailLight;
	private boolean electricWindows;
	private boolean electricWindowMotor;
	private boolean battery;

	public ElectricalParts() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ElectricalParts(boolean headlights, boolean tailLights, 
			boolean electricWindows, boolean battery) {
		super();
		this.headlight = headlights;
		this.tailLight = tailLights;
		this.electricWindows = electricWindows;
		this.battery = battery;
	}
	
	public ElectricalParts(boolean headlight) {
		super();
		this.headlight = headlight;
	}
	
	

	public boolean isHeadlight() {
		return headlight;
	}

	public void setHeadlight(boolean headlight) {
		this.headlight = headlight;
	}

	public boolean isTailLight() {
		return tailLight;
	}

	public void setTailLight(boolean tailLight) {
		this.tailLight = tailLight;
	}

	public boolean isElectricWindows() {
		return electricWindows;
	}

	public void setElectricWindows(boolean electricWindows) {
		this.electricWindows = electricWindows;
	}

	public boolean isElectricWindowMotor() {
		return electricWindowMotor;
	}

	public void setElectricWindowMotor(boolean electricWindowMotor) {
		this.electricWindowMotor = electricWindowMotor;
	}

	public boolean isBattery() {
		return battery;
	}

	public void setBattery(boolean battery) {
		this.battery = battery;
	}
}
