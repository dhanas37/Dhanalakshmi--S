package org.test.robot;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import com.esotericsoftware.kryo.util.CuckooObjectMap.Keys;

public class GoogleDemo {
public static void main(String[] args) throws InterruptedException, AWTException {
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.google.com/\r\n");
	driver.manage().window().maximize();
	Thread.sleep(2000);
	WebElement search = driver.findElement(By.id("APjFqb"));
	search.sendKeys("Selenium Java");
	

    Thread.sleep(1000);

    Robot r = new Robot();

    // Select last word (Java)
    r.keyPress(KeyEvent.VK_END);
    r.keyRelease(KeyEvent.VK_END);
    r.keyPress(KeyEvent.VK_CONTROL);
    r.keyPress(KeyEvent.VK_SHIFT);
    r.keyPress(KeyEvent.VK_LEFT);

    r.keyRelease(KeyEvent.VK_LEFT);
    r.keyRelease(KeyEvent.VK_SHIFT);
    r.keyRelease(KeyEvent.VK_CONTROL);
    r.keyPress(KeyEvent.VK_DELETE);
    r.keyRelease(KeyEvent.VK_DELETE);

    Thread.sleep(1000);
	
	
	
}
}
