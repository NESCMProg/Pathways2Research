package pathways2research.UAT;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import resources.base;

public class HomePage extends base {
	
	@FindBy(css="img.default-logo")
	WebElement EBSCO_Logo;
	
	@FindBy(css="h2.hero-title.h3")
	WebElement WebsiteHeader;
	
	@FindBy(xpath="//a[contains(text(),'Business and Economics')]")
	WebElement bussinessGroup;
	
	@FindBy(xpath="//a[contains(text(),'Education')]")
	WebElement EducationGroup;
	
	@FindBy(xpath="//a[contains(text(),'Sustainability')]")
	WebElement sustainabilityGroup;
	
	@FindBy(id="darkModeToggle")
	WebElement websiteMode;
	
	@FindBy(css="#edit-search-form-sds-search-bar-container-query")
	WebElement searchBar;
	
	@FindBy(css="#edit-search-form-sds-search-bar-container-actions-submit")
	WebElement searchBtn;
	
	@FindBy(css="#mobile-menu-2")
	WebElement burgerMenu;
	
	@FindBy(css="#edit-language")
	WebElement languageDdl;
	
	@FindBy(xpath="//body/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/nav[1]/ul[1]/li[1]/a[1]")
	WebElement myAccount;
	
	@FindBy(xpath="//body/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/nav[1]/ul[1]/li[2]/a[1]")
	WebElement logOutBtn;
	
	public HomePage() {
		PageFactory.initElements(driver, this);	
	}
	
	public bussinessGroupPage bussinessGroupArticles() throws InterruptedException {
		bussinessGroup.click();
		Thread.sleep(1000);
		return new bussinessGroupPage();
	}
	
	public EducationGroupPage educationGroupArticles() throws InterruptedException {
		EducationGroup.click();
		Thread.sleep(1000);
		return new EducationGroupPage();
	}
	
	public SustainabilityGroupPage sustainabilityGroupArticles() throws InterruptedException {
		sustainabilityGroup.click();
		Thread.sleep(1000);
		return new SustainabilityGroupPage();
	}
	

}
