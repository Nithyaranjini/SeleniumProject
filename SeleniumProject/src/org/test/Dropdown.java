package org.test;

import java.util.List;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {
	public static void main(String[] args) throws InterruptedException {
    System.setProperty("webdriver.chrome.driver","C:\\Users\\srini\\eclipse-workspace\\SeleniumProject\\Driver\\chromedriver1.exe");
    WebDriver driver= new ChromeDriver();
	driver.manage().window().maximize();
    driver.get("https://www.facebook.com/");
    WebElement btncreate=driver.findElement(By.xpath("//a[text()='Create New Account']"));
    btncreate.click();
    Thread.sleep(3000);
    WebElement dropdown=driver.findElement(By.name("birthday_month"));
    Select s=new Select(dropdown);
    boolean b=s.isMultiple();
    System.out.println(b);
    s.selectByIndex(5);
    //s.selectByValue("8");
    //s.selectByVisibleText("Dec");
    List <WebElement>options=s.getOptions();
    for (int i = 0; i <options.size(); i++) {
    WebElement ele=options.get(i);
    String text=ele.getText();
    System.out.println(text);}
    }
    


}
