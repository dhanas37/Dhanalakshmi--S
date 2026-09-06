package org.test.adactin;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AdactinHotel {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.get("https://adactinhotelapp.com/");
	driver.manage().window().maximize();
	driver.findElement(By.id("username")).sendKeys("yoshitha29");
	driver.findElement(By.id("password")).sendKeys("dhanas@37");
	driver.findElement(By.id("login")).click();
	Thread.sleep(2000);
	//2nd page
	WebElement dropLocation = driver.findElement(By.id("location"));
	Select seLocation=new Select(dropLocation);
	seLocation.selectByIndex(1);
	WebElement dropHotel = driver.findElement(By.id("hotels"));
	Select seHotel=new Select(dropHotel);
	seHotel.selectByValue("Hotel Sunshine");
	WebElement dropRoom = driver.findElement(By.id("room_type"));
	Select seRoom=new Select(dropRoom);
	seRoom.selectByVisibleText("Super Deluxe");
	WebElement dropRoomNum = driver.findElement(By.id("room_nos"));
	Select seRoomNu=new Select(dropRoomNum);
	seRoomNu.selectByValue("2");
	WebElement dropAdult = driver.findElement(By.id("adult_room"));
	Select seAdlut=new Select(dropAdult);
	seAdlut.selectByValue("2");
	WebElement dropChild = driver.findElement(By.id("child_room"));
	Select seChild=new Select(dropChild);
	seChild.selectByValue("2");
	Thread.sleep(1000);
	driver.findElement(By.id("Submit")).click();
	Thread.sleep(2000);
	//3rd page
	driver.findElement(By.id("radiobutton_0")).click();
	driver.findElement(By.id("continue")).click();
	//4th page
	driver.findElement(By.id("first_name")).sendKeys("Dhanalakshmi ");
	driver.findElement(By.id("last_name")).sendKeys("Purushoth");
	driver.findElement(By.id("address")).sendKeys("No.162,East Street ,Modaiyur-604206");
	driver.findElement(By.id("cc_num")).sendKeys("5555 5555 5555 4444");
	WebElement dropCardType = driver.findElement(By.id("cc_type"));
	Select seCard=new Select(dropCardType);
	seCard.selectByVisibleText("Master Card");
	WebElement dropMonth = driver.findElement(By.id("cc_exp_month"));
	Select seMonth=new Select(dropMonth);
	seMonth.selectByVisibleText("February");
	WebElement dropYear = driver.findElement(By.id("cc_exp_year"));
	Select seYear=new Select(dropYear);
	seYear.selectByVisibleText("2015");
	 driver.findElement(By.id("cc_cvv")).sendKeys("555");
	 Thread.sleep(2000);
	 driver.findElement(By.id("book_now")).click();
	 
	 Thread.sleep(10000);
	 //To get order id

	 WebElement orderNo = driver.findElement(By.id("order_no"));
	 String orderId = orderNo.getAttribute("value");

	 System.out.println("Order Number: " + orderId);

	 
	
	
	
	
	
	
	
	
	
	
	

	
	
}
}
