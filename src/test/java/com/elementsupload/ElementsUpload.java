package com.elementsupload;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import com.elements.BaseClass;
import com.elements.ClickOnPage;
import com.elements.DumpElements;
import com.elements.ScrollIntoElement;
import com.elements.SelectProject;

public class ElementsUpload extends BaseClass{
	@Test
	public void test1() {
		String pageName = "Data Integration Rules";
		String elementName = "Delete";
		try {
			SelectProject sp = new SelectProject();
			sp.selectProject(driver, 1);
			driver.findElement(By.linkText("Repository")).click();
			WebElement scrollTillElement = driver.findElement(By.xpath("//span[text()='Data Integration Rules']"));
			WebDriverWait ww = new WebDriverWait(driver, 20);
			ScrollIntoElement scroll = new ScrollIntoElement();
			scroll.executeScript(driver, scrollTillElement);
			ClickOnPage click = new ClickOnPage();
			click.clickinOnPage(driver, pageName);
			Actions ac = new Actions(driver);
			ac.doubleClick(scrollTillElement).perform();
			driver.findElement(By.xpath("//button[contains(text(),'Create')]")).click();
			ww.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//b[contains(text(),'Create Element in')]"))));
			DumpElements dp = new DumpElements();
			dp.dumpelements(driver, elementName);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
}
