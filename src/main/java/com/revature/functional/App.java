package com.revature.functional;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.revature.functional.domain.GenericHospitalBuilder;
import com.revature.functional.domain.Hospital;
import com.revature.functional.domain.HospitalBuilder;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		Hospital mercy = new HospitalBuilder()
				.withName("Mercy Hospital")
				.withNNurses(50)
				.withBudget(15)
				.withNDoctors(3)
				.buildHospital();
		
		Hospital noMercy = new GenericHospitalBuilder()
				.with($ -> {
					$.name = "No Mercy";
					$.nDoctors = 0;
					$.nNurses = -1;
					$.budget = 0.0;
				})
				.buildHospital();
		
		//Anonymous function
		Runnable r1 = new Runnable() {
			@Override
			public void run() {
				System.out.println("Hello from runnable");
			}
		};
		
		int x = 5;
		//Lambda function
		Runnable r2 = () -> {System.out.println("Hello from runnable again");};
		
		//Sort budget with lambda
		List<Hospital> hospitalList = new ArrayList<>();
		hospitalList.add(mercy);
		hospitalList.add(noMercy);
		//Collections.sort(hospitalList, (Hospital h1, Hospital h2) -> h1.getBudget().compareTo(h2.getBudget()));
		
		//(int x, int y) -> x + y;
		//() -> 42
		//(String str) -> { System.out.println(str); }
		
	}
}
