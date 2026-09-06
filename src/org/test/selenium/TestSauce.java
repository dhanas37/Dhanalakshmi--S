package org.test.selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestSauce {
public static void main(String[] args) {
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.saucedemo.com");
	WebElement txtusername = driver.findElement(By.id("user-name"));
	txtusername.sendKeys("visual_user");
	WebElement passWord = driver.findElement(By.id("password"));
	passWord.sendKeys("secret_sauce");
	WebElement btnnlogin = driver.findElement(By.id("login-button"));
	btnnlogin.click();
}
}
