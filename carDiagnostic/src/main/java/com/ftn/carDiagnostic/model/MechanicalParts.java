package com.ftn.carDiagnostic.model;

public class MechanicalParts extends CarComponentsProblem {

	private boolean shockAbsorber;
	private boolean brakeDisc;
	private boolean stabilizer;
	private boolean brakePads;
	private boolean dualMassFlyWheel;
	private boolean engineGasket;
	private boolean engineOilConsumption;
	
	
	

	
	public MechanicalParts() {
		super();
		// TODO Auto-generated constructor stub
	}
	public MechanicalParts(boolean shockAbsorber, boolean brakeDisc, boolean stabilizer, boolean brakePads, 
			boolean dualMassFlyWheel, boolean engineGasket, boolean engineOilConsumption) {
		super();
		this.shockAbsorber = shockAbsorber;
		this.brakeDisc = brakeDisc;
		this.stabilizer = stabilizer;
		this.brakePads = brakePads;
		this.dualMassFlyWheel = dualMassFlyWheel;
		this.engineGasket = engineGasket;
		this.engineOilConsumption = engineOilConsumption;
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
	public boolean isDualMassFlyWheel() {
		return dualMassFlyWheel;
	}
	public void setDualMassFlyWheel(boolean dualMassFlyWheel) {
		this.dualMassFlyWheel = dualMassFlyWheel;
	}
	
	
}