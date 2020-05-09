package com.ftn.carDiagnostic.model;

public class ElectricalParts extends CarComponentsProblem {

	private boolean headlights;
	private boolean tailLights;
	private boolean interiorLights;
	private boolean carStereo;
	private boolean electricWindows;
	private boolean electricWindowMotor;
	private boolean battery;

	public ElectricalParts() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ElectricalParts(boolean headlights, boolean tailLights, boolean interiorLights, boolean carStereo,
			boolean electricWindows, boolean battery) {
		super();
		this.headlights = headlights;
		this.tailLights = tailLights;
		this.interiorLights = interiorLights;
		this.carStereo = carStereo;
		this.electricWindows = electricWindows;
		this.battery = battery;
	}

	public boolean isHeadlights() {
		return headlights;
	}

	public void setHeadlights(boolean headlights) {
		this.headlights = headlights;
	}

	public boolean isTailLights() {
		return tailLights;
	}

	public void setTailLights(boolean tailLights) {
		this.tailLights = tailLights;
	}

	public boolean isInteriorLights() {
		return interiorLights;
	}

	public void setInteriorLights(boolean interiorLights) {
		this.interiorLights = interiorLights;
	}

	public boolean isCarStereo() {
		return carStereo;
	}

	public void setCarStereo(boolean carStereo) {
		this.carStereo = carStereo;
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
