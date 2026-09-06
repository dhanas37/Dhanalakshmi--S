package org.test.screenshot;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class FlipkartDemo {
	public static void main(String[] args) throws InterruptedException, IOException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[@role='button']")).click();
		Thread.sleep(2000);
		Actions actions = new Actions(driver);

	    // Hover over a top navigation menu
		Thread.sleep(2000);
	    WebElement electronicMenu = driver.findElement(By.xpath("//div[text()='Electronics']"));
	    actions.moveToElement(electronicMenu).click().perform();
	    WebElement electronicWatch = driver.findElement(By.xpath("//div[text()='Wearables ']"));
	    actions.click(electronicWatch).perform();

		driver.findElement (By.xpath("//textarea[@jsname='yZiJbe']")).sendKeys("flipkart");
		Thread.sleep(3000);
		TakesScreenshot ts=(TakesScreenshot)driver;
		File tk=ts.getScreenshotAs(OutputType.FILE);
		File f=new File("C:\\Users\\Admin\\eclipse-workspace\\SeleniumConcept\\ScreenshotrReport\\searchpage.png");
		FileUtils.copyFile(tk, f);
		
}
}