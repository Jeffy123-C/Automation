package seleniumBasics;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestngAnnotation {
	@Test
	public void test() {
		System.out.println("Sample test case");
		
	}
	@BeforeMethod
	public void before() {
		System.out.println("Sample before method");
	}
	@AfterMethod
	public void after() {
		System.out.println("Sample after method");
	}
	@BeforeClass
	public void beforeClass() {
		System.out.println("Sample before class");
		
	}
	@AfterClass
	public void afterClass() {
		System.out.println("Sample after class");
	}
	@BeforeTest
	public void beforeTest() {
		System.out.println("Sample before test");
	}
	@AfterTest
	public void afterTest() {
		System.out.println("Sample after test");
	}
	@BeforeSuite
	public void beforeSuite() {
		System.out.println("Sample before suite");
	}
	@AfterSuite
	public void afterSuite() {
		System.out.println("Sample after suite");
	}

}
