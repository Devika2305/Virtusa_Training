package testNG_Assignments;

import org.openqa.selenium.WebDriver;


import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import BasicMethods.OpenBrowser;
import BasicMethods.TitleMatch;

public class Assignment_1 {

	//System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\devik\\\\Downloads\\\\chromedriver_win32 (1)\\\\chromedriver.exe");
	WebDriver driver;
	static TitleMatch t;
	
	@BeforeTest
	public void beforeTest() throws InterruptedException {
		OpenBrowser browser = new OpenBrowser();
		driver = browser.chooseBrowser("Chrome");
	}
	
	@Test(priority = 0)
	public void checkNavigateToFB() throws InterruptedException {
		t = new TitleMatch(driver);
		t.navigateToURL("http://iamneo.ai");
	}
	
	@Test(priority = 1)
	public void checkTitleMatching() {
		t.getTitle();
		t.titleMatching("We are Hiring");
	}
	
	@Test(priority = 2)
	public void getUrl() throws InterruptedException {
		t.navigateToURL("https://www.facebook.com");
	}
	
	@Test(priority = 3)
	public void checkBackNavigation() {
		t.navigateBack();
	}
	
	@Test(priority = 4)
	public void printTitle() {
		t.printCurrentURL();
	}
	
	@Test(priority = 5)
	public void forwardnavigation() {
		t.navigateForward();
	}
	
	@AfterTest
	public void afterTest() {
		driver.quit();
	}
	
	
}
