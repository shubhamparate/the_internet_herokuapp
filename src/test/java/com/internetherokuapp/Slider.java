package com.internetherokuapp;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterTest;

public class Slider {
	WebDriver driver;
	
	@BeforeTest
	public void beforeTest() {
		driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com/horizontal_slider");

	}
	
	@Test
	public void f() {
		WebElement slider =	driver.findElement(By.xpath("//*[@id='content']/div/div/input"));	//clicks on slider
		slider.click();
		slider.sendKeys(Keys.ARROW_LEFT);
		slider.sendKeys(Keys.ARROW_RIGHT);
	}
	
	@AfterTest
	public void afterTest() {
	}

}
