package SeleniumAssignment5;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class Assignment5 {

	public static void getLinkCount(WebDriver driver){
		List<WebElement> allLink = driver.findElements(By.tagName("a"));
		
		System.out.println("Number of links on a page :: "+allLink.size());
	}
	
	
	public static void getAllLinkInfo(WebDriver driver){
		List<WebElement> allLink = driver.findElements(By.tagName("a"));
		
		for(WebElement link:allLink){
			System.out.println(link);
			System.out.println("Link Text :: "+ link.getText());
			System.out.println("Link URL  :: "+ link.getAttribute("href"));
			
			System.out.println("-------------------------------------------");
		}
	}
	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\devik\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://flipkart.com");
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//button[@class = \"_2KpZ6l _2doB4z\"]")).click();
		Thread.sleep(1000);
		
		getLinkCount(driver);
		
		getAllLinkInfo(driver);
		
		

	}
}
