package com.ftn.carDiagnostic.model;

public class VisualSymptom {
	
	private boolean headlightNotWorking;
	private boolean taillightNotWorking;
	private boolean electricWindowNotWorking;
	private boolean oilPuddleUnderCar;
	private boolean fluidPuddle;
	private boolean whiteSmoke;
	private boolean blueSmoke;
	private boolean blackSmoke;
	private boolean batteryDashLight; //not done
	private boolean oilDashLight; 
	private boolean coolantDashLight;
	private boolean steeringWheelDashLight;
	private boolean brakePadsDashLight;
	private boolean dpfDashLight; 
	private boolean airConditionNotWorking; 
	private boolean engineOverHeating; //not done
	private boolean unevenTyreWear; //not done
	private boolean engineStartProblem; //not done
	private boolean engineShaking; //not done
	private boolean carUnstable; //not done

	private CarState carState;
	
	
	public VisualSymptom() {
		super();
		// TODO Auto-generated constructor stub
	}


	public boolean isHeadlightNotWorking() {
		return headlightNotWorking;
	}


	public void setHeadlightNotWorking(boolean headlightNotWorking) {
		this.headlightNotWorking = headlightNotWorking;
	}


	public boolean isTaillightNotWorking() {
		return taillightNotWorking;
	}


	public void setTaillightNotWorking(boolean taillightNotWorking) {
		this.taillightNotWorking = taillightNotWorking;
	}


	public boolean isElectricWindowNotWorking() {
		return electricWindowNotWorking;
	}


	public void setElectricWindowNotWorking(boolean electricWindowNotWorking) {
		this.electricWindowNotWorking = electricWindowNotWorking;
	}


	public boolean isOilPuddleUnderCar() {
		return oilPuddleUnderCar;
	}


	public void setOilPuddleUnderCar(boolean oilPuddleUnderCar) {
		this.oilPuddleUnderCar = oilPuddleUnderCar;
	}


	public boolean isFluidPuddle() {
		return fluidPuddle;
	}


	public void setFluidPuddle(boolean fluidPuddle) {
		this.fluidPuddle = fluidPuddle;
	}


	public boolean isWhiteSmoke() {
		return whiteSmoke;
	}


	public void setWhiteSmoke(boolean whiteSmoke) {
		this.whiteSmoke = whiteSmoke;
	}


	public boolean isBlueSmoke() {
		return blueSmoke;
	}


	public void setBlueSmoke(boolean blueSmoke) {
		this.blueSmoke = blueSmoke;
	}


	public boolean isBlackSmoke() {
		return blackSmoke;
	}


	public void setBlackSmoke(boolean blackSmoke) {
		this.blackSmoke = blackSmoke;
	}


	public boolean isBatteryDashLight() {
		return batteryDashLight;
	}


	public void setBatteryDashLight(boolean batteryDashLight) {
		this.batteryDashLight = batteryDashLight;
	}


	public boolean isOilDashLight() {
		return oilDashLight;
	}


	public void setOilDashLight(boolean oilDashLight) {
		this.oilDashLight = oilDashLight;
	}


	public boolean isCoolantDashLight() {
		return coolantDashLight;
	}


	public void setCoolantDashLight(boolean coolantDashLight) {
		this.coolantDashLight = coolantDashLight;
	}


	public boolean isSteeringWheelDashLight() {
		return steeringWheelDashLight;
	}


	public void setSteeringWheelDashLight(boolean steeringWheelDashLight) {
		this.steeringWheelDashLight = steeringWheelDashLight;
	}


	public boolean isBrakePadsDashLight() {
		return brakePadsDashLight;
	}


	public void setBrakePadsDashLight(boolean brakePadsDashLight) {
		this.brakePadsDashLight = brakePadsDashLight;
	}


	public boolean isDpfDashLight() {
		return dpfDashLight;
	}


	public void setDpfDashLight(boolean dpfDashLight) {
		this.dpfDashLight = dpfDashLight;
	}


	public boolean isAirConditionNotWorking() {
		return airConditionNotWorking;
	}


	public void setAirConditionNotWorking(boolean airConditionNotWorking) {
		this.airConditionNotWorking = airConditionNotWorking;
	}


	public boolean isEngineOverHeating() {
		return engineOverHeating;
	}


	public void setEngineOverHeating(boolean engineOverHeating) {
		this.engineOverHeating = engineOverHeating;
	}


	public boolean isUnevenTyreWear() {
		return unevenTyreWear;
	}


	public void setUnevenTyreWear(boolean unevenTyreWear) {
		this.unevenTyreWear = unevenTyreWear;
	}


	public boolean isEngineStartProblem() {
		return engineStartProblem;
	}


	public void setEngineStartProblem(boolean engineStartProblem) {
		this.engineStartProblem = engineStartProblem;
	}


	public boolean isEngineShaking() {
		return engineShaking;
	}


	public void setEngineShaking(boolean engineShaking) {
		this.engineShaking = engineShaking;
	}


	public boolean isCarUnstable() {
		return carUnstable;
	}


	public void setCarUnstable(boolean carUnstable) {
		this.carUnstable = carUnstable;
	}
}

