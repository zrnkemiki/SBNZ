package com.ftn.carDiagnostic.model.symptoms;

public class FeelingSymptom {
	
	private boolean poorBraking; // done
	private boolean bouncing; //kops
	private boolean shaking; //kops
	private boolean longStarting; //kops
	private boolean ridesUncomfortable;	// done
	private boolean poorPerformance; //done
	
	public boolean isPoorPerformance() {
		return poorPerformance;
	}

	public void setPoorPerformance(boolean poorPerformance) {
		this.poorPerformance = poorPerformance;
	}

	public FeelingSymptom() {
		
	}

	public boolean isPoorBraking() {
		return poorBraking;
	}

	public void setPoorBraking(boolean poorBraking) {
		this.poorBraking = poorBraking;
	}

	public boolean isBouncing() {
		return bouncing;
	}

	public void setBouncing(boolean bouncing) {
		this.bouncing = bouncing;
	}

	public boolean isShaking() {
		return shaking;
	}

	public void setShaking(boolean shaking) {
		this.shaking = shaking;
	}

	public boolean isLongStarting() {
		return longStarting;
	}

	public void setLongStarting(boolean longStarting) {
		this.longStarting = longStarting;
	}

	public boolean isRidesUncomfortable() {
		return ridesUncomfortable;
	}

	public void setRidesUncomfortable(boolean ridesUncomfortable) {
		this.ridesUncomfortable = ridesUncomfortable;
	}
	
	
}
