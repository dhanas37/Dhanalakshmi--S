package org.test.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestPHP {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver = new ChromeDriver();
	driver.get("https://phptravels.net");
	driver.manage().window().maximize();
	WebElement btnSAccept = driver.findElement(By.id("acknowledgeDemoWarning"));
	btnSAccept.click();
	Thread.sleep(3000);
	WebElement btnLogin = driver.findElement(By.xpath("//a[@href='https://phptravels.net/login']"));
	btnLogin.click();
	Thread.sleep(1000);
	WebElement txtusername = driver.findElement(By.id("email"));
	txtusername.sendKeys("dhanasr95@gmail.com ");
	WebElement passWord = driver.findElement(By.id("password"));	passWord.sendKeys("Password123");
	WebElement btnnlogin = driver.findElement(By.xpath("//button[@type='submit']"));
	btnnlogin.click();

}
}
