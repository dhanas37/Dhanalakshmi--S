package org.test.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestDemoQA {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/text-box");
		
		
	WebElement txtUsername = driver.findElement(By.id("userName"));
	txtUsername.sendKeys("Dhana");
	
	//To get Attribute
	
	String attrusere = txtUsername.getAttribute("value");
	System.out.println(attrusere);
	
	
	WebElement txtpassWord = driver.findElement(By.id("userEmail"));
	txtpassWord.sendKeys("dhanasr96@gmail.com");
	
	
	String attrPass = txtpassWord.getAttribute("value");
	System.out.println(attrPass);
	
	WebElement cAddress = driver.findElement(By.id("currentAddress"));
	 cAddress.sendKeys("5-A,Gingee,pincode-604202");
	 WebElement pAddress = driver.findElement(By.id("permanentAddress"));
	 pAddress.sendKeys("24-A,Chrompet,Chennai");
	 
	 
	WebElement btnlogin = driver.findElement(By.id("submit"));
	btnlogin.click();
	Thread.sleep(3000);
	
	//To get Text
	
	WebElement verifyName = driver.findElement(By.id("name"));
	String text = verifyName.getText();
	System.out.println(text);
	WebElement verfyEmail = driver.findElement(By.id("email"));
	String text2 = verfyEmail.getText();
	System.out.println(text2);
	
	
	
	

	
	

}
}
