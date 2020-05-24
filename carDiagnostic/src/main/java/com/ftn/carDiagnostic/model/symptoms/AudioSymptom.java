package com.ftn.carDiagnostic.model.symptoms;

import com.ftn.carDiagnostic.model.CarState;

public class AudioSymptom {
	private boolean grinding;  //done
	private boolean squealing;  //done
	private boolean whistling; // done
	private boolean knocking; // done
	private boolean ticking;  // done
	private CarState carState;
	
	
	public AudioSymptom() {
		
	}


	public boolean isGrinding() {
		return grinding;
	}


	public void setGrinding(boolean grinding) {
		this.grinding = grinding;
	}



	public boolean isSquealing() {
		return squealing;
	}


	public void setSquealing(boolean squealing) {
		this.squealing = squealing;
	}


	public boolean isWhistling() {
		return whistling;
	}


	public void setWhistling(boolean whistling) {
		this.whistling = whistling;
	}


	public boolean isKnocking() {
		return knocking;
	}


	public void setKnocking(boolean knocking) {
		this.knocking = knocking;
	}


	public boolean isTicking() {
		return ticking;
	}


	public void setTicking(boolean ticking) {
		this.ticking = ticking;
	}


	public CarState getCarState() {
		return carState;
	}


	public void setCarState(CarState carState) {
		this.carState = carState;
	}
	
	
}

