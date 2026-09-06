package org.test.robot;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SnapdealDemo {
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
	      //Search Product
       WebElement product = driver.findElement(By.xpath("//img[@title='QitmirMKT Rose Gold Metal Digital Womens Watch' ]"));
       Actions actions = new Actions(driver);
       actions.contextClick(product).perform();
        Thread.sleep(2000);
        Robot robot = new Robot();
      // Without opening new tab using Robot to click the product
      robot.keyPress(KeyEvent.VK_DOWN);
      robot.keyRelease(KeyEvent.VK_DOWN);
      
       robot.keyPress(KeyEvent.VK_DOWN);
      robot.keyRelease(KeyEvent.VK_DOWN);

     robot.keyPress(KeyEvent.VK_ENTER);
       robot.keyRelease(KeyEvent.VK_ENTER);

        Thread.sleep(3000);


        System.out.println(driver.getTitle());
	}}