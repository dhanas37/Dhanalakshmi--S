package com.test.javascript;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//javascript
public class jsendkeys {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		JavascriptExecutor js=(JavascriptExecutor)driver;
		WebElement txtName = driver.findElement(By.name("email"));
		WebElement txtpass = driver.findElement(By.name("pass"));
        js.executeScript("arguments[0].setAttribute('value','dhana');", txtName);
        js.executeScript("arguments[0].setAttribute('value','balu');", txtpass);
        Thread.sleep(3000);
		WebElement btnLogin = driver.findElement(By.xpath("//span[text()='Log in']"));
		js.executeScript("arguments[0].click();",btnLogin);

		
	
	}
}
