package com.internetherokuapp;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterTest;

public class MultiWindow {
	WebDriver driver;
	
	@BeforeTest
	public void beforeTest() {
		driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com/windows");
	}
	
	@Test
	public void f() {
		driver.findElement(By.xpath("//*[contains(text(),'Click Here')]")).click();	//opens new window
		
		Set<String> windows = driver.getWindowHandles();
		for(String window:windows) {
			driver.switchTo().window(window);
			if(driver.getTitle().equals("New Window")) {
				System.out.println(driver.getTitle());
				break;
			}
		}
	}


	@AfterTest
	public void afterTest() {
		driver.quit();
	}

}
