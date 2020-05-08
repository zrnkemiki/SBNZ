package com.ftn.carDiagnostic.model;

public class AirFlowParts extends CarComponentsProblem {

	private boolean airFilter;
	private boolean massAirFlowMeter;
	private boolean airIntakeTube;
	private boolean turboCharger;
	private boolean throttleBody;
	private boolean intercooler;
	private boolean manifoldAirPressure;
	private boolean intakeManifold;
	private boolean exhaustManifold;
	private boolean egrValve;
	private boolean catalyticConverter;
	private boolean dieselParticulateFilter;
	
	
	
	
	public AirFlowParts() {
		super();
		// TODO Auto-generated constructor stub
	}
	public AirFlowParts(boolean airFilter, boolean massAirFlowMeter, boolean airIntakeTube, boolean turboCharger,
			boolean throttleBody, boolean intercooler, boolean manifoldAirPressure, boolean intakeManifold,
			boolean exhaustManifold, boolean egrValve, boolean catalyticConverter, boolean dieselParticulateFilter) {
		super();
		this.airFilter = airFilter;
		this.massAirFlowMeter = massAirFlowMeter;
		this.airIntakeTube = airIntakeTube;
		this.turboCharger = turboCharger;
		this.throttleBody = throttleBody;
		this.intercooler = intercooler;
		this.manifoldAirPressure = manifoldAirPressure;
		this.intakeManifold = intakeManifold;
		this.exhaustManifold = exhaustManifold;
		this.egrValve = egrValve;
		this.catalyticConverter = catalyticConverter;
		this.dieselParticulateFilter = dieselParticulateFilter;
	}
	public boolean isAirFilter() {
		return airFilter;
	}
	public void setAirFilter(boolean airFilter) {
		this.airFilter = airFilter;
	}
	public boolean isMassAirFlowMeter() {
		return massAirFlowMeter;
	}
	public void setMassAirFlowMeter(boolean massAirFlowMeter) {
		this.massAirFlowMeter = massAirFlowMeter;
	}
	public boolean isAirIntakeTube() {
		return airIntakeTube;
	}
	public void setAirIntakeTube(boolean airIntakeTube) {
		this.airIntakeTube = airIntakeTube;
	}
	public boolean isTurboCharger() {
		return turboCharger;
	}
	public void setTurboCharger(boolean turboCharger) {
		this.turboCharger = turboCharger;
	}
	public boolean isThrottleBody() {
		return throttleBody;
	}
	public void setThrottleBody(boolean throttleBody) {
		this.throttleBody = throttleBody;
	}
	public boolean isIntercooler() {
		return intercooler;
	}
	public void setIntercooler(boolean intercooler) {
		this.intercooler = intercooler;
	}
	public boolean isManifoldAirPressure() {
		return manifoldAirPressure;
	}
	public void setManifoldAirPressure(boolean manifoldAirPressure) {
		this.manifoldAirPressure = manifoldAirPressure;
	}
	public boolean isIntakeManifold() {
		return intakeManifold;
	}
	public void setIntakeManifold(boolean intakeManifold) {
		this.intakeManifold = intakeManifold;
	}
	public boolean isExhaustManifold() {
		return exhaustManifold;
	}
	public void setExhaustManifold(boolean exhaustManifold) {
		this.exhaustManifold = exhaustManifold;
	}
	public boolean isEgrValve() {
		return egrValve;
	}
	public void setEgrValve(boolean egrValve) {
		this.egrValve = egrValve;
	}
	public boolean isCatalyticConverter() {
		return catalyticConverter;
	}
	public void setCatalyticConverter(boolean catalyticConverter) {
		this.catalyticConverter = catalyticConverter;
	}
	public boolean isDieselParticulateFilter() {
		return dieselParticulateFilter;
	}
	public void setDieselParticulateFilter(boolean dieselParticulateFilter) {
		this.dieselParticulateFilter = dieselParticulateFilter;
	}
	
	
}
