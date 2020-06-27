package com.ftn.carDiagnostic.model.fix;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "mechanicalpartsfix")
public class MechanicalPartsFix {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	@Column
	@ElementCollection(targetClass = String.class)
	private List<String> shockAbsorberFix;
	@Column
	@ElementCollection(targetClass = String.class)
	private List<String> brakeDiscFix;
	@Column
	@ElementCollection(targetClass = String.class)
	private List<String> stabilizerFix;
	@Column
	@ElementCollection(targetClass = String.class)
	private List<String> brakePadsFix;
	@Column
	@ElementCollection(targetClass = String.class)
	private List<String> engineBeltFix;
	@Column
	@ElementCollection(targetClass = String.class)
	private List<String> brakeLinesFix;
	@Column
	@ElementCollection(targetClass = String.class)
	private List<String> engineOilConsumptionFix;
	@Column
	@ElementCollection(targetClass = String.class)
	private List<String> engineGasketFix;
	@Column
	@ElementCollection(targetClass = String.class)
	private List<String> dualMassFlyWheelFix;
	@Column
	@ElementCollection(targetClass = String.class)
	private List<String> tyreFix;

	public void GenerateFixes() {
		this.shockAbsorberFix = new ArrayList<String>();
		this.brakeDiscFix = new ArrayList<String>();
		this.stabilizerFix = new ArrayList<String>();
		this.brakePadsFix = new ArrayList<String>();
		this.engineBeltFix = new ArrayList<String>();
		this.brakeLinesFix = new ArrayList<String>();
		this.engineOilConsumptionFix = new ArrayList<String>();
		this.engineGasketFix = new ArrayList<String>();
		this.dualMassFlyWheelFix = new ArrayList<String>();
		this.tyreFix = new ArrayList<String>();

		this.shockAbsorberFix.add("Check shock absorber for oil leakage");
		this.shockAbsorberFix.add("Check shock absorber is straight");
		this.brakeDiscFix.add("Check brake discs for damage");
		this.brakeDiscFix.add("Replace brake discs");
		this.stabilizerFix.add("Check stabilizer is tight");
		this.stabilizerFix.add("Check for bends"); // Prebaci problem na electric window motor!
		this.brakePadsFix.add("Check brake pads wear");
		this.brakePadsFix.add("Replace brake pads");
		this.engineBeltFix.add("Put some soap on belt");
		this.engineBeltFix.add("Replace belt");
		this.brakeLinesFix.add("Repair brake lines");
		this.brakeLinesFix.add("Replace brake lines");
		this.engineOilConsumptionFix.add("Try using oil with more density");
		this.engineGasketFix.add("Replace gasket");
		this.dualMassFlyWheelFix.add("Replace dualmass flywheel");
		this.tyreFix.add("Re-inflate tyre");
		this.tyreFix.add("Repair puncture");
		this.tyreFix.add("Change tyre");
	}

	public MechanicalPartsFix() {
		
	}

	public MechanicalPartsFix(List<String> shockAbsorberFix, List<String> brakeDiscFix, List<String> stabilizerFix,
			List<String> brakePadsFix, List<String> engineBeltFix, List<String> brakeLinesFix,
			List<String> engineOilConsumptionFix, List<String> engineGasketFix, List<String> dualMassFlyWheelFix,
			List<String> tyreFix) {
		super();
		this.shockAbsorberFix = shockAbsorberFix;
		this.brakeDiscFix = brakeDiscFix;
		this.stabilizerFix = stabilizerFix;
		this.brakePadsFix = brakePadsFix;
		this.engineBeltFix = engineBeltFix;
		this.brakeLinesFix = brakeLinesFix;
		this.engineOilConsumptionFix = engineOilConsumptionFix;
		this.engineGasketFix = engineGasketFix;
		this.dualMassFlyWheelFix = dualMassFlyWheelFix;
		this.tyreFix = tyreFix;
	}

	public List<String> getShockAbsorberFix() {
		return shockAbsorberFix;
	}

	public void setShockAbsorberFix(List<String> shockAbsorberFix) {
		this.shockAbsorberFix = shockAbsorberFix;
	}

	public List<String> getBrakeDiscFix() {
		return brakeDiscFix;
	}

	public void setBrakeDiscFix(List<String> brakeDiscFix) {
		this.brakeDiscFix = brakeDiscFix;
	}

	public List<String> getStabilizerFix() {
		return stabilizerFix;
	}

	public void setStabilizerFix(List<String> stabilizerFix) {
		this.stabilizerFix = stabilizerFix;
	}

	public List<String> getBrakePadsFix() {
		return brakePadsFix;
	}

	public void setBrakePadsFix(List<String> brakePadsFix) {
		this.brakePadsFix = brakePadsFix;
	}

	public List<String> getEngineBeltFix() {
		return engineBeltFix;
	}

	public void setEngineBeltFix(List<String> engineBeltFix) {
		this.engineBeltFix = engineBeltFix;
	}

	public List<String> getBrakeLinesFix() {
		return brakeLinesFix;
	}

	public void setBrakeLinesFix(List<String> brakeLinesFix) {
		this.brakeLinesFix = brakeLinesFix;
	}

	public List<String> getEngineOilConsumptionFix() {
		return engineOilConsumptionFix;
	}

	public void setEngineOilConsumptionFix(List<String> engineOilConsumptionFix) {
		this.engineOilConsumptionFix = engineOilConsumptionFix;
	}

	public List<String> getEngineGasketFix() {
		return engineGasketFix;
	}

	public void setEngineGasketFix(List<String> engineGasketFix) {
		this.engineGasketFix = engineGasketFix;
	}

	public List<String> getDualMassFlyWheelFix() {
		return dualMassFlyWheelFix;
	}

	public void setDualMassFlyWheelFix(List<String> dualMassFlyWheelFix) {
		this.dualMassFlyWheelFix = dualMassFlyWheelFix;
	}

	public List<String> getTyreFix() {
		return tyreFix;
	}

	public void setTyreFix(List<String> tyreFix) {
		this.tyreFix = tyreFix;
	}

}
