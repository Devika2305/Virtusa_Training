
package SeleniumAssignment1;

//import java.util.List;
//import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment1 {
	
	public void openBrowser(WebDriver driver) throws InterruptedException{
		driver.get("http://iamneo.ai/");
		driver.manage().window().maximize();
		Thread.sleep(10000);
		//System.out.println("Title is :"+driver.getTitle());
		boolean contains = driver.getTitle().contains("We are Hiring!");
		if(contains) {
			System.out.println("PASS");
		}
		else {
			System.out.println("FAIL");
		}
		
	}
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\devik\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		Assignment1 obj = new Assignment1();
		obj.openBrowser(driver);
		
		
		driver.navigate().to("https://www.facebook.com");
		Thread.sleep(2000);
		String url = driver.getCurrentUrl();
		System.out.println("Current URL :: " + url);
		driver.navigate().back();
		driver.navigate().refresh();
		
		
		Thread.sleep(3000);
		driver.close();
	
	}

}