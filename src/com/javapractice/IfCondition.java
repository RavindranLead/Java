package com.javapractice;

public class IfCondition {
	
	String cricketerName = "Sachin";
	
	private void guesstheCricketName() {
		
		if (cricketerName.equalsIgnoreCase("Messi")) {
			System.out.println("he is not a Cricketer");
			
		}else if (cricketerName.equals("Safhin")) {
			System.out.println("Yes!! you are right");
			
		}
		
		
		else {
			System.out.println("I can't guess the person");
			
			
		}
		
	}
	

	public static void main(String[] args) {
		IfCondition condition = new IfCondition();
		condition.guesstheCricketName();
		

	}

}
