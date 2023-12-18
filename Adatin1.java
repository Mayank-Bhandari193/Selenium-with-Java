
package com.test;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Adatin1 {

	public static void main(String[] args)throws InterruptedException, AWTException{  
	//Browser Launch
			System.setProperty("webdriver.chrome.driver","C:\\Users\\Mayank Bhandari\\Desktop\\SeleniumProject\\driver\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.get("http://adactinhotelapp.com/HotelAppBuild2/");
			
			//Maximize the Window
			driver.manage().window().maximize();
			
			//login page:-
			WebElement usr = driver.findElement(By.id("username"));
			usr.sendKeys("Mayank26");
			WebElement pass = driver.findElement(By.id("password"));
			pass.sendKeys("Mayank@26");
			Thread.sleep(2000);
			WebElement login = driver.findElement(By.name("login"));
			login.click();
			
			//logged page:-
			 WebElement loca = driver.findElement(By.id("location"));
			 loca.click();
			
			Robot r = new Robot();
			r.keyPress(KeyEvent.VK_DOWN);
			r.keyRelease(KeyEvent.VK_DOWN);
			r.keyPress(KeyEvent.VK_DOWN);
			r.keyRelease(KeyEvent.VK_DOWN);
			r.keyPress(KeyEvent.VK_DOWN);
			r.keyRelease(KeyEvent.VK_DOWN);
			r.keyPress(KeyEvent.VK_DOWN);
			r.keyRelease(KeyEvent.VK_DOWN);
			r.keyPress(KeyEvent.VK_DOWN);
			r.keyRelease(KeyEvent.VK_DOWN);
			 Thread.sleep(1000);	
	        r.keyPress(KeyEvent.VK_ENTER);
	        r.keyRelease(KeyEvent.VK_ENTER);
	        
	        
	        WebElement hot = driver.findElement(By.id("hotels"));
	        hot.click();
			
	        r.keyPress(KeyEvent.VK_DOWN);
			r.keyRelease(KeyEvent.VK_DOWN);
			r.keyPress(KeyEvent.VK_DOWN);
			r.keyRelease(KeyEvent.VK_DOWN);
			 Thread.sleep(1000);	
	        r.keyPress(KeyEvent.VK_ENTER);
	        r.keyRelease(KeyEvent.VK_ENTER);

			WebElement type = driver.findElement(By.id("room_type"));
			type.click();
			r.keyPress(KeyEvent.VK_DOWN);
			r.keyRelease(KeyEvent.VK_DOWN);
			r.keyPress(KeyEvent.VK_DOWN);
			r.keyRelease(KeyEvent.VK_DOWN);
			r.keyPress(KeyEvent.VK_DOWN);
			r.keyRelease(KeyEvent.VK_DOWN);
			 Thread.sleep(1000);	
	        r.keyPress(KeyEvent.VK_ENTER);
	        r.keyRelease(KeyEvent.VK_ENTER);
	        
	        WebElement nos = driver.findElement(By.id("room_nos"));
	        nos.click();
	        r.keyPress(KeyEvent.VK_DOWN);
			r.keyRelease(KeyEvent.VK_DOWN);
			 Thread.sleep(1000);	
	        r.keyPress(KeyEvent.VK_ENTER);
	        r.keyRelease(KeyEvent.VK_ENTER);
			
	        WebElement adult = driver.findElement(By.id("adult_room"));
	        adult.click();
	        r.keyPress(KeyEvent.VK_DOWN);
			r.keyRelease(KeyEvent.VK_DOWN);
			 Thread.sleep(1000);	
	        r.keyPress(KeyEvent.VK_ENTER);
	        r.keyRelease(KeyEvent.VK_ENTER);
	              
	        Thread.sleep(2000);
	        WebElement submit = driver.findElement(By.id("Submit"));
	        submit.click();
	        //after search:-
	        WebElement radiobtn = driver.findElement(By.id("radiobutton_0"));
	        radiobtn.click();
	        WebElement contin = driver.findElement(By.id("continue"));
	        contin.click();
	        
	        WebElement first = driver.findElement(By.id("first_name"));
	        first.sendKeys("pornstar");
	        
	        WebElement last = driver.findElement(By.id("last_name"));
	        last.sendKeys("MIA KHAlIFA");
	        
	        WebElement add = driver.findElement(By.id("address"));
	        add.sendKeys("kbsdkbkdfbkfbfkgffkvbfkwefkgffkhbkffvkn kdbfffkbkfb");
	        
	        WebElement numb = driver.findElement(By.id("cc_num"));
	        numb.sendKeys("1597539031245059");
	        
	        WebElement cctype = driver.findElement(By.id("cc_type"));
	        cctype.click();
	        r.keyPress(KeyEvent.VK_DOWN);
			r.keyRelease(KeyEvent.VK_DOWN);
			r.keyPress(KeyEvent.VK_DOWN);
			r.keyRelease(KeyEvent.VK_DOWN);
			 Thread.sleep(1000);	
	        r.keyPress(KeyEvent.VK_ENTER);
	        r.keyRelease(KeyEvent.VK_ENTER);
	        
	        WebElement month = driver.findElement(By.id("cc_exp_month"));
	        month.click();
	        r.keyPress(KeyEvent.VK_DOWN);
			r.keyRelease(KeyEvent.VK_DOWN);
			r.keyPress(KeyEvent.VK_DOWN);
			r.keyRelease(KeyEvent.VK_DOWN);
			r.keyPress(KeyEvent.VK_DOWN);
			r.keyRelease(KeyEvent.VK_DOWN);
			r.keyPress(KeyEvent.VK_DOWN);
			r.keyRelease(KeyEvent.VK_DOWN);
			r.keyPress(KeyEvent.VK_DOWN);
			r.keyRelease(KeyEvent.VK_DOWN);
			r.keyPress(KeyEvent.VK_DOWN);
			r.keyRelease(KeyEvent.VK_DOWN);
			 Thread.sleep(1000);	
	        r.keyPress(KeyEvent.VK_ENTER);
	        r.keyRelease(KeyEvent.VK_ENTER);
	        
	        WebElement year = driver.findElement(By.id("cc_exp_year"));
	        year.click();
	        r.keyPress(KeyEvent.VK_DOWN);
			r.keyRelease(KeyEvent.VK_DOWN);
			r.keyPress(KeyEvent.VK_DOWN);
			r.keyRelease(KeyEvent.VK_DOWN);
			r.keyPress(KeyEvent.VK_DOWN);
			r.keyRelease(KeyEvent.VK_DOWN);
			r.keyPress(KeyEvent.VK_DOWN);
			r.keyRelease(KeyEvent.VK_DOWN);
			r.keyPress(KeyEvent.VK_DOWN);
			r.keyRelease(KeyEvent.VK_DOWN);
			r.keyPress(KeyEvent.VK_DOWN);
			r.keyRelease(KeyEvent.VK_DOWN);
			r.keyPress(KeyEvent.VK_DOWN);
			r.keyRelease(KeyEvent.VK_DOWN);
			r.keyPress(KeyEvent.VK_DOWN);
			r.keyRelease(KeyEvent.VK_DOWN);
			r.keyPress(KeyEvent.VK_DOWN);
			r.keyRelease(KeyEvent.VK_DOWN);
			r.keyPress(KeyEvent.VK_DOWN);
			r.keyRelease(KeyEvent.VK_DOWN);
			r.keyPress(KeyEvent.VK_DOWN);
			r.keyRelease(KeyEvent.VK_DOWN);
			r.keyPress(KeyEvent.VK_DOWN);
			r.keyRelease(KeyEvent.VK_DOWN);
			r.keyPress(KeyEvent.VK_DOWN);
			r.keyRelease(KeyEvent.VK_DOWN);
			r.keyPress(KeyEvent.VK_DOWN);
			r.keyRelease(KeyEvent.VK_DOWN);
			r.keyPress(KeyEvent.VK_DOWN);
			r.keyRelease(KeyEvent.VK_DOWN);
			r.keyPress(KeyEvent.VK_DOWN);
			r.keyRelease(KeyEvent.VK_DOWN);
			 Thread.sleep(1000);	
	        r.keyPress(KeyEvent.VK_ENTER);
	        r.keyRelease(KeyEvent.VK_ENTER);
	        
	        WebElement cvv = driver.findElement(By.id("cc_cvv"));
	        cvv.sendKeys("123");
	        
	        WebElement Booknow = driver.findElement(By.id("book_now"));
	        Booknow.click();
			//hence booked.
	        WebElement booked = driver.findElement(By.id("my_itinerary"));
	        booked.submit();
			
			
	        

		}
		

	}


