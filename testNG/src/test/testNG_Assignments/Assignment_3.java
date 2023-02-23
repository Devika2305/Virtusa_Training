package testNG_Assignments;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import BasicMethods.OpenBrowser;
import Pages.FlipkartPage;
import Pages.SnapDeal;

// Flipkart
public class Assignment_3 {

	WebDriver driver;
	FlipkartPage fk = new FlipkartPage(driver);
	
	@BeforeTest
	public void beforeTest() throws Throwable {
		OpenBrowser browser = new OpenBrowser();
		driver = browser.chooseBrowser("Chrome");
	}
	
	@Test(priority=0)
	public void Count() {
		fk.countLinks(driver);
	}
	
	@Test(priority=1)
	public void printLinks() {
		fk.print(driver);
	}
	
	@AfterTest
	public void aftertest() {
		driver.quit();
	}
}
