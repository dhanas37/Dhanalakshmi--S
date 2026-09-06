package com.test.javascript;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Jsendkeys3 {
	public static void main(String[] args) {
		WebDriver driver =new ChromeDriver();
		driver.get(" https://demoqa.com/date-picker");
		driver.manage().window().maximize();
		JavascriptExecutor js=(JavascriptExecutor)driver;

        WebElement date = driver.findElement(By.id("datePickerMonthYearInput"));

        js.executeScript("arguments[0].value='08/15/2026';", date);
        WebElement dateTime = driver.findElement(By.id("dateAndTimePickerInput"));
        js.executeScript("arguments[0].value='August 2, 2026 10:57 AM';", dateTime);

	}

}
