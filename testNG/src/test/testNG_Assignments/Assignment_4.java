package testNG_Assignments;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import BasicMethods.GoogleSearch;
import BasicMethods.OpenBrowser;
import Pages.EbayPage;

public class Assignment_4 {

	//Ebay
	WebDriver driver;
	static EbayPage eb;
	
	@BeforeTest
	public void beforeTest() throws Throwable {
		OpenBrowser browser = new OpenBrowser();
		driver = browser.chooseBrowser("Chrome");
	}
	
	@Test(priority=0)
	public void googleSearch() throws InterruptedException {
		GoogleSearch gs = new GoogleSearch(driver);
		gs.googleSearch("Ebay");
	}
	
	@Test(priority=1)
	public void clickEbay() throws InterruptedException {
		eb = new EbayPage(driver);
		eb.clickOnEbay();
	}
	
	@Test(priority=2)
	public void searchProduct() throws InterruptedException {
		eb.searchProduct("Apple Watch");
	}
	
	@Test(priority=3)
	public void searchNProduct() {
		eb.searchNProduct(10);
	}
	
	@Test(priority=4)
	public void searchAll() {
		eb.getAllProducts();
	}
	
	@Test(priority=5)
	public void seachAllScrollDown() {
		eb.getAllProductsViaScrollDown();
	}
	
	@AfterTest
	public void afterTest() {
		driver.quit();
	}
}
