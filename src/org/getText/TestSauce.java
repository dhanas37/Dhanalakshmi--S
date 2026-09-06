package org.getText;

import java.util.List;

import org.jspecify.annotations.Nullable;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestSauce {
public static void main(String[] args) {
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.saucedemo.com");
	WebElement txtusername = driver.findElement(By.id("user-name"));
	txtusername.sendKeys("standard_user");
	WebElement passWord = driver.findElement(By.id("password"));
	passWord.sendKeys("secret_sauce");
	WebElement btnnlogin = driver.findElement(By.id("login-button"));
	btnnlogin.click();
	//To Get heading
	
    WebElement printHead = driver.findElement(By.xpath("//div[text()='Sauce Labs Backpack']"));
    String text = printHead.getText();
    System.out.println(text);
    //To get price
    
    WebElement printPrice = driver.findElement(By.xpath("//div[@class='inventory_item_price']"));
    String text1 = printPrice.getText();
    System.out.println(text1);
    
    //click add to cart
    
    WebElement addToCart = driver.findElement(By.id("add-to-cart-sauce-labs-backpack"));
    addToCart.click();

    // Get cart badge count
    WebElement badge = driver.findElement(By.id("shopping_cart_container"));
    String text2 = badge.getText();
    System.out.println("BadgeCount: "+text2);
    
    //To Get Title
    WebElement verifyTitle = driver.findElement(By.xpath("//div[text()='Swag Labs']"));
    String text3 = verifyTitle.getText();
    System.out.println("Title : "+text3);



}
}
