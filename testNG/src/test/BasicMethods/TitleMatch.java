package BasicMethods;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;


public class TitleMatch {

	
		
		WebDriver driver ;
		String titleOfThePage;
		
		public TitleMatch(WebDriver driver) {
			this.driver = driver;
		}
		
		public void navigateToURL(String URL) throws InterruptedException {
			driver.navigate().to(URL);
			Thread.sleep(5000);
		}
		
		public void printCurrentURL() {
			String currentUrl = driver.getCurrentUrl();
			System.out.println("Current URL :: " + currentUrl);
			
		}
		
		public void getTitle() {
			titleOfThePage = driver.getTitle();
		}
		
		public void titleMatching(String compare) {
			Assert.assertEquals(compare, titleOfThePage,"We are Hiring");
		}
		
		public void navigateBack() {
			driver.navigate().back();
			driver.navigate().refresh();
			driver.navigate().refresh();
		}

		public void navigateForward() {
			driver.navigate().forward();
			driver.navigate().refresh();
			driver.navigate().refresh();
		}

	
}
