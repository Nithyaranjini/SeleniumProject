package org.test;

import java.awt.AWTException;
import java.io.File;
import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.*;
import com.google.common.io.Files;

public class ScreenShot{
public static void main(String[] args) throws InterruptedException,AWTException,IOException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\srini\\eclipse-workspace\\SeleniumInstall\\Driver\\chromedriver1.exe");
	    WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
	    driver.get("http://greenstech.in/selenium-course-content.html");
	    TakesScreenshot tk = (TakesScreenshot) driver;
	    File screnshootAs = tk.getScreenshotAs(OutputType.FILE);
	    System.out.println(screnshootAs);
	    File rwn = new File("D:\\Add\\sub\\mul\\screenshot.jpg");
	    Files.copy(screnshootAs,rwn);
	    }}


	    

		
		


