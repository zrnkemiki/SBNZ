package com.ftn.carDiagnostic.helper;

import java.util.ArrayList;
import java.util.List;

import com.ftn.carDiagnostic.model.fix.AirFlowPartsFix;


public class Proba {

	public static void main(String[] args) {
		
		ArrayList<String> lista = new ArrayList<String>();
		
		AirFlowPartsFix fixes = new AirFlowPartsFix();
		
		List<String> turbo = new ArrayList<String>();
		turbo.add("turbofix1");
		turbo.add("turbofix2");
		
		List<String> air = new ArrayList<String>();
		air.add("airfix1");
		air.add("airfix2");
		
		fixes.setTurboChargerFix(turbo);
		fixes.setAirIntakeTubeFix(air);
		
		List<String> turboget = fixes.getTurboChargerFix();
		List<String> airget = fixes.getAirIntakeTubeFix();
		
		lista.addAll(turboget);
		lista.addAll(airget);
		
		for (String s : lista) {
			System.out.println(s);
		}
		

	}

}
