package com.voytovych.basic;

public class ForeignContractor extends Person {
	
	public ForeignContractor(String name){
		super(name);
	}
	public boolean increasePay(int percent) {
	
		System.out.println("I'm just a foreign worker");
		return true;
	}
}
