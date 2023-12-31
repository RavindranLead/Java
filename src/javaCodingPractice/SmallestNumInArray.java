package javaCodingPractice;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SmallestNumInArray {

	public static void main(String[] args) {

		//		int givenArray[]= {10,8,4,2,7};
		//
		//		int largest = Integer.MAX_VALUE;
		//
		//		for(int i = 0;i<givenArray.length;i++) {
		//
		//			if(givenArray[i]>largest) {
		//				largest = givenArray[i];
		//			}
		//		}
		//		System.out.println("Largest number is : " + largest);


//		int givenAray[]= {50,10,30,20,60};
//		int min=givenAray[0];
//
//		for(int i = 1;i<givenAray.length;i++)
//		{
//			if (givenAray[i]<min) {
//				min = givenAray[i]; 
//
//			}
//		}
//		System.out.println("minimum number in array is: " + min);

//		int givenArray[]= {50,10,30,20,60};
//		
//		Arrays.sort(givenArray);
//		System.out.println(givenArray[0]);
		
		
		Integer givenArray[]= {50,10,30,20,60};
		List<Integer> asList = Arrays.asList(givenArray);
		Collections.sort(asList);
		System.out.println(asList.get(0));
		
		

}
}


