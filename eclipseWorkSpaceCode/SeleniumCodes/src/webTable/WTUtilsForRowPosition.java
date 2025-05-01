package webTable;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class WTUtilsForRowPosition {
	
	public static int getRowPosition(WebDriver driver, String rowXpath, String columnValue, int columnIndex) {
        List<WebElement> rowElements = driver.findElements(By.xpath(rowXpath));
        for (int i = 1; i <= rowElements.size(); i++) {
            String rowValue = driver.findElement(By.xpath("//table/tbody/tr[" + i + "]/td[" + columnIndex + "]")).getText();
            if (rowValue.equals(columnValue)) {
                return i;				// Row's position
            }
        }
        return 0; // Return 0 if row not found
    
	}
}