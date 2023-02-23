package testNG_Assignments;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import BasicMethods.OpenBrowser;
import Pages.FlipkartPage;

public class Assignment_6 {

	static WebDriver driver;
	static FlipkartPage fk;
	
	@BeforeTest
	public void beforeTest() throws InterruptedException {
		OpenBrowser browser = new OpenBrowser();
		driver = browser.chooseBrowser("Chrome");
		driver.navigate().to("https://www.flipkart.com");
		Thread.sleep(2000);
	}
	
	@Test(priority=0)
	public void pressLoginBtn() throws InterruptedException {
		fk = new FlipkartPage(driver);
		fk.clickOnLoginBtn();
	}
	
	
	@Test(priority=1)
	public void enterUsername() {
		fk.enterEmail("xyzu@gmail.com");
	}
	
	
	@Test(priority=2)
	public void enterPassword() {
		fk.enterPass("qwerty");
	}
	
	@Test(priority=3)
	public void clickFinalLogin() throws InterruptedException {
		fk.clickFinalLogin();
	}
	
	@AfterTest
	public void afterTest() {
		driver.quit();
	}
}
