package com.internetherokuapp;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterTest;

public class Add_Remove_Elements_ {
	WebDriver driver;
	@Test
	public void f() {
		driver.findElement(By.partialLinkText("Add/Remove Elements")).click();
		driver.findElement(By.xpath("//*[@id='content']/div/button")).click();	//adds element
		driver.findElement(By.xpath("//*[@id='content']/div/button")).click();	//adds element
		driver.findElement(By.xpath("//*[@id='elements']/button")).click();	//deletes
		driver.findElement(By.xpath("//*[@id='elements']/button")).click();	//deletes
	}
	@BeforeTest
	public void beforeTest() {
		driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com/");
	}

	@AfterTest
	public void afterTest() throws InterruptedException {
		Thread.sleep(500);
		driver.quit();
	}

}
