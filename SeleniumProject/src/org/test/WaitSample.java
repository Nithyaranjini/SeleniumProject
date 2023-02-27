package org.test;

import java.time.Duration;




import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

public class WaitSample {
	
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\srini\\eclipse-workspace\\SeleniumInstall\\Driver\\chromedriver1.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		//Implicit waits syntax
		//driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS)   //old version
		// driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		
		/*driver.get("https://www.facebook.com/");
	  	WebElement btncreate = driver.findElement(By.xpath("//a[text()='Create New Account']"));
	    btncreate.click();
	    WebElement btnfemaleRadio = driver.findElement(By.xpath("(//input[@type='radio'])[1]"));
	    btnfemaleRadio.click();}}*/

	
		/* driver.get("https://www.facebook.com/");
	     WebElement btncreate = driver.findElement(By.xpath("//a[text()='Create New Account']"));
	     btncreate.click();
	     WebDriverWait  wait= new WebDriverWait(driver,Duration.ofSeconds(20));
	     WebElement btnfemaleRadio = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//input[@type='radio'])[2]")));
         btnfemaleRadio.click();}}*/
		
		    //Explicity,webdriver,fluent wait
		 driver.get("https://www.facebook.com/");
		 WebElement btncreate1 = driver.findElement(By.xpath("//a[text()='Create New Account']"));
		    
	     btncreate1.click();
		 Wait wait = new FluentWait(driver).withTimeout(Duration.ofSeconds(30)).
		 pollingEvery(Duration.ofSeconds(3)).ignoring(Throwable.class);
		    
		 Object object= wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//input[@type='radio'])[2]")));
		 WebElement element=(WebElement) object;
		 element.click();}}


