package com.voytovych.basic;

public class TestTax {

	public static void main(String[] args) {
//		Tax t = new Tax();
		NJTax t = new NJTax();
		
		t.grossIncome = 40000;
		t.numberOfDependents = 2;
		t.state = "NJ";
		
		double yourTax = t.calcTax();
		
//		System.out.println("Your tax is " + yourTax);
		
		double njt = t.adjustForStudents(yourTax);
		
		System.out.println("Your tax is " + njt);
	}

}
