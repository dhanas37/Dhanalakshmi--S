package org.getAttribute;

import org.jspecify.annotations.Nullable;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Testinputfield {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get(" https://the-internet.herokuapp.com/inputs");
		Thread.sleep(1000);
		WebElement txtNum = driver.findElement(By.xpath("//input[@type='number']"));
		txtNum.sendKeys("987654");
		@Nullable
		String attribute = txtNum.getAttribute("value");
		
       System.out.println(attribute);
}
}