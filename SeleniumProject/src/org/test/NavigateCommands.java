package org.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class NavigateCommands{
	
		public static void main(String[] args) throws InterruptedException {
			System.setProperty("webdriver.chrome.driver","C:\\Users\\srini\\eclipse-workspace\\SeleniumInstall\\Driver\\chromedriver.exe");
		    WebDriver driver= new ChromeDriver();
			driver.manage().window().maximize();
			/*driver.navigate().to("https://www.facebook.com/");
			driver.navigate().to("https://www.flipkart.com/");
			driver.navigate().to("https://www.amazon.in/");
			driver.navigate().to("https://www.instagram.com/");
			driver.navigate().back();
			driver.navigate().back();
			driver.navigate().forward();
			driver.navigate().forward();
			driver.navigate().refresh();}}*/

	         
         //webelement
	      driver.navigate().to("https://www.facebook.com/");
          WebElement txtUserName = driver.findElement(By.id("email"));
          boolean d  = txtUserName.isDisplayed();
          System.out.println(d);
          boolean c = txtUserName.isEnabled();
          System.out.println(c);


         WebElement btnCreate = driver.findElement(By.xpath("//a[text()='Create New Account']"));
         btnCreate.click();

         Thread.sleep(3000);
         WebElement btnMaleButton = driver.findElement(By.xpath("(//input[@type='radio'])[2]"));
         boolean e = btnMaleButton.isSelected();
         System.out.println(e);
         btnMaleButton.click();
         Thread.sleep(3000);
         boolean f= btnMaleButton.isSelected();
         System.out.println(f);}}



