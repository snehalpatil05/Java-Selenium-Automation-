package screenshot;

import java.io.File;
import java.io.IOException;
import java.util.Random;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;


public class ScreenshotUtility {

	public static void takeScreenshot(WebDriver driver) {
		TakesScreenshot screenshot = (TakesScreenshot)driver; 

		File srcFile = screenshot.getScreenshotAs(OutputType.FILE);

		Random obj = new Random();
		int randomNumber = obj.nextInt(1000);
		System.out.println("RandomNumber: "+randomNumber);

		try {
			FileUtils.copyFile(srcFile, new File("C:\\Users\\SnehalPatil\\eclipse-workspace\\SeleniumCodes\\ScreenShotsTaken\\ScreenShot"+randomNumber+".png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
