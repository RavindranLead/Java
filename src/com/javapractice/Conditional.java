package com.javapractice;

public class Conditional {
	
	
	int a = 10;
	int b = 20;

	private void ifStatement() {
		
		if (a<b) {
			
			System.out.println(" You are correct");		
		}else {
			System.out.println(" You are wrong a is less than b");	
		}
	}
	
	
	public static void main(String[] args) {
		
		Conditional obj = new Conditional();
		obj.ifStatement();
		
		
	
	}

}
