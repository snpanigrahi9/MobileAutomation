package com.sita.page;

import java.util.Properties;

import org.openqa.selenium.By;
import org.testng.Assert;

import com.aventstack.extentreports.Status;
import com.common.base.AppDriver;
import com.common.base.BaseTest;
import com.common.util.UserActions;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.ios.IOSDriver;

public class LetsGetYouVerified extends BaseTest{
	
	
	
	String path = System.getProperty("user.dir");
	Properties p =  BaseTest.loadProperty();
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
	
	
	
	
	
    public LetsGetYouVerified() {
    	
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
    	    
    	    letGetYouVerifiedText = AppiumBy.xpath(p.getProperty("letGetYouVerifiedText_locator"));
    	    beforeRegistrationText = AppiumBy.xpath(p.getProperty("beforeRegistrationText_locator"));
    	    capturePassposrtText = AppiumBy.xpath(p.getProperty("capturePassposrtText_locator"));
    	    takePhotoPassportText = AppiumBy.xpath(p.getProperty("takePhotoPassportText_locator"));
    	    scanPassportText = AppiumBy.xpath(p.getProperty("scanPassportText_locator"));
    	    nfcEnabledPassportScanText = AppiumBy.xpath(p.getProperty("nfcEnabledPassportScanText_locator"));
    	    takeSelfieText = AppiumBy.xpath(p.getProperty("takeSelfieText_locator"));
    	    prepareSelfieText = AppiumBy.xpath(p.getProperty("prepareSelfieText_locator"));
    	    webUrlText = AppiumBy.xpath(p.getProperty("webUrlText_locator"));
    	    webUrlPopupText = AppiumBy.xpath(p.getProperty("webUrlPopupText_locator"));
    	    qaText = AppiumBy.xpath(p.getProperty("qaText_locator"));
    	    devText = AppiumBy.xpath(p.getProperty("devText_locator"));
    	    preProdText = AppiumBy.xpath(p.getProperty("preProdText_locator"));
    	    prodText = AppiumBy.xpath(p.getProperty("prodText_locator"));
    	    customText = AppiumBy.xpath(p.getProperty("customText_locator"));
    	    cancelButton = AppiumBy.xpath(p.getProperty("cancelButton_locator"));
    	    reverseCameraText = AppiumBy.xpath(p.getProperty("reverseCameraText_locator"));
    	    showDebugMenuText = AppiumBy.xpath(p.getProperty("showDebugMenuText_locator"));
    	    debugOptionText = AppiumBy.xpath(p.getProperty("debugOptionText_locator"));
    	    fullAppResetText = AppiumBy.xpath(p.getProperty("fullAppResetText_locator"));
    	    verificationText = AppiumBy.xpath(p.getProperty("verificationText_locator"));
    	    hardcodePassText = AppiumBy.xpath(p.getProperty("hardcodePassText_locator"));
    	    disableNfcText = AppiumBy.xpath(p.getProperty("disableNfcText_locator"));
    	    changeLanguageText = AppiumBy.xpath(p.getProperty("changeLanguageText_locator"));
    	    about = AppiumBy.xpath(p.getProperty("about_locator"));
    	    aboutTitleText = AppiumBy.xpath(p.getProperty("aboutTitleText_locator"));
    	    closeButton = AppiumBy.xpath(p.getProperty("closeButton_locator"));
    	    privacyPolicy = AppiumBy.xpath(p.getProperty("privacyPolicy_locator"));
    	    privacyPolicyTitleText = AppiumBy.xpath(p.getProperty("privacyPolicyTitleText_locator"));
    	    fullyResetAppText = AppiumBy.xpath(p.getProperty("fullyResetAppText_locator"));
    	    erasePassportDataText = AppiumBy.xpath(p.getProperty("erasePassportDataText_locator"));
    	    deletePassportDetailsText = AppiumBy.xpath(p.getProperty("deletePassportDetailsText_locator"));
    	    homeMenuThreeDot = AppiumBy.xpath(p.getProperty("homeMenuThreeDot_locator"));
    	    homeMenuSettings = AppiumBy.xpath(p.getProperty("homeMenuSettings_locator"));
    	    homeMenuContinue = AppiumBy.xpath(p.getProperty("homeMenuContinue_locator"));
    	    homeNFCOkButton = AppiumBy.xpath(p.getProperty("homeNFCOkButton_locator"));
    	    settingNFCCheckbox = AppiumBy.xpath(p.getProperty("settingNFCCheckbox_locator"));
    	    settingHardCodeCheckbox = AppiumBy.xpath(p.getProperty("settingHardCodeCheckbox_locator"));
    	    settingBackButton = AppiumBy.xpath(p.getProperty("settingBackButton_locator"));
    	    debugOptionBack = AppiumBy.xpath(p.getProperty("debugOptionBack_locator"));
    	    reverseCameraSwitch = AppiumBy.xpath(p.getProperty("reverseCameraSwitch_locator"));
    	    contninue = AppiumBy.xpath(p.getProperty("contninue_locator"));
    	    capturePassportText = AppiumBy.xpath(p.getProperty("capturePassportText_locator"));
    	    entirePassportPageText = AppiumBy.xpath(p.getProperty("entirePassportPageText_locator"));
    	    backOfYourPassportText = AppiumBy.xpath(p.getProperty("backOfYourPassportText_locator"));
    	    nfcChipReaderText = AppiumBy.xpath(p.getProperty("nfcChipReaderText_locator"));
    	}
    	
    	else if(AppDriver.getCurrentDriver() instanceof IOSDriver)
    	{
    		
    		
    	}

    	}
    
    public void clickGetStarted() throws InterruptedException {
    	Thread.sleep(5000);
    	ua = new UserActions();
    	try {
    		
    		Assert.assertTrue(ua.GetDisplayed(homeGetStartedButton));
    		ua.click(homeGetStartedButton);     
    		BaseTest.test.log(Status.PASS, "GetStarted is Clicked");
    	} catch (Exception e) {
    		
    	BaseTest.test.log(Status.FAIL, "GetStarted is not Clicked");
    	}
    }
    
    public void clickHomeContinue() throws InterruptedException {
    	Thread.sleep(8000);
    	ua = new UserActions();
	
	try {
		ua.click(homeMenuContinue);
		BaseTest.test.log(Status.PASS, "Menu is Clicked");
	} catch (Exception e) {
		BaseTest.test.log(Status.FAIL, "Menu is not Clicked");
	}
    }
    
    
    public void clickNfcOkButton() throws InterruptedException {
    	Thread.sleep(3000);
    	ua = new UserActions();
    	try {
    		ua.click(homeNFCOkButton);
    		BaseTest.test.log(Status.PASS, "NFC popUp OK button is Clicked");
    	} catch (Exception e) {
    		BaseTest.test.log(Status.FAIL, "NFC popUp OK button is not Clicked");
    	}
        }
    
    public void clickHomeMenu() throws InterruptedException {
    	Thread.sleep(8000);
    	ua = new UserActions();
    	
    	try {
    		ua.click(homeMenuThreeDot);
    		BaseTest.test.log(Status.PASS, "HamBurger is Clicked");
    	} catch (Exception e) {
    		BaseTest.test.log(Status.FAIL, "HamBurger is not Clicked");
    	}
    }
    
    
    public void clickHomeSettings() throws InterruptedException {
    	Thread.sleep(2000);
    	ua = new UserActions();
    	
    	try {
    		
    		
    		for (int i = 0; i <5; i++) {
    			ua.click(homeMenuSettings);
    		}
    		BaseTest.test.log(Status.PASS, "Setting is Clicked");
    		Thread.sleep(3000);
    	} catch (Exception e) {
    		BaseTest.test.log(Status.FAIL, "Setting is not Clicked");
    	}
    	
    }
    
    
    public void clickNfcCheckbox() throws InterruptedException {
    	Thread.sleep(2000);
    	ua = new UserActions();
	
	try {
		ua.click(settingNFCCheckbox);
		BaseTest.test.log(Status.PASS, "NFC Checkbox is Clicked");
	} catch (Exception e) {
		BaseTest.test.log(Status.FAIL, "NFC Checkbox is not Clicked");
	}
    }
    
public void clickHardCodeCheckbox() throws InterruptedException {
	Thread.sleep(2000);
	ua = new UserActions();
	try {
		ua.click(settingHardCodeCheckbox);
		BaseTest.test.log(Status.PASS, "Hard Code Checkbox is Clicked");
	} catch (Exception e) {
		BaseTest.test.log(Status.FAIL, "Hard Code Checkbox is not Clicked");
	}
    }

public void clickSettingBack() throws InterruptedException {
	Thread.sleep(3000);
	ua = new UserActions();
	try {
		ua.click(settingBackButton);
	BaseTest.test.log(Status.PASS, "Back is Clicked");
		
	} catch (Exception e) {
		BaseTest.test.log(Status.FAIL, "Back is Not Clicked");
	}
	
}

public void clickDebugSettingBack() throws InterruptedException {
	Thread.sleep(3000);
	ua = new UserActions();
	try {
		ua.click(debugOptionBack);
	BaseTest.test.log(Status.PASS, "Back is Clicked");
		
	} catch (Exception e) {
		BaseTest.test.log(Status.FAIL, "Back is Not Clicked");
	}
	
}

public void switchReverseCamera() throws InterruptedException {
	Thread.sleep(3000);
	ua = new UserActions();
	try {
		ua.click(reverseCameraSwitch);
	BaseTest.test.log(Status.PASS, "Back is Clicked");
		
	} catch (Exception e) {
		BaseTest.test.log(Status.FAIL, "Back is Not Clicked");
	}
	
}

public void clickPrivacyPolicy() throws InterruptedException {
	Thread.sleep(3000);
	ua = new UserActions();
	
	try {
		ua.click(privacyPolicy);
	BaseTest.test.log(Status.PASS, "Privacy policy is Clicked");
		
	} catch (Exception e) {
		BaseTest.test.log(Status.FAIL, "Privacy policy is Not Clicked");
	}
	
}



public void verifyprivacyPolicyText(String expected) throws InterruptedException {
	Thread.sleep(5000);
	ua = new UserActions();
	String text;
	try {
			
			Assert.assertTrue(ua.GetDisplayed(privacyPolicyTitleText));
			text = ua.getText(privacyPolicyTitleText);
			Assert.assertEquals(expected, text);
			BaseTest.test.log(Status.PASS, text+ " is Displayed");
				
	} catch (Exception e) {
		BaseTest.test.log(Status.FAIL, e);
	}
}

public void clickClose() throws InterruptedException {
	Thread.sleep(3000);
	ua = new UserActions();
	try {
		ua.click(closeButton);
	BaseTest.test.log(Status.PASS, "Close is Clicked");
		
	} catch (Exception e) {
		BaseTest.test.log(Status.FAIL, "Close is Not Clicked");
	}
	
}

public void clickAbout() throws InterruptedException {
	Thread.sleep(3000);
	ua = new UserActions();
	try {
		ua.click(about);
	BaseTest.test.log(Status.PASS, "About is Clicked");
		
	} catch (Exception e) {
		BaseTest.test.log(Status.FAIL, "About is Not Clicked");
	}
	
}



public void verifyaboutTitleText(String expected) throws InterruptedException {
	Thread.sleep(5000);
	ua = new UserActions();
	String text;
	try {
			Assert.assertTrue(ua.GetDisplayed(aboutTitleText));
			text = ua.getText(aboutTitleText);
			Assert.assertEquals(expected, text);
			BaseTest.test.log(Status.PASS, text+ " is Displayed");
				
	} catch (Exception e) {
		BaseTest.test.log(Status.FAIL, e);
	}
}
    
    
    public boolean getProductName() {
    	ua = new UserActions();
       try {
    	   String actualText = ua.getText(homeNFCOkButton);
           System.out.println("Product Title Text: " + actualText);
           return actualText.contains("Sauce");
		
	} catch (Exception e) {
		e.printStackTrace();
	}
	return false; 
    }
    
    
    public void verifyletGetYouVerifiedText(String expected) throws InterruptedException {
		Thread.sleep(8000);
		ua = new UserActions();
		String text;
		try {
				Assert.assertTrue( ua.GetDisplayed(letGetYouVerifiedText));
				text = ua.getText(letGetYouVerifiedText);
				Assert.assertEquals(expected, text);
				BaseTest.test.log(Status.PASS, text+ " is Displayed");
					
		} catch (Exception e) {
			BaseTest.test.log(Status.FAIL, e);
		}
	}
    
    public void verifybeforeRegistrationText(String expected) throws InterruptedException {
		Thread.sleep(3000);
		ua = new UserActions();

		String text;
		try {
				
				
				Assert.assertTrue(ua.GetDisplayed(beforeRegistrationText));
				text = ua.getText(beforeRegistrationText);
				Assert.assertEquals(expected, text);
				BaseTest.test.log(Status.PASS, text+ " is Displayed");
					
		} catch (Exception e) {
			BaseTest.test.log(Status.FAIL, e);
		}
	}
    
    public void verifycapturePassposrtText(String expected) throws InterruptedException {
		Thread.sleep(3000);
		ua = new UserActions();

		String text;
		try {
				Assert.assertTrue(ua.GetDisplayed(capturePassposrtText));
				text = ua.getText(capturePassposrtText);
				Assert.assertEquals(expected, text);
				BaseTest.test.log(Status.PASS, text+ " is Displayed");
					
		} catch (Exception e) {
			BaseTest.test.log(Status.FAIL, e);
		}
	}
    
    public void verifytakePhotoPassportText(String expected) throws InterruptedException {
		Thread.sleep(3000);
		ua = new UserActions();
		String text;
		try {
				Assert.assertTrue(ua.GetDisplayed(takePhotoPassportText));
				text = ua.getText(takePhotoPassportText);
				Assert.assertEquals(expected, text);
				BaseTest.test.log(Status.PASS, text+ " is Displayed");
					
		} catch (Exception e) {
			BaseTest.test.log(Status.FAIL, e);
		}
	}
    
    public void verifyscanPassportText(String expected) throws InterruptedException {
		Thread.sleep(3000);
		ua = new UserActions();
		String text;
		try {
				Assert.assertTrue(ua.GetDisplayed(scanPassportText));
				text = ua.getText(scanPassportText);
				Assert.assertEquals(expected, text);
				BaseTest.test.log(Status.PASS, text+ " is Displayed");
					
		} catch (Exception e) {
			BaseTest.test.log(Status.FAIL, e);
		}
	}
    
    public void verifynfcEnabledPassportScanText(String expected) throws InterruptedException {
		Thread.sleep(3000);
		ua = new UserActions();

		String text;
		try {
				Assert.assertTrue(ua.GetDisplayed(nfcEnabledPassportScanText));
				text = ua.getText(nfcEnabledPassportScanText);
				Assert.assertEquals(expected, text);
				BaseTest.test.log(Status.PASS, text+ " is Displayed");
					
		} catch (Exception e) {
			BaseTest.test.log(Status.FAIL, e);
		}
	}
    
    public void verifytakeSelfieText(String expected) throws InterruptedException {
		Thread.sleep(3000);
		ua = new UserActions();
		String text;
		try {
				Assert.assertTrue(ua.GetDisplayed(takeSelfieText));
				text = ua.getText(takeSelfieText);
				Assert.assertEquals(expected, text);
				BaseTest.test.log(Status.PASS, text+ " is Displayed");
					
		} catch (Exception e) {
			BaseTest.test.log(Status.FAIL, e);
		}
	}
    
    public void verifyprepareSelfieText(String expected) throws InterruptedException {
		Thread.sleep(3000);
		ua = new UserActions();
		String text;
		try {
				
				Assert.assertTrue(ua.GetDisplayed(prepareSelfieText));
				text = ua.getText(prepareSelfieText);
				Assert.assertEquals(expected, text);
				BaseTest.test.log(Status.PASS, text+ " is Displayed");
					
		} catch (Exception e) {
			BaseTest.test.log(Status.FAIL, e);
		}
	}

    
    public void verifyWebUrlText(String expected) throws InterruptedException {
  		Thread.sleep(3000);
		ua = new UserActions();
  		String text;
  		try {
  				Assert.assertTrue(ua.GetDisplayed(webUrlText));
				text = ua.getText(webUrlText);
				Assert.assertEquals(expected, text);
				BaseTest.test.log(Status.PASS, text+ " is Displayed");
  					
  		} catch (Exception e) {
  			BaseTest.test.log(Status.FAIL, e);
  		}
  	}
    
    
    
    public void selectWebUrlText() throws InterruptedException {
		ua = new UserActions();
  		Thread.sleep(3000);
  		try {
  				Assert.assertTrue(ua.GetDisplayed(webUrlText));
  				ua.click(webUrlText);
				BaseTest.test.log(Status.PASS, "selectWebUrl is Displayed");
  					
  		} catch (Exception e) {
  			BaseTest.test.log(Status.FAIL, e);
  		}
  	}
    
    public void clickCancel() throws InterruptedException {
		ua = new UserActions();
  		Thread.sleep(3000);
  		try {
  				Assert.assertTrue(ua.GetDisplayed(cancelButton));
  				ua.click(cancelButton);
				BaseTest.test.log(Status.PASS, "cancel is Displayed");
  					
  		} catch (Exception e) {
  			BaseTest.test.log(Status.FAIL, e);
  		}
  	}
    
    public void verifyFullAppResetText(String expected) throws InterruptedException {
		ua = new UserActions();
  		Thread.sleep(3000);
  		String text;
  		try {
  			
  				Assert.assertTrue(ua.GetDisplayed(fullAppResetText));
				text = ua.getText(fullAppResetText);
				Assert.assertEquals(expected, text);
				BaseTest.test.log(Status.PASS, text+ " is Displayed");
  					
  		} catch (Exception e) {
  			BaseTest.test.log(Status.FAIL, e);
  		}
  	}
    
    public void verifyFullyResetAppText(String expected) throws InterruptedException {
  		Thread.sleep(3000);
		ua = new UserActions();
  		String text;
  		try {
  			
  				Assert.assertTrue(ua.GetDisplayed(fullyResetAppText));
				text = ua.getText(fullyResetAppText);
				Assert.assertEquals(expected, text);
				BaseTest.test.log(Status.PASS, text+ " is Displayed");
  					
  		} catch (Exception e) {
  			BaseTest.test.log(Status.FAIL, e);
  		}
  	}
    
    
    public void verifyErasePassportDataText(String expected) throws InterruptedException {
  		Thread.sleep(3000);
		ua = new UserActions();
  		String text;
  		try {
  			
  				Assert.assertTrue(ua.GetDisplayed(erasePassportDataText));
				text = ua.getText(erasePassportDataText);
				Assert.assertEquals(expected, text);
				BaseTest.test.log(Status.PASS, text+ " is Displayed");
  					
  		} catch (Exception e) {
  			BaseTest.test.log(Status.FAIL, e);
  		}
  	}
    
    
    public void verifyDeletePassportDetailsText(String expected) throws InterruptedException {
  		Thread.sleep(3000);
		ua = new UserActions();
  		String text;
  		try {
  			
  				Assert.assertTrue(ua.GetDisplayed(deletePassportDetailsText));
				text = ua.getText(deletePassportDetailsText);
				Assert.assertEquals(expected, text);
				BaseTest.test.log(Status.PASS, text+ " is Displayed");
  					
  		} catch (Exception e) {
  			BaseTest.test.log(Status.FAIL, e);
  		}
  	}
    
    
    public void verifytWebUrlPopupText(String expected1,String expected2, String expected3, String expected4, String expected5, String expected6) throws InterruptedException {
  		Thread.sleep(3000);
		ua = new UserActions();
  		String text;
  		String textQA;
  		String textDev;
  		String textPreProd;
  		String textProd;
  		String textCustom;
  		try {
  			Assert.assertTrue(ua.GetDisplayed(webUrlPopupText));
			text = ua.getText(webUrlPopupText);
			Assert.assertEquals(expected1, text);
			BaseTest.test.log(Status.PASS, text+ " is Displayed");
			
			Assert.assertTrue(ua.GetDisplayed(qaText));
			textQA = ua.getText(qaText);
			Assert.assertEquals(expected2, textQA);
			BaseTest.test.log(Status.PASS, textQA+ " is Displayed");

			Assert.assertTrue(ua.GetDisplayed(devText));
			textDev = ua.getText(devText);
			Assert.assertEquals(expected3, textDev);
			BaseTest.test.log(Status.PASS, textDev+ " is Displayed");
			
			Assert.assertTrue(ua.GetDisplayed(preProdText));
			textPreProd = ua.getText(preProdText);
			Assert.assertEquals(expected4, textPreProd);
			BaseTest.test.log(Status.PASS, textPreProd+ " is Displayed");
			
			Assert.assertTrue(ua.GetDisplayed(prodText));
			textProd = ua.getText(prodText);
			Assert.assertEquals(expected5, textProd);
			BaseTest.test.log(Status.PASS, textProd+ " is Displayed");
			
			Assert.assertTrue(ua.GetDisplayed(customText));
			textCustom = ua.getText(customText);
			Assert.assertEquals(expected6, textCustom);
			BaseTest.test.log(Status.PASS, textCustom+ " is Displayed");
			
  					
  		} catch (Exception e) {
  			BaseTest.test.log(Status.FAIL, e);
  		}
  	}
    
    public void verifyReverseCameraText(String expected) throws InterruptedException {
  		Thread.sleep(3000);
		ua = new UserActions();

  		String text;
  		try {
  				Assert.assertTrue(ua.GetDisplayed(reverseCameraText));
				text = ua.getText(reverseCameraText);
				Assert.assertEquals(expected, text);
				BaseTest.test.log(Status.PASS, text+ " is Displayed");
  		} catch (Exception e) {
  			BaseTest.test.log(Status.FAIL, e);
  		}
  	}
    
    public void verifyshowDebugMenuText(String expected) throws InterruptedException {
  		Thread.sleep(3000);
		ua = new UserActions();
  		String text;
  		try {
  				Assert.assertTrue(ua.GetDisplayed(showDebugMenuText));
				text = ua.getText(showDebugMenuText);
				Assert.assertEquals(expected, text);
				BaseTest.test.log(Status.PASS, text+ " is Displayed");
  					
  		} catch (Exception e) {
  			BaseTest.test.log(Status.FAIL, e);
  		}
  	}
    
    public void verifydebugOptionText(String expected) throws InterruptedException {
  		Thread.sleep(3000);
		ua = new UserActions();
  		String text;
  		try {
  				Assert.assertTrue(ua.GetDisplayed(debugOptionText));
				text = ua.getText(debugOptionText);
				Assert.assertEquals(expected, text);
				BaseTest.test.log(Status.PASS, text+ " is Displayed");
  					
  		} catch (Exception e) {
  			BaseTest.test.log(Status.FAIL, e);
  		}
  	}
    
    public void selectdebugOption() throws InterruptedException {
  		Thread.sleep(3000);
		ua = new UserActions();
  		try {
  				Assert.assertTrue(ua.GetDisplayed(debugOptionText));
  				ua.click(debugOptionText);
				BaseTest.test.log(Status.PASS,  "Debug is Displayed");
  					
  		} catch (Exception e) {
  			BaseTest.test.log(Status.FAIL, e);
  		}
  	}
    
    public void verifyverificationText(String expected) throws InterruptedException {
  		Thread.sleep(3000);
		ua = new UserActions();
  		String text;
  		try {
  				Assert.assertTrue(ua.GetDisplayed(verificationText));
				text = ua.getText(verificationText);
				Assert.assertEquals(expected, text);
				BaseTest.test.log(Status.PASS, text+ " is Displayed");
  					
  		} catch (Exception e) {
  			BaseTest.test.log(Status.FAIL, e);
  		}
  	}
    
    public void verifyhardcodePassText(String expected) throws InterruptedException {
  		Thread.sleep(3000);
		ua = new UserActions();
  		String text;
  		try {

	  				Assert.assertTrue(ua.GetDisplayed(hardcodePassText));
					text = ua.getText(hardcodePassText);
					Assert.assertEquals(expected, text);
					BaseTest.test.log(Status.PASS, text+ " is Displayed");
  		} catch (Exception e) {
  			BaseTest.test.log(Status.FAIL, e);
  		}
  	}
    
    public void verifydisableNfcText(String expected) throws InterruptedException {
  		Thread.sleep(3000);
		ua = new UserActions();
  		String text;
  		try {
  				Assert.assertTrue(ua.GetDisplayed(disableNfcText));
				text = ua.getText(disableNfcText);
				Assert.assertEquals(expected, text);
				BaseTest.test.log(Status.PASS, text+ " is Displayed");
  					
  		} catch (Exception e) {
  			BaseTest.test.log(Status.FAIL, e);
  		}
  	}
    
    public void verifychangeLanguageText(String expected) throws InterruptedException {
  		Thread.sleep(3000);
		ua = new UserActions();
  		String text;
  		try {
  				Assert.assertTrue(ua.GetDisplayed(changeLanguageText));
				text = ua.getText(changeLanguageText);
				Assert.assertEquals(expected, text);
				BaseTest.test.log(Status.PASS, text+ " is Displayed");
  					
  		} catch (Exception e) {
  			BaseTest.test.log(Status.FAIL, e);
  		}
  	}

    
    public void clickContinue() throws InterruptedException {
    	Thread.sleep(3000);
		ua = new UserActions();
    	try {
    		ua.click(contninue);
    	BaseTest.test.log(Status.PASS, "Continue button is Clicked");
    		
    	} catch (Exception e) {
    		BaseTest.test.log(Status.FAIL, "Continue button is Not Clicked");
    	}
    	
    }
    
    public void verifyCapturePassportHeaderText(String expected) throws InterruptedException {
		Thread.sleep(3000);
		ua = new UserActions();
		String text;
		try {
				Assert.assertTrue(ua.GetDisplayed(capturePassportText));
				text = ua.getText(capturePassportText);
				Assert.assertTrue(text.contains(expected));
				BaseTest.test.log(Status.PASS, text+ " is Displayed");
					
		} catch (Exception e) {
			BaseTest.test.log(Status.FAIL, e);
		}
	}
    
    
    public void verifyEntirePassportPageText(String expected) throws InterruptedException {
		Thread.sleep(3000);
		ua = new UserActions();
		String text;
		try {
				Assert.assertTrue(ua.GetDisplayed(entirePassportPageText));
				text = ua.getText(entirePassportPageText);
				Assert.assertEquals(expected, text);
				BaseTest.test.log(Status.PASS, text+ " is Displayed");
					
		} catch (Exception e) {
			BaseTest.test.log(Status.FAIL, e);
		}
	}
    
    public void verifyBackOfYourPassportText(String expected) throws InterruptedException {
		Thread.sleep(3000);
		ua = new UserActions();
		String text;
		try {
				Assert.assertTrue(ua.GetDisplayed(backOfYourPassportText));
				text = ua.getText(backOfYourPassportText);
				Assert.assertEquals(expected, text);
				BaseTest.test.log(Status.PASS, text+ " is Displayed");
					
		} catch (Exception e) {
			BaseTest.test.log(Status.FAIL, e);
		}
	}
    
    public void verifyNfcChipReaderText(String expected) throws InterruptedException {
		Thread.sleep(3000);
		ua = new UserActions();
		String text;
		try {
				Assert.assertTrue(ua.GetDisplayed(nfcChipReaderText));
				text = ua.getText(nfcChipReaderText);
				Assert.assertEquals(expected, text);
				BaseTest.test.log(Status.PASS, text+ " is Displayed");
					
		} catch (Exception e) {
			BaseTest.test.log(Status.FAIL, e);
		}
	}
	
	
	
	

}
