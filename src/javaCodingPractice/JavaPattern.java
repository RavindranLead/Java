package javaCodingPractice;

import java.util.Scanner;

public class JavaPattern {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number of lines");
		int numberOfLines = scanner.nextInt(); //3

		int row,column=0;


//		for(row=0;row<numberOfLines;row++) {
//			for(coloum=0;coloum<=row;coloum++) {
//				System.out.print("*");
//
//			}
//			System.out.println();
//
//		}
		
		for(row=1;row<numberOfLines;row++) {
			for(column=1;column<=row;column++) {
				System.out.print(column + " ");
				
		}
			System.out.println();
		}
		
		
		
		
	

	}

}
