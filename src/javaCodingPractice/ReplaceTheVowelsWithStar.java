package javaCodingPractice;

import java.util.Iterator;

public class ReplaceTheVowelsWithStar {
	// Convert the given string in to CharArray
	// By using for loop iterate the charArray

	public static void main(String[] args) {

		String given = "Ravi";
//		char[] charArray = given.toCharArray();
//
//		for(int i = 0;i<charArray.length;i++) {
//
//			if (given.charAt(i)=='a' || given.charAt(i)=='e' || given.charAt(i)=='i' ||
//					given.charAt(i)=='o' || given.charAt(i)=='u' || given.charAt(i)=='A' || given.charAt(i)=='E' || given.charAt(i)=='I' ||
//					given.charAt(i)=='O' || given.charAt(i)=='U') {
//				charArray[i]='*';
//
//
//			}
//			
//			System.out.print(charArray[i]);
//
//		}
		
		String replaceAll = given.replaceAll("[AEIOUaeiou]", "*");
		System.out.println(replaceAll);
		



	}

}
