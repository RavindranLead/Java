package com.javapractice;

public class BankAccount {


	String accountHolderName = "Dharun";
	char initial ='G';
	int age = 25;
	long phoneNumber=9876543210l;
	int accountBalance=67556;


	private void myBalance() {
		System.out.println("My account Balance is: " + accountBalance);
		

	}
	



	public static void main(String[] args) {
		
		// Classname objName = new Classname();
		
		/*This my account balance getting code
		my name is Dharun*/
		
		
		BankAccount account = new BankAccount();
		account.myBalance();
		
		
		
	
		
		
		


	}

}
