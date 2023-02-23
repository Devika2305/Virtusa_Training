package SeleniumAssignment4;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment4 {

	ChromeDriver driver;
	String url = "https://www.ebay.com/";
	
	Assignment4(ChromeDriver driver){
		this.driver = driver;
	}
	
	public void invokeBrowser(){
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get(url);
		
	}
	
	public void searchProduct(String product){
		By search_box = By.className("gh-tb");
		By magnifier_btn = By.className("btn");
		
		driver.findElement(search_box).sendKeys(product);
		driver.findElement(magnifier_btn).click();
		
	}
	
	public void getNthProduct(int itemNumber){
		By product_select_xpath = By.xpath(String.format("(//li[@class=\"s-item s-item__pl-on-bottom\"])[%d]", itemNumber));
		String nthProduct = driver.findElement(product_select_xpath).getText();
		System.out.println(itemNumber+"th Product :: "+ nthProduct);
	}
	
	
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\devik\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		Assignment4 e = new Assignment4(driver);
		e.invokeBrowser();
		e.searchProduct("Apple Watch");
		e.getNthProduct(1);
		e.getNthProduct(10);
		driver.close();
	}
}
