package org.test.jsSetAttribute;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo3 {
	public static void main(String[] args) throws InterruptedException {
	     WebDriver driver = new ChromeDriver();
	        driver.get("https://demoqa.com/dynamic-properties");
	        driver.manage().window().maximize();
	        JavascriptExecutor js = (JavascriptExecutor) driver;
	        WebElement btn = driver.findElement(By.id("enableAfter"));
           js.executeScript("arguments[0].setAttribute('disabled','');",btn);

	        // Enable button
	        js.executeScript("arguments[0].removeAttribute('disabled');",btn);
	      
}
}