package org.test.jsscrollinto;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollintoDemo1 {
	    public static void main(String[] args) throws InterruptedException {

	        WebDriver driver = new ChromeDriver();
	        driver.manage().window().maximize();

	        driver.get("https://the-internet.herokuapp.com/infinite_scroll");
	        Thread.sleep(2000);
	        WebElement element = driver.findElement(By.xpath("(//div[@class='jscroll-added'])[3]"));
	        JavascriptExecutor js = (JavascriptExecutor) driver;
	        js.executeScript("arguments[0].scrollIntoView(true);", element);

	        Thread.sleep(3000);
	       

}
}