package org.test.selenium;

import org.jspecify.annotations.Nullable;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestPractice2 {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://practicetestautomation.com/practice-test-login");
		
		WebElement txtusername = driver.findElement(By.id("username"));
		txtusername.sendKeys("student");
		
		String attrUser = txtusername.getAttribute("value");
		System.out.println(attrUser);
		WebElement passWord = driver.findElement(By.id("password"));
		passWord.sendKeys("Password123");
		WebElement btnnlogin = driver.findElement(By.id("submit"));
		btnnlogin.click();
		WebElement verifySubmit = driver.findElement(By.xpath("//h1[@class='post-title']"));
		String text = verifySubmit.getText();
		System.out.println(text);


}
}