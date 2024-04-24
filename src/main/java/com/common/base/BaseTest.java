package com.common.base;



import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.net.MalformedURLException;
import java.time.LocalDate;
import java.util.Properties;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import io.appium.java_client.android.nativekey.PressesKey;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;
import io.appium.java_client.service.local.flags.GeneralServerFlag;

import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
public class BaseTest {

	AppiumDriverLocalService server;
	AndroidDriver driver;
    
    @BeforeTest
    public void launchApplication() throws MalformedURLException{

    	//driver = (AndroidDriver) AppiumDriverFactory.launchApp();
    	
    	
    	
    }

	/*
	 * @AfterTest public void close() { if (AppDriver.getCurrentDriver() != null) {
	 * AppDriver.getCurrentDriver().quit(); } }
	 */
    
    public static ExtentReports extent;
    public static ExtentTest test;
	@BeforeSuite
    public void setUp() {
		
		
		 String path =  System.getenv("AppData");
		 System.out.println(path);
		
		  AppiumServiceBuilder builder = new AppiumServiceBuilder(); builder
		  .withAppiumJS(new File(
		 // "C:\\Users\\S.Panigrahi\\AppData\\Roaming\\npm\\node_modules\\appium\\build\\lib\\main.js"
				  System.getenv("AppData")+"//npm//node_modules//appium//build//lib//main.js"
		  )) .usingDriverExecutable(new File("C:\\Program Files\\nodejs\\node.exe"))
		  .usingPort(4723) .withArgument(GeneralServerFlag.LOCAL_TIMEZONE)
		  .withLogFile(new File("AppiumLog.txt")) .withIPAddress("127.0.0.1"); server =
		  AppiumDriverLocalService.buildService(builder); server.start();
		 
		
		
        ExtentHtmlReporter htmlReporter = new ExtentHtmlReporter("test-output/extent-report.html");
        extent = new ExtentReports();
        extent.attachReporter(htmlReporter);
        
        
    }
	
	@AfterMethod
	public void getResult(ITestResult result) {
        if (result.getStatus() == ITestResult.FAILURE) {
            test.log(Status.FAIL, "Test Case Failed is " + result.getName());
            test.log(Status.FAIL, "Test Case Failed is " + result.getThrowable());
        } else if (result.getStatus() == ITestResult.SKIP) {
            test.log(Status.SKIP, "Test Case Skipped is " + result.getName());
        }
    }
	
	@AfterSuite
	 public void tearDown() {
	     extent.flush();
     	AndroidDriver driver = (AndroidDriver) AppDriver.getCurrentDriver();
     	driver.removeApp("aero.sita.sitalab.smartpathmobile");
     	
        if (AppDriver.getCurrentDriver() != null) {
        	AppDriver.getCurrentDriver().quit();
        }
		/*
		 * AppiumDriverLocalService server;
		 * 
		 * AppiumServiceBuilder builder = new AppiumServiceBuilder(); builder
		 * .withAppiumJS(new File("‪")) .usingDriverExecutable(new File(""))
		 * .usingPort(4723) .withArgument(GeneralServerFlag.LOCAL_TIMEZONE)
		 * .withLogFile(new File("AppiumLog.txt")) .withIPAddress("127.0.0.1"); server =
		 * AppiumDriverLocalService.buildService(builder);
		 */
		server.stop();
        
        
        
	 }	
	public void back() {
		((PressesKey) AppDriver.getCurrentDriver()).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
	}
	
//	Read external files
	
	public static Properties loadProperty()
	{
		Properties p = new Properties();
		try {
			File ff = new File(System.getProperty("user.dir")+"//config//Config.properties");
			System.out.println(ff);
			FileInputStream f = new FileInputStream(ff);
			p.load(f);
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		
		return p;
	}
	
	public void takeScreenshot() {
        try {
            if (AppDriver.getCurrentDriver() instanceof TakesScreenshot) {
                File screenshotFile = ((TakesScreenshot) AppDriver.getCurrentDriver()).getScreenshotAs(OutputType.FILE);
                String path = System.getProperty("user.dir") + File.separator + "Screenshots" + File.separator
                        + LocalDate.now() + File.separator + "screenshot.png";
                org.apache.commons.io.FileUtils.copyFile(screenshotFile, new File(path));
                test.log(Status.INFO, "Screenshot: ", MediaEntityBuilder.createScreenCaptureFromPath(path).build());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
        
    }
	


