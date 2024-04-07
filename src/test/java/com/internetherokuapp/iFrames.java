package com.internetherokuapp;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;

public class iFrames {
	WebDriver driver;	
	@BeforeTest
	public void beforeTest() {
		driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com/iframe");
	}
	@Test
	public void f() {
		WebDriverWait wait  = new WebDriverWait(driver, Duration.ofSeconds(5));
		
		driver.findElement(By.xpath("//*[contains(text(),'File')]")).click();
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[contains(text(),'New document')]"))).click();	//clicks on new doc
		driver.findElement(By.xpath("//*[contains(text(),'Paragraph')]")).click();
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[contains(text(),'Headings')]"))).click();	//clicks on headlline
		driver.findElement(By.xpath("//*[contains(text(),'Heading 3')]")).click();	//clicks on heading3
		driver.findElement(By.xpath("//*[@id='tinymce']")).sendKeys("123");
		driver.findElement(By.xpath("//*[@id='content']/div/div/div[1]/div[1]/div[2]/div/div[3]/button[1]")).click();	//clicks on bold
		driver.findElement(By.xpath("//*[@id='tinymce']")).sendKeys("456");
		driver.findElement(By.xpath("//*[@id='content']/div/div/div[1]/div[1]/div[2]/div/div[3]/button[2]/span")).click();	//clicks on italic
		driver.findElement(By.xpath("//*[@id='content']/div/div/div[1]/div[1]/div[2]/div/div[4]/button[2]")).click();	//middle para
		WebElement select1 = driver.findElement(By.xpath("//*[@id='tinymce']"));
		select1.sendKeys(Keys.CONTROL+"A");

	}

	@AfterTest
	public void afterTest() {
	}

}
