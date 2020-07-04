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
	@ElementCollection
	private List<String> mafFix;
	@ElementCollection
	private List<String> airIntakeTubeFix;
	@ElementCollection
	private List<String> turboChargerFix;
	@ElementCollection
	private List<String> throttleBodyFix;
	@ElementCollection
	private List<String> intercoolerFix;
	@ElementCollection
	private List<String> mapFix;
	@ElementCollection
	private List<String> intakemanifoldFix;
	@ElementCollection
	private List<String> exhaustmanifoldFix;
	@ElementCollection
	private List<String> egrFix;
	@ElementCollection
	private List<String> catalyticConverterFix;
	@ElementCollection
	private List<String> dpfFix;
	
	public void GenerateFixes() {
		this.mafFix = new ArrayList<>();
		this.airIntakeTubeFix = new ArrayList<String>();
		this.turboChargerFix = new ArrayList<String>();
		this.throttleBodyFix = new ArrayList<String>();
		this.intercoolerFix = new ArrayList<String>();
		this.mapFix = new ArrayList<String>();
		this.intakemanifoldFix = new ArrayList<String>();
		this.exhaustmanifoldFix = new ArrayList<String>();
		this.egrFix = new ArrayList<String>();
		this.catalyticConverterFix = new ArrayList<String>();
		this.dpfFix = new ArrayList<String>();;
		
		
		this.mafFix.add("Clean maf");
		this.mafFix.add("Maf replacement");
		this.airIntakeTubeFix.add("Check for leakage");
		this.airIntakeTubeFix.add("Air intake tube replacement");
		this.turboChargerFix.add("Check for oil signs in turbo charger");
		this.turboChargerFix.add("Check turbine gap in turbo charger");
		this.turboChargerFix.add("Turbo charger replacement");
		this.throttleBodyFix.add("Clean throttle body");
		this.intercoolerFix.add("Check for leakage");
		this.intercoolerFix.add("Intercooler replacement");
		this.mapFix.add("Clean map");
		this.mapFix.add("Map replacement");
		this.intakemanifoldFix.add("Check for intake manifold leakage");
		this.intakemanifoldFix.add("Intakemanifold replacement");
		this.exhaustmanifoldFix.add("Check for exhaust manifold leakage");
		this.exhaustmanifoldFix.add("Exhaustmanifold replacement");
		this.egrFix.add("Clean EGR valve");
		this.egrFix.add("EGR Replacement");
		this.catalyticConverterFix.add("CatalyticConverter replacement");
		this.dpfFix.add("Go to highway and drive car for 20min on higher revs");
		this.dpfFix.add("Using diagnostic force dpf regeneration");
		this.dpfFix.add("DPF replacement");
		
	}
	
	

	public AirFlowPartsFix() {
		super();
		// TODO Auto-generated constructor stub
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
