package pathways2research.UAT;

import java.io.IOException;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import resources.base;
import utility.Log;

public class pathwayHomePageTest extends base{
	
	LoginPage loginpage;
	HomePage homepage;
	
	public pathwayHomePageTest() {
		super();
	}
	
	@BeforeMethod
	public void setUp() throws IOException {
		initialization();
		Capabilities cap = ((RemoteWebDriver) driver).getCapabilities();
		 String browserName = cap.getBrowserName().toLowerCase();
		 Log.info("Test executed in browser: "+browserName);
		 String bv = cap.getVersion().toString();
		 Log.info("Browser Version is: "+bv);
		loginpage = new LoginPage();
		homepage = new HomePage();
	}
	
	@Test
	public void patronLoginValidation() throws InterruptedException {
		homepage = loginpage.homePageLoginValidation();
		Log.info("Accessed to HomePage in Pathways2Research UAT Site");
	}

	@AfterMethod
	public void teardown() {
		driver.quit();
		Log.info("Browser is closed");
	}
	
	
}
