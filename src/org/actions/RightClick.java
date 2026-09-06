package org.actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClick {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		Actions a1=new Actions(driver);
		Thread.sleep(1000);
		WebElement btnSearch = driver.findElement(By.xpath("//textarea[@class='gLFyf']"));
		a1.contextClick(btnSearch).perform();
}
}