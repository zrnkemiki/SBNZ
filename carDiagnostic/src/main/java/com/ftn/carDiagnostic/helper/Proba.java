package com.ftn.carDiagnostic.helper;

import java.util.Calendar;
import java.util.Date;

public class Proba {

	public static void main(String[] args) {
		
		Date d = new Date();
		
		System.out.println(d);
		
		Calendar cal = Calendar.getInstance();
		cal.setTime(d);
		cal.set(Calendar.HOUR_OF_DAY, 23);
		
		Date novi = cal.getTime();
		System.out.println(novi);

	}

}
