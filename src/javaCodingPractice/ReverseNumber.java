package javaCodingPractice;

import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		int given = 0;
		System.out.println("Enter the Number");
		Scanner s = new Scanner(System.in);
		given  = s.nextInt();
		
		
		
		int reveresedNum=0;
		while(given!=0) {
		reveresedNum=reveresedNum*10;
		reveresedNum=reveresedNum+given%10;
		given=given/10;
		}

		System.out.println(reveresedNum);
	}

}
