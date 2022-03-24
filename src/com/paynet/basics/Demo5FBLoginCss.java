package com.paynet.basics;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//login
public class Demo5FBLoginCss {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "D:\\Software\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		driver.get("https://www.facebook.com/");
		driver.get("https://www.facebook.com/");

		driver.findElement(By.partialLinkText("New Account")).click();

		driver.findElement(By.cssSelector("input[name='firstname']")).sendKeys("Balaji");
		driver.findElement(By.cssSelector("[name='lastname']")).sendKeys("Dinakaran");
		driver.findElement(By.name("reg_email__")).sendKeys("bala1234@gmail.com");
		driver.findElement(By.cssSelector("#password_step_input")).sendKeys("Welcome123");

	}

}
