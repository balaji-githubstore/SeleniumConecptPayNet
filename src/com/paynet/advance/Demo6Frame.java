package com.paynet.advance;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo6Frame {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Software\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("file:///D:/zdemo_html/Demo1.html");
		
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@src='Demo2.html']")));
		
		driver.findElement(By.linkText("Google")).click();
		
		
		driver.switchTo().defaultContent();
		
	}

}
