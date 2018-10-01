package com.revature.functional.domain;

public class Hospital implements Comparable<Hospital>{
	private String name;
	private int nDoctors;
	private int nNurses;
	private double budget;

	public Hospital(String name, int nDoctors, int nNurses, double budget) {
		super();
		this.name = name;
		this.nDoctors = nDoctors;
		this.nNurses = nNurses;
		this.budget = budget;
	}
	
	public Hospital(String name, double budget) {
		this(name, 10, 50, budget);
	}
	
	public double getBudget() {
		return budget;
	}

	@Override
	public int compareTo(Hospital o) {
		// TODO Auto-generated method stub
		return 0;
	}

}
