package Pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FlipkartPage {

WebDriver driver;
By login_btn = By.xpath("(//button[@type=\"submit\"])[1]");
By email_textBox = By.className("_2IX_2-");
By pass_textBox = By.xpath("//input[@type=\"password\"]");
By login_internal_btn = By.xpath("(//button[@type=\"submit\"])[2]");

	
	public FlipkartPage(WebDriver driver) {
		this.driver= driver;
	}
	
	public void countLinks(WebDriver driver) {
		List<WebElement> count = driver.findElements(By.tagName("a"));
		System.out.println("Number of links on a page :: "+count.size());
	}
	
	public void print(WebDriver driver) {
		List<WebElement> links = driver.findElements(By.tagName("a"));
		
		for(WebElement link:links){
			System.out.println(link);
			System.out.println("Link Text :: "+ link.getText());
			System.out.println("Link URL  :: "+ link.getAttribute("href"));	
		}
	}
		public void clickOnLoginBtn() throws InterruptedException {
			driver.findElement(login_btn).click();
			Thread.sleep(1000);
		}
		
		public void enterEmail(String email) {
			driver.findElement(email_textBox).sendKeys(email);
		}
		
		public void enterPass(String pass) {
			driver.findElement(pass_textBox).sendKeys(pass);
		}
		
		public void clickFinalLogin() throws InterruptedException {
			driver.findElement(login_internal_btn).click();
			Thread.sleep(1000);
	}
}
