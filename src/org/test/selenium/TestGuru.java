package org.test.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestGuru {
public static void main(String[] args) {
	WebDriver driver = new ChromeDriver();
	driver.get("https://demo.guru99.com/test/login.html");
	
	WebElement txtusername = driver.findElement(By.id("email"));
	txtusername.sendKeys("dhanasr95@gmail.com ");
	WebElement passWord = driver.findElement(By.id("passwd"));
	passWord.sendKeys("Password123");
	WebElement btnnlogin = driver.findElement(By.id("SubmitLogin"));
	btnnlogin.click();




}
}
