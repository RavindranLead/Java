package selenium;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class SeleniumPractice extends BaseClass {

	public static void main(String[] args) throws InterruptedException, AWTException {
		browserLaunch("Chrome");
		//		getUrl("https://letcode.in/edit");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		//		//		WebElement input = driver.findElement(By.id("fullName"));
		//		//		input.sendKeys("Ravindran");
		//		//		WebElement append = driver.findElement(By.id("join"));
		//		//		append.sendKeys(" - How about you?" + Keys.TAB);
		//		//		WebElement get = driver.findElement(By.id("getMe"));
		//		//		String attribute = get.getAttribute("value");
		//		//		System.out.println(attribute);
		//		//		WebElement clear = driver.findElement(By.id("clearMe"));
		//		//		clear.clear();
		//		//		WebElement editable = driver.findElement(By.id("noEdit"));
		//		//		boolean enabled = editable.isEnabled();
		//		//		System.out.println(enabled);
		//		//		
		//		//		driver.navigate().to("https://letcode.in/buttons");
		//		//		WebElement position = elementFinder("id", "position");
		//		//		position.click();
		//		//		Point location = position.getLocation();
		//		//		System.out.println(location);
		//		//		WebElement disable = driver.findElement(By.id("isDisabled"));
		//		//		boolean enabled2 = disable.isEnabled();
		//		//		System.out.println(enabled2);
		//		driver.navigate().to("https://letcode.in/dropdowns");
		//		WebElement fruit = driver.findElement(By.id("fruits"));
		//		Select s = new Select(fruit);
		//		s.selectByVisibleText("Apple");
		//		WebElement firstSelectedOption = s.getFirstSelectedOption();
		//		System.out.println(firstSelectedOption.getText());
		//		System.out.println("----------------------------------------------------");
		//		WebElement superh = driver.findElement(By.id("superheros"));
		//		Select s1 = new Select(superh);
		//		boolean multiple = s1.isMultiple();
		//		System.out.println(multiple);
		//		System.out.println("----------------------------------------------------");
		//		s1.selectByIndex(1);
		//		s1.selectByIndex(2);
		//		s1.selectByIndex(3);
		//		List<WebElement> allSelectedOptions = s1.getAllSelectedOptions();
		//		for (WebElement all : allSelectedOptions) {
		//			String attribute = all.getText();
		//			System.out.println(attribute);
		//			System.out.println("----------------------------------------------------");
		//			
		//		}
		//		WebElement lang = driver.findElement(By.id("lang"));
		//		Select s2 = new Select(lang);
		//		s2.selectByValue("java");
		//		List<WebElement> options = s2.getOptions();
		//		for (WebElement lang1 : options) {
		//			String text = lang1.getText();
		//			System.out.println(text);
		//
		//		}
		//		System.out.println("----------------------------------------------------");
		//		WebElement country = driver.findElement(By.id("country"));
		//		Select s3 = new Select(country);
		//		s3.selectByValue("India");
		//		WebElement firstSelectedOption2 = s3.getFirstSelectedOption();
		//		String text = firstSelectedOption2.getText();
		//		System.out.println(text);


		//		getUrl("https://letcode.in/alert");
		//		WebElement simple = driver.findElement(By.xpath("//button[text()='Simple Alert']"));
		//		simple.click();
		//		Alert alert = driver.switchTo().alert();
		//		alert.accept();
		//		WebElement confirm = driver.findElement(By.id("confirm"));
		//		confirm.click();
		//		Alert alert2 = driver.switchTo().alert();
		//		String text = alert2.getText();
		//		System.out.println(text);
		//		alert2.accept();
		//		WebElement prompt = driver.findElement(By.cssSelector("#prompt"));
		//		prompt.click();
		//		Alert alert3 = driver.switchTo().alert();
		//		alert3.sendKeys("I am a ROBOT" + Keys.TAB);
		//		String text2 = alert3.getText();
		//		System.out.println(text2);
		//		alert3.accept();
		//		WebElement modern = driver.findElement(By.id("modern"));
		//		modern.click();
		//		Thread.sleep(3000);
		//		driver.findElement(By.xpath("//button[@class='modal-close is-large']")).click();
		//		driver.navigate().to("https://letcode.in/frame");
		//		driver.switchTo().frame(0);
		//		WebElement fname = driver.findElement(By.xpath("//input[@name='fname']"));
		//		fname.sendKeys("Ravindran");
		//		WebElement lname = driver.findElement(By.xpath("//input[@name='lname']"));
		//		lname.sendKeys("Narayanan");
		//		driver.switchTo().frame(0);	
		//		WebElement frame2 = driver.findElement(By.name("email"));
		//		frame2.sendKeys("ravin123@gmail.com");
		//		driver.navigate().to("https://letcode.in/radio");
		//		WebElement first = driver.findElement(By.id("yes"));
		//		first.click();
		//		WebElement one = driver.findElement(By.id("two"));
		//		one.click();
		//		boolean selected = one.isSelected();
		//		System.out.println(selected);
		//		WebElement enable = driver.findElement(By.id("maybe"));
		//		boolean enabled = enable.isEnabled();
		//		System.out.println(enabled);
		//		WebElement checkbox = driver.findElement(By.xpath("(//input[@type='checkbox'])[1]"));
		//		boolean selected2 = checkbox.isSelected();
		//		System.out.println(selected2);
		//		driver.navigate().to("https://www.ajio.com/");
		Actions a = new Actions(driver);
		//		WebElement men = driver.findElement(By.xpath("(//a[@class=' alignTag'])[1]"));
		//		a.moveToElement(men).perform();
		//		WebElement shirts = driver.findElement(By.xpath("//a[@href='/men-shirts/c/830216013']"));
		//		a.moveToElement(shirts).click().perform();
		//		WebElement search = driver.findElement(By.xpath("//input[@name='searchVal']"));
		//		search.sendKeys("DNMX Captain America T-Shirt");
		//		String title = driver.getTitle();
		//		System.out.println(title);
		//		WebElement search1 = driver.findElement(By.cssSelector("span.ic-search"));
		//		a.moveToElement(search1).click().perform();
		//		WebElement filter = driver.findElement(By.xpath("//div[@class='filter-dropdown']/child::select"));
		//		Select s = new Select(filter);
		//		List<WebElement> options = s.getOptions();
		//		for (WebElement optionslist : options) {
		//			String text = optionslist.getText();
		//			System.out.println(text);
		//			
		//		}
		//		s.selectByIndex(2);
		//		WebElement pepsi = driver.findElement(By.xpath("//img[@src='https://assets."
		//				+ "ajio.com/medias/sys_master/root/20210831/B6KP/612d45d67cdb8cb8240e039e/dnmx_blue_typographic_print_crew-neck_t-shirt.jpg']"));
		//		a.moveToElement(pepsi).click().perform();

		//		driver.navigate().to("https://letcode.in/dropable");
		//		WebElement draggable = driver.findElement(By.id("draggable"));
		//		WebElement droppable = driver.findElement(By.id("droppable"));
		//		a.dragAndDrop(draggable, droppable).perform();

		//		driver.navigate().to("https://www.leafground.com/drag.xhtml");
		//		WebElement drag = driver.findElement(By.id("form:drag_content"));
		//		WebElement drop = driver.findElement(By.id("form:drop_header"));
		//		a.dragAndDrop(drag, drop).perform();
		//
		//		WebElement name = driver.findElement(By.id("form:j_idt94:j_idt95"));
		//		WebElement categ = driver.findElement(By.id("form:j_idt94:j_idt97"));
		//		a.dragAndDrop(name, categ).perform();

		//		driver.navigate().to("https://letcode.in/windows");
		//		WebElement home = driver.findElement(By.id("home"));
		//		home.click();
		//		Set<String> windowHandles = driver.getWindowHandles();
		//		List<String> li = new ArrayList<String>();
		//		li.addAll(windowHandles);
		//		driver.switchTo().window(li.get(1));
		//		String title = driver.getTitle();
		//		System.out.println(title);
		//		driver.switchTo().window(li.get(0));
		//		driver.close();
		//		driver.quit();
		//		driver.get("https://letcode.in/windows");
		//		WebElement multi = elementFinder("id", "multi");
		//		multi.click();
		//		Set<String> windowHandles = driver.getWindowHandles();
		//		List<String> li = new ArrayList<>();
		//		li.addAll(windowHandles);
		//		driver.switchTo().window(li.get(0));
		//		WebElement findElement = driver.findElement(By.id("testing"));
		//		findElement.click();
		//		driver.switchTo().window(li.get(2));
		//		driver.quit();

		driver.navigate().to("https://letcode.in/table");
		//		List<WebElement> data = driver.findElements(By.xpath("//table[@id='shopping']/tbody/tr[2]/td"));
		//		for (WebElement webElement : data) {
		//			System.out.println(webElement.getText());
		//			
		//		}
		//		System.out.println("___________________________________________");
		//		List<WebElement> td = driver.findElements(By.xpath("//table[@id='shopping']/tbody/tr/td"));
		//		for (WebElement webElement1 : td) {
		//			System.out.println(webElement1.getText());
		//			
		//		}
		//		System.out.println("___________________________________________");
		//		List<WebElement> foot = driver.findElements(By.xpath("//table[@id='shopping']/tbody/following::tfoot/td"));
		//		for (WebElement webElement2 : foot) {
		//			System.out.println(webElement2.getText());
		//			
		//		}
		//		System.out.println("___________________________________________");

		WebElement present = driver.findElement(By.xpath("//table[@id='simpletable']/tbody/tr[2]/td[4]/input"));
		present.click();
		List<WebElement> rows = driver.findElements(By.xpath("//table[@id='simpletable']/tbody/tr/td[2]"));
		for (WebElement webElement : rows) {
			String text = webElement.getText();
			System.out.println(text);

		}
		WebElement sortables = driver.findElement(By.xpath("//table[@class='mat-sort table is-bordered is-striped is-narrow is-hoverable is-fullwidth']/tr/td"));
		String text = sortables.getText();
		System.out.println(text);
		WebElement price = driver.findElement(By.xpath("//table[@class='mat-sort table is-bordered is-striped is-narrow is-hoverable is-fullwidth']/tr/td[1]/following::td[1]"));
		String text4 = price.getText();
		System.out.println(text4);
		WebElement click = driver.findElement(By.xpath("//div[@class='mat-sort-header-pointer-left ng-tns-c30-0 ng-trigger ng-trigger-leftPointer']"));
		click.click();
		WebElement sortables2 = driver.findElement(By.xpath("//table[@class='mat-sort table is-bordered is-striped is-narrow is-hoverable is-fullwidth']/tr/td"));
		String text2 = sortables2.getText();
		System.out.println(text2);
		WebElement folow = driver.findElement(By.xpath("//table[@class='mat-sort table is-bordered is-striped is-narrow is-hoverable is-fullwidth']/tr/td[1]/following::td[1]"));
		String text3 = folow.getText();
		System.out.println(text3);




























	}

}
