package org.test;

import java.awt.AWTException;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class RobotSample2 {
	public static void main(String[] args) throws InterruptedException, AWTException  
	{		
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\srini\\eclipse-workspace\\SeleniumInstall\\Driver\\chromedriver1.exe");
		
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
    driver.get("https://www.facebook.com/");
    WebElement btnGmail = driver.findElement((By.xpath("//input[@id='email']")));
    btnGmail.sendKeys("sri.nithya2k@gmal.com");
    btnGmail.contextClick(btnGmail);
    Actions acc = new Actions(driver);
    acc.doubleClick(btnGmail);

    Robot  btnGmail1 = new Robot();
    btnGmail1.keyPress(KeyEvent.KEY_PRESSED);
    btnGmail1.perform();
    Robot r = new Robot();
    for(int i =0;i<9;i++) {
       r.keyPress(KeyEvent.VK_DOWN);
       r.keyRelease(KeyEvent.VK_DOWN);
       r.keyPress(KeyEvent.VK_ENTER);
   	   r.keyRelease(KeyEvent.VK_ENTER);}
       
       
       

}}
