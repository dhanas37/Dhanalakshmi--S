package com.test.javascript;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Jsendkeys1 {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver =new ChromeDriver();
		driver.get(" https://demoqa.com/text-box");
		driver.manage().window().maximize();
		JavascriptExecutor js=(JavascriptExecutor)driver;
		WebElement txtName = driver.findElement(By.id("userName"));
		WebElement txtEmail = driver.findElement(By.id("userEmail"));
		js.executeScript("arguments[0].value='Dhana';", txtName);
        js.executeScript("arguments[0].value='dhana34@gmail.com';", txtEmail);
        Thread.sleep(2000);
		WebElement txtAdd = driver.findElement(By.id("currentAddress"));
		js.executeScript("arguments[0].value='eaststreetchennai';", txtAdd);
        Thread.sleep(2000);

		WebElement txtAdd1 = driver.findElement(By.id("permanentAddress"));
		js.executeScript("arguments[0].value='weststreetchennai';", txtAdd1);
        Thread.sleep(3000);
		WebElement btnLogin = driver.findElement(By.id("submit"));
		js.executeScript("arguments[0].click();",btnLogin);

}
}