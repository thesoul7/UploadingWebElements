package com.testscripts;

import javax.naming.Context;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.testng.Case1;
import com.testng.Case3;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class TestingAPK extends Case3 {

	
	@Test
	public void test1() {
		try {
			System.out.println("Hi");
			//driver.get("https://www.google.com");
			System.out.println(driver.getContext());;
			String activity = ((AndroidDriver<MobileElement>) driver).currentActivity();
			System.out.println(activity);
			
			
			
			
			
			
		/*	Activity act = new Activity("","");
			System.out.println(act.getAppActivity());;*/
			//driver.get("https://www.google.com");
			//driver.findElementByXPath("//*[@text='AGREE AND CONTINUE']").click();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	/*@Test
	public void test2() {
		try {
			System.out.println("Bye");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}*/
}
