package org.actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsW3schools {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get(" https://www.w3schools.com/howto/howto_js_accordion.asp\r\n");
		driver.manage().window().maximize();
		Actions a1=new Actions(driver);
	

		WebElement section1 = driver.findElement(By.xpath("//button[text()='Section 1']"));
		section1.click();
		
	WebElement btnHowTo = driver.findElement(By.xpath("//a[text()='How to']"));
	a1.moveToElement(btnHowTo).click().perform();
	Thread.sleep(1000);	
	WebElement btnaccordion = driver.findElement(By.xpath("//button[text()='Section 1']"));
	a1.click(btnaccordion).perform();

	
}
}