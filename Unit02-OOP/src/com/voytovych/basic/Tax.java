package com.voytovych.basic;

public class Tax {
	int numberOfDependents;
	double grossIncome;
	String state;
	
	Tax () {
		
	}
	
	Tax (double gi, String st, int depen) {
		grossIncome = gi;
		state = st;
		numberOfDependents = depen;
	}
	
	public double calcTax() {
		
		if (grossIncome < 50000) {
			return grossIncome*0.06;
		}else{
			return grossIncome*0.08;
		}
	}
}
