package org.test.screenshot;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleDemo {
	public static void main(String[] args) throws InterruptedException, IOException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		driver.findElement (By.xpath("//textarea[@jsname='yZiJbe']")).sendKeys("flipkart");
		Thread.sleep(3000);
		TakesScreenshot ts=(TakesScreenshot)driver;
		File tk=ts.getScreenshotAs(OutputType.FILE);
		File f=new File("C:\\Users\\Admin\\eclipse-workspace\\SeleniumConcept\\ScreenshotrReport\\searchpage.png");
		FileUtils.copyFile(tk,f);
		
}
}

