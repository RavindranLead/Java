package javaCodingPractice;

public class NumberPattern {

	public static void main(String[] args) {
		int givenNumber = 6;
		
		int row,coloumn=0;
		
		for(row=1;row<=givenNumber;row++) {
			for(coloumn=1;coloumn<=row;coloumn++) {
				System.out.print(coloumn + " ");
		}
			
			System.out.println();
		}
		
		

	}

}
