package com.ftn.carDiagnostic.model.parts;

import com.ftn.carDiagnostic.model.CarComponentsProblem;

public class MechanicalParts extends CarComponentsProblem {

	private boolean shockAbsorber;
	private boolean brakeDisc;
	private boolean stabilizer;
	private boolean brakePads;
	private boolean engineBelt;
	private boolean engineGasket;
	private boolean engineOilConsumption;
	private boolean brakeLines;
	
	

	
	public MechanicalParts() {
		super();
		// TODO Auto-generated constructor stub
	}
	public MechanicalParts(boolean shockAbsorber, boolean brakeDisc, boolean stabilizer, boolean brakePads, 
			boolean engineBelt, boolean engineGasket, boolean engineOilConsumption, boolean brakeLines) {
		super();
		this.shockAbsorber = shockAbsorber;
		this.brakeDisc = brakeDisc;
		this.stabilizer = stabilizer;
		this.brakePads = brakePads;
		this.engineBelt = engineBelt;
		this.engineGasket = engineGasket;
		this.engineOilConsumption = engineOilConsumption;
		this.brakeLines = brakeLines;
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
	
	
}
