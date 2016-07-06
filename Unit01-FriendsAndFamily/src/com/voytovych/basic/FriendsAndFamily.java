package com.voytovych.basic;

import java.util.Scanner;

public class FriendsAndFamily {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		do {
			System.out.println("\n Enter list price: ");
			double listPrice = input.nextDouble();
			
			System.out.println(" Enter discount %: ");
			int discount = input.nextInt();
			
			System.out.println("Your price: " + listPrice);
			System.out.println("Your discoutn: " + discount);
		} while (true);
	}

}
