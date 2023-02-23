package testNG_Assignments;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import BasicMethods.OpenBrowser;
import Pages.SnapDeal;

public class Assignment_5 {

	//SnapDeal
		WebDriver driver;
		SnapDeal sd;
		
		@BeforeTest
		public void beforeTest() throws Throwable {
			OpenBrowser browser = new OpenBrowser();
			driver = browser.chooseBrowser("Chrome");
		}
		
		@Test(priority=0)
		public void SignInHold() throws InterruptedException {
			sd = new SnapDeal(driver);
			sd.hold();
		}
		
		@Test(priority=1)
			public void SignInClick() throws InterruptedException {
				sd.clickLogin();
			}
		
		@Test(priority=2)
		public void Email() {
			sd.enterEmail(null);
		}
		
		@AfterTest
		public void aftertest() {
			driver.quit();

		}
}
