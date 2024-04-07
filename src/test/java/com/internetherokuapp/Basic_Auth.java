package com.internetherokuapp;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterTest;

public class Basic_Auth {
	WebDriver driver;

	String username = "admin";
	String password = "admin";
	String domain = "the-internet.herokuapp.com/basic_auth";
	String url1;
	@BeforeTest
	public void beforeTest() {
		driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com/");
		
	}
	@Test
	public void f() {
		url1 = "https://"+username+":"+password+"@"+domain;
		driver.get(url1);

	}

	@AfterTest
	public void afterTest() {
	}

}
