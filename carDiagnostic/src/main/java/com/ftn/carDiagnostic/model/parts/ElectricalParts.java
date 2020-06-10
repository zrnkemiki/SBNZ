package com.ftn.carDiagnostic.model.parts;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.ftn.carDiagnostic.model.CarComponentsProblem;
@Entity
@DiscriminatorValue("electrical_parts")
public class ElectricalParts extends CarComponentsProblem {
	
	/*Delovi automobila su grupisani po klasama onog tipa kom pripadaju ( elektro, mehanicki..).
	 *Aplikacija pomocu pravila, na osnovu simptoma setuje atribut onog dela automobila koji je u kvaru na TRUE
	 */
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	private boolean headlight;
	private boolean tailLight;
	private boolean electricWindows;
	private boolean electricWindowMotor;
	private boolean battery;
	private boolean electricFan;

	public ElectricalParts() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ElectricalParts(boolean headlights, boolean tailLights, 
			boolean electricWindows, boolean battery, boolean electricFan) {
		super();
		this.headlight = headlights;
		this.tailLight = tailLights;
		this.electricWindows = electricWindows;
		this.battery = battery;
		this.electricFan = electricFan;
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

	public boolean isElectricFan() {
		return electricFan;
	}

	public void setElectricFan(boolean electricFan) {
		this.electricFan = electricFan;
	}
}
