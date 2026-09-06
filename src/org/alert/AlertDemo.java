package org.alert;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertDemo {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
    driver.get("https://demoqa.com/alerts");
    driver.manage().window().maximize();
    //SimpleAlert
    driver.findElement(By.id("alertButton")).click();
    Thread.sleep(2000);
    Alert simpleAlert = driver.switchTo().alert();
    String text = simpleAlert.getText();
    System.out.println(text);
    simpleAlert.accept();
    Thread.sleep(5000);
    // Timer Alert
    driver.findElement(By.id("timerAlertButton")).click();
    Thread.sleep(6000); 
    Alert timerAlert = driver.switchTo().alert();
    System.out.println(timerAlert.getText());
    timerAlert.accept();
   // Confirmation Alert
    WebElement confirmAlert = driver.findElement(By.id("confirmButton"));
    confirmAlert.click();
    Thread.sleep(2000);
    driver.switchTo().alert().dismiss();
    //PromptAlert
    WebElement buttonPrompt = driver.findElement(By.id("promtButton"));
    buttonPrompt.click();
    Alert promptAlert = driver.switchTo().alert();
    promptAlert.sendKeys("Dhakshu");
    Thread.sleep(3000);
    promptAlert.accept();
}}
    
    

   
    



