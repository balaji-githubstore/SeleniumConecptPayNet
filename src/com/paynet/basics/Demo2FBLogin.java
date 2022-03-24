package com.paynet.basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo2FBLogin {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Software\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		//maximize
		//set the implicit wait
		
		driver.get("https://www.facebook.com/");
		
		String title= driver.getTitle();
		System.out.println(title);
		
		String url=driver.getCurrentUrl();
		System.out.println(url);
		
		driver.quit();
	}

}
