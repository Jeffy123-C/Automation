package testScript;

import java.io.IOException;
import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import automationCore.TestNGBase;
import pages.LoginPage;
import utilities.ExcelUtility;

public class LoginTest extends TestNGBase{
	@Test
	public void verifyUserLoginWithValidCredentials() throws IOException {
		String username=ExcelUtility.getStringData(0, 0, "LoginPage");
		String password=ExcelUtility.getStringData(0, 1, "LoginPage");
		//WebElement usernamefield=driver.findElement(By.id("user-name"));
		//usernamefield.sendKeys("standard_user");
		//WebElement passwordfield=driver.findElement(By.id("password"));
		//passwordfield.sendKeys("secret_sauce");
		//WebElement loginbutton=driver.findElement(By.id("login-button"));
		//loginbutton.click();
		LoginPage loginpage=new LoginPage(driver);
		loginpage.enterUsernameOnUsernameField(username);
		loginpage.enterPasswordOnPasswordField(password);
		loginpage.clickOnLoginButton();
		
	}
	@Test
	public void verifyUserLoginWithInvalidUsernameAndValidPassword() throws IOException {
		String username=ExcelUtility.getStringData(1, 0, "LoginPage");
		String password=ExcelUtility.getStringData(1, 1, "LoginPage");
		//WebElement usernamefield=driver.findElement(By.id("user-name"));
		//usernamefield.sendKeys("standard");
		//WebElement passwordfield=driver.findElement(By.id("password"));
		//passwordfield.sendKeys("secret_sauce");
		//WebElement loginbutton=driver.findElement(By.id("login-button"));
		//loginbutton.click();
		LoginPage loginpage=new LoginPage(driver);
		loginpage.enterUsernameOnUsernameField(username);
		loginpage.enterPasswordOnPasswordField(password);
		loginpage.clickOnLoginButton();
		
	}
	@Test
	public void verifyUserLoginWithValidUsernameAndInvalidPassword() throws IOException {
		String username=ExcelUtility.getStringData(2, 0, "LoginPage");
		String password=ExcelUtility.getStringData(2, 1, "LoginPage");
		//WebElement usernamefield=driver.findElement(By.id("user-name"));
		//usernamefield.sendKeys("standard_user");
		//WebElement passwordfield=driver.findElement(By.id("password"));
		//passwordfield.sendKeys("secret");
		//WebElement loginbutton=driver.findElement(By.id("login-button"));
		//loginbutton.click();
		LoginPage loginpage=new LoginPage(driver);
		loginpage.enterUsernameOnUsernameField(username);
		loginpage.enterPasswordOnPasswordField(password);
		
		loginpage.clickOnLoginButton();
		
	}
	@Test
	public void verifyUserLoginWithInvalidCredentials() throws IOException {
		String username=ExcelUtility.getStringData(3, 0, "LoginPage");
		String password=ExcelUtility.getStringData(3, 1, "LoginPage");
		//WebElement usernamefield=driver.findElement(By.id("user-name"));
		//usernamefield.sendKeys("standard");
		//WebElement passwordfield=driver.findElement(By.id("password"));
		//passwordfield.sendKeys("secret");
		//WebElement loginbutton=driver.findElement(By.id("login-button"));
		//loginbutton.click();
		LoginPage loginpage=new LoginPage(driver);
		loginpage.enterUsernameOnUsernameField(username);
		loginpage.enterPasswordOnPasswordField(password);
		loginpage.clickOnLoginButton();
		
	}

}
