package com.paynet.advance;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo12FindElements {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\Software\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.medibuddy.in/");
		
		System.out.println(driver.findElements(By.id("hello")).size());
		System.out.println(driver.findElements(By.id("wzrk-cancel")).size());
		
		if(driver.findElements(By.id("wzrk-cancel")).size()>0)
		{
			driver.findElement(By.id("wzrk-cancel")).click();
		}
		
	}

}
