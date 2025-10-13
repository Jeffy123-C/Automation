package seleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class WebElements extends Base{
	public void verifyCommands() {
		driver.navigate().to("https://selenium.qabible.in/simple-form-demo.php");
	
	WebElement message=driver.findElement(By.xpath("//input[@id='single-input-field']"));
	WebElement button=driver.findElement(By.xpath("//button[@id='button-one']"));
		message.sendKeys("jeffy");
		button.click();
	}

	public static void main(String[] args) {
		WebElements element=new WebElements();
		element.initializeBrowser();
		element.verifyCommands();

	}

}
