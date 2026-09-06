package org.test.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestDemo2 {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/login");
		
		WebElement txtusername = driver.findElement(By.id("userName"));
		txtusername.sendKeys("dhanas37");
		WebElement passWord = driver.findElement(By.id("password"));
		passWord.sendKeys("123456");
		WebElement btnnlogin = driver.findElement(By.id("login"));
		btnnlogin.click();
	}}
