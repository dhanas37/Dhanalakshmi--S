package org.test.windowhandling;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class TwoWindowHandleConcept {
public static void main(String[] args) throws AWTException, InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.google.com/");
	driver.manage().window().maximize();
   WebElement btnTitle = driver.findElement(By.xpath("//img[@title='World Cup 2026: A celebration']"));
   String parentWindow = driver.getWindowHandle();
   System.out.println(parentWindow);
   Actions a=new Actions(driver);
   Thread.sleep(2000);
    a.moveToElement(btnTitle).contextClick().perform();
    Robot r=new Robot();
    r.keyPress(KeyEvent.VK_DOWN);
    r.keyRelease(KeyEvent.VK_DOWN);
    r.keyPress(KeyEvent.VK_ENTER);
    r.keyRelease(KeyEvent.VK_ENTER);
    Set<String> windows = driver.getWindowHandles();
    for (String childWindow : windows) {
    	System.out.println(childWindow);
    	if (!parentWindow.equals(childWindow)) {
    	    driver.switchTo().window(childWindow);
    	}    	
    		
    	}
    	
    	
    	
		
}
 

   
}

