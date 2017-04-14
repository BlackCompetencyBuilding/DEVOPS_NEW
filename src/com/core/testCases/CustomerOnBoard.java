package com.core.testCases;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CustomerOnBoard {
	public static void main(String[] args) {
		    // Initialize WebDriver
		    WebDriver driver = new FirefoxDriver();

		    // Maximize Window
		   driver.manage().window().maximize();
		  
		    // Wait For Page To Load
		    driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);

		   //Navigate to Google webstites
		   driver.get("https://www.gmail.com 
		/*CASE- 1. Both User name and Password are entered correctly. 
		Check whether Email field exists or not */
		    try
		        {
		          WebElement a1 = driver.findElement(By.xpath("//*[@id='Email']"));
		          System.out.println("---------Emaild exists --------------\n-----------------------");
		          a1.sendKeys("ENTER CORRECT MAIL ID");
		         }
		    catch(Throwable e)
		         {
		         System.out.println("Emaild not found: " + e.getMessage());
		         }

		    //Check whether Password field exists or not
		     try
		        {
			 WebElement password = driver.findElement(By.xpath("//*[@id='Passwd']"));
		         System.out.println("----------Passwordd exits ------------\n-----------------------");
		         password.sendKeys("ENTER CORRECT PASSWORD");
		        }
		    catch(Throwable e)
		        {
			 System.out.println("Passwordd not found: " + e.getMessage());
		        }


	}

}
