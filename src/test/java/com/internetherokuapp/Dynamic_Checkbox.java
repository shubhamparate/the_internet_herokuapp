package com.internetherokuapp;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;

public class Dynamic_Checkbox {
	WebDriver driver;
	
	@BeforeTest
	public void beforeTest() {
		driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com/dynamic_controls");
	}
	@Test
	public void f() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		driver.findElement(By.id("checkbox")).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='checkbox-example']/button"))).click();	//clicks on remove
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='checkbox-example']/button"))).click();	//clicks on add
		driver.findElement(By.xpath("//*[@id='input-example']/button")).click();	//clicks on enable
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='input-example']/button"))).click();	//clicks on disable
		
	}


	@AfterTest
	public void afterTest() throws InterruptedException {
		Thread.sleep(200);driver.quit();
	}

}
