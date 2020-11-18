package com.testng;

import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class Case1 {

	public static  AndroidDriver<MobileElement> driver;
	public static String url ="http://localhost:4723/wd/hub";
	public static String justdial = "C:\\Users\\Preety\\Desktop\\APK\\com.justdial.search.apk";
	public static String sastaSundar ="C:\\Users\\Preety\\Desktop\\APK\\SastaSundar.apk";
	public static String apiDemo ="C:\\Users\\Preety\\Desktop\\APK\\ApiDemos-debug.apk";
	public static String snapdeal ="C:\\Users\\Preety\\Desktop\\APK\\snapdeal.apk";
	@BeforeMethod
	public void beforeClass() throws Exception {
		DesiredCapabilities caps =new DesiredCapabilities();
		caps.setCapability("deviceName","Android Emulator");
		caps.setCapability("udid","emulator-5554");
		caps.setCapability("platformName","Android");
		caps.setCapability("noReset","false");
		caps.setCapability("app",apiDemo);
		//caps.setCapability("fullReset","true");
		//caps.setCapability("browserName","Chrome");
		/*caps.setCapability("appPackage","com.justdial.search");
		caps.setCapability("appActivity",".SplashScreenNewActivity");*/
		driver = new AndroidDriver<MobileElement>( new URL(url), caps);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
	
}
