package org.dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultiSelectdemo {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com");
		driver.manage().window().maximize();
		driver.findElement(By.id("name")).sendKeys("Dhana");
		driver.findElement(By.id("email")).sendKeys("dhnaa23@gmail.com");
		driver.findElement(By.id("phone")).sendKeys("894567890");
		driver.findElement(By.id("textarea")).sendKeys("No.22,RainbowApartment,Chennai");
		driver.findElement(By.id("female")).click();
		driver.findElement(By.id("tuesday")).click();
		WebElement dropCountry = driver.findElement(By.id("country"));
		Select seCountry=new Select(dropCountry);
		seCountry.selectByIndex(1);
		seCountry.selectByValue("australia");
		WebElement dropColors = driver.findElement(By.id("colors"));
		Select seColors=new Select(dropColors);
		seColors.selectByIndex(1);
		seColors.selectByValue("green");
		seColors.selectByVisibleText("White");
		seColors.deselectAll();
		WebElement dropAnimals = driver.findElement(By.id("animals"));
		Select seAnimals=new Select(dropAnimals);
		seAnimals.selectByIndex(0);
		seAnimals.selectByValue("elephant");
		seAnimals.selectByVisibleText("Rabbit");
		seAnimals.deselectByIndex(0);
		driver.findElement(By.id("datepicker")).sendKeys("07/12/2026");
		
		driver.findElement(By.xpath("//a[text()='13']")).click();
		driver.findElement(By.id("start-date")).sendKeys("01/02/2026");
		driver.findElement(By.id("end-date")).sendKeys("15/06/2026");
		driver.findElement(By.xpath("//button[@class='submit-btn']")).click();
		
		
		
		
		
	
		

		
		
		
		

	
		
		
}
}