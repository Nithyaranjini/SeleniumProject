package org.test;


import java.awt.AWTException;
import java.awt.event.KeyEvent;



import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class Robot {
	public static void main(String[] args) throws AWTException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\srini\\eclipse-workspace\\SeleniumInstall\\Driver\\chromedriver.exe");
	    WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://greenstech.in/selenium-course-content.html");
		WebElement questions = driver.findElement(By.xpath("//h2[@class='title mb-0 center']"));  
		WebElement tcs =       driver.findElement(By.xpath("(//a[@title='Interview Questions'])[4]"));
		Actions acc = new Actions(driver);
		acc.click(questions).perform();
	    acc.contextClick(tcs).perform();
	    Robot r = new Robot();
	    r.keyPress(KeyEvent.VK_DOWN);
	    r.keyRelease(KeyEvent.VK_DOWN);
	    
	    r.keyPress(KeyEvent.VK_DOWN);
	    r.keyRelease(KeyEvent.VK_DOWN);
	   
	        
	    r.keyPress(KeyEvent.VK_ENTER);
	    r.keyRelease(KeyEvent.VK_ENTER);}}
	    
	   
	    
	   
		


	



