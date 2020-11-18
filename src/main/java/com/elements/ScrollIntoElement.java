package com.elements;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ScrollIntoElement {
	public void executeScript(WebDriver driver,WebElement element)
	{
		JavascriptExecutor js = (JavascriptExecutor)driver;		
		int y=element.getLocation().getY();
		js.executeScript("window.scrollTo(0,"+y+")", element);
	}
}
