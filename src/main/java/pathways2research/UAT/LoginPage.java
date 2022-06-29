package pathways2research.UAT;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import resources.base;
import utility.Log;

public class LoginPage extends base {
	@FindBy(css="#edit-name")
	WebElement username;
	
	@FindBy(css="#edit-pass")
	WebElement password;
	
	@FindBy(css="#edit-submit")
	WebElement LoginBtn;
	
	
	public LoginPage() {
		PageFactory.initElements(driver, this);	
	}
	
	public HomePage homePageLoginValidation() throws InterruptedException {
		username.sendKeys("NES_Patron");
		password.sendKeys("exm9fek5tfu-WMB@hwz");
		LoginBtn.click();
		Thread.sleep(2000);
		Log.info("Application is accessed with correct credentials");
		return new HomePage();
	}
	
}
