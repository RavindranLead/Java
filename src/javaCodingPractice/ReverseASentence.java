package javaCodingPractice;

public class ReverseASentence {

	public static void main(String[] args) {
		String given = "I love India";
		String reversed = "";
		String[] split = given.split(" ");
		for(int i = split.length-1;i>=0;i--) {

			reversed=reversed+split[i]+ " ";
		}
		System.out.print(reversed);
		
		

	}

}


