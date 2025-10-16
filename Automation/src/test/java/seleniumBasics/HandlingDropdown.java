package seleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class HandlingDropdown extends Base {
	public void verifyDropdown() {
		driver.navigate().to("https://www.webdriveruniversity.com/Dropdown-Checkboxes-RadioButtons/index.html");
		WebElement dropdown1=driver.findElement(By.id("dropdowm-menu-1"));
		Select select=new Select(dropdown1);
		//select.selectByIndex(2);
		//select.selectByValue("python");
		select.selectByVisibleText("Python");
		
	}
	public void verifyCheckBox() {
		driver.navigate().to("https://www.webdriveruniversity.com/Dropdown-Checkboxes-RadioButtons/index.html");
		WebElement option=driver.findElement(By.xpath("//input[@value='option-1']"));
		option.click();
	}
	public void verifyRadiobutton() {
		driver.navigate().to("https://www.webdriveruniversity.com/Dropdown-Checkboxes-RadioButtons/index.html");
		WebElement checkbox=driver.findElement(By.xpath("//input[@value=\"green\"]"));
		checkbox.click();
		System.out.println(checkbox.isSelected());
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
HandlingDropdown element=new HandlingDropdown();
element.initializeBrowser();
//element.verifyDropdown();
//element.verifyCheckBox();
element.verifyRadiobutton();


	}

}
