package org.alert;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class W3School3 {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
        driver.get( "https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_prompt");
        driver.manage().window().maximize();
        driver.switchTo().frame("iframeResult");

        driver.findElement(By.xpath("//button[text()='Try it']")).click();

        Alert promptAlert = driver.switchTo().alert();
        
        promptAlert.sendKeys("yoshi");
        Thread.sleep(5000);
        System.out.println(promptAlert.getText());

        promptAlert.accept();
        Thread.sleep(3000);

}
}