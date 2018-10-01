package com.revature.functional.domain;

public class HospitalBuilder {
	private String name;
	private int nDoctors;
	private int nNurses;
	private double budget;
	
	public HospitalBuilder withName(String name) {
		this.name = name;
		return this;
	}
	
	public HospitalBuilder withNDoctors(int nDoctors) {
		this.nDoctors = nDoctors;
		return this;
	}
	
	public HospitalBuilder withNNurses(int nNurses) {
		this.nNurses = nNurses;
		return this;
	}
	
	public HospitalBuilder withBudget(double budget) {
		this.budget = budget;
		return this;
	}
	
	public Hospital buildHospital() {
		return new Hospital(name, nDoctors, nNurses, budget);
	}

}
