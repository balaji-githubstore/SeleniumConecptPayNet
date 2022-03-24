package com.paynet.advance;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Demo14PhpTravel {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\Software\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://phptravels.net/");

		driver.findElement(By.linkText("Hotels")).click();
		driver.findElement(By.xpath("//span[contains(text(),'Search by City')]")).click();
		
		driver.findElement(By.xpath("//input[@type='search']")).sendKeys("chennai");
		
		//if not work then use downarrow and click
		//driver.findElement(By.xpath("//li[text()='Chennai,India']")).click();
		Actions action=new Actions(driver);
		
		action.pause(Duration.ofSeconds(1))
		.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).build().perform();

	}
}
