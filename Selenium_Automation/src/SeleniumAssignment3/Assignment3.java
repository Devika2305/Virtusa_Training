package SeleniumAssignment3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
public class Assignment3 {
	public static void main(String[] args) throws InterruptedException {

		ChromeDriver driver;

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\devik\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");

		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://jqueryui.com/droppable/");
		
		WebElement webFrame = driver.findElement(By.className("demo-frame"));
		
		driver.switchTo().frame(webFrame);
		
		WebElement source = driver.findElement(By.id("draggable"));
		WebElement target = driver.findElement(By.id("droppable"));
		
		
		Actions action = new Actions(driver);
		String colourBefDnD = target.getCssValue("color");
		action.moveToElement(source).clickAndHold().moveToElement(target).release().build().perform();
		String colorAftDnD = target.getCssValue("color");
		
		System.out.println("Color before Drag and Drop : "+ colourBefDnD);
		System.out.println("Color after Drag and Drop : "+ colorAftDnD);
		
		driver.close();
	}
}
