package org.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frame {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\srini\\eclipse-workspace\\SeleniumInstall\\Driver\\chromedriver1.exe");
		WebDriver driver = new ChromeDriver();
	
	
	driver.manage().window().maximize();
	    driver.get("http://demo.guru99.com/test/guru99home/");
	    driver.switchTo().frame("a077aa5e");
	    WebElement image = driver.findElement(By.xpath("//img[@src='Jmeter720.png']"));
	    image.click();
	    WebElement frame = driver.findElement(By.xpath("//iframe[@src='ads.html']"));
	    driver.switchTo().frame(frame);
	    WebElement image1 = driver.findElement(By.xpath("//img[@src='Jmeter720.png']"));
	    image1.click();
	   

}}
