package org.test;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Javascript1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\srini\\eclipse-workspace\\SeleniumInstall\\Driver\\chromedriver1.exe");
		WebDriver driver = new ChromeDriver();
	    driver.get("http://greenstech.in/selenium-course-content.html");
	    WebElement scrollDown = driver.findElement(By.xpath("(//h3[@title='Top Selenium Trends In 2020'])[2]"));
	    JavascriptExecutor js = (JavascriptExecutor) driver;	
	    js.executeScript("arguments[0].scrollIntoView(true)",scrollDown );
		Thread.sleep(3000);
	    WebElement scrollUp = driver.findElement(By.xpath("//button[@title='Schedule Demo']"));
	    js.executeScript("arguments[0].scrollIntoView(false)",scrollUp );

}}
