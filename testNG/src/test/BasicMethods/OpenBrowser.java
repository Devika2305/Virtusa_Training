package BasicMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenBrowser {

	public OpenBrowser() {
	System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\devik\\\\Downloads\\\\chromedriver_win32 (1)\\\\chromedriver.exe");

	}
	
	public WebDriver chooseBrowser(String browser) throws InterruptedException {
		
		WebDriver driver = null;
		
		if(browser == "Chrome")
			driver = new ChromeDriver();
		
		else if(browser == "Firefox") {
			System.out.println("Not there !!!");
		}
			
		else {
			System.out.println("Not there !!!");
		}
		
		driver.get("https://google.com");
		driver.manage().window().maximize();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			System.out.println("Inside Select Browser");
			System.out.println("Error is : "+ e.getMessage());
		}
		Thread.sleep(5000);
		
		return driver;

	}
}
