package com.orangeHr.qa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.orangeHr.qa.utils.WebUtils;

public class AdminPage {

	WebDriver driver;
	WebUtils webUtils;
	
	public AdminPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		webUtils = new WebUtils(driver);
	}

	@FindBy(xpath="//button[text()=' Add ']")
	WebElement addButton;  
	
	@FindBy(xpath="//div[label[text()='User Role']]//following-sibling:: div//div[@class='oxd-select-wrapper']")
	WebElement selectUserRole;

	@FindBy(xpath="//div[@role='option']/span[text()='Admin']")
	WebElement adminRole;
	
	
	@FindBy(xpath="//input[@placeholder='Type for hints...']")
	WebElement typeForHint;
	
	@FindBy(xpath="//span[text()='Admin  Admin123']")
	WebElement selectOrangeTest;
	
	@FindBy(xpath="//div[label[text()='Status']]//following-sibling::div//div[@class='oxd-select-wrapper']")	
	WebElement selectStatus;
	
	@FindBy(xpath="//div[@role='option']/span[text()='Enabled']")
	WebElement selectEnabled;
	
	@FindBy(xpath="//div[label[text()='Username']]//following-sibling::div/input")
	WebElement userName;
	
	@FindBy(xpath="//div[label[text()='Password']]//following-sibling::div/input[@type='password']") 
	WebElement password;	
	
	@FindBy(xpath="//div[label[text()='Confirm Password']]//following-sibling::div/input[@type='password']")
	WebElement confirmPassword;
	
	@FindBy(xpath="//button[text()=' Save ']")
	WebElement saveButton;
	
//	Actions 
//	public void clickOnAddButton() {
//		addButton.click();
//	}
//	
//	public void clickOnSelectUserRole() {
//		selectUserRole.click();
//	}
//	
//	public void clickOnAdminRole() {
//		adminRole.click();
//	}
//
//	public void enterTypeForHint(String hint) {
//		typeForHint.sendKeys(hint);
//	}
//	
//	public void clickOnOrangeTest() { 
//		selectOrangeTest.click();
//	}
//	
//	public void clickOnSelectStatus() {
//		selectStatus.click();
//	}
//	
//	public void clickOnSelectEnabled() {
//		selectStatus.click();
//	}
//	
//	public void enterUserName (String uname) { 
//		userName.sendKeys(uname);
//	}
//	
//	public void enterPassword (String pwd) {
//		password.sendKeys(pwd);
//	}
//	
//	public void enterConfirmPwd (String confirmPwd) { 
//		confirmPassword.sendKeys(confirmPwd);
//	}
//	
//	public void clickOnSaveButton() {
//	saveButton.click();
//	}
	
//	Actions Using WebUtils
	
	public void clickOnAddButton() {
		webUtils.clcikOnElement(addButton);
	}
	
	public void clickOnSelectUserRole() {
		webUtils.clcikOnElement(selectUserRole);
	}
	
	public void clickOnAdminRole() {
		webUtils.clcikOnElement(adminRole);
	}

	public void enterTypeForHint(String hint) {
		webUtils.enterText(typeForHint, hint);
	}
	
	public void clickOnOrangeTest() { 
		webUtils.clcikOnElement(selectOrangeTest);
	}
	
	public void clickOnSelectStatus() {
		webUtils.clcikOnElement(selectStatus);
	}
	
	public void clickOnSelectEnabled() {
		webUtils.clcikOnElement(selectEnabled);
	}
	
	public void enterUserName (String uname) { 
		webUtils.enterText(userName, uname);
	}
	
	public void enterPassword (String pwd) {
		webUtils.enterText(password, pwd);
	}
	
	public void enterConfirmPwd (String confirmPwd) { 
		webUtils.enterText(confirmPassword, confirmPwd);
	}
	
	public void clickOnSaveButton() {
		webUtils.clcikOnElement(saveButton);
	}
	
}

