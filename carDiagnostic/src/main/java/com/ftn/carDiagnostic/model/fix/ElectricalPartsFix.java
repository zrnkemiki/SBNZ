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
@Table(name = "electricalpartsfix")
public class ElectricalPartsFix {
	
	/*Razliciti nacini popravke delova automobila su grupisani po klasama onog tipa kom pripadaju ( elektro, mehanicki..).
	 *Aplikacija pomocu pravila, na osnovu dela koji je problematican, pomocu pravila dobavlja popravku za taj deo.
	 */
	
	//private String testFix;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@ElementCollection
	private List<String> headlightFix;
	@ElementCollection
	private List<String> taillightFix;
	@ElementCollection
	private List<String> electricWindowsFix;
	@ElementCollection
	private List<String> electricWindowMotorFix;
	@ElementCollection
	private List<String> batteryFix;
	@ElementCollection
	private List<String> electricFanFix;
	@ElementCollection
	private List<String> alternatorFix; 
	
	public ElectricalPartsFix(List<String> headlightFix, List<String> taillightFix, List<String> electricWindowsFix,
			List<String> batteryFix, List<String> electricFanFix, List<String> electricWindowMotorFix, List<String> alternatorFix) {
		super();
		this.headlightFix = headlightFix;
		this.taillightFix = taillightFix;
		this.electricWindowsFix = electricWindowsFix;
		this.batteryFix = batteryFix;
		this.electricFanFix = electricFanFix;
		this.electricWindowMotorFix = electricWindowMotorFix;
		this.alternatorFix = alternatorFix;
	}

	public ElectricalPartsFix() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public void GenerateFixes() {
		this.headlightFix = new ArrayList<String>();
		this.taillightFix = new ArrayList<String>();;
		this.electricWindowsFix = new ArrayList<String>();;
		this.batteryFix = new ArrayList<String>();;
		this.electricFanFix = new ArrayList<String>();
		this.electricWindowMotorFix = new ArrayList<String>();
		this.alternatorFix = new ArrayList<String>();
		
		this.headlightFix.add("Check fuse");
		this.headlightFix.add("Check front contact");
		this.headlightFix.add("Headlight replacement");
		this.taillightFix.add("Check fuse");
		this.taillightFix.add("Check rear contact");
		this.taillightFix.add("Taillight replacement");
		this.electricWindowsFix.add("Check fuse");
		this.electricWindowsFix.add("Check contact");
		this.electricWindowsFix.add("Check window motor");
		this.electricWindowsFix.add("Window replacement");
		this.batteryFix.add("Jump start your car");
		this.batteryFix.add("Recharge battery");
		this.batteryFix.add("Battery replacement");
		this.electricFanFix.add("Replace fan");
		this.electricFanFix.add("Electricfan replacement");
		this.electricWindowMotorFix.add("Window motor replacement");
		this.alternatorFix.add("Check alternator charging voltage");
		this.alternatorFix.add("Check Rotor and Stator");
		this.alternatorFix.add("Alternator replacement");
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

	public List<String> getAlternatorFix() {
		return alternatorFix;
	}

	public void setAlternatorFix(List<String> alternatorFix) {
		this.alternatorFix = alternatorFix;
	}
	
	
	
	
}
