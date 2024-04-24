package com.common.util;

import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;

import com.google.common.collect.ImmutableMap;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;

import com.common.base.AppDriver;
import com.common.base.AppiumDriverFactory;
import com.common.base.BaseTest;

public class UserActions extends BaseTest {

	Properties p =  BaseTest.loadProperty();
	Long l = Long.parseLong(p.getProperty("implicitwait"));
	
	public void click(By locator) {
	

		try {
			//wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
			//wait.until(ExpectedConditions.presenceOfElementLocated(locator));
			//wait.until(ExpectedConditions.elementToBeClickable(locator));
			AppDriver.getCurrentDriver().findElement(locator).click();
		} catch (StaleElementReferenceException e) {
			//wait.until(ExpectedConditions.elementToBeClickable(locator));
			AppDriver.getCurrentDriver().findElement(locator).click();
		}

		catch (TimeoutException t) {
			//wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
			AppDriver.getCurrentDriver().findElement(locator).click();
		}

	}
	public String getText(By locator) {

		//wait.until(ExpectedConditions.presenceOfElementLocated(locator));
		//wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
		return AppDriver.getCurrentDriver().findElement(locator).getText();
	}
	
	public Boolean GetDisplayed(By locator) { 
		
		boolean w = AppDriver.getCurrentDriver().findElement(locator).isDisplayed();
	    return w;
	
}
	
	public void swipeLeft(By locator)
	{
		WebElement element = AppDriver.getCurrentDriver().findElement(locator);
		
		((JavascriptExecutor) AppDriver.getCurrentDriver()).executeScript("mobile: swipeGesture", ImmutableMap.of(
			    "elementId",((RemoteWebElement)element).getId(),
			    "direction", "left",
			    "percent", 0.75
			));	
		
	}
	
	public void implicitWait()
	{
		AppDriver.getCurrentDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(l));
		
	}
	
	
	
	
	

}
