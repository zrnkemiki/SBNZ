package com.ftn.carDiagnostic.model.fix;

import java.util.ArrayList;
import java.util.List;

public class ElectricalPartsFix {
	
	/*Razliciti nacini popravke delova automobila su grupisani po klasama onog tipa kom pripadaju ( elektro, mehanicki..).
	 *Aplikacija pomocu pravila, na osnovu dela koji je problematican, pomocu pravila dobavlja popravku za taj deo.
	 */
	
	private String testFix;
	
	private List<String> headlightFix;
	private List<String> taillightFix;
	private List<String> electricWindowsFix;
	private List<String> electricWindowMotorFix;
	private List<String> batteryFix;
	private List<String> electricFanFix;
	
	public ElectricalPartsFix(List<String> headlightFix, List<String> taillightFix, List<String> electricWindowsFix,
			List<String> batteryFix, List<String> electricFanFix, List<String> electricWindowMotorFix) {
		super();
		this.headlightFix = headlightFix;
		this.taillightFix = taillightFix;
		this.electricWindowsFix = electricWindowsFix;
		this.batteryFix = batteryFix;
		this.electricFanFix = electricFanFix;
		this.electricWindowMotorFix = electricWindowMotorFix;
	}

	public ElectricalPartsFix() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public void TestFixes() {
		this.headlightFix = new ArrayList<String>();
		this.taillightFix = new ArrayList<String>();;
		this.electricWindowsFix = new ArrayList<String>();;
		this.batteryFix = new ArrayList<String>();;
		
		this.headlightFix.add("Check fuse");
		this.headlightFix.add("Check front contact");
		this.taillightFix.add("Check fuse");
		this.taillightFix.add("Check rear contact");
		this.electricWindowsFix.add("Check fuse");
		this.electricWindowsFix.add("Check contact");
		this.electricWindowsFix.add("Check window motor"); //Prebaci problem na electric window motor!
		this.batteryFix.add("Jump start your car");
		this.batteryFix.add("Recharge battery");
	}

	public List<String> getHeadlightFix() {
		return headlightFix;
	}

	public void setHeadlightFix(List<String> headlightFix) {
		this.headlightFix = headlightFix;
	}

	public List<String> getTaillightFix() {
		return taillightFix;
	}

	public void setTaillightFix(List<String> taillightFix) {
		this.taillightFix = taillightFix;
	}

	public List<String> getElectricWindowsFix() {
		return electricWindowsFix;
	}

	public void setElectricWindowsFix(List<String> electricWindowsFix) {
		this.electricWindowsFix = electricWindowsFix;
	}

	public List<String> getBatteryFix() {
		return batteryFix;
	}

	public void setBatteryFix(List<String> batteryFix) {
		this.batteryFix = batteryFix;
	}

	public String getTestFix() {
		return testFix;
	}

	public void setTestFix(String testFix) {
		this.testFix = testFix;
	}

	public List<String> getElectricFanFix() {
		return electricFanFix;
	}

	public void setElectricFanFix(List<String> electricFanFix) {
		this.electricFanFix = electricFanFix;
	}

	public List<String> getElectricWindowMotorFix() {
		return electricWindowMotorFix;
	}

	public void setElectricWindowMotorFix(List<String> electricWindowMotorFix) {
		this.electricWindowMotorFix = electricWindowMotorFix;
	}
	
	
	
	
}
