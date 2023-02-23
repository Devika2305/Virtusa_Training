package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class SnapDeal {
	
	WebDriver driver;
	
	public SnapDeal(WebDriver driver) {
		this.driver= driver;
	}
	
	By signIn = By.xpath("//*[@id=\"sdHeader\"]/div[4]/div[2]/div/div[3]/div[3]/div");
	By login =  By.xpath("//*[@id=\"sdHeader\"]/div[4]/div[2]/div/div[3]/div[3]/div/div/div[2]/div[2]/span[2]/a");
	By userName = By.xpath("//*[@id=\"userName\"]");
	By cntnue = By.xpath("//*[@id=\"checkUser\"]");
	
	public void hold() throws InterruptedException {
		WebElement hold = driver.findElement(signIn);
		Actions act = new Actions(driver);
		act.moveToElement(hold).perform();
		Thread.sleep(2000);
	}
	
	public void enterEmail(String username) {
		driver.findElement(userName).sendKeys(username);
		driver.findElement(cntnue).click();
	}
	
	public void clickLogin() throws InterruptedException {
		driver.findElement(login).click();
		Thread.sleep(2000);
	}
}
