package org.test.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestParabank {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://parabank.parasoft.com");
		WebElement txtUsername = driver.findElement(By.name("username"));
		txtUsername.sendKeys("Dhana");
		WebElement txtpassWord = driver.findElement(By.name("password"));
		txtpassWord.sendKeys("12345");
		WebElement btnlogin = driver.findElement(By.xpath("//input[@type='submit']"));
		btnlogin.click();
	}
	
		
		
}
