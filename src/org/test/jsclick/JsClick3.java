package org.test.jsclick;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JsClick3 {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
	    driver.get("https://the-internet.herokuapp.com/checkboxes");
	    driver.manage().window().maximize();
	    JavascriptExecutor js = (JavascriptExecutor) driver;
        WebElement checkbox = driver.findElement(By.xpath("//input[@type='checkbox'][1]"));
        js.executeScript("arguments[0].click();", checkbox);

        Boolean isChecked = (Boolean) js.executeScript("return arguments[0].checked;", checkbox);

                if (isChecked) {
            System.out.println("Checkbox is selected");
        } else {
            System.out.println("Checkbox is not selected");
        }
	   
}
}