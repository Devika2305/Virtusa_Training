package BasicMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class GoogleSearch {

	WebDriver driver;

	public GoogleSearch(WebDriver driver) {
		this.driver = driver;
	}
	
	By searchBox = By.id("input");
	By searchButton = By.id("icon");   // xpath ==>  *[@id="icon"]
	
	public void googleSearch(String input) throws InterruptedException {
		System.out.println(input);
		driver.findElement(searchBox).sendKeys(input);
		Thread.sleep(2000);
		driver.findElement(searchButton).click();
		Thread.sleep(2000);
	}
}
