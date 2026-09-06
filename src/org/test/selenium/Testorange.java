package org.test.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Testorange {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.get("https://opensource-demo.orangehrmlive.com");
	WebElement txtUsername = driver.findElement(By.xpath("//input[@placeholder='Username']"));
    txtUsername.sendKeys("Admin");

    WebElement txtpassWord = driver.findElement(By.name("password"));
    txtpassWord.sendKeys("admin123");

    WebElement btnLogin = driver.findElement(By.xpath("//button[@type='submit']"));
    btnLogin.click();

}
}
