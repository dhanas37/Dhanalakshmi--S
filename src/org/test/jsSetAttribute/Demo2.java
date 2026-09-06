package org.test.jsSetAttribute;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo2 {
	public static void main(String[] args) throws InterruptedException {
	     WebDriver driver = new ChromeDriver();
	        driver.get("https://the-internet.herokuapp.com/dynamic_loading/1");
	        driver.manage().window().maximize();
	        JavascriptExecutor js = (JavascriptExecutor) driver;
	        WebElement start = driver.findElement(By.xpath("//button[text()='Start']"));
	        start.click();
	       WebElement hiddenEl = driver.findElement(By.id("finish"));
           js.executeScript("arguments[0].setAttribute('style','display:block !important');", hiddenEl );
            Thread.sleep(2000);
            String text = hiddenEl.getText();
	        System.out.println(text);



	        
}
}