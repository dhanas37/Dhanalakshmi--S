package org.draganddrop;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragDemo3 {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/drag_drop.html");
		driver.manage().window().maximize();
		Actions ac=new Actions(driver);
		//DebitSide
		WebElement btnSource = driver.findElement(By.xpath("(//a[@class='button button-orange'])[2]"));
	  WebElement btnDest = driver.findElement(By.xpath("(//li[@class='placeholder'])[2]"));
		ac.dragAndDrop(btnSource, btnDest).perform();
		//CreditSide
		Thread.sleep(2000);
		WebElement btnSource1 = driver.findElement(By.xpath("(//a[@class='button button-orange'])[4]"));
		  WebElement btnDest1 = driver.findElement(By.xpath("//ol[@id='bank']/li[@class='placeholder']"));
			ac.dragAndDrop(btnSource1, btnDest1).perform();
			
			
	
		
	}	    

}
