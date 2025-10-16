package seleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class WebElements extends Base{
	public void verifyCommands() {
	driver.navigate().to("https://selenium.qabible.in/simple-form-demo.php");		
	WebElement message=driver.findElement(By.xpath("//input[@id='single-input-field']"));
	message.sendKeys("Jeffy");
	WebElement button=driver.findElement(By.xpath("//button[@id='button-one']"));
	System.out.println(button.isDisplayed());
	System.out.println(button.isEnabled());
		button.click();
		WebElement yourText=driver.findElement(By.xpath("//div[@id='message-one']"));
		System.out.println(yourText.getText());
		WebElement total=driver.findElement(By.id("button-two"));
		System.out.println(total.getTagName());
		System.out.println(button.getCssValue("background-color"));
	}

	public static void main(String[] args) {
		WebElements element=new WebElements();
		element.initializeBrowser();
		element.verifyCommands();

		
	}

}
