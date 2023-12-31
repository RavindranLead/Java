package javaCodingPractice;

public class CountTheVowelsInTheGivenString {

	public static void main(String[] args) {
		// 1. Let assume the count of the vowel is 0 and uniform the sting into one particular case
		// 2. Calculate the length of the string
		// 3. iterate the given string till end of the length.
		// 4. in if condition check the characters index with the vowels
		// 5 . if condition satisfies increase the count

		String given = "Lionel Messi";
		String given1 = given.toLowerCase();
		int vowelCount = 0;
		int length = given1.length();
		for(int i=0;i<length;i++) {
			if (given1.charAt(i)=='a' || given1.charAt(i)=='e' || given1.charAt(i)=='i' || given1.charAt(i)=='o' ||
					given1.charAt(i)=='u') {

				vowelCount++;
			}
		}
		System.out.println("Vowel count is :" + vowelCount);

	}

}
