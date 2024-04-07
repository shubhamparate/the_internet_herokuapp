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

public class JQuery {
	
	WebDriver driver;
	
	@BeforeTest
	public void beforeTest() {
		driver = new EdgeDriver();
		driver.get("https://the-internet.herokuapp.com/jqueryui/menu");
		driver.manage().window().maximize();
	}
	
	@Test
	public void f() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		driver.findElement(By.xpath("//*[contains(text(),'Enabled')]")).click();
		driver.findElement(By.xpath("//*[contains(text(),'Downloads')]")).click();
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[contains(text(),'PDF')]"))).click();
	}

	@AfterTest
	public void afterTest() throws InterruptedException {
		Thread.sleep(200);
		driver.quit();
	}

}
