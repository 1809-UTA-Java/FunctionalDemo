package com.revature.functional.domain;

import java.util.function.Consumer;

public class GenericHospitalBuilder {
	public String name;
	public int nDoctors;
	public int nNurses;
	public double budget;

	public GenericHospitalBuilder with(Consumer<GenericHospitalBuilder> builderFunction) {
		builderFunction.accept(this);
		return this;
	}
	
	public Hospital buildHospital() {
		return new Hospital(name, nDoctors, nNurses, budget);
	}
}
