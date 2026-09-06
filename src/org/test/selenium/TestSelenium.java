package org.test.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestSelenium {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.seleniumeasy.com/test/basic-first-form-demo.html");
	
Thread.sleep(2000);
	WebElement btnnlogin = driver.findElement(By.xpath("//a[@class='ParkwebGetDomain_getDomainCta__FZP8W']"));
	btnnlogin.click();


}
}
