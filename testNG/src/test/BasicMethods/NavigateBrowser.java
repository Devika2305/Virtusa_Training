package BasicMethods;

import org.openqa.selenium.WebDriver;

public class NavigateBrowser {

	WebDriver driver;

	public NavigateBrowser(WebDriver driver) {
		this.driver = driver;
	}
	
	public void navigate(String url) {
		driver.get(url);
	}
}
