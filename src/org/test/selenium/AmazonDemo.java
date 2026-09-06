package org.test.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonDemo {
public static void main(String[] args) {
	WebDriver driver = new ChromeDriver();
    driver.manage().window().maximize();

    driver.get("https://www.amazon.in/");
WebElement searchButton = driver.findElement(By.xpath("//input[@role='searchbox']"));
searchButton.sendKeys("Mobile");
driver.findElement(By.xpath("//input[@type='submit']")).click();

}

}
