package org.dropdown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class GerOptionDemo1 {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
	
		driver.get("https://output.jsbin.com/osebed/2");
		driver.manage().window().maximize();
		WebElement dropFruits = driver.findElement(By.id("fruits"));
		Select se=new Select(dropFruits);
		se.selectByIndex(0);
		se.selectByValue("apple");
		se.selectByVisibleText("Grape");
		List<WebElement> options = se.getOptions();
		for(int i=0;i<options.size();i++) {
			String text = options.get(i).getText();
			System.out.println(text);
		}

}
}