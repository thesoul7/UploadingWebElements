package com.elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DumpElements {

	
	public void dumpelements(WebDriver driver, String elementName) {
		SelectProject sp  = new SelectProject();
		try {
			int length = 250;
			int count = 19;
			for (int i =count; i < length; i++) {
				String element = elementName + count;
				WebDriverWait ww = new WebDriverWait(driver, 20);
				ww.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("(//label[contains(text(),'Element Name')])[1]"))));
				Thread.sleep(2000);
				driver.findElement(By.xpath("(//label[contains(text(),'Element Name')])[1]/following-sibling::input")).sendKeys(element);
				sp.selectType(driver, "textfield");
				sp.selectLocator(driver, "xpath");
				driver.findElement(By.xpath("//input[@formcontrolname='LocValue']")).sendKeys("//input[text()='Save']");
				driver.findElement(By.xpath("//button[contains(text(),'Continue')]")).click();
				count = count + 1;
				Thread.sleep(2000);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
