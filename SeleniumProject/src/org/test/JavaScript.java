package org.test;


import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScript {
	



	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\srini\\eclipse-workspace\\SeleniumInstall\\Driver\\chromedriver1.exe");
		WebDriver driver = new ChromeDriver();
	driver.get("https://www.facebook.com/");
	WebElement txtUserName =driver.findElement(By.id("email"));
	JavascriptExecutor js = (JavascriptExecutor) driver;	
	js.executeScript("arguments[0].setAttribute('value','hexaware')",txtUserName);
	Object UserName = js.executeScript("arguments[0].getAttribute('value')",txtUserName);
	System.out.println(UserName);
	WebElement txtpassword = driver.findElement(By.name("pass"));
	js.executeScript("arguments[0].setAttribute('value','WELCOME123')",txtpassword);
	Object  txtpass = js.executeScript("return arguments[0].getAttribute, ('value')",txtUserName);
	System.out.println(txtpass);
	WebElement loginBtn = driver.findElement(By.name("login"));
	js.executeScript("arguments[1].click()",txtpassword,txtUserName,loginBtn);
	}}
		
		
		
		
	   
	  
	
	   
	  
	   
	   
	    
		
	


