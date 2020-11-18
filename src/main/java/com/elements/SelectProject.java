package com.elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class SelectProject {

	
	public void selectProject(WebDriver driver,int indexValue) {
		try {
			WebElement projectList=driver.findElement(By.id("userProject"));
			Select s = new Select(projectList);
			s.selectByIndex(indexValue);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void selectType(WebDriver driver,String type) {
		try {
			WebElement web = driver.findElement(By.xpath("//select[@formcontrolname='WebElementType']"));
			Select s = new Select(web);
			s.selectByVisibleText(type);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void selectLocator(WebDriver driver,String locator) {
		try {
			WebElement loc = driver.findElement(By.xpath("//select[@formcontrolname='LocName']"));
			Select s = new Select(loc);
			s.selectByVisibleText(locator);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
