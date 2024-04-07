package com.internetherokuapp;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.time.Duration;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;

public class WebTables {
	WebDriver driver;
	
	
	
	@BeforeTest
	public void beforeTest() {
		driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com/challenging_dom");
		
		
	}
	
	@Test
	public void f() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='content']/div/div/div/div[2]/table/tbody/tr")));
		List<WebElement> rows = driver.findElements(By.xpath("//*[@id='content']/div/div/div/div[2]/table/tbody/tr"));
		int rowsize = rows.size();
		System.out.println("Row size is:"+rowsize);
		
		for(int i=1;i<=rowsize;i++) {
			String beforexpath = "//*[@id='content']/div/div/div/div[2]/table/tbody/tr[";
			String afterxpath = "]/td[1]";
			String actualxpath = beforexpath+i+afterxpath;
			WebElement element = driver.findElement(By.xpath(actualxpath));
			System.out.println(element.getText());
			
		}
	}

	@AfterTest
	public void afterTest() {
		driver.quit();
	}

}
