package com.javapractice;

public class Lion extends Animal {

	public static void main(String[] args) {
		
		Lion lion= new Lion();
		int legs2 = lion.legs;
		System.out.println("Lion has " + legs2 + " Legs");
		String type2 = lion.type;
		System.out.println("Lion's is from family of " + type2);
		System.out.println("Lion lives in the " + lion.lives);
		

	}

}
