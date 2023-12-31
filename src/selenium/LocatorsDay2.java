package selenium;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class LocatorsDay2 extends BaseClass {

	public static void main(String[] args) throws InterruptedException {
		browserLaunch("Chrome");
		getUrl("https://www.redbus.in/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		//		WebElement email = driver.findElement(By.id("email"));
		//		email.sendKeys("ravinop1098@gmail.com");
		//		WebElement pass = driver.findElement(By.id("pass"));
		//		pass.sendKeys("Ravi123");
		//		Thread.sleep(2000);
		//		driver.findElement(By.xpath("//div[@class='_9lsa']//child::*")).click();
		//		

//		WebElement from = driver.findElement(By.id("src"));
//		from.sendKeys("Chennai");
//		WebElement from1 = driver.findElement(By.xpath("//text[text()='Egmore']"));
//		Actions a =new Actions(driver);
//		a.moveToElement(from1).click().perform();
//		WebElement des = driver.findElement(By.id("dest"));
//		des.sendKeys("Mumbai");
//		WebElement to = driver.findElement(By.xpath("//text[text()='Andheri East']"));
//		a.moveToElement(to).click().perform();
		List<WebElement> tagName = driver.findElements(By.tagName("a"));
		for (WebElement tag : tagName) {
			System.out.println(tag);
			
		}
	


	}

}
