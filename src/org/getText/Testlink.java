package org.getText;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Testlink {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com\r\n");
		Thread.sleep(1000);
		WebElement searh = driver.findElement(By.xpath("//a[text()='A/B Testing']"));
		searh.click();
		WebElement head = driver.findElement(By.xpath("//h3[text()='A/B Test Variation 1']"));
		String text = head.getText();
		System.out.println(text);
		WebElement textPara = driver.findElement(By.id("content"));
		String text2 = textPara.getText();
		System.out.println(text2);
	}
}
