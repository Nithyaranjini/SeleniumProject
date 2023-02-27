package org.test;

import java.awt.AWTException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserLaunchChrome {
	public static void main(String[] args) throws InterruptedException, AWTException  
	{		
	System.setProperty("webdriver.chrome.driver","C:\\Users\\srini\\eclipse-workspace\\SeleniumProject\\Driver\\chromedriver1.exe");
		
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.facebook.com/");
	String CurrentUrl = driver.getCurrentUrl();
	System.out.println(CurrentUrl);
	String getTitle = driver.getTitle();
	System.out.println(getTitle);
	}}


