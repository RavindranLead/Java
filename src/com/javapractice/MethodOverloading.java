package com.javapractice;

public class MethodOverloading {

	private int addition(int a) {
		return a;

	}

	private int addition(int a, int b) {
		
		return a+b;
	
	}

	public static void main(String[] args) {
		MethodOverloading overloading = new MethodOverloading();
		int addition = overloading.addition(66,34);
		System.out.println(addition);
		int addition2 = overloading.addition(8);
		System.out.println(addition2);
		
		 


	}

}
