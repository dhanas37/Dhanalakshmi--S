package org.test.screenshot;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HdfcDemo {
public static void main(String[] args) throws IOException, InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.hdfc.bank.in/");
	driver.manage().window().maximize();
	driver.findElement(By.xpath("//button[@aria-label='Login']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//span[text()='NetBanking']")).click();
	Thread.sleep(2000);
	
	Thread.sleep(3000);
    TakesScreenshot ts=(TakesScreenshot)driver;
	File tk=ts.getScreenshotAs(OutputType.FILE);
	File f=new File("C:\\Users\\Admin\\eclipse-workspace\\SeleniumConcept\\ScreenshotrReport\\loginpage.png");
	FileUtils.copyFile(tk,f);
	
	

}
}
