package com.common.base;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.options.XCUITestOptions;
import java.net.MalformedURLException;
import java.net.URL;
import org.testng.SkipException;


public class AppiumDriverFactory {
	
	static AppiumDriver driver;
    
    
     public static void Android_launchApp() throws MalformedURLException
     {
    	 UiAutomator2Options caps = new UiAutomator2Options();
    	 caps.setPlatformName("Android");
    	 caps.setPlatformVersion("10.0");
    	 caps.setDeviceName("emulator-5554");
    	 caps.setAutomationName("UiAutomator2");
    	 caps.setAppPackage("aero.sita.sitalab.smartpathmobile");
    	 caps.setAppActivity("aero.sita.smartpathmobile.newPaxApp.ui.SplashPaxActivity");
    	 caps.setAppWaitForLaunch(false);
    	 caps.setNoReset(true);
    	 caps.setFullReset(false);
    	 driver = new AndroidDriver(new URL("http://127.0.0.1:4723"), caps);
    	 AppDriver.setDriver(driver);
     }
     
     public static void ios_launchApp() throws MalformedURLException
     {
    	 XCUITestOptions options = new XCUITestOptions();
    	 options.setDeviceName("");
    	 options.setPlatformVersion("");
    	 options.setBundleId("");
    	 driver = new IOSDriver(new URL("http://127.0.0.1:4723"), options);
    	 AppDriver.setDriver(driver);
     }
     
     public static AppiumDriver launchApp() throws MalformedURLException
     {
    	if( System.getProperty("platform").contains("Android"))
    	{
    		AppiumDriverFactory.Android_launchApp();
    	}
    	
    	else if(System.getProperty("platform").contains("IOS"))
    	{
    		AppiumDriverFactory.ios_launchApp();
    		
    	}
    	
    	else {
    		throw new SkipException("Enter valid platform value. Androis/IOS");
    	}
		return driver;
    	 
     }

    }



