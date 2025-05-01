package webTable;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class MyWebTable {
	
	@Test
	public void method() {

		ChromeDriver driver = new ChromeDriver();
		driver.get("https://money.rediff.com/mutual-funds/liquid"); //to Navigate to URL
		driver.manage().window().maximize();
		
		// store the value of 3 entities
		
		String col1Value = "Nippon Life Asset Management Ltd.";
		String col1Name = "Company";
		String col2Name = "Returns(%)";
		
// let's find column position
		
		List <WebElement> colNameElements = driver.findElements(By.xpath("//table/thead/tr/th"));
		int columnSize = colNameElements.size();
		System.out.println("Total number of columns are: "+columnSize);
	
		// Below code finds the column 1 position.
		int col1Position = 0;
		for(int i=1; i<columnSize; i++) {
			String columnName = driver.findElement(By.xpath("//table/thead/tr/th["+i+"]")).getText(); //company
			if(col1Name.equals(columnName)) {
				col1Position = i;  //1
				break;
			}
		}
		System.out.println(col1Name+"'s position is : "+col1Position);
		
		// Below code finds the column 2's position.
		int col2Position = 0;
		for(int i=1; i<columnSize; i++) {
			String columnName = driver.findElement(By.xpath("//table/thead/tr/th["+i+"]")).getText(); //Returns(%)
			if(col2Name.equals(columnName)) {
				col2Position = i;  //1
				break;
			}
		}
		System.out.println(col2Name+"'s position is : "+col2Position);
		
// let's find Row's position	
		
		//find the Xpath for the Nippon
		//driver.findElement(By.xpath("//table/tbody/tr[7]/td));
		

		List <WebElement> rowElements = driver.findElements(By.xpath("//table/tbody/tr"));
		int rowPosition = 0;
		for(int i=1; i<rowElements.size(); i++) {
			String rowValue = driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td["+col1Position+"]")).getText(); 
			// Nippon Life Asset Management Ltd.'s row positio
			if(col1Value.equals(rowValue)) {
				rowPosition = i;  //1["+rowPosition+"]"
				break;
			}
		}
		
		System.out.println(col1Value+"'s row position is : "+rowPosition);
		
// Finding the Column 2 Value (Value of Returns(%))
		
		String col2Value = driver.findElement(By.xpath("//table/tbody/tr["+rowPosition+"]/td["+col2Position+"]")).getText(); 
		// Returns(%) of Nippon Life Asset Management Ltd.
		System.out.println(col2Name+" of "+col1Value+" is "+col2Value);
	}
}
