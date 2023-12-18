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

public class Adatin {

	public static void main(String[] args)throws InterruptedException, AWTException{  
	//Browser Launch
			System.setProperty("webdriver.chrome.driver","C:\\Users\\Mayank Bhandari\\Desktop\\SeleniumProject\\driver\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.get("http://adactinhotelapp.com/");
			
			//Maximize the Window
			driver.manage().window().maximize();
			
			 //Navigate to the registration page
	        WebElement registerLink = driver.findElement(By.linkText("New User Register Here"));
	        registerLink.click();

	         //Fill in the registration form (replace with actual element locators)
	        WebElement usernameField = driver.findElement(By.id("username"));
	        WebElement passwordField = driver.findElement(By.id("password"));
	        WebElement confirmPasswordField = driver.findElement(By.id("re_password"));
	        WebElement fullNameField = driver.findElement(By.id("full_name"));
	        WebElement emailField = driver.findElement(By.id("email_add"));
	        WebElement mobileNumberField = driver.findElement(By.id("captcha"));
	        WebElement registerButton = driver.findElement(By.id("tnc_box"));

	        usernameField.sendKeys("YourUsername");
	        passwordField.sendKeys("YourPassword");
	        confirmPasswordField.sendKeys("YourPassword");
	        fullNameField.sendKeys("YourFullName");
	        emailField.sendKeys("YourEmail@example.com");
	        mobileNumberField.sendKeys("1234567890");
	        registerButton.click();

	        // Wait for registration to complete (add appropriate wait logic)

	        // If there's a confirmation dialog, handle it (replace with actual handling code)
	        Alert alert = driver.switchTo().alert();
	        alert.accept();

	        // Optionally, navigate to the login page and log in (if required)

	        // Close the browser
	        driver.quit();
	    
			
	}

}
