package org.test.scriptAttribute;

import org.jspecify.annotations.Nullable;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AttributeDemo1 {
	public static void main(String[] args) {
		WebDriver driver =new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/dynamic_content");
		driver.manage().window().maximize();
		JavascriptExecutor js=(JavascriptExecutor)driver;
		//innerHTML
		WebElement content = driver.findElement(By.id("content"));
        Object executeScript = js.executeScript( "return arguments[0].innerHTML;",  content);
		String text = executeScript.toString();
        System.out.println(text);
        //innerText
		Object executeScript1 = js.executeScript( "return arguments[0].innerText;",  content);
		String text1 = executeScript1.toString();
		System.out.println(text1);
		//textContent
		Object executeScript2= js.executeScript( "return arguments[0].textContent;",  content);
		String text2 = executeScript2.toString();
	System.out.println(text2);
		//to find link
		WebElement link = driver.findElement(By.xpath("//a"));

		JavascriptExecutor js1 = (JavascriptExecutor) driver;

	
		Object executeScript3= js1.executeScript( "return arguments[0].href;",  link);
		String text3 = executeScript3.toString();
		System.out.println(text3);
	

		




	
		
		

}
}