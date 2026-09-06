package org.alert;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class W3school2 {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
        driver.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_confirm\r\n");
        driver.manage().window().maximize();
        driver.switchTo().frame("iframeResult");

        driver.findElement(By.xpath("//button[text()='Try it']")).click();

        Alert confirmAlert = driver.switchTo().alert();

        System.out.println(confirmAlert.getText());

        confirmAlert.dismiss();

        Thread.sleep(3000);

}
}