package org.test.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Testuniversity {
public static void main(String[] args) {
	WebDriver driver = new ChromeDriver();
	driver.get("https://webdriveruniversity.com");
	
	WebElement  btnlogin = driver.findElement(By.id("login-portal"));
	btnlogin.click();


}
}
