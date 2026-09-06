package org.test.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestInternet {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/login");
		
		WebElement txtusername = driver.findElement(By.id("username"));
		txtusername.sendKeys("tomsmith ");
		WebElement passWord = driver.findElement(By.id("password"));
		passWord.sendKeys("SuperSecretPassword!");
		WebElement btnnlogin = driver.findElement(By.xpath("//button[@type='submit']"));
		btnnlogin.click();
}
}