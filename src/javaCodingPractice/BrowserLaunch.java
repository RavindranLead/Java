package javaCodingPractice;

public class BrowserLaunch {

	public static void main(String[] args) {
		String broswer = "Chrome";

		switch (broswer) {
		case "Firefox":
			System.out.println("Firefox Launched Successfully");
			
			
		case "Edge":
			System.out.println("Edge Launched Successfully");
			
		case "Chrome":
			System.out.println("Chrome Launched Successfully");
			break;

		default:
			System.out.println("Browser Not Launched");
			
		}

	
		

	}

}
