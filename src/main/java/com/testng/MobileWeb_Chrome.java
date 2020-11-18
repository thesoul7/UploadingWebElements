package com.testng;

import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.BrowserType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class MobileWeb_Chrome {

	public static  AndroidDriver<MobileElement> driver;
	public static String url ="http://localhost:4723/wd/hub";
	//public static String justdial = "C:\\Users\\Preety\\Desktop\\APK\\com.justdial.search.apk";
	//public static String sastaSundar ="C:\\Users\\Preety\\Desktop\\APK\\SastaSundar.apk";
	public static String apiDemo ="C:\\Users\\Preety\\Desktop\\APK\\ApiDemos-debug.apk";
	//public static String firefox ="C:\\Users\\Preety\\Desktop\\APK\\firefox.apk";
	//public static String snapdeal ="C:\\Users\\Preety\\Desktop\\APK\\snapdeal.apk";
	public static String appPackage ="io.appium.android.apis";
	public static String appActivity ="io.appium.android.apis.view.WebView1";
	@BeforeMethod
	public void beforeClass() throws Exception {
		DesiredCapabilities caps =new DesiredCapabilities();
		caps.setCapability("deviceName","Android Emulator");
		caps.setCapability("browserName","Chrome");
		caps.setCapability("udid","emulator-5554");
		caps.setCapability("app",apiDemo);
		//caps.setCapability("fullReset","true");
		//caps.setCapability(MobileCapabilityType.AUTO_WEBVIEW, true);
		/*caps.setCapability("appPackage",appPackage);
		caps.setCapability("appActivity",appActivity);*/
		//caps.setCapability(MobileCapabilityType.BROWSER_NAME,BrowserType.CHROME);
		driver = new AndroidDriver<MobileElement>( new URL(url), caps);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	
	/*@AfterMethod
	public void tearDown() {
		driver.quit();
	}*/
	
}
