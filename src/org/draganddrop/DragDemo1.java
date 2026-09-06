package org.draganddrop;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragDemo1 {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/drag_and_drop\r\n");
		driver.manage().window().maximize();
		WebElement boxA = driver.findElement(By.id("column-a"));
        WebElement boxB = driver.findElement(By.id("column-b"));
//To Swap drag and drop
        Actions actions = new Actions(driver);
        actions.dragAndDrop(boxA, boxB).perform();
//To print inside the box
        WebElement boxAText = driver.findElement(By.id("column-a"));
        String text = boxAText.getText();
        System.out.println("BoxA Contains: "+text);
        WebElement boxBtext = driver.findElement(By.id("column-b"));
        String text2 = boxBtext.getText();
        System.out.println("BoxA Contains: "+text2);
        

}
}