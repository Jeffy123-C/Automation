package testScript;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import automationCore.TestNGBase;
import pages.LoginPage;

public class LoginTest extends TestNGBase{
	@Test
	public void verifyUserLoginWithValidCredentials() {
		//WebElement usernamefield=driver.findElement(By.id("user-name"));
		//usernamefield.sendKeys("standard_user");
		//WebElement passwordfield=driver.findElement(By.id("password"));
		//passwordfield.sendKeys("secret_sauce");
		//WebElement loginbutton=driver.findElement(By.id("login-button"));
		//loginbutton.click();
		LoginPage loginpage=new LoginPage(driver);
		loginpage.enterUsernameOnUsernameField();
		loginpage.enterPasswordOnPasswordField();
		loginpage.clickOnLoginButton();
		
	}
	@Test
	public void verifyUserLoginWithInvalidUsernameAndValidPassword() {
		WebElement usernamefield=driver.findElement(By.id("user-name"));
		usernamefield.sendKeys("standard");
		WebElement passwordfield=driver.findElement(By.id("password"));
		passwordfield.sendKeys("secret_sauce");
		WebElement loginbutton=driver.findElement(By.id("login-button"));
		loginbutton.click();
		
	}
	@Test
	public void verifyUserLoginWithValidUsernameAndInvalidPassword() {
		WebElement usernamefield=driver.findElement(By.id("user-name"));
		usernamefield.sendKeys("standard_user");
		WebElement passwordfield=driver.findElement(By.id("password"));
		passwordfield.sendKeys("secret");
		WebElement loginbutton=driver.findElement(By.id("login-button"));
		loginbutton.click();
		
	}
	@Test
	public void verifyUserLoginWithInvalidCredentials() {
		WebElement usernamefield=driver.findElement(By.id("user-name"));
		usernamefield.sendKeys("standard");
		WebElement passwordfield=driver.findElement(By.id("password"));
		passwordfield.sendKeys("secret");
		WebElement loginbutton=driver.findElement(By.id("login-button"));
		loginbutton.click();
		
	}

}
