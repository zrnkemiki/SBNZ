package com.ftn.carDiagnostic.model.parts;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.ftn.carDiagnostic.model.CarComponentsProblem;
@Entity
@DiscriminatorValue("mechanical_parts")
public class MechanicalParts extends CarComponentsProblem {

	
	private boolean shockAbsorber;
	private boolean brakeDisc;
	private boolean stabilizer;
	private boolean brakePads;
	private boolean engineBelt;
	private boolean engineGasket;
	private boolean engineOilConsumption;
	private boolean brakeLines;
	private boolean dualMassFlyWheel;
	private boolean tyre;
	
	

	

	
	public MechanicalParts() {
		super();
		// TODO Auto-generated constructor stub
	}
	public MechanicalParts(boolean shockAbsorber, boolean brakeDisc, boolean stabilizer, boolean brakePads, 
			boolean engineBelt, boolean engineGasket, boolean engineOilConsumption, boolean brakeLines, boolean dualMassFlyWheel,boolean tyre) {
		super();
		this.shockAbsorber = shockAbsorber;
		this.brakeDisc = brakeDisc;
		this.stabilizer = stabilizer;
		this.brakePads = brakePads;
		this.engineBelt = engineBelt;
		this.engineGasket = engineGasket;
		this.engineOilConsumption = engineOilConsumption;
		this.brakeLines = brakeLines;
		this.dualMassFlyWheel = dualMassFlyWheel;
		this.tyre = tyre;
	}
	
	public boolean isEngineOilConsumption() {
		return engineOilConsumption;
	}
	public void setEngineOilConsumption(boolean engineOilConsumption) {
		this.engineOilConsumption = engineOilConsumption;
	}
	
	public boolean isEngineGasket() {
		return engineGasket;
	}
	public void setEngineGasket(boolean engineGasket) {
		this.engineGasket = engineGasket;
	} 
	public boolean isShockAbsorber() {
		return shockAbsorber;
	}
	public void setShockAbsorber(boolean shockAbsorber) {
		this.shockAbsorber = shockAbsorber;
	}
	public boolean isBrakeDisc() {
		return brakeDisc;
	}
	public void setBrakeDisc(boolean brakeDisc) {
		this.brakeDisc = brakeDisc;
	}
	public boolean isStabilizer() {
		return stabilizer;
	}
	public void setStabilizer(boolean stabilizer) {
		this.stabilizer = stabilizer;
	}
	public boolean isBrakePads() {
		return brakePads;
	}
	public void setBrakePads(boolean brakePads) {
		this.brakePads = brakePads;
	}
	public boolean isEngineBelt() {
		return engineBelt;
	}
	public void setEngineBelt(boolean engineBelt) {
		this.engineBelt = engineBelt;
	}
	public boolean isBrakeLines() {
		return brakeLines;
	}
	public void setBrakeLines(boolean brakeLines) {
		this.brakeLines = brakeLines;
	}
	public boolean isDualMassFlyWheel() {
		return dualMassFlyWheel;
	}
	public void setDualMassFlyWheel(boolean dualMassFlyWheel) {
		this.dualMassFlyWheel = dualMassFlyWheel;
	}
	public boolean isTyre() {
		return tyre;
	}
	public void setTyre(boolean tyre) {
		this.tyre = tyre;
	}
	
}
