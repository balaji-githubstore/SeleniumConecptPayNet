package com.paynet.advance;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Demo10Action {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\Software\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://nasscom.in/");

		// mouse over on Membership
		Actions action = new Actions(driver);

		// only perform enough because doing one activity
		action.moveToElement(driver.findElement(By.xpath("//a[text()='Membership']"))).perform();
		

		driver.findElement(By.xpath("//a[text()='Members Listing']")).click();
		
	

	}
}
