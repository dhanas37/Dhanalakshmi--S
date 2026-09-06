package org.actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsDemo {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.myntra.com/");
	driver.manage().window().maximize();
	Actions a=new Actions(driver);
	Thread.sleep(1000);
	WebElement btnMen = driver.findElement(By.xpath("//a[@data-group='men']"));
	
	WebElement btnTshirt = driver.findElement(By.xpath("//a[@class='desktop-categoryLink']"));
	a.moveToElement(btnMen).moveToElement(btnTshirt).click().perform();
	Thread.sleep(1000);
	WebElement checkBox = driver.findElement(By.xpath("//label[@class='common-customCheckbox vertical-filters-label']"));
	 a.click(checkBox).perform();
	 
}
}
