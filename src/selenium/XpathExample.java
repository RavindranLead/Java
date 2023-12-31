package selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class XpathExample {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://saucedemo.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement userName = driver.findElement(By.xpath("//div[@class='form_group']/child::input[1]"));
		userName.sendKeys("standard_user");
		WebElement passWord = driver.findElement(By.xpath("//input[@id='login-button']/preceding::input[1]"));
		passWord.sendKeys("secret_sauce");
		WebElement login = driver.findElement(By.xpath("//input[@id='user-name']/following::input[2]"));
		login.click();
		WebElement product = driver.findElement(By.xpath("//a[@id='item_2_title_link']/child::*"));
		product.click();
		WebElement add = driver.findElement(By.xpath("//div[@class='inventory_details_desc large_size']/following-sibling::button"));
		add.click();
		WebElement cartLink = driver.findElement(By.xpath("//div[@class='header_secondary_container']/preceding::a[1]"));
		cartLink.click();
		WebElement checkout = driver.findElement(By.xpath("//button[@class='btn btn_secondary back btn_medium']/following::button"));
		checkout.click();
		WebElement firstName = driver.findElement(By.id("first-name"));
		firstName.sendKeys("Ravindran");
		WebElement lastName = driver.findElement(By.id("last-name"));
		lastName.sendKeys("Narayanan");
		WebElement pin = driver.findElement(By.id("postal-code"));
		pin.sendKeys("6584555");
		WebElement contine = driver.findElement(By.xpath("//div[@class='checkout_buttons']/child::input"));
		contine.click();
		WebElement finish = driver.findElement(By.xpath("//button[@class='btn btn_secondary back btn_medium cart_cancel_link']/following::button"));
		finish.click();
		
	
		
	}

}
