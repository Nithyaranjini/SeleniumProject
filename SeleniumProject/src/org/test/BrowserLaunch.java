package org.test;

import java.awt.AWTException;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import java.awt.Robot;
import java.awt.event.KeyEvent;

public class BrowserLaunch {
	

	public static void main(String[] args) throws InterruptedException, AWTException  
	{		
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\srini\\eclipse-workspace\\SeleniumInstall\\Driver\\chromedriver1.exe");
		
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	//get title
	/*driver.get("https://www.instagram.com/");
 	String CurrentUrl = driver.getCurrentUrl();
	System.out.println(CurrentUrl);
	String getTitle = driver.getTitle();
	System.out.println(getTitle);}}*/
	
	
	 //Actions
    /*driver.get("http://greenstech.in/selenium-course-content.html");
    WebElement btnCourse= driver.findElement(By.xpath("//div[txt()='Courses']"));
    Actions acc = new Actions (driver);
    acc.moveToElement(btnCourse).perform();}}*/
	
	//using actions send keys
	/*driver.get("https://www.facebook.com/");
	WebElement txtUserName = driver.findElement(By.xpath("//input[@id='email']"));
	Actions acc = new Actions();
	acc.keyDown( txtUserName.key.SHIFT).txtUserName.sendKeys("greens"). keyUP(txtUserName.key.SHIFT).performe();}}*/

    //DoubleClick
	/*driver.get("https://www.facebook.com/");
	WebElement xtxUserName = driver.findElement(By.xpath("//input[@id='email']"));
    WebElement txtUserPass = driver.findElement(By.xpath("//input[@type='password']"));
    txtUserPass.sendKeys("welcome123");
	xtxUserName.sendKeys("greens");
	Actions acc = new Actions(driver);
	acc.doubleClick(xtxUserName).perform();
	acc.doubleClick(txtUserPass).perform();}}*/
	

    /* WebElement searchbtn = driver.findElement(By.xpath("//input[@title='Search for products, brands and more']"));
     searchbtn .click();
     searchbtn.sendKeys("iphone");
     Actions acc = new Actions(driver);
     acc.doubleClick(searchbtn).perform();*/
	
	
   //Drag and Drop
	/*driver.get("https://demo.guru99.com/insurance/v1/index.php");
	WebElement logIn = driver.findElement(By.xpath("//input[@name='submit']"));
	logIn.click();
	Thread.sleep(3000);
	WebElement src = driver.findElement(By.xpath("//a[text()='Bank']"));
	WebElement dest = driver.findElement(By.xpath("//li[@class='placeholder')[1]]"));
	Actions acc = new Actions(driver);
	acc.dragAndDrop(src, dest).perform();*/
	

	
     
    	//Alert
	  /* driver.get("https://demo.automationtesting.in/Alerts.html");
	   WebElement alOk = driver.findElement(By.xpath("//a[text()='Alert with OK ']"));
	   alOk .click();
	   
       WebElement displayOnAlertSimpleAlert =  driver.findElement(By.xpath("//button[@class='btn btn-danger']"));
       displayOnAlertSimpleAlert.click();
       Alert alt =driver.switchTo().alert();
       String text = alt.getText();
       System.out.println(text);
       Thread.sleep(3000);
       alt.accept();}}

       WebElement comformAlert = driver.findElement(By.xpath("//a[text()='Alert with OK & Cancel ']"));
       comformAlert.click();
       WebElement displayOnAlertConformAlert =  driver.findElement(By.xpath("//button[text()='click the button to display a confirm box ']"));
       displayOnAlertConformAlert.click();
       Alert conformAl =driver.switchTo().alert();
       String text = conformAl.getText();
       System.out.println(text);
       Thread.sleep(3000);
       conformAl.dismiss();}}
     
       WebElement promptAlert =  driver.findElement(By.xpath("//a[text()='Alert with Textbox ']"));
	   promptAlert.click();
	   WebElement demoPromptBox = driver.findElement(By.xpath("//button[text()='click the button to demonstrate the prompt box ']"));
	   demoPromptBox.click();
	  Alert alert =driver.switchTo().alert();
      alert .sendKeys("Automation test engineering Hi Hello");
	  String text = alert.getText();
      System.out.println(text);
      Thread.sleep(3000);
      alert.accept();}}*/


	
        
        
        
       
      
    

	






	
	
	
	 
	 
	   
	  

	

  
	
	
			
	
	




	
	
	
	
	
	
	
	

	