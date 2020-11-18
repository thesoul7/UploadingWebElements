package com.elements;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseClass {
	public WebDriver driver;
	
	
	@BeforeMethod
	public void login() {
		try {
			driver = new ChromeDriver();
			driver.get("http://10.10.10.137:9999/index.html");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			driver.findElement(By.id("login-email")).sendKeys("suhas.bm@testyantra.in");
			driver.findElement(By.id("login-password")).sendKeys("Admin@5ty", Keys.ENTER);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	
	@AfterMethod
	public void tearDown() {
		driver.close();
	}
}
