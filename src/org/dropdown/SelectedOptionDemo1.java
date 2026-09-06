package org.dropdown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectedOptionDemo1 {
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
		WebElement firstSelectedOption = seCountry.getFirstSelectedOption();
		String text = firstSelectedOption.getText();
		System.out.println(text);
		WebElement dropColors = driver.findElement(By.id("colors"));
		Select seColors=new Select(dropColors);
		seColors.selectByIndex(1);
		seColors.selectByValue("green");
		seColors.selectByVisibleText("White");
		List<WebElement> allSelectedOptions = seColors.getAllSelectedOptions();
		for(int i=0;i<allSelectedOptions.size();i++){
			String text2 = allSelectedOptions.get(i).getText();
			System.out.println(text2);
			
			
			
		}
		
}
}