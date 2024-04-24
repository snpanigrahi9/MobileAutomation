package com.sita.mobile.test;


import java.net.MalformedURLException;
import java.util.Properties;
import org.testng.annotations.Test;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.common.base.AppiumDriverFactory;
import com.common.base.BaseTest;
import com.common.util.UserActions;
import com.sita.page.GetStarted;
import com.sita.page.LetsGetYouVerified;
import io.appium.java_client.android.AndroidDriver;

public class BiometricRegistrationTest extends BaseTest {

	String path = System.getProperty("user.dir");
	Properties p =  BaseTest.loadProperty();
	String boardingPassHeaderdefault = p.getProperty("YOUR_BOARDING_PASS");
	String boardingPassText = p.getProperty("YOUR_BOARDING_PASS_TEXT");
	String digitalIdentityHeader = p.getProperty("DIGITAL_IDENTITY");
	String digitalIdentityText = p.getProperty("DIGITAL_IDENTITY_TEXT");
	String dataIsSecureHeader = p.getProperty("DATA_SECURE");
	String dataIsSecuredText = p.getProperty("DATA_SECURE_TEXT");
	String letGetYouVerified = p.getProperty("LET_GET_YOU_VERIFIED");
	String beforeRegistration = p.getProperty("BEFORE_REGISTRATION");
	String capturePassport = p.getProperty("CAPTURE_PASSPORT");
	String photoYourPassport = p.getProperty("PHOTOT_YOUR_PASSPORT");
	String scanPassport = p.getProperty("SCAN_PASSPORT");
	String nfcEnabled = p.getProperty("NFC_ENABLED");
	String takeSelfie = p.getProperty("TAKE_SELFIE");
	String prepareTakeSelfie = p.getProperty("PREPARE_TAKE_SELFIE");
	String webServiceServer = p.getProperty("WEB_SERVICE_SERVER-URL");
	String reverseCamera = p.getProperty("REVERSE_CAMERA");
	String showDebugMenu = p.getProperty("SHOW_DEBUG_MENU");
	String debugOption = p.getProperty("DEBUG_OPTION");
	String verificationOption = p.getProperty("VERIFICATION_OPTION");
	String hardcodedPassport = p.getProperty("USE_HARDCODED_PASSPORT");
	String disabledNFCCheck = p.getProperty("DISABLE_NFC_CHECK");
	String changeLanguage =   p.getProperty("CHANGE_LANGUAGE");
	String privacyPolicy =    p.getProperty("PRIVACY_POLICY");
	String about = p.getProperty("ABOUT");
	
	String QA = p.getProperty("QA");
	String dev = p.getProperty("DEV");
	String preProd = p.getProperty("PREPROD");
	String prod =    p.getProperty("PROD");
	String custom = p.getProperty("CUSTOM");
	String fullAppReset = p.getProperty("FULL_APP_RESET");
	String fullyResetApp = p.getProperty("FULLY_RESET_APP");
	String erasePassportData = p.getProperty("ERASE_PASSPORT_DATA");
	String deletePassportDetails = p.getProperty("DELETE_PASSPORT_DETAILS");
	String capturePassportHeader = p.getProperty("CAPTURE_PASSPORT");
	String entirePassportPagetext = p.getProperty("ENTIRE_PASSPORT_PAGE");
	String backOfYourPassporttext = p.getProperty("BACK_OF_YOUR_PASSPORT");
	String nfcChipReadertext =  p.getProperty("NFC_CHIP_READER");
	
