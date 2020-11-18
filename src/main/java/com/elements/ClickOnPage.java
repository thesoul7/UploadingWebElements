package com.elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ClickOnPage {

	
	public void clickinOnPage(WebDriver driver, String pageName) {
		try {
			driver.findElement(By.xpath("//span[text()='"+pageName+"']")).click();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
