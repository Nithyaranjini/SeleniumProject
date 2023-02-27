package org.test;

import java.awt.AWTException;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.awt.Robot;
import java.awt.event.KeyEvent;


public class Actions {
	
	public static void main(String[] args) throws AWTException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\srini\\eclipse-workspace\\SeleniumInstall\\Driver\\chromedriver1.exe");
	    WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		/*driver.get("http://greenstech.in/selenium-course-content.html");
        WebElement btnCourse= driver.findElement(By.xpath("//div[txt()='Courses ']"));
	    Actions acc = new Actions (driver);
	    acc.moveToElement(btnCourse).perform();}}*/

        driver.get("https://www.facebook.com/");
        WebElement txtUserName = driver.findElement(By.xpath("//input[@id='email']"));
        Actions acc = new  Actions();
        acc.keyDown( txtUserName.key.SHIFT).txtUserName.sendKeys("greens"). keyUP(txtUserName.key.SHIFT).performe();
        }}

	      

        /* WebElement searchbtn = driver.findElement(By.xpath("//input[@title='Search for products, brands and more']"));
        searchbtn .click();
        searchbtn.sendKeys("iphone");
        Actions acc = new Actions(driver);
        acc.doubleClick(searchbtn).perform();*/
	    
	

