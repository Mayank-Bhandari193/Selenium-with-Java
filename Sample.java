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

public class Sample 
{

	public static void main(String[] args) throws InterruptedException, AWTException{ 
            //Browser Launch
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Mayank Bhandari\\Desktop\\SeleniumProject\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		//To print the URL
		//String url=driver.getCurrentUrl();
		//System.out.println(url);
		
		
		//Navigation
		//Thread.sleep(2000);
		//driver.navigate().to("https://www.google.com/");
		//driver.navigate().back();
		//driver.navigate().forward();
		//driver.navigate().refresh();
		
		//Maximize the Window
		driver.manage().window().maximize();
		
		
		
		//WebElement link=driver.findElement(By.linkText("Forgotten Password?"));
		
		//Actions a= new Actions(driver);
		//a.contextClick(link).perform();
		
		//Robot r= new Robot();
		//r.keyPress(KeyEvent.VK_DOWN);
		//r.keyRelease(KeyEvent.VK_DOWN);
		//r.keyPress(KeyEvent.VK_DOWN);
		//r.keyRelease(KeyEvent.VK_DOWN);
		//r.keyPress(KeyEvent.VK_DOWN);
		//r.keyRelease(KeyEvent.VK_DOWN);
		//r.keyPress(KeyEvent.VK_DOWN);
		//r.keyRelease(KeyEvent.VK_DOWN);
		//r.keyPress(KeyEvent.VK_DOWN);
		//r.keyRelease(KeyEvent.VK_DOWN);
		//r.keyPress(KeyEvent.VK_DOWN);
		//r.keyRelease(KeyEvent.VK_DOWN);
		
		//Thread.sleep(2000);
		
		//r.keyPress(KeyEvent.VK_DOWN);
		//r.keyRelease(KeyEvent.VK_DOWN);
		
		
		//link.click();
		
		//WebElement link=driver.findElement(By.partialLinkText("password?"));
		//link.click();
		
		
		//WebElement fbText=driver.findElement(By.xpath("//h2[text()='Facebook helps you connect and share with the people in your life.']"));
		//String text=fbText.getText();
		//System.out.println(text);
		
		//WebElement mobile=driver.findElement(By.xpath("//a[text()='Mobiles']"));
		
		//Actions acc= new Actions(driver);
		//acc.moveToElement(mobile).perform();
		//acc.contextClick(mobile).perform();
		
		
		//Static Wait
		//Thread.sleep(3000);
		
		//WebElement simpleAlert=driver.findElement(By.id("alertButton"));
		//simpleAlert.click();
		
		//To Handle Alert
		//Alert a=driver.switchTo().alert();
		//a.accept();
		
		// Handling Confirm Alert (Clicking OK)
        //WebElement confirmAlertButton = driver.findElement(By.id("confirmButton"));
        //confirmAlertButton.click();
        //Alert confirmAlert = driver.switchTo().alert();
        //System.out.println("Confirm Alert Text: " + confirmAlert.getText());
        //confirmAlert.accept();

        //Thread.sleep(3000);
		

        // Handling Prompt Alert (Entering Text and Accepting)
        //WebElement promptAlertButton = driver.findElement(By.id("promtButton"));
        //promptAlertButton.click();
        //Alert promptAlert = driver.switchTo().alert();
        //System.out.println("Prompt Alert Text: " + promptAlert.getText());
        //promptAlert.sendKeys("Selenium");
        //promptAlert.accept();

        //Thread.sleep(3000);
        
     // Close the WebDriver
        //driver.quit();
        

        
		//get Text
		//WebElement fbtext=driver.findElement(By.xpath("//h2[text()='Facebook helps you connect and share with the people in your life.']"));
		//String text=fbtext.getText();
		
		//System.out.println(text);
		
		//WebElement link=driver.findElement(By.linkText("Forgotten password?"));
		//link.click();
		
		//WebElement link=driver.findElement(By.partialLinkText("Forgotten"));
		//link.click();
		
		//WebElement user= driver.findElement(By.xpath("//input[@id='email']"));
		//user.sendKeys("HELLO JAVA");
		
		//WebElement password= driver.findElement(By.xpath("//input[@id='pass']"));
		//password.sendKeys("HELLO JAVA");
		
		
		
		//WebElement user =driver.findElement(By.id("email"));
		//user.sendKeys("Besant Technology ");
		
		//WebElement password=driver.findElement(By.id("pass"));
		//password.sendKeys("123456");
		
		
		//WebElement loginButton=driver.findElement(By.xpath("//button[@name='login']"));
		//loginButton.click();
	}
}

