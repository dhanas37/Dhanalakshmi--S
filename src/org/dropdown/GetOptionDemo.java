package org.dropdown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class GetOptionDemo {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://adactinhotelapp.com/");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("yoshitha29");
		driver.findElement(By.id("password")).sendKeys("dhanas@37");
		driver.findElement(By.id("login")).click();
		Thread.sleep(2000);
		//2nd page
		WebElement dropLocation = driver.findElement(By.id("location"));
		Select seLocation=new Select(dropLocation);
		seLocation.selectByIndex(1);
		List<WebElement> options = seLocation.getOptions();
		for(int i=0;i<options.size();i++) {
			String text = options.get(i).getText();
			System.out.println(text);
		}
		
	
}}
