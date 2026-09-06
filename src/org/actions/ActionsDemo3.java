package org.actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsDemo3 {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/\r\n");
		driver.manage().window().maximize();
		Actions ac=new Actions(driver);
		WebElement link1 = driver.findElement(By.xpath("//a[text()='A/B Testing']"));
		ac.moveToElement(link1).contextClick().doubleClick().build().perform();
		WebElement para = driver.findElement(By.xpath("//p"));
		System.out.println(para.getText());
		

}
}