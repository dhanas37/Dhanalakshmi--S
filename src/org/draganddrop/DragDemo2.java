package org.draganddrop;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragDemo2 {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.get("https://jqueryui.com/draggable/");
	driver.manage().window().maximize();
	driver.switchTo().frame(0);
	Actions ac=new Actions(driver);
	
    WebElement source = driver.findElement(By.id("draggable"));
    WebElement dest = driver.findElement(By.tagName("body"));
   ac.dragAndDrop(source, dest).perform();

    
}}

	