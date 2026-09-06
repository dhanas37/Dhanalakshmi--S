package org.test.jsSetAttribute;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SetAttributeDemo1 {
	public static void main(String[] args) throws InterruptedException {
     WebDriver driver = new ChromeDriver();
        driver.get("https://demoqa.com/text-box");
        driver.manage().window().maximize();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        WebElement txtName = driver.findElement(By.id("userName"));
		WebElement txtEmail = driver.findElement(By.id("userEmail"));
		js.executeScript("arguments[0].setAttribute('value','dhana');", txtName);
        js.executeScript("arguments[0].setAttribute('value','dhanas34@gmail.com');", txtEmail);
        Thread.sleep(2000);

}
}