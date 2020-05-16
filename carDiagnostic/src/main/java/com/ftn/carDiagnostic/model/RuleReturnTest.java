package com.ftn.carDiagnostic.model;

import java.util.List;import com.google.common.collect.Range;

public class RuleReturnTest {
	
	
	
	public RuleReturnTest() {
		super();
		// TODO Auto-generated constructor stub
	}

	public void ruleReturn(List<String> fixes) {
		for (int i = 0; i < fixes.size(); i++)
		System.out.println( (i+1)  + " Please  " + fixes.get(i) );
	}
}
