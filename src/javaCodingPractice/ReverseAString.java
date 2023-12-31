package javaCodingPractice;

public class ReverseAString {

	public static void main(String[] args) {
		String given = "India";
		String reveresd = "";

		char[] charArray = given.toCharArray();

		for(int i = charArray.length-1;i>=0;i--) {

			reveresd=reveresd+charArray[i];

		}

		System.out.println(reveresd);



	}
}
