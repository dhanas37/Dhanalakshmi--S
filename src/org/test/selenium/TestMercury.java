package org.test.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestMercury {
public static void main(String[] args) {
	WebDriver driver = new ChromeDriver();
	driver.get("https://demo.guru99.com/test/newtours");
	
	WebElement txtusername = driver.findElement(By.name("userName"));
	txtusername.sendKeys("dhanasr95@gmail.com ");
	WebElement passWord = driver.findElement(By.name("password"));
	passWord.sendKeys("Password123");
	WebElement btnnlogin = driver.findElement(By.name("submit"));
	btnnlogin.click();

}
}
