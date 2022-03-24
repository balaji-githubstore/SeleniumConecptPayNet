package com.paynet.advance;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo1MultipleTabs {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Software\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		driver.findElement(By.xpath("//img[@alt='LinkedIn OrangeHRM group']")).click();
		
		List<String> windows=new ArrayList<String>(driver.getWindowHandles());		
		driver.switchTo().window(windows.get(1));
		
		driver.findElement(By.name("email-or-phone")).sendKeys("hello@gmail.com");
		
		//enter password as abcd
		driver.findElement(By.id("password")).sendKeys("abcd");
		
		//click on agree
		driver.findElement(By.id("join-form-submit")).click();
		
		driver.quit();
		
	}

}


