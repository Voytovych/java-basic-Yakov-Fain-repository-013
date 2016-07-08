package com.voytovych.basic;

public class WhileLoopDemo {

	public static void main(String[] args) {
		String [] friends = new String [20];
		friends[0] = "Masha";
		friends[1] = "Matilda";
		friends[2] = "Rosa";
		friends[18] = "Hillary";
		friends[19] = "Natalia";
		
		int totalElements = friends.length;
		int i = 0;
		
		while (i < totalElements) {
			if (friends[i] == null || friends[i] == "Rosa") {
				i++;
				//Go back to check the while expression
				continue;
			}
			
			System.out.println("I love " + friends[i]);
			i++;
			
		}
		System.out.println("The iteration is over");

	}

}
