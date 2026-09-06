package org.getText;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FaceBook {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.facebook.com/");
	WebElement verifyLog = driver.findElement(By.xpath("//span[text()='Log in to Facebook']"));
	String text = verifyLog.getText();
	System.out.println(text);

}
}
