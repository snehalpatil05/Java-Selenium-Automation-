package webTable;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class WTUtilsForColumnPosition {
	
	public static int getColumnPosition(WebDriver driver, String columnXpath, String columnName) {
        List<WebElement> columnElements = driver.findElements(By.xpath(columnXpath));
        for (int i = 1; i <= columnElements.size(); i++) {
            String colName = driver.findElement(By.xpath("//table/thead/tr/th[" + i + "]")).getText();
            if (colName.equals(columnName)) {
                return i; 				// Column's position
            }
        }
		return 0;  //if column not found
	}

}
