package pathways2research.UAT;

import java.awt.AWTException;
import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import resources.base;
import utility.Log;

public class bussinessGroupPageTest extends base {

	LoginPage loginpage;
	HomePage homepage;
	bussinessGroupPage bgp;

	public bussinessGroupPageTest() {
		super();
	}

	@BeforeMethod
	public void setUp() throws IOException, InterruptedException {
		initialization();
		loginpage = new LoginPage();
		homepage = new HomePage();
		homepage = loginpage.homePageLoginValidation();
		bgp = new bussinessGroupPage();
		bgp = homepage.bussinessGroupArticles();
	}

	@Test
	public void businessEconomicsGroup() throws InterruptedException, AWTException {
		try {
			bgp.businessEconomicsTG();
			Log.info("Test Pass");
		} catch (Exception e1) {
			Log.error("Test Failed");
		}
	}

	@AfterMethod
	public void teardown() {
		driver.quit();
		Log.info("Browser is closed");
	}

}
