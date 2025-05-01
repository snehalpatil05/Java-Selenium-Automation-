package com.orangeHr.qa.utils;

import java.time.Duration;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class WebUtils {
	
	public WebDriver driver;
	public WebDriverWait wait;
	public static final Logger logger = Logger.getLogger(WebUtils.class.getName());
	
	public WebUtils(WebDriver driver) {
		this.driver = driver;
		this.wait = new WebDriverWait(driver, Duration.ofSeconds(15));
	}
	
	// exception handling, explicit wait, operation logger
	public void enterText(WebElement element, String text) {
		try {
			WebElement visibleElement = wait.until(ExpectedConditions.visibilityOf(element));
			visibleElement.sendKeys(text);
			logger.log(Level.INFO, "Entered "+text+" on element: "+element);
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void clcikOnElement(WebElement element) {
		try {
			WebElement visibleElement = wait.until(ExpectedConditions.visibilityOf(element));
			visibleElement.click();
			logger.log(Level.INFO, "Clicked on element: "+element);
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public boolean isElementDisplayed(WebElement element) {
		boolean status = false;
		try {
			WebElement visibleElement = wait.until(ExpectedConditions.visibilityOf(element));
			status = visibleElement.isDisplayed();
			logger.log(Level.INFO, "Clicked on element: "+element);
		}catch (Exception e) {
			e.printStackTrace();
		}
		return status;
	}
	
	public String getText(WebElement element) {
		String text = "";
		try {
			WebElement visibleElement = wait.until(ExpectedConditions.visibilityOf(element));
			text = visibleElement.getText();
			logger.log(Level.INFO, "Clicked on element: "+element);
		}catch (Exception e) {
			e.printStackTrace();
		}
		return text;
	}

}



