package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Letcode extends BaseClass{

	public static void main(String[] args) {
		browserLaunch("Chrome");
		getUrl("https://letcode.in/frame");
		WebElement frame1 = driver.findElement(By.id("firstFr"));
		driver.switchTo().frame(frame1);
		driver.findElement(By.name("fname")).sendKeys("Ravindran");
		
		WebElement frame2 = driver.findElement(By.xpath("//iframe[@src='innerFrame']"));
		driver.switchTo().frame(frame2);
		driver.findElement(By.name("email")).sendKeys("Google@123.com");

	}

}
