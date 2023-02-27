package org.test;

import java.awt.AWTException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;


public class Xpath {

	public static void main(String[] args) throws InterruptedException, AWTException  
	{		
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\srini\\eclipse-workspace\\SeleniumInstall\\Driver\\chromedriver1.exe");
		
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();

	driver.get("https://www.facebook.com/");
   /* WebElement txtUserName= driver.findElement(By.xpath("//input[@type='text']"));
    txtUserName.sendKeys("greens");
	WebElement txtUserPassword = driver.findElement(By.xpath("//input[@placeholder='Password']"));
	txtUserPassword.sendKeys("wecome12345");}}*/

	WebElement btnLogin= driver.findElement(By.xpath("//button[@value='1']")); 
	btnLogin.click();
	WebElement createButton = driver.findElement(By.xpath("//a[@role='button'])[2]"));
	createButton.click();
	
	
	//xpath using text
	WebElement btnCreate = driver.findElement(By.xpath("//a[text()='Create New Account']"));
    btnCreate.click();
	
	WebElement facebookText = driver.findElement(By.xpath("//h2[contains(text(),'the people in your life.')]"));
	
	String text= facebookText.getText();
	System.out.println(text);
	
	String attribute= facebookText.getAttribute("class");
	System.out.println(attribute);
	

}}
