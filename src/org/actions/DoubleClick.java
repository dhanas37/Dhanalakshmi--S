package org.actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClick {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.get("https://practice.expandtesting.com/");
	driver.manage().window().maximize();
	Actions a1=new Actions(driver);
	Thread.sleep(1000);
	WebElement btnWeb = driver.findElement(By.xpath("//a[@class='my-link']"));
	a1.doubleClick(btnWeb).perform();
	Thread.sleep(2000);
    WebElement message = driver.findElement(By.xpath("//p"));
    System.out.println("Message after double click: " + message.getText());


}
}
