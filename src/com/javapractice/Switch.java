package com.javapractice;

public class Switch {

	char a = 'V';
	private void passOrFail() {
		switch (a) {
		case 'P':
			System.out.println("The test case is PASS");

			break;
		case 'F':
			System.out.println("The test case is FAIL");

			break;


		default:
			System.out.println("The test case is SKIPPED");

			break;
		}

	}



	public static void main(String[] args) {

		Switch switch1 = new Switch();
		switch1.passOrFail();

	}

}
