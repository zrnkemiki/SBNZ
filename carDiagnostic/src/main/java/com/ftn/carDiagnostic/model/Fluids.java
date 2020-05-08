package com.ftn.carDiagnostic.model;

public class Fluids extends CarComponentsProblem{
	private boolean oil;
	private boolean coolant;
	private boolean powerSteeringFluid;
	private boolean washerFluid;
	private boolean transmissionFluid;
	private boolean freon;
	private int level; //0-low 1-normal 2-high
	
	
	
	
	public Fluids() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public Fluids(boolean oil, boolean coolant, boolean powerSteeringFluid, boolean washerFluid,
			boolean transmissionFluid, boolean freon, int level) {
		super();
		this.oil = oil;
		this.coolant = coolant;
		this.powerSteeringFluid = powerSteeringFluid;
		this.washerFluid = washerFluid;
		this.transmissionFluid = transmissionFluid;
		this.freon = freon;
		this.level = level;
	}


	public boolean isOil() {
		return oil;
	}
	public void setOil(boolean oil) {
		this.oil = oil;
	}
	public boolean isCoolant() {
		return coolant;
	}
	public void setCoolant(boolean coolant) {
		this.coolant = coolant;
	}
	public boolean isPowerSteeringFluid() {
		return powerSteeringFluid;
	}
	public void setPowerSteeringFluid(boolean powerSteeringFluid) {
		this.powerSteeringFluid = powerSteeringFluid;
	}
	public boolean isWasherFluid() {
		return washerFluid;
	}
	public void setWasherFluid(boolean washerFluid) {
		this.washerFluid = washerFluid;
	}
	public boolean isTransmissionFluid() {
		return transmissionFluid;
	}
	public void setTransmissionFluid(boolean transmissionFluid) {
		this.transmissionFluid = transmissionFluid;
	}
	public boolean isFreon() {
		return freon;
	}
	public void setFreon(boolean freon) {
		this.freon = freon;
	}
	public int getLevel() {
		return level;
	}
	public void setLevel(int level) {
		this.level = level;
	}
	
	
}
