package org.alert;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertDemo3 {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
	    driver.get("https://www.lambdatest.com/selenium-playground/javascript-alert-box-demo");
	    driver.manage().window().maximize();
	    //SimpleAlert
	    WebElement jsAlert = driver.findElement(By.xpath("(//button[text()='Click Me'])[1]")); 
	    jsAlert.click();
	    Thread.sleep(2000);
       Alert simpleAlert = driver.switchTo().alert();	    
       String text = simpleAlert.getText();	   
      System.out.println(text);
       simpleAlert.accept();
      Thread.sleep(5000);
      //Confirm Alert
      WebElement jsConfirm = driver.findElement(By.xpath("(//button[text()='Click Me'])[2]")); 
      jsConfirm.click();
	  Thread.sleep(2000);
	  Alert Confirmalert = driver.switchTo().alert();
	  String text2 = Confirmalert.getText();
	  System.out.println(text2);
	  Confirmalert.dismiss();
	   //PromptAlert
	    WebElement buttonPrompt = driver.findElement(By.xpath("(//button[text()='Click Me'])[3]"));
	    buttonPrompt.click();
	    Thread.sleep(3000);
	    Alert promptAlert = driver.switchTo().alert();
	    System.out.println( promptAlert.getText());
	    promptAlert.sendKeys("Dhakshu");
	    Thread.sleep(7000);
	    promptAlert.accept();
	   

}
}