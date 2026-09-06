package org.test.jsclick;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Jsclick2 {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
	    driver.get("https://the-internet.herokuapp.com/checkboxes");
	    driver.manage().window().maximize();
	    JavascriptExecutor js = (JavascriptExecutor) driver;
	    List<WebElement> checkboxes = driver.findElements(By.xpath("//input[@type='checkbox']"));
	    for (WebElement checkbox : checkboxes) {
            if (!checkbox.isSelected()) {
                js.executeScript("arguments[0].click();", checkbox);
            }
        }	    
}
}