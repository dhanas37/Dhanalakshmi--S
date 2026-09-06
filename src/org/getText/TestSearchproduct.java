package org.getText;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestSearchproduct {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://automationexercise.com");
		Thread.sleep(1000);
		
		WebElement txtpro = driver.findElement(By.xpath("//a[@href='/products']"));
		txtpro.click();
		WebElement printName = driver.findElement(By.xpath("//p[text()='Blue Top']"));
		String text = printName.getText();
		System.out.println(text);
		Thread.sleep(1000);
		WebElement printPrice = driver.findElement(By.xpath("//h2[text()='Rs. 500']"));
		String text1 = printPrice.getText();
		System.out.println(text1);
		Thread.sleep(1000);
		WebElement printCart = driver.findElement(By.xpath("//a[@data-product-id='1']"));
		String text2 = printCart.getText();
		System.out.println(text2);
		Thread.sleep(1000);
		

		
	}
	}


