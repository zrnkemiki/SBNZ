package com.ftn.carDiagnostic.model;

import java.util.List;

public class Car {
	
	private Long id;
	private String brand;
	private String model;
	private String year;
	private String engineType;
	private String milage;
	private List<CarComponentsProblem> problemHistory;
}
