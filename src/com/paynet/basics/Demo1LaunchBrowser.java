package com.paynet.basics;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Demo1LaunchBrowser {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Software\\chromedriver.exe");
		System.setProperty("webdriver.edge.driver", "D:\\Software\\msedgedriver.exe" );
		
		ChromeDriver driver=new ChromeDriver();
//		EdgeDriver driver=new EdgeDriver();
		
		
		
	}

}
