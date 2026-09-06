package com.test.javascript;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class jsendkeys2 {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver =new ChromeDriver();
		driver.get(" https://the-internet.herokuapp.com/inputs");
		driver.manage().window().maximize();
		JavascriptExecutor js=(JavascriptExecutor)driver;

		WebElement txtnum = driver.findElement(By.xpath("//input[@type='number']"));
		js.executeScript("arguments[0].value='12345';",txtnum);
}
}