package org.test.scrollby;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HorizontalScrollDemo {
	public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://the-internet.herokuapp.com/large");

       JavascriptExecutor js = (JavascriptExecutor) driver;
       js.executeScript("window.scrollBy(500, 0);");

        Thread.sleep(3000);
    }
}

