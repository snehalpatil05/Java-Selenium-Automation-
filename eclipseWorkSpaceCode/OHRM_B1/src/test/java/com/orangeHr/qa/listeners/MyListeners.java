package com.orangeHr.qa.listeners;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.orangeHr.qa.base.BaseClass;
import com.orangeHr.qa.utils.ExtentReporteUtility;

public class MyListeners implements ITestListener {
	
	ExtentReports extentReports;
	ExtentTest extentTest;

	// we use method overriding in Listeners
	
	//When the execution of project starts this "onStart" method will get invoked
	@Override
	public void onStart(ITestContext context) {
//		System.out.println("Execution of project test Started");
		extentReports = ExtentReporteUtility.generateExtentReport();
		
	}
	
	// when any @Test method starts executed, before that onTestStart method will get invoked
	@Override
	public void onTestStart(ITestResult result) {
		String testName = result.getName();
//		System.out.println(testName+ " Started executing");
		extentTest = extentReports.createTest(testName);
		extentTest.log(Status.INFO, testName+ " Started executing");
		}
	
	//when the @Test method execution is completed successfully this onTestSuccess will be invoked
	@Override
	public void onTestSuccess(ITestResult result) {
		String testName = result.getName();
//		System.out.println(testName+ " got executed successfully");
		extentTest.log(Status.PASS, testName+ " got executed successfully");

	}

	//when the @Test method execution is failed this onTestFailure will be invoked

	@Override
	public void onTestFailure(ITestResult result) {
		String testName = result.getName();
		WebDriver driver = BaseClass.getDriver();
		
		if(driver!=null) {

//		System.out.println(testName+ " Test Execution failed");
//		System.out.println("Take the Screenshot");
		
//		Take Screenshot:
//		WebDriver driver;
		File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		String destPath = System.getProperty("user.dir")+"/Screenshots/"+testName+".png";
		
		try {
		FileHandler.copy(screenshot, new File(destPath));
		extentTest.addScreenCaptureFromPath(destPath);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
		extentTest.log(Status.INFO, result.getThrowable());
		extentTest.log(Status.FAIL, testName+ " Test Execution failed");
		
	}
	
	//when any @Test method execution is skipped this onTestSkipped will be invoked
	@Override
	public void onTestSkipped(ITestResult result) {
		String testName = result.getName();
//		System.out.println(testName+ " Test case got skipped");
		extentTest.log(Status.SKIP, testName+ " Test case got skipped");

	}

	//When project execution ends onFinish method will get invoked
	@Override
	public void onFinish(ITestContext context) {
//		System.out.println("Project execution finished");
		extentReports.flush();

	}

}
