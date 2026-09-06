package org.test.robot;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class LoginDem0 {
public static void main(String[] args) throws InterruptedException, AWTException {
	WebDriver driver=new ChromeDriver();
	driver.get("https://the-internet.herokuapp.com/login");
	driver.manage().window().maximize();
	Thread.sleep(2000);
	WebElement txtuserName = driver.findElement(By.id("username"));
	txtuserName.sendKeys("tomsmith ");
	Actions ac=new Actions(driver);
	ac.doubleClick(txtuserName).click().perform();
	Robot robot = new Robot();

    // (Cut)
    robot.keyPress(KeyEvent.VK_CONTROL);
    robot.keyPress(KeyEvent.VK_X);

    robot.keyRelease(KeyEvent.VK_X);
    robot.keyRelease(KeyEvent.VK_CONTROL);

    Thread.sleep(1000);

    // TAB move 
    robot.keyPress(KeyEvent.VK_TAB);
    robot.keyRelease(KeyEvent.VK_TAB);

    Thread.sleep(1000);

    // (Paste)
    robot.keyPress(KeyEvent.VK_CONTROL);
    robot.keyPress(KeyEvent.VK_V);

    robot.keyRelease(KeyEvent.VK_V);
    robot.keyRelease(KeyEvent.VK_CONTROL);

	
}
}
