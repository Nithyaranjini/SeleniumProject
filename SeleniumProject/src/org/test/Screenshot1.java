package org.test;
import java.io.File;
import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import com.google.common.io.Files;
public class Screenshot1{

public static void main(String[] args) throws InterruptedException, IOException {
			System.setProperty("webdriver.chrome.driver","C:\\Users\\srini\\eclipse-workspace\\SeleniumInstall\\Driver\\chromedriver1.exe");
		    WebDriver driver= new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.flipkart.com/");
		    WebElement fashion = driver.findElement(By.xpath("//div[text()='Fashion']"));
			Actions acc = new Actions(driver);
			acc.moveToElement(fashion).perform();
			Thread.sleep(3000);
		     TakesScreenshot tk = (TakesScreenshot) driver;
			File screnshootAs = tk.getScreenshotAs(OutputType.FILE);
		    System.out.println(screnshootAs);
		    Thread.sleep(3000);
			File rwn = new File("D:\\Add\\sub\\mul\\screenshot.jpg");
			Files.copy(screnshootAs,rwn);}}

          
           




