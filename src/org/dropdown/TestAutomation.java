package org.dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class TestAutomation {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.get("https://automationexercise.com/signup");
	driver.manage().window().maximize();
	driver.findElement(By.name("name")).sendKeys("dhana");
	driver.findElement(By.xpath("//input[@data-qa='signup-email']")).sendKeys("dhanasr00@gmail.com");
	driver.findElement(By.xpath("//button[@data-qa='signup-button']")).click();
	//2nd page
	driver.findElement(By.id("uniform-id_gender2")).click();
	driver.findElement(By.id("password")).sendKeys("12356");
	WebElement dropDays = driver.findElement(By.id("days"));
	Select seDays=new Select(dropDays);
	seDays.selectByIndex(1);
	WebElement dropmonths = driver.findElement(By.id("months"));
	Select seMonths=new Select(dropmonths);
	seMonths.selectByIndex(2);
	WebElement dropYears = driver.findElement(By.id("years"));
	Select seYears=new Select(dropYears);
	seYears.selectByIndex(3);
	  driver.findElement(By.id("first_name")).sendKeys("Dhakshu");
	  driver.findElement(By.id("last_name")).sendKeys("P");
	  driver.findElement(By.id("address1")).sendKeys("No.23,RainbowApartments,chennai");
	  driver.findElement(By.id("address2")).sendKeys("No.23,RainbowApartments,chennai");
	  WebElement dropCount = driver.findElement(By.id("country"));
	  Select seCount=new Select(dropCount);
	   seCount.selectByIndex(3);
	  driver.findElement(By.id("state")).sendKeys("tamilnadu");
	driver.findElement(By.id("city")).sendKeys("chennai");

		driver.findElement(By.id("zipcode")).sendKeys("6000045");

		driver.findElement(By.id("mobile_number")).sendKeys("9000567459");
		driver.findElement(By.xpath("//button[text()='Create Account']")).click();
		

		
		
	  

	  
	  
	

	
}
}