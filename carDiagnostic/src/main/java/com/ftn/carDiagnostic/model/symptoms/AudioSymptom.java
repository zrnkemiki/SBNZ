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
@Table(name = "audiosymptom")
public class AudioSymptom {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private boolean grinding;  //done
	private boolean squealing;  //done
	private boolean whistling; // done
	private boolean knocking; // done
	private boolean ticking;  // done
	@Enumerated(EnumType.STRING)
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

