package org.test;

import java.awt.AWTException;



import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;




public class DropdownSample1 {
public static void main(String[] args) throws InterruptedException,AWTException,IOException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\srini\\eclipse-workspace\\SeleniumInstall\\Driver\\chromedriver1.exe");
	    WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		
		//mutiple select  dropdown
		driver.get("https://demoqa.com/select-menu");
		WebElement multiselect = driver.findElement(By.id("cars"));
		Select s = new Select(multiselect);
		Boolean b = s.isMultiple();
		System.out.println(b);
		s.selectByIndex(2);
        s.selectByValue("saab");
		s.selectByVisibleText("Audi");
		List<WebElement> allSelectedOptions = s.getAllSelectedOptions();
		for(int i=0;i<allSelectedOptions.size();i++) {
			WebElement ele  =allSelectedOptions.get(i);
			String txt =ele.getText();
			System.out.println(txt);}
		WebElement FirstSelectedOption=s.getFirstSelectedOption();
		String txt2 = FirstSelectedOption.getText();
		System.out.println(txt2);
		Thread.sleep(30000);
		//s.deselectAll();
}}
		
		
		
		
		
		
	


