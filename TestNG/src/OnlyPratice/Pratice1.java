package OnlyPratice;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Pratice1 {
	
	
	@BeforeSuite
	public void lauchBrowser() {
		System.out.println("Befoure suite");
	}

	
	@BeforeTest()
	public void OpenWebsite() {
		System.out.println(" Befoure Test");
	}
	
	
	@BeforeClass()
	public void Maximize() {
		System.out.println(" Befoure Class");
	}
	
	
	@BeforeMethod
	public void login() {
		System.out.println("Log-in Befoure Methgode");
	}
	
	@Test(priority=1)
	public void homescreen1() {
		System.out.println("Home Screen");
	}
	
	
	
	
	
	
	@AfterSuite()
	public void Closebrowser() {
		System.out.println("After Suite");
	}
	
	
	@AfterClass()
	public void afterclass() {
		System.out.println("After class");
	}
	
	@AfterMethod()
	public void Logout() {
		System.out.println("Logout-After Methode");
	}
	
	@AfterTest()
	public void closeWebsite() {
		System.out.println("After Test");
	}
	
	
}
