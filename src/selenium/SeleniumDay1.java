package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SeleniumDay1 extends BaseClass {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\VITLAP180\\eclipse-workspace\\JavaPractice1\\Drivers\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://google.com");
//		WebDriverManager.chromedriver().setup();
//		WebDriver driver = new ChromeDriver();
//		driver.get("https://google.com");
//		driver.manage().window().maximize();
//		String currentUrl = driver.getCurrentUrl();
//		System.out.println(currentUrl);
//		String title = driver.getTitle();
//		System.out.println(title);
//		driver.navigate().to("https://facebook.com");
//		driver.navigate().back();
//		driver.navigate().forward();
//		driver.navigate().refresh();
//		driver.navigate().to("https://netmeds.com");
//		
		

		

	}

}
