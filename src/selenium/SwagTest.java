package selenium;

public class SwagTest extends BaseClass {

	public static void main(String[] args) {
		browserLaunch("chrome");
		getUrl("https://saucedemo.com");
		SwagPom a = new SwagPom(driver);
		sendKeys(a.getUserName(), "standard_user");
		sendKeys(a.getPass(), "secret_sauce");
		clicks(a.getLogin());
		clicks(a.getAddcart());
		clicks(a.getClickcart());
		clicks(a.getProceedcheckout());
		sendKeys(a.getFirstName(), "ravindran");
		sendKeys(a.getLastName(), "narayanan");
		sendKeys(a.getPincode(), "600018");
		clicks(a.getConti());
		clicks(a.getFinish());
		
		
		

	}

}
