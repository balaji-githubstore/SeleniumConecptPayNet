package com.paynet.advance;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo4MultipleTabs {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Software\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("https://www.medibuddy.in/");
		
		driver.findElement(By.id("wzrk-cancel")).click();
		driver.findElement(By.linkText("For Employer")).click();
		
		List<String> windows=new ArrayList<String>(driver.getWindowHandles());		
		driver.switchTo().window(windows.get(1));
		
		driver.findElement(By.name("getInTouchName")).sendKeys("hello@gmail.com");
		
		driver.close();
		
		driver.switchTo().window(windows.get(0));
		
		String title=driver.getTitle();
		System.out.println(title);
		
	}

}