	UserActions ua=null;
	AndroidDriver driver;
	/*
	 * Verify Text in Splash page
	 */
	  @Test(priority = 1) 
	  public void verifySplashPage() throws
	  InterruptedException, MalformedURLException 
	  {
		 driver = (AndroidDriver) AppiumDriverFactory.launchApp();
		 test = extent.createTest("verifySplashPage");
		 //driver.installApp("C:\\Users\\S.Panigrahi\\app-sitalab-release.apk");
		 driver.installApp(System.getProperty("user.dir")+"//app-sitalab-release.apk");
		 driver.activateApp("aero.sita.sitalab.smartpathmobile");
	  GetStarted registration = new GetStarted();
	  registration.notificationAllow();
	  registration.verifyBoardingPassHeading(boardingPassHeaderdefault);
	  registration.verifyBoardingPassText(boardingPassText);
	  registration.swipe_left();
	  registration.verifyDigitalIdentityHeading(digitalIdentityHeader);
	  registration.verifyDigitalIdentityText(digitalIdentityText); 
	  registration.swipe_left();
	  registration.verifyDataIsSecureHeading(dataIsSecureHeader);
	  registration.verifyDataIsSecureText(dataIsSecuredText);
	  registration.clickGetStarted(); 
	  takeScreenshot();
	  //driver.terminateApp("aero.sita.sitalab.smartpathmobile");
	  Thread.sleep(5000);
	  }
	 
		
		  @Test(priority = 2) public void verifyHomePage() throws InterruptedException,
		  MalformedURLException { 
	      test = extent.createTest("verifyHomePage");
		  GetStarted registration = new GetStarted(); 
		  //AndroidDriver driver =(AndroidDriver) AppiumDriverFactory.launchApp();
		  Thread.sleep(5000);
		  driver.activateApp("aero.sita.sitalab.smartpathmobile");
		  Thread.sleep(5000);
		  LetsGetYouVerified getYouVerified = new LetsGetYouVerified(); 
		  //registration.clickGetStarted();
		  getYouVerified.verifyletGetYouVerifiedText(letGetYouVerified);
		  getYouVerified.verifybeforeRegistrationText(beforeRegistration);
		  getYouVerified.verifycapturePassposrtText(capturePassport);
		  getYouVerified.verifytakePhotoPassportText(photoYourPassport);
		  getYouVerified.verifyscanPassportText(scanPassport);
		  getYouVerified.verifynfcEnabledPassportScanText(nfcEnabled);
		  getYouVerified.verifytakeSelfieText(takeSelfie);
		  getYouVerified.verifyprepareSelfieText(prepareTakeSelfie);
		  //driver.terminateApp("aero.sita.sitalab.smartpathmobile");
		  //driver.close();
		  
		  }
		 
		  
			
			  @Test(priority = 3) public void verifyMenuValidation() throws
			  InterruptedException { test = extent.createTest("verifySettingPage");
			  LetsGetYouVerified getYouVerified = new LetsGetYouVerified();
			  //loginPage.clickGetStarted();
			  getYouVerified.clickHomeMenu();
			  getYouVerified.clickHomeSettings();
			  getYouVerified.verifyWebUrlText(webServiceServer);
			  getYouVerified.selectWebUrlText();
			  getYouVerified.verifytWebUrlPopupText(webServiceServer,QA,dev,preProd,prod, custom);
			  getYouVerified.clickCancel();
			  getYouVerified.selectdebugOption();
			  getYouVerified.verifyFullAppResetText(fullAppReset);
			  getYouVerified.verifyFullyResetAppText(fullyResetApp);
			  getYouVerified.verifyErasePassportDataText(erasePassportData);
			  getYouVerified.verifyDeletePassportDetailsText(deletePassportDetails);
			  getYouVerified.clickDebugSettingBack();
			  getYouVerified.verifyReverseCameraText(reverseCamera);
			  getYouVerified.switchReverseCamera(); getYouVerified.switchReverseCamera();
			  getYouVerified.verifyshowDebugMenuText(showDebugMenu);
			  getYouVerified.verifydebugOptionText(debugOption);
			  getYouVerified.verifyverificationText(verificationOption);
			  getYouVerified.verifyhardcodePassText(hardcodedPassport);
			  getYouVerified.verifydisableNfcText(disabledNFCCheck);
			  getYouVerified.verifychangeLanguageText(changeLanguage);
			  getYouVerified.clickNfcCheckbox(); getYouVerified.clickHardCodeCheckbox();
			  getYouVerified.clickSettingBack(); getYouVerified.clickHomeMenu();
			  getYouVerified.clickPrivacyPolicy();
			  getYouVerified.verifyprivacyPolicyText(privacyPolicy);
			  getYouVerified.clickClose(); getYouVerified.clickHomeMenu();
			  getYouVerified.clickAbout(); getYouVerified.verifyaboutTitleText(about);
			  getYouVerified.clickClose();
			  
			  }
			  
			  @Test(priority = 4) public void verifyCapturePassport() throws
			  InterruptedException { 
			  test = extent.createTest("verifyCapturePassport");
			  LetsGetYouVerified getYouVerified = new LetsGetYouVerified();
			  //loginPage.clickGetStarted(); 
			  getYouVerified.clickContinue();
			  getYouVerified.verifyCapturePassportHeaderText(capturePassportHeader);
			  getYouVerified.verifyEntirePassportPageText(entirePassportPagetext);
			  getYouVerified.verifyBackOfYourPassportText(backOfYourPassporttext);
			  getYouVerified.verifyNfcChipReaderText(nfcChipReadertext);
			  
			  
			  }
			 
}
