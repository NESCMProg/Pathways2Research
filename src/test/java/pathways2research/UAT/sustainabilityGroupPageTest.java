package pathways2research.UAT;

import java.awt.AWTException;
import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import resources.base;
import utility.Log;

public class sustainabilityGroupPageTest extends base {
	
	LoginPage loginpage;
	HomePage homepage;
	SustainabilityGroupPage sgp;
	
	public sustainabilityGroupPageTest() {
		super();
	}
	
	@BeforeMethod
	public void setUp() throws IOException, InterruptedException {
		initialization();
		loginpage = new LoginPage();
		homepage = new HomePage();
		homepage = loginpage.homePageLoginValidation();
		sgp = new SustainabilityGroupPage();
		sgp = homepage.sustainabilityGroupArticles();
		
		
	}
	
	@Test
	public void sustanabilityTopic() throws InterruptedException, AWTException {
		Log.info("Group Name: Sustainability");
		Log.info("Test Designed By: Charan");
		Log.info("Test Executed By: " + machineName);
		Log.info("Test Executed Date: " + currentDateTime);
		try {
			sgp.validateSustainabilityTG();
			Log.info("Test Pass");
		}
		catch(Exception e1) {
			Log.error("Test Failed");
		}
	}
	
	@AfterMethod
	public void teardown() {
		driver.quit();
		Log.info("Browser is closed");
	}

}
