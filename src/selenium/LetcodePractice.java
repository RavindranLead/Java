package selenium;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Keys;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LetcodePractice {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://letcode.in/dropdowns");
		//		driver.findElement(By.id("fullName")).sendKeys("Ravindran");
		//		driver.findElement(By.id("join")).sendKeys("narayanan" + Keys.TAB);
		//		driver.findElement(By.id("clearMe")).clear();
		//		WebElement enabled = driver.findElement(By.id("noEdit"));
		//		boolean enabled2 = enabled.isEnabled();
		//		System.out.println(enabled2);
		//		driver.navigate().to("https://letcode.in/buttons");
		//		driver.findElement(By.id("home")).click();
		//		driver.navigate().back();
		//		WebElement location = driver.findElement(By.id("position"));
		//		Point location2 = location.getLocation();
		//		System.out.println(location2);
		//		WebElement findElement = driver.findElement(By.id("color"));
		//		String cssValue = findElement.getCssValue(findElement.getText());
		//		System.out.println(cssValue);
		//		Dimension size = driver.findElement(By.id("driver.findElement(by.)")).getSize();
		//		System.out.println(size.getHeight());
		WebElement sel = driver.findElement(By.id("fruits"));
		Select s = new Select(sel);
		s.selectByIndex(3);
		List<WebElement> options = s.getOptions();
		for (WebElement webElement : options) {
			System.out.println(webElement.getText());
			
		}
	}

}
