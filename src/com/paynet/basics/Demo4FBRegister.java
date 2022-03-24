package com.paynet.basics;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Demo4FBRegister {
	
	public static void main(String[] args) {
		
System.setProperty("webdriver.chrome.driver", "D:\\Software\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("https://www.facebook.com/");
		
		driver.findElement(By.partialLinkText("New Account")).click();
		
		driver.findElement(By.name("firstname")).sendKeys("Balaji");
		driver.findElement(By.name("lastname")).sendKeys("Dinakaran");
		driver.findElement(By.name("reg_email__")).sendKeys("bala1234@gmail.com");		
		driver.findElement(By.id("password_step_input")).sendKeys("Welcome123");
		
		Select selectObj=new Select(driver.findElement(By.id("day")));
		selectObj.selectByVisibleText("12");
//		selectObj.selectByValue("21");
//		selectObj.selectByIndex(1);
		
		Select selectMonObj=new Select(driver.findElement(By.id("month")));
		selectMonObj.selectByVisibleText("Apr");
		
		Select selectYear=new Select(driver.findElement(By.xpath("//select[@title='Year']")));
		selectYear.selectByVisibleText("2010");
		
		
		driver.findElement(By.xpath("//input[@value='-1']")).click();
		
		driver.findElement(By.xpath("//button[text()='Sign Up']")).click();
	}

}
