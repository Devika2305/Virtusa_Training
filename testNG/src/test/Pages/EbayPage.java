package Pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class EbayPage {

	WebDriver driver;
	
	public EbayPage(WebDriver driver) {
		this.driver= driver;
	}
	
	By clickEbay = By.xpath("//a[@href = \"https://www.ebay.com/\"]");
	By searchBox = By.className("gh-tb");
	By searchBtn = By.className("btn");
	int item=1;
	
	
	public void clickOnEbay() throws InterruptedException {
		driver.findElement(clickEbay).click();
		Thread.sleep(2000);
	}
	
	public void searchProduct(String product) throws InterruptedException{
		
		driver.findElement(searchBox).sendKeys(product);	
		driver.findElement(searchBtn).click();
		Thread.sleep(2000);
	}
	public void searchNProduct(int item) {
		this.item = item;
//		String productXpath = String.format("//div[@id='ResultSetItems']/ul[@id='ListViewInner']/li[%d]", item);;
//		String nthProduct = driver.findElement(By.xpath(productXpath)).getText();
//		System.out.println("Nth Product :: "+ nthProduct);
		
		By product_select_xpath = By.xpath(String.format("(//li[@class=\"s-item s-item__pl-on-bottom\"])[%d]", item));
		String nthProduct = driver.findElement(product_select_xpath).getText();
		System.out.println("Nth Product :: "+ nthProduct);
	}
	public void getAllProducts(){
		//List<WebElement> allProduct = driver.findElements(By.xpath("//div[@id='ResultSetItems']/ul[@id='ListViewInner']/li"));
		List<WebElement> allProduct = driver.findElements(By.xpath("//li[@class=\"s-item s-item__pl-on-bottom\"]"));
		
		for(WebElement product: allProduct){
			System.out.println(product.getText());
		
			System.out.println("-----------------------------------------");
		}
	}
	
	public void getAllProductsViaScrollDown(){
		List<WebElement> allProduct = driver.findElements(By.xpath("//li[@class=\"s-item s-item__pl-on-bottom\"]"));
		Actions action = new Actions(driver);
		
		for(WebElement product: allProduct){
			
			action.moveToElement(product).build().perform();
			
			System.out.println(product.getText());
			
			System.out.println("-----------------------------------------");
		}
	}

}
