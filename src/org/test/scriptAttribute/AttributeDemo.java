package org.test.scriptAttribute;

import org.jspecify.annotations.Nullable;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AttributeDemo {
public static void main(String[] args) {
	WebDriver driver =new ChromeDriver();
	driver.get("https://www.facebook.com");
	driver.manage().window().maximize();
	JavascriptExecutor js=(JavascriptExecutor)driver;
	WebElement txtName = driver.findElement(By.name("email"));
	WebElement txtpass = driver.findElement(By.name("pass"));
    js.executeScript("arguments[0].setAttribute('value','dhana');", txtName);
    @Nullable
	Object executeScript = js.executeScript("return arguments[0].getAttribute('value');", txtName);
    String string = executeScript.toString();
    System.out.println(string);
    js.executeScript("arguments[0].setAttribute('value','balu');", txtpass);
    @Nullable
	Object executeScript2 = js.executeScript("return arguments[0].getAttribute('value');", txtpass);
    String string2 = executeScript2.toString();
    System.out.println(string2);
}
}
