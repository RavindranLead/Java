package com.javapractice;

public class StaticKeyword {

	
	int x = 0;
	static int  y = 0;
	
	
	public void person() {
		x++;
		y++;
		System.out.println("X value is " + x);
		System.out.println("Y Value is " + y );

	}
	public static void main(String[] args) {
		StaticKeyword staticKeyword = new StaticKeyword();
		staticKeyword.person();
		StaticKeyword staticKeyword1 = new StaticKeyword();
		staticKeyword1.person();
		StaticKeyword staticKeyword2 = new StaticKeyword();
		staticKeyword2.person();
		StaticKeyword staticKeyword3 = new StaticKeyword();
		staticKeyword3.person();

	}

}
