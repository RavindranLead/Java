package javaCodingPractice;

import java.util.Iterator;

public class ElementPresentOrNot {
	
//	Step 1 : Store all the numbers in the Array.
//	Step 2 : Declare the variable for the finding number
//	Step 3 : Declare a boolean variable as false
//	Step 4 : Iterate the numbers in the array using Foreach loop
//	Step 5 : Inside the forloop, create a If condition for find the number.
//    Step 6 : Always use the result statement in the out side of the loop.
	
	
	public static void main(String[] args) {
		int [] numbers = {10,20,30,40,50,60,70};
		
		int numberToFind=40;
		
		Boolean numFound = false;
		
		for (int numList : numbers) {
			if (numList==numberToFind) {
				numFound=true;
				
			}
			
		}
		
		if (numFound) {
			System.out.println("Number is Present");
			
		}
		else {
			System.out.println("Number is NOT Present");
		}
		
		}
		

	}


