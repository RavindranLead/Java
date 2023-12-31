package com.javapractice;

public class StaticExample {
	
	
	public static void sayMyName() {
		System.out.println("My name is Ravindran");
		System.out.println("______________________________________");
		
	}
	
	private void sayMyAge() {
		System.out.println("I'm 24 yeard Old");
		
		

	}

	public static void main(String[] args) {
		sayMyName();
		StaticExample example = new StaticExample();
		example.sayMyAge();
		
	}

}
