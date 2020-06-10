package com.ftn.carDiagnostic.model.symptoms;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.ftn.carDiagnostic.model.CarState;

@Entity
@Table(name = "feelingsymptom")
public class FeelingSymptom {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private boolean poorBraking; // done
	private boolean bouncing; //kops
	private boolean shaking; //kops
	private boolean longStarting; //kops
	private boolean ridesUncomfortable;	// done
	private boolean poorPerformance; //done
	@Enumerated(EnumType.STRING)
	private CarState carState;
	
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

	public CarState getCarState() {
		return carState;
	}

	public void setCarState(CarState carState) {
		this.carState = carState;
	}
	
	
}
