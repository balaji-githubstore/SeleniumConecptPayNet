package com.paynet.advance;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo7Get {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\Software\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demo.openemr.io/b/openemr");

		String tagname = driver.findElement(By.xpath("//p[contains(text(),'most')]")).getTagName();
		System.out.println(tagname);
		
		String innertext= driver.findElement(By.xpath("//p[contains(text(),'most')]")).getText();
		System.out.println(innertext);
		
		String attValue=driver.findElement(By.xpath("//p[contains(text(),'most')]")).getAttribute("class");
		System.out.println(attValue);
		
		String hrefValue=driver.findElement(By.partialLinkText("Licensing")).getAttribute("href");
		System.out.println(hrefValue);
	}

}
