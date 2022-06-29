package pathways2research.UAT;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import resources.base;
import utility.Log;

public class SustainabilityGroupPage extends base{
	
	@FindBy(css = "#header-page-title-block")
	WebElement groupTitle;

	@FindBy(id = "darkModeToggle")
	WebElement websiteMode;

	@FindBy(css = "#edit-search-form-sds-search-bar-container-query")
	WebElement searchBar;

	@FindBy(css = "#edit-search-form-sds-search-bar-container-actions-submit")
	WebElement searchBtn;

	@FindBy(css = "#mobile-menu-2")
	WebElement burgerMenu;

	@FindBy(xpath = "/html[1]/body[1]/div[1]/div[2]/div[5]/div[1]/div[2]/div[1]/main[1]/div[1]/div[2]/div[1]/div[1]/details[1]/summary[1]/h2[1]/a[1]/span[1]")
	WebElement firstSustainabilityArticle;

	@FindBy(xpath = "//body/div[1]/div[1]/div[5]/div[1]/div[2]/div[1]/main[1]/div[1]/div[2]/h1[1]/div[1]/div[1]/button[1]/*[1]")
	WebElement mailIcon;

	@FindBy(xpath = "//body/div[1]/div[1]/div[5]/div[1]/div[2]/div[1]/main[1]/div[1]/div[2]/h1[1]/div[1]/div[1]/button[2]")
	WebElement linkIcon;

	@FindBy(css = "a.share-icon.quote")
	WebElement quoteIcon;

	@FindBy(xpath = "//a[contains(text(),'Bookmark')]")
	WebElement bookmarkIcon;

	@FindBy(css = "a.menu-toggle")
	WebElement toggleMenu;

	@FindBy(css = "li.save-google-drive")
	WebElement googleDriveBtn;

	@FindBy(css = "a.links.links-pdf-view")
	WebElement pdfBtn;

	@FindBy(css = "p.title-article")
	WebElement articleText;

	@FindBy(xpath = "//button[contains(text(),'>')]")
	WebElement topicRightScroll;

	@FindBy(xpath = "//button[contains(text(),'<')]")
	WebElement topicLeftScroll;

	@FindBy(css = "h1.site-name.mb-0.h4")
	WebElement webLink;
	
	@FindBy(xpath="//h1[@id='header-page-title-block']")
	WebElement headerGroupTitle;
	
	public SustainabilityGroupPage() {
		PageFactory.initElements(driver, this);
	}
	
	public void validateSustainabilityTG() throws InterruptedException, AWTException {
		System.out.println("Entered inside method");
		Thread.sleep(2000);
		topicRightScroll.click();
		topicRightScroll.click();
		System.out.println("clicked right scroll");
		Thread.sleep(1000);
		topicLeftScroll.click();
		System.out.println("clicked left scroll");
		String headerTitle = groupTitle.getText();
		Log.info("Group Title is: " + headerTitle);
		Thread.sleep(1000);
		firstSustainabilityArticle.click();
		System.out.println("clicked an article");
		Thread.sleep(5000);
		// color mode changed 2nd time
		websiteMode.click();
		String pathwaysLink = webLink.getText();
		Log.info("Website Link is: " + pathwaysLink);
		System.out.println("website link is: " + pathwaysLink);
		Thread.sleep(5000);
		System.out.println("About to zoom out");
		System.out.println("zooming");
		Robot robot = new Robot();
		for (int i = 0; i < 4; i++) {
			robot.keyPress(KeyEvent.VK_CONTROL);
			robot.keyPress(KeyEvent.VK_SUBTRACT);
			robot.keyRelease(KeyEvent.VK_SUBTRACT);
			robot.keyRelease(KeyEvent.VK_CONTROL);
		}
		bookmarkIcon.click();
		Log.info("clicked on bookmark in Sustainability group");
		System.out.println("clicked on bookmark");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='edit-close']")).click();
		Log.info("Bookmark is closed");
		Thread.sleep(1000);
		toggleMenu.click();
		Log.info("Clicked on Toggle Menu");
		System.out.println("clicked on togglemenu");
		pdfBtn.click();
		Thread.sleep(4000);
		Log.info("clicked on PDF Link in Sustainability group");
		ArrayList<String> pdftabs2 = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(pdftabs2.get(0));
		Thread.sleep(2000);
		toggleMenu.click();
		googleDriveBtn.click();
		Thread.sleep(2000);
		Log.info("clicked on Google Drive link in Sustainability group");
		System.out.println("clicked on googledrive Link");
		ArrayList<String> GDtabs2 = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(GDtabs2.get(1));
		driver.close();
		Log.info("Google Drive tab is closed");
	}

}
