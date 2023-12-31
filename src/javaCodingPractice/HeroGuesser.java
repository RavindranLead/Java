package javaCodingPractice;

public class HeroGuesser {
	
	private void heroFinder() {
		String heroName = "Vijay";
		if (heroName.equals("Ajith")) {
			System.out.println("You guessed Actor Ajith");	
		}else if (heroName.equals("Dulquer")) {
			System.out.println("You guessed Actor Dulquer");
			
		}else if (heroName.equals("Vijay")) {
			System.out.println("You guessed Actor Vijay");
			
		}else {
			System.out.println("Your guesssing was wrong");
		}

	}
	
	

	public static void main(String[] args) {
		
		HeroGuesser obj = new HeroGuesser();
		obj.heroFinder();
		
		
		
	
		
		

	}

}
