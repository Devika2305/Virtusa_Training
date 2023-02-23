package testNG_Assignments;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import BasicMethods.OpenBrowser;
import Pages.FacebookPage;

public class Assignment_2 {
	
	static WebDriver driver;
	static FacebookPage fb;
	
	@BeforeTest
	public void beforeTest() throws InterruptedException {
		OpenBrowser browser = new OpenBrowser();
		driver = browser.chooseBrowser("Chrome");
		driver.navigate().to("https://www.fb.com");
		Thread.sleep(2000);
	}
	
	@Test(priority = 0)
	public void checkNavigateToFB() throws InterruptedException {
		fb = new FacebookPage(driver);
		System.out.println("Facebook : "+fb.getClass());
		fb.navigateToURL("www.fb.com");
	}
	
	@Test(priority = 1)
	public void verifyPage() {
		fb.getTitle();
		fb.titleMatching("www.facebook.com");
	}
	
	@Test(priority = 2)
	public void verifyCreateAnAccount() throws InterruptedException {
		fb.verifySignUpButton();
	}
	
	@Test(priority = 3)
	public void checkFillingDetails() {
		fb.fillDetails_Textbox("ABC", "XYZ", "xyuz@gmail.com", "abcdef");
	}
	
	@Test(priority = 4)
	public void checkFillingDOB() {
		fb.selectDates("14", "Dec", "2002");
	}
	
	@Test(priority = 5)
	public void selectGender() {
		fb.selectGender();
	}
	
	@Test(priority = 6)
	public void checkFinalSubmit() {
		fb.signUpButtonSubmit();
	}
	
	@AfterTest
	public void afterTest() {
		driver.quit();
	}
}