package org.test.jsSetAttribute;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo4 {
	public static void main(String[] args) throws InterruptedException {
	     WebDriver driver = new ChromeDriver();
	        driver.get("https://the-internet.herokuapp.com/login\r\n");
	        driver.manage().window().maximize();
	        JavascriptExecutor js = (JavascriptExecutor) driver;
	        WebElement username = driver.findElement(By.id("username"));
	        js.executeScript("arguments[0].setAttribute('value','tomsmith');",username);
            WebElement password = driver.findElement(By.id("password"));
          js.executeScript("arguments[0].setAttribute('value','SuperSecretPassword!');",password);
         Thread.sleep(2000);
         WebElement loginBtn = driver.findElement(By.xpath("//button[@type='submit']"));
                   js.executeScript("arguments[0].click();",loginBtn);


}
}