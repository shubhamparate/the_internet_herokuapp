package com.internetherokuapp;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import static org.testng.Assert.ARRAY_MISMATCH_TEMPLATE;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;

public class ContextMenu {
	WebDriver driver;
	
	@BeforeTest
	public void beforeTest() {
		driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com/context_menu");
		
	}
	@Test
	public void test1() {
		Actions action = new Actions(driver);
		WebElement popupElement = driver.findElement(By.id("hot-spot"));
		action.contextClick(popupElement).perform();
		driver.switchTo().alert().accept();
	}
	

	@AfterTest
	public void afterTest() throws InterruptedException {
		Thread.sleep(200);
		driver.quit();
	}

}
