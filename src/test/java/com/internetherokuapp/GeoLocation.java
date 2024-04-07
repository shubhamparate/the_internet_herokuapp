package com.internetherokuapp;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;

public class GeoLocation {
	WebDriver driver;
	
	@BeforeTest
	public void beforeTest() {
		driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com/geolocation");
	}
	
	@Test
	public void f() {
		WebElement location1 = driver.findElement(By.xpath("//*[contains(text(),'Where am I?')]"));	
		location1.click();
		driver.switchTo().alert().dismiss();
	}


	@AfterTest
	public void afterTest() throws InterruptedException {
		Thread.sleep(500);
		driver.quit();
	}

}
