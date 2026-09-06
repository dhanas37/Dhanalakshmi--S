package org.test.windowhandling;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class GreensDemo {
	public static void main(String[] args) throws InterruptedException {
		
		
	    WebDriver driver = new ChromeDriver();
	    driver.manage().window().maximize();

	    driver.get("http://greenstech.in/selenium-course-content.html");
	    WebElement btnCourse = driver.findElement(By.xpath("//div[@title='Courses']"));
	    Actions a=new Actions(driver);
	    a.moveToElement(btnCourse).click().perform();
String parentwindow = driver.getWindowHandle();	    
System.out.println(parentwindow);
WebElement btnMaster = driver.findElement(By.xpath("//div[@title='Master Program']"));
a.moveToElement(btnMaster).click().perform();

WebElement btnR = driver.findElement( By.xpath("//span[text()='Data Analytics Certification Training']"));
a.moveToElement(btnR).click().perform();

// Wait if a new window is expected
Thread.sleep(3000);

Set<String> windows = driver.getWindowHandles();
for (String childwin : windows) {
	System.out.println(childwin);
   if ((parentwindow !=childwin)) {
       driver.switchTo().window(childwin);
       
   }
}

}
}