package com.sita.page;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;

import java.io.File;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.aventstack.extentreports.Status;
import com.common.base.AppDriver;
import com.common.base.BaseTest;
import com.common.util.UserActions;

public class GetStarted extends BaseTest {
	
	String path = System.getProperty("user.dir");
	Properties p =  BaseTest.loadProperty();
	//public AndroidDriver  driver;
	UserActions ua=null;
	By notificationAllow;
	By boardingPassHeader;
	By boardingPassText;
	By digitalIdentityHeader;
	By digitalIdentityText;
	By dataIsSecureHeader;
	By dataIsSecureText;
	By swipe;
	By homeGetStartedButton;
	
	By letGetYouVerifiedText;
	By beforeRegistrationText;
	By capturePassposrtText;
	By takePhotoPassportText;
	By scanPassportText;
	By nfcEnabledPassportScanText;
	By takeSelfieText;
	By prepareSelfieText;
	By webUrlText;
	By webUrlPopupText;
	By qaText;
	By devText;
	By preProdText;
	By prodText;
	By customText;
	By cancelButton;
	By reverseCameraText;
	By showDebugMenuText;
	By debugOptionText;
	By fullAppResetText;
	By verificationText;
	By hardcodePassText;
	By disableNfcText;
	By changeLanguageText;
	By about;
	By aboutTitleText;
	By closeButton;
	By privacyPolicy;
	By privacyPolicyTitleText;
	By fullyResetAppText;
	By erasePassportDataText;
	By deletePassportDetailsText;
	By homeMenuThreeDot;
	By homeMenuSettings;
	By homeMenuContinue;
	By homeNFCOkButton;
	By settingNFCCheckbox;
	By settingHardCodeCheckbox;
	By settingBackButton;
	By debugOptionBack;
	By reverseCameraSwitch;
	By contninue;
	By capturePassportText;
	By entirePassportPageText;
	By backOfYourPassportText;
	By nfcChipReaderText;
	
    public GetStarted() {
    	
    	if (AppDriver.getCurrentDriver() instanceof AndroidDriver)
    	{
    		notificationAllow = AppiumBy.id(p.getProperty("notificationAllow_locator"));
    	    boardingPassHeader = AppiumBy.xpath(p.getProperty("boardingPassHeader_locator"));
    	    boardingPassText = AppiumBy.xpath(p.getProperty("boardingPassText_locator"));
    	    digitalIdentityHeader = AppiumBy.xpath(p.getProperty("digitalIdentityHeader_locator"));
    	    digitalIdentityText = AppiumBy.xpath(p.getProperty("digitalIdentityText_locator"));
    	    dataIsSecureHeader = AppiumBy.xpath(p.getProperty("dataIsSecureHeader_locator"));
    	    dataIsSecureText = AppiumBy.xpath(p.getProperty("dataIsSecureText_locator"));
    	    swipe = AppiumBy.accessibilityId(p.getProperty("swipe_locator"));
    	    homeGetStartedButton = AppiumBy.xpath(p.getProperty("homeGetStartedButton_locator"));
    	}
    	
    	else if(AppDriver.getCurrentDriver() instanceof IOSDriver)
    	{
    		
    		
    	}

    	}
    
    public void notificationAllow()
    {
		ua = new UserActions();
		ua.implicitWait();
		ua.click(notificationAllow);
    }
    
    
	public void verifyBoardingPassHeading(String expected) throws InterruptedException {
	
		
		ua = new UserActions();
		//Thread.sleep(3000);
		ua.implicitWait();
		//ua.click(notificationAllow);
		String text;
		try {
					//Assert.assertTrue(boardingPassHeader.isDisplayed());
					//text = boardingPassHeader.getText();
			        Assert.assertTrue( ua.GetDisplayed(boardingPassHeader));
					text = ua.getText(boardingPassHeader);
					Assert.assertEquals(expected, text);
					BaseTest.test.log(Status.PASS, text+ " is Displayed");
					
		} catch (Exception e) {
			BaseTest.test.log(Status.FAIL, e);
		}
	
	}
	
	public void verifyBoardingPassText(String expected) throws InterruptedException {
		ua = new UserActions();
		//Thread.sleep(3000);
		ua.implicitWait();
		String text;
		try {
			
			Assert.assertTrue(ua.GetDisplayed(boardingPassText));
			text = ua.getText(boardingPassText);
			Assert.assertEquals(expected, text);
			BaseTest.test.log(Status.PASS, text+ " is Displayed");
		} catch (Exception e) {
			BaseTest.test.log(Status.FAIL, e);
		}
	}
    
    
    public void swipe_left()
    {
  	  ua = new UserActions();
  	  ua.swipeLeft(swipe);
    	
    	
    }

    
    public void clickHomeContinue() throws InterruptedException {
    	//Thread.sleep(8000);
    }
    
    
    public void clickNfcOkButton() throws InterruptedException {
    	//Thread.sleep(3000);
        }
    
    public void clickHomeMenu() throws InterruptedException {
    	//Thread.sleep(3000);
    }
    
    
    public void clickHomeSettings() throws InterruptedException {
    	//Thread.sleep(2000);
    	for (int i = 0; i <5; i++) {
		}
    	
    }
    
    
    public void clickNfcCheckbox() throws InterruptedException {
    	//Thread.sleep(2000);
    }
    
public void clickHardCodeCheckbox() throws InterruptedException {
	//Thread.sleep(2000);
    }

public void clickSettingBack() throws InterruptedException {
	//Thread.sleep(3000);
}
    
    
    public boolean getProductName() {
       try {
		
	} catch (Exception e) {
		e.printStackTrace();
	}
	return false; 
    }


	


	
	public void verifyDigitalIdentityHeading(String expected) throws InterruptedException {
		ua = new UserActions();
		//Thread.sleep(3000);
		ua.implicitWait();
		String text;
		try {
				Assert.assertTrue(ua.GetDisplayed(digitalIdentityHeader));
				text = ua.getText(digitalIdentityHeader);
				Assert.assertEquals(expected, text);
				BaseTest.test.log(Status.PASS, text+ " is Displayed");		
		} catch (Exception e) {
			BaseTest.test.log(Status.FAIL, e);
		}
		
	}
	
	public void verifyDigitalIdentityText(String expected) throws InterruptedException {
		ua = new UserActions();
		//Thread.sleep(3000);
		ua.implicitWait();
		String text;
		try {
			    Assert.assertTrue(ua.GetDisplayed(digitalIdentityText));
				text = ua.getText(digitalIdentityText);
				Assert.assertEquals(expected, text);
				BaseTest.test.log(Status.PASS, text+ " is Displayed");
					
		} catch (Exception e) {
			BaseTest.test.log(Status.FAIL, e);
		}
		
	}
	
	public void verifyDataIsSecureHeading(String expected) throws InterruptedException {
		ua = new UserActions();
		//Thread.sleep(3000);
		ua.implicitWait();
		String text;
		try {
			    Assert.assertTrue(ua.GetDisplayed(dataIsSecureHeader));
				text = ua.getText(dataIsSecureHeader);
				Assert.assertEquals(expected, text);
				BaseTest.test.log(Status.PASS, text+ " is Displayed");
					
		} catch (Exception e) {
			BaseTest.test.log(Status.FAIL, e);
		}
	}
	
	public void verifyDataIsSecureText(String expected) throws InterruptedException {
		ua = new UserActions();
		//Thread.sleep(2000);
		ua.implicitWait();
		String text;
		try {
			    Assert.assertTrue(ua.GetDisplayed(dataIsSecureText));
				text =  ua.getText(dataIsSecureText);
				Assert.assertTrue(text.contains(expected));
				BaseTest.test.log(Status.PASS, text+ " is Displayed");
					
		} catch (Exception e) {
			BaseTest.test.log(Status.FAIL, e);
		}
	}
	
    public void clickGetStarted() throws InterruptedException {
    	ua = new UserActions();
    	//Thread.sleep(5000);
    	ua.implicitWait();
    	try {
    		
    		Assert.assertTrue( ua.GetDisplayed(homeGetStartedButton));
    		 ua.click(homeGetStartedButton);
    		BaseTest.test.log(Status.PASS, "GetStarted is Clicked");
    	} catch (Exception e) {
    		
    	BaseTest.test.log(Status.FAIL, "GetStarted is not Clicked");
    	}
    }
}

