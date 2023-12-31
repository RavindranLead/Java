package javaCodingPractice;

public class ReverseWordsInSentence {

	public static void main(String[] args) {
		
		String given = "India is my Country";
		String reversed = "";
		
		String[] split = given.split(" ");
		System.out.println(split[0]);
		
		
		for(int i = split.length-1;i>=0;i--) {
			
  			reversed=reversed+split[i]+ " ";
		}
		System.out.println(reversed);
		

	}

}
