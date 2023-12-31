package javaCodingPractice;



public class LengthOfTheString {

	public static void main(String[] args) {
		
		String givenString = "Ravi";
//		int length = givenString.length();
//		System.out.println(length);
		
		char[] charArray = givenString.toCharArray();
		int length = 0;
		
		for (char c : charArray) {
			
			length++;
			
			
		}
		System.out.println(length);
		
	

	}

}
