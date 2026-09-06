package org.test.jsclick;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JsClick1 {
public static void main(String[] args) {
	WebDriver driver = new ChromeDriver();
    driver.get("https://demoqa.com/buttons");
    driver.manage().window().maximize();
    JavascriptExecutor js = (JavascriptExecutor) driver;
 // Double Click button
    WebElement doubleClick = driver.findElement(By.id("doubleClickBtn"));
    js.executeScript("arguments[0].click();", doubleClick);

    // Right Click button
    WebElement rightClick = driver.findElement(By.id("rightClickBtn"));
    js.executeScript("arguments[0].click();", rightClick);

    // Normal Click button
    WebElement clickBtn = driver.findElement( By.xpath("//button[text()='Click Me']") );
    js.executeScript("arguments[0].click();", clickBtn);

   
    
}
}
