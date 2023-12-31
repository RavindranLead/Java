package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SwagPom {
	@FindBy(id = "user-name")private WebElement userName;
	@FindBy(id = "password")private WebElement pass;
	@FindBy(id = "login-button")private WebElement login;
	@FindBy(xpath = "//button[@data-test='add-to-cart-sauce-labs-onesie']")private WebElement addcart;
	@FindBy(xpath = "//a[@class='shopping_cart_link']")private WebElement clickcart;
	@FindBy(id = "checkout")private WebElement proceedcheckout;
	@FindBy(id = "first-name")private WebElement firstName;
	@FindBy(id = "last-name")private WebElement lastName;
	@FindBy(id = "postal-code")private WebElement pincode;
	@FindBy(id = "continue")private WebElement conti;
	@FindBy(id = "finish")private WebElement finish;
	public SwagPom(WebDriver driver) {
		PageFactory.initElements(driver, this);
		
	}
	public WebElement getUserName() {
		return userName;
	}
	public WebElement getPass() {
		return pass;
	}
	public WebElement getLogin() {
		return login;
	}
	public WebElement getAddcart() {
		return addcart;
	}
	public WebElement getClickcart() {
		return clickcart;
	}
	public WebElement getProceedcheckout() {
		return proceedcheckout;
	}
	public WebElement getFirstName() {
		return firstName;
	}
	public WebElement getLastName() {
		return lastName;
	}
	public WebElement getPincode() {
		return pincode;
	}
	public WebElement getConti() {
		return conti;
	}
	public WebElement getFinish() {
		return finish;
	}
	

}
