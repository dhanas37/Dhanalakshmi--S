package org.dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultiselectDemo1 {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
	
		driver.get("https://output.jsbin.com/osebed/2");
		driver.manage().window().maximize();
		WebElement dropFruits = driver.findElement(By.id("fruits"));
		
		Select se=new Select(dropFruits);
		boolean multiple = se.isMultiple();
		System.out.println(multiple);
		se.selectByIndex(0);
		se.selectByValue("apple");
		se.selectByVisibleText("Grape");
		se.deselectByIndex(0);
		se.deselectAll();

		
}
}