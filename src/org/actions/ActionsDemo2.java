package org.actions;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsDemo2 {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/context_menu");
		driver.manage().window().maximize();
		Actions ac=new Actions(driver);
		WebElement box = driver.findElement(By.id("hot-spot"));
         ac.moveToElement(box).contextClick().perform();
       Alert alert = driver.switchTo().alert();
        System.out.println(alert.getText());
         alert.accept();

               

		
	}
	
		}	