package javaCodingPractice;

public class JavaPalindrome {

	public static void main(String[] args) {
	
		String given = "madam";
		
		char[] charArray = given.toCharArray();
	    
	    String rev = "";
	    
	    for(int i = charArray.length-1;i>=0;i--){
	        
	        rev=rev + charArray[i]; 
	        
	    }
	    
	    if(given.equals(rev)){
	        System.out.println("It's a Palindrome");
	    }else{
	        System.out.println("It's not a Palindrome");
	    }   
	        
	    }



}
