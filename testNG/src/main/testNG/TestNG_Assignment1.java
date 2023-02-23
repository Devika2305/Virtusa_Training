package com.testNG;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNG_Assignment1 {
	
	@Test (priority=0)
	public void openBrowser(WebDriver driver) throws InterruptedException{
		driver.get("http://iamneo.ai/");
		driver.manage().window().maximize();
		Thread.sleep(10000);
		System.out.println("Title is :"+driver.getTitle());
		String title = driver.getTitle();
		Assert.assertEquals(title, "Learning and assessment solution for Universities and Enterprises");
		
	}
	
	@Test (priority=1)
	public void navigate(WebDriver driver) throws InterruptedException {
		driver.navigate().to("https://www.facebook.com");
		Thread.sleep(2000);
		String url = driver.getCurrentUrl();
		System.out.println("Current URL :: " + url);
		driver.navigate().back();
		driver.navigate().refresh();
	}
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\devik\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		TestNG_Assignment1 obj = new TestNG_Assignment1();
		obj.openBrowser(driver);
		obj.navigate(driver);
			
		
		Thread.sleep(3000);
		driver.close();
	
	}

}