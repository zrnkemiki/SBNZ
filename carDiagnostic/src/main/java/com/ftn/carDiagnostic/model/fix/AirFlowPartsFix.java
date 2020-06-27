package com.ftn.carDiagnostic.model.fix;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "airflowpartsfix")
public class AirFlowPartsFix {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	@ElementCollection(targetClass = String.class)
	private List<String> mafFix;
	@ElementCollection(targetClass = String.class)
	private List<String> airIntakeTubeFix;
	@ElementCollection(targetClass = String.class)
	private List<String> turboChargerFix;
	@ElementCollection(targetClass = String.class)
	private List<String> throttleBodyFix;
	@ElementCollection(targetClass = String.class)
	private List<String> intercoolerFix;
	@ElementCollection(targetClass = String.class)
	private List<String> mapFix;
	@ElementCollection(targetClass = String.class)
	private List<String> intakemanifoldFix;
	@ElementCollection(targetClass = String.class)
	private List<String> exhaustmanifoldFix;
	@ElementCollection(targetClass = String.class)
	private List<String> egrFix;
	@ElementCollection(targetClass = String.class)
	private List<String> catalyticConverterFix;
	@ElementCollection(targetClass = String.class)
	private List<String> dpfFix;
	
	public void GenerateFixes() {
		this.turboChargerFix = new ArrayList<String>();
		this.dpfFix = new ArrayList<String>();;
		
		
		this.turboChargerFix.add("Check for oil signs in turbo charger");
		this.turboChargerFix.add("Check turbine gap in turbo charger");
		this.dpfFix.add("Go to highway and drive car for 20min on higher revs");
		this.dpfFix.add("Using diagnostic force dpf regeneration");
		
	}
	
	public AirFlowPartsFix() {
		
	}

	public List<String> getMafFix() {
		return mafFix;
	}

	public void setMafFix(List<String> mafFix) {
		this.mafFix = mafFix;
	}

	public List<String> getAirIntakeTubeFix() {
		return airIntakeTubeFix;
	}

	public void setAirIntakeTubeFix(List<String> airIntakeTubeFix) {
		this.airIntakeTubeFix = airIntakeTubeFix;
	}

	public List<String> getTurboChargerFix() {
		return turboChargerFix;
	}

	public void setTurboChargerFix(List<String> turboChargerFix) {
		this.turboChargerFix = turboChargerFix;
	}

	public List<String> getThrottleBodyFix() {
		return throttleBodyFix;
	}

	public void setThrottleBodyFix(List<String> throttleBodyFix) {
		this.throttleBodyFix = throttleBodyFix;
	}

	public List<String> getIntercoolerFix() {
		return intercoolerFix;
	}

	public void setIntercoolerFix(List<String> intercoolerFix) {
		this.intercoolerFix = intercoolerFix;
	}

	public List<String> getMapFix() {
		return mapFix;
	}

	public void setMapFix(List<String> mapFix) {
		this.mapFix = mapFix;
	}

	public List<String> getIntakemanifoldFix() {
		return intakemanifoldFix;
	}

	public void setIntakemanifoldFix(List<String> intakemanifoldFix) {
		this.intakemanifoldFix = intakemanifoldFix;
	}

	public List<String> getExhaustmanifoldFix() {
		return exhaustmanifoldFix;
	}

	public void setExhaustmanifoldFix(List<String> exhaustmanifoldFix) {
		this.exhaustmanifoldFix = exhaustmanifoldFix;
	}

	public List<String> getEgrFix() {
		return egrFix;
	}

	public void setEgrFix(List<String> egrFix) {
		this.egrFix = egrFix;
	}

	public List<String> getCatalyticConverterFix() {
		return catalyticConverterFix;
	}

	public void setCatalyticConverterFix(List<String> catalyticConverterFix) {
		this.catalyticConverterFix = catalyticConverterFix;
	}

	public List<String> getDpfFix() {
		return dpfFix;
	}

	public void setDpfFix(List<String> dpfFix) {
		this.dpfFix = dpfFix;
	}
	
	
}
