package com.paynet.advance;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo3Alert {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\Software\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://nasscom.in/nasscom-membership");
		
		driver.findElement(By.partialLinkText("Calculate Membership Fee")).click();
		
		String text=  driver.switchTo().alert().getText();
		System.out.println(text);
		
		driver.switchTo().alert().accept();
	}

}
