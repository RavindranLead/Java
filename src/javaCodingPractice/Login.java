package javaCodingPractice;

public class Login {
	
	private void browserLaunch() {
		System.out.println("Browser Launched Successfully");

	}
	
	private void enterUsername() {
		System.out.println("Entered UserName Successfully");
		

	}
	private void enterPassword() {
		System.out.println("Entered Password Successfully");
	

	}
	
	
	private void login() {
		System.out.println("Clicked Login Button Successfully");

	}
	

		public static void main(String[] args) {
			
			//Classname objName = new Classname();
			Login obj = new Login();
			obj.browserLaunch();
			obj.enterUsername();
			
			
			
			
		}
		
		

}


