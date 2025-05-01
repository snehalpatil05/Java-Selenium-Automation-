package webTable;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class MyWebTableUsingRowAndColumnUtils {
	
	@Test
    public void method() {
        WebDriver driver = new ChromeDriver();
        driver.get("https://money.rediff.com/mutual-funds/liquid");
        driver.manage().window().maximize();
        
// store the value of 3 entities -> Column Name and ColumnRow Value
		String col1Value = "Nippon Life Asset Management Ltd.";
		String col1Name = "Company";
		String col2Name = "Returns(%)";
        
// Columns position	
		int col1Position = WTUtilsForColumnPosition.getColumnPosition(driver, "//table/thead/tr/th", col1Name);  
		System.out.println(col1Name + "'s position is: " + col1Position);
     
        int col2Position = WTUtilsForColumnPosition.getColumnPosition(driver, "//table/thead/tr/th", col2Name);
        System.out.println(col2Name+ "'s position is: "+ col2Position);
        
// Row position
        int	rowPosition = WTUtilsForRowPosition.getRowPosition(driver, "//table/tbody/tr", col1Value, col1Position);
        System.out.println(col1Value + "'s row position is: " + rowPosition);

// Finding the value of Returns(%)
        
        if (rowPosition >= 1) {
    		String col2Value = driver.findElement(By.xpath("//table/tbody/tr["+rowPosition+"]/td["+col2Position+"]")).getText(); 
            System.out.println(col2Name+" of "+col1Value+" is: "+col2Value);
            
        } else {
            System.out.println("Company not found in table!");
        }      
        driver.quit();  
	}
}
