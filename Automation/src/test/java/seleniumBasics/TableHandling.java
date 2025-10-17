package seleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class TableHandling extends Base {
	public void verifyTable() {
		driver.navigate().to("https://money.rediff.com/indices/nse");
		WebElement table=driver.findElement(By.xpath("//table[@id='dataTable']"));
		//System.out.println(table.getText());
		WebElement row=driver.findElement(By.xpath("//table[@id='dataTable']/tbody/tr[1]"));
		System.out.println(row.getText());
		
		
		
	}

	public static void main(String[] args) {
		TableHandling table=new TableHandling();
		table.initializeBrowser();
		table.verifyTable();
		

	}

}
