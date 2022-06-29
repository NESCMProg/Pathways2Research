package pathways2research.UAT;

import java.awt.AWTException;
import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import resources.base;
import utility.Log;

public class educationGroupPageTest extends base {

	LoginPage loginpage;
	HomePage homepage;
	EducationGroupPage egp;
	
	public educationGroupPageTest() {
		super();
	}
	
	@BeforeMethod
	public void setUp() throws IOException, InterruptedException {
		initialization();
		loginpage = new LoginPage();
		homepage = new HomePage();
		homepage = loginpage.homePageLoginValidation();
		egp = new EducationGroupPage();
		Thread.sleep(1000);
		egp = homepage.educationGroupArticles();
	}
	
	@Test
	public void educationTopic() throws InterruptedException, AWTException {
		Log.info("Group Name: Education");
		Log.info("Test Designed By: Charan");
		Log.info("Test Executed By: " + machineName);
		Log.info("Test Executed Date: " + currentDateTime);
		try {
			egp.validateEducationTG();
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
