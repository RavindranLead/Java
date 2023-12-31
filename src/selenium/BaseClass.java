package selenium;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {


	public static WebDriver driver;

	public static void browserLaunch(String option) {
		if (option.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();	


		}else if (option.equalsIgnoreCase("edge")) {
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();	

		}else if (option.equalsIgnoreCase("Firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
			driver.manage().window().maximize();		
		}
		driver.manage().window().maximize();


	}
	public static void getUrl(String url) {
		driver.get(url);

	}

	public static WebElement elementFinder(String option, String value) {
		try {
			if (option.equalsIgnoreCase("id")) {
				WebElement id = driver.findElement(By.id(value));
				return id;

			}else if (option.equalsIgnoreCase("name")) {
				WebElement name = driver.findElement(By.name(value));
				return name;

			}else if (option.equalsIgnoreCase("className")) {
				WebElement className = driver.findElement(By.className(value));
				return className;

			}else if (option.equalsIgnoreCase("tagName")) {
				WebElement tagName = driver.findElement(By.tagName(value));
				return tagName;

			}else if (option.equalsIgnoreCase("linkText")) {
				WebElement linkText = driver.findElement(By.linkText(value));
				return linkText;

			}
			else if (option.equalsIgnoreCase("partialLinkText")) {
				WebElement partialLinkText = driver.findElement(By.partialLinkText(value));
				return partialLinkText;

			}else if (option.equalsIgnoreCase("xpath")) {
				WebElement xpath = driver.findElement(By.xpath(value));
				return xpath;

			}else if (option.equalsIgnoreCase("css")) {
				WebElement css = driver.findElement(By.cssSelector(value));
				return css;

			}

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;

	}
	public static void clicks(WebElement element) {
		element.click();

	}
	public static void sendKeys(WebElement element, String value) {
		element.sendKeys(value);

	}

	public static void close() {
		driver.close();

	}
	public static void quit() {
		driver.quit();

	}
	public static void navigateTo(String url) {
		driver.navigate().to(url);
		
	}
	
	public static void navigateBack() {
		driver.navigate().back();
		
	}
	public static void navigateForward() {
		driver.navigate().forward();
		
	}
	
	public static void refresh() {
		driver.navigate().refresh();
		
	}
}







