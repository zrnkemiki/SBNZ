package com.ftn.carDiagnostic.model;

import java.util.List;

public class RuleReturnTest {

	public RuleReturnTest() {
		super();
		// TODO Auto-generated constructor stub
	}

	public void ruleReturn(List<String> fixes) {
		System.out.println("POSSIBLE FIXES: ");
		System.out.println("-----------------------------------");
		for (int i = 0; i < fixes.size(); i++) {
			System.out.println((i + 1)+ "." + " Please  " + fixes.get(i) + "!");
			
		}
		System.out.println("-----------------------------------");
	}
}
