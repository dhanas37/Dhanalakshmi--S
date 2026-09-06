package org.test.robot;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class GoogleDemo1 {
	public static void main(String[] args) throws InterruptedException, AWTException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/\r\n");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		Actions actions = new Actions(driver);

				actions.contextClick().perform();
		Thread.sleep(2000);

		Robot robot = new Robot();

		for (int i = 0; i < 4; i++) {
		    robot.keyPress(KeyEvent.VK_DOWN);
		    robot.keyRelease(KeyEvent.VK_DOWN);
		    robot.delay(100);
		}

				robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);

		
}
}