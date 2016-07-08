package com.voytovych.basic;

public class NJTax extends Tax {
	double adjustForStudents (double stateTax){
		double adjustedTax = stateTax - 500;
		return adjustedTax;
	}
	
	@Override
	public double calcTax() {
		
		if (grossIncome < 50000) {
			return grossIncome*0.10;
		}else{
			return grossIncome*0.13;
		}
	}
}
