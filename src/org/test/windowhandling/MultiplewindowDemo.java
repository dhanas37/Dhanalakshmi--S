package org.test.windowhandling;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MultiplewindowDemo {
public static void main(String[] args) throws InterruptedException, AWTException {
	WebDriver driver=new ChromeDriver();
	driver.get("https://the-internet.herokuapp.com/windows");
	WebElement btnClick = driver.findElement(By.xpath("//a[text()='Click Here']"));
	driver.manage().window().maximize();
	String parentWindow = driver.getWindowHandle();
	System.out.println(parentWindow);
	Actions a=new Actions(driver);
	Thread.sleep(2000);
    a.moveToElement(btnClick).contextClick().perform();
    Robot r=new Robot();
    r.keyPress(KeyEvent.VK_DOWN);
    r.keyRelease(KeyEvent.VK_DOWN);
    r.keyPress(KeyEvent.VK_ENTER);
    r.keyRelease(KeyEvent.VK_ENTER);
    r.keyPress(KeyEvent.VK_DOWN);
    r.keyRelease(KeyEvent.VK_DOWN);
    r.keyPress(KeyEvent.VK_ENTER);
    r.keyRelease(KeyEvent.VK_ENTER);
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
    driver.switchTo().window(parentWindow);
    


    
    
    
    
    
    
    
    
    
      
   
}
}
