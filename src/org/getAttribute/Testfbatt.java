package org.getAttribute;

import org.jspecify.annotations.Nullable;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Testfbatt {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		@Nullable
		String title = driver.getTitle();
		System.out.println(title);
		@Nullable
		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);
		WebElement txtnName = driver.findElement(By.name("email"));
		txtnName.sendKeys("Dhana");
		@Nullable
		String attribute = txtnName.getAttribute("value");
		System.out.println(attribute);
		WebElement txtPass = driver.findElement(By.name("pass"));
		txtPass.sendKeys("123456");
		@Nullable
		String attribute2 = txtPass.getAttribute("value");
		System.out.println(attribute2);
		
	}
				
}
