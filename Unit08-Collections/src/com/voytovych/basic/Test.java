package com.voytovych.basic;

import java.util.ArrayList;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		ArrayList customers = new ArrayList();
		Customer cust1 = new Customer("David","Lee");
		customers.add(cust1);
		Customer cust2 = new Customer("Ringo","Starr");
		customers.add(cust2);
		
		Customer theBestCustomer = (Customer) customers.get(0);
		
		Order ord = new Order();
		customers.add(ord);
		
		int totalElem = customers.size();
		for (int i = 0; i < totalElem; i++) {
			Customer currentCust = (Customer) customers.get(i); // Exception in thread "main" java.lang.ClassCastException
			System.out.println("The current customer is " + currentCust.lastName);
		}
		

	}

}
