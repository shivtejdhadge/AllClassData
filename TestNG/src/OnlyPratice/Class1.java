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

public class Class1 {
	
	
	@BeforeSuite
	public void openDB() {
		System.out.println("Open Database");
	}

	@AfterSuite
	public void closeDB() {
		System.out.println("Close Database");
	}
	
	@BeforeTest
	public void lauchBrowser() {
		System.out.println("Launch Browser");
	}
	
	@AfterTest
	public void CloseBrowser() {
		System.out.println("Close Browser");
	}


	@BeforeClass
	public void openFB(){
	System.out.println("Open FaceBook Tab");
	}
	
	@AfterClass
	public void CloseFB(){
	System.out.println("Close FaceBook Tab");
	}
	
	@BeforeMethod
	public void Login(){
	System.out.println("Login on FaceBook");
	}
	
	@AfterMethod
	public void Logout(){
	System.out.println("LogoutFrom FB");
	}
	
	
	@Test(priority=1)
	public void HomeScreenFB(){
	System.out.println("HomeScreen");
	}
	
	
	
	
	
	
	
	
}
