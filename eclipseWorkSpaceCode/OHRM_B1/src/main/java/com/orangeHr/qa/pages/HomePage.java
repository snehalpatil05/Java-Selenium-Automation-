package com.orangeHr.qa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.orangeHr.qa.utils.WebUtils;

public class HomePage {

	WebDriver driver;
	WebUtils webUtils;

	// 	create a constructor
	public HomePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		webUtils = new WebUtils(driver);
		// this automatically initialize the elements which are in the Login Page.
	}

	@FindBy(xpath="//li[@class='oxd-userdropdown']")
	WebElement accountDropdown;  
	
	@FindBy(xpath="//span[text()='Admin']")
	WebElement adminLink;
	

	// Actions - creating a method for the WebElements
	public boolean isAccountDropdownVisible() {
		boolean status = webUtils.isElementDisplayed(accountDropdown);
		return status;
	}
	
	public void clickOnAdminLink() {
		//adminLink.click();
		webUtils.clcikOnElement(adminLink);
	}
}
