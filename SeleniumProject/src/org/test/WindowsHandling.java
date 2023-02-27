package org.test;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowsHandling {
	
		public static void main(String[] args) throws InterruptedException {
			System.setProperty("webdriver.chrome.driver","C:\\Users\\srini\\eclipse-workspace\\SeleniumInstall\\Driver\\chromedriver1.exe");
			WebDriver driver = new ChromeDriver();
		    driver.manage().window().maximize();
		   driver.get("https://www.amazon.in/");
		   WebElement txtsearch = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
		   txtsearch.sendKeys("iphone",Keys.ENTER);
		   WebElement iphoneGraphi = driver.findElement(By.xpath("(//span[@class='a-size-medium a-color-base a-text-normal'])[1]"));
		   iphoneGraphi.click();
		   String parId = driver.getWindowHandle();
		   System.out.println(parId);
		   Set<String> allWindowId =driver.getWindowHandles();
		  // single child window
	       /*    for (String eachID : allWindowId) {
			   if(!eachID.equals(parId)) {
			   driver.switchTo().window(eachID);}}*/
		   
		  //multiple child window
		   /*int count=1;
		   for (String eachID : allWindowId) {
		       if (count == 2) {
		       	 Thread.sleep(3000);
		         }
	         	 driver.switchTo().window(eachID);
		         count++;}}
}*/
         
		   
		   //alternative way
         /* List<String>allId= new ArrayList<>();
          allId.addAll(allWindowId);
          for(int i=0;i<allId.size();i++)
          {
          String childId= allId.get(1);
          driver.switchTo().window(childId);
          }
         WebElement addtocard =driver.findElement((By.xpath("//input[@name='submit.add-to-cart']")));
         addtocard.click();
         }}*/
		}}


