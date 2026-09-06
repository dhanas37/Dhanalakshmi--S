package org.test.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GreensTech {
	public static void main(String[] args) {
		
	
    WebDriver driver = new ChromeDriver();
    driver.manage().window().maximize();

    driver.get("http://greenstech.in/selenium-course-content.html");
    WebElement heading2 = driver.findElement(By.xpath("//div[@title='Selenium Test Papers']"));
    heading2.click();
    WebElement heading1 = driver.findElement(By.xpath("//div[@title='Model Resumes']"));
    heading1.click();
    
}
}