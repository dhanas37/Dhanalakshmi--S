package org.getAttribute;

import org.jspecify.annotations.Nullable;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestAttribute {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/text-box");
		
		
	WebElement txtUsername = driver.findElement(By.id("userName"));
	txtUsername.sendKeys("Dhana");
	//To get Attribute
	
	String attrusere = txtUsername.getAttribute("id");
	System.out.println(attrusere);
	
	@Nullable
	String attribute1 = txtUsername.getAttribute("type");
	System.out.println(attribute1);
	@Nullable
	String attribute2 = txtUsername.getAttribute("placeholder");
	System.out.println(attribute2);
	}	
}
