package org.actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class TestHovers {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/hovers\r\n");
		driver.manage().window().maximize();
		Actions ac=new Actions(driver);
		Thread.sleep(1000);
		//Avatar1
		WebElement img1 = driver.findElement(By.xpath("(//img[@alt='User Avatar'])[1]"));
		ac.click(img1).perform();
		WebElement name1 = driver.findElement(By.xpath("(//h5)[1]"));
		String text = name1.getText();
		System.out.println(text);
		//Avatar2
		Thread.sleep(1000);
		WebElement img2 = driver.findElement(By.xpath("(//img[@alt='User Avatar'])[2]"));
		ac.moveToElement(img2).perform();
        Thread.sleep(1000);

        WebElement name2 = driver.findElement(By.xpath("(//h5)[2]"));
        System.out.println(name2.getText());
        //Avatar3
        WebElement img3 = driver.findElement(By.xpath("(//img[@alt='User Avatar'])[3]"));
		ac.moveToElement(img2).moveToElement(img3).perform();
        Thread.sleep(1000);

        WebElement name3 = driver.findElement(By.xpath("(//h5)[3]"));
        System.out.println(name3.getText());

        

		
	
}
}