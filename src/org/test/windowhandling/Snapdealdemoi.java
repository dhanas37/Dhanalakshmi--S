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

public class Snapdealdemoi {
	public static void main(String[] args) throws InterruptedException, AWTException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.snapdeal.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		WebElement btnsearch = driver.findElement(By.id("search-box-input"));
		btnsearch.sendKeys("Watches");
	      Robot r = new Robot();
	      r.keyPress(KeyEvent.VK_DOWN);
	      r.keyRelease(KeyEvent.VK_DOWN);
	      r.keyPress(KeyEvent.VK_ENTER);
	      r.keyRelease(KeyEvent.VK_ENTER);
	      String parentWindow = driver.getWindowHandle();
	      System.out.println(parentWindow);


	      //Search Product
       WebElement product = driver.findElement(By.xpath("//img[@title='QitmirMKT Rose Gold Metal Digital Womens Watch' ]"));
       Actions actions = new Actions(driver);
       actions.contextClick(product).perform();
        Thread.sleep(2000);
     // Robot - Open link in new tab
        Robot robot = new Robot();
        robot.delay(1000);

        // Move to "Open link in new tab"
         robot.keyPress(KeyEvent.VK_DOWN);
         robot.keyRelease(KeyEvent.VK_DOWN);
         robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);

       

        Set<String> windows = driver.getWindowHandles();
       for (String childwin : windows) {
          if ((parentWindow !=childwin)) {
              driver.switchTo().window(childwin);
              
          }

       }
       driver.findElement(By.xpath("//span[@class='payBlkBig']")).getText();

        System.out.println(driver.getTitle());
	}

}