package SeleniumAssignment2;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
public class Assignment2 {
	ChromeDriver driver;
	String url = "http://www.flipkart.com";

	public Assignment2(ChromeDriver driver) {
		this.driver = driver;
	}

	@SuppressWarnings("deprecation")
	public void invokeBrowser() {

		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver.exe");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get(url);

	}

	public void loginToFlipkart() {
		By login_btn = By.xpath("(//button[@type=\"submit\"])[1]");
		By email_textBox = By.className("_2IX_2-");
		By pass_textBox = By.xpath("//input[@type=\"password\"]");
		By login_internal_btn = By.xpath("(//button[@type=\"submit\"])[2]");
		
		driver.findElement(login_btn).click();
		driver.findElement(email_textBox).sendKeys("xyz@gmail.com");
		driver.findElement(pass_textBox).sendKeys("123");
		driver.findElement(login_internal_btn).click();
		
	}
	
	public void closeBrowser() {
		driver.quit();
	}
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\devik\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		Assignment2 f = new Assignment2(driver);
		f.invokeBrowser();
		f.loginToFlipkart();
		f.closeBrowser();
		driver.close();
	}
	

	


}
