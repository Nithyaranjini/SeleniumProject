package org.test;

import java.awt.AWTException;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Alert {
	public static void main(String[] args) throws InterruptedException, AWTException  
	{		
	System.setProperty("webdriver.chrome.driver","C:\\Users\\srini\\eclipse-workspace\\SeleniumProject\\Driver\\chromedriver1.exe");
		
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demo.automationtesting.in/Alerts.html");
	   WebElement alOk = driver.findElement(By.xpath("//a[text()='Alert with OK ']"));
	   alOk .click();
	   
   WebElement displayOnAlertSimpleAlert =  driver.findElement(By.xpath("//button[@class='btn btn-danger']"));
   displayOnAlertSimpleAlert.click();
    Alert alt =driver.switchTo().alert();
    String text = alt.getText();
    System.out.println(text);
    Thread.sleep(3000);
    alt.accept();}}




   /* WebElement comformAlert = driver.findElement(By.xpath("//a[text()='Alert with OK & Cancel ']"));
      comformAlert.click();
      WebElement displayOnAlertConformAlert =  driver.findElement(By.xpath("//button[text()='click the button to display a confirm box ']"));
      displayOnAlertConformAlert.click();
      Alert conformAl =driver.switchTo().alert();
      String text = conformAl.getText();
      System.out.println(text);
      Thread.sleep(3000);
      conformAl.dismiss();}}*/
   
	/*WebElement promptAlert =  driver.findElement(By.xpath("//a[text()='Alert with Textbox ']"));
	 promptAlert.click();
	 WebElement demoPromptBox = driver.findElement(By.xpath("//button[text()='click the button to demonstrate the prompt box ']"));
	 demoPromptBox.click();
	 Alert alert =driver.switchTo().alert();
	 alert .sendKeys("Automation test engineering Hi Hello");
	 String text = alert.getText();
	 System.out.println(text);
	 Thread.sleep(3000);
     alert.accept();}}*/



