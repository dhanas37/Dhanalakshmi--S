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

public class AmazonDemo {
public static void main(String[] args) throws AWTException, InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.amazon.in/");
	driver.manage().window().maximize();
	// Search for iPhone X
    driver.findElement(By.id("twotabsearchtextbox")).sendKeys("iPhone X");
    driver.findElement(By.id("nav-search-submit-button")).click();
    String parentWindow = driver.getWindowHandle();
    System.out.println(parentWindow);

    // First product
    WebElement product = driver.findElement(By.xpath("//img[@class='s-image']"));

    // Right-click on the product
    Actions action = new Actions(driver);
    action.contextClick(product).perform();

    // Robot - Open link in new tab
    Robot robot = new Robot();
    robot.delay(1000);

    // Move to "Open link in new tab"
     robot.keyPress(KeyEvent.VK_DOWN);
     robot.keyRelease(KeyEvent.VK_DOWN);
     robot.keyPress(KeyEvent.VK_ENTER);
    robot.keyRelease(KeyEvent.VK_ENTER);
    
    
      Thread.sleep(3000);

      Set<String> windows = driver.getWindowHandles();
     for (String childwin : windows) {
        if ((parentWindow !=childwin)) {
            driver.switchTo().window(childwin);
            
        }
    }
//     WebElement priceP = driver.findElement(By.xpath(" //span[@class='a-price-whole'][1]"));
//     String text = priceP.getText();
//     System.out.println(text);

   

}
}

