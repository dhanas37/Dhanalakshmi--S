package org.test.windowhandling;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AccordionDemo {
public static void main(String[] args) throws InterruptedException, AWTException {
	WebDriver driver = new ChromeDriver();
    driver.manage().window().maximize();

    driver.get("http://greenstech.in/selenium-course-content.html");
    String parentwindow = driver.getWindowHandle();
    System.out.println(parentwindow);

 WebElement btnAll = driver.findElement(By.xpath("//a[@title='All Courses']"));
 Actions a=new Actions(driver);
	Thread.sleep(2000);
 a.moveToElement(btnAll).contextClick().perform();
 Robot r=new Robot();
 r.keyPress(KeyEvent.VK_DOWN);
 r.keyRelease(KeyEvent.VK_DOWN);
 r.keyPress(KeyEvent.VK_ENTER);
 r.keyRelease(KeyEvent.VK_ENTER);
 r.keyPress(KeyEvent.VK_DOWN);
 r.keyRelease(KeyEvent.VK_DOWN);
 r.keyPress(KeyEvent.VK_ENTER);
 r.keyRelease(KeyEvent.VK_ENTER);
 Set<String> windowHandles = driver.getWindowHandles();
 List<String> li=new LinkedList<>();
 li.addAll(windowHandles);
 driver.switchTo().window(li.get(0));
 driver.switchTo().window(li.get(1));
 driver.switchTo().window(parentwindow);
 
 
    


}
}
