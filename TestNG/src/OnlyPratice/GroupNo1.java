package OnlyPratice;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class GroupNo1 {
	
	
	
	@BeforeSuite(alwaysRun=true)
	public void openDB() {
		System.out.println("Open Batabase");
	}
	
	@AfterSuite(alwaysRun=true)
	public void CloseDB() {
		System.out.println("Close Batabase");
	}
	
	
	@BeforeClass(alwaysRun=true)
	public void LunchBrowser() {
		System.out.println("Launch Browser");
	}
	
	@AfterClass(alwaysRun=true)
	public void CloseBrowser() {
		System.out.println("Close Browser");
	}
	
	
	@BeforeMethod(alwaysRun=true)
	public void OpenURL() {
		System.out.println("Open URL");
	}
	
	@AfterMethod(alwaysRun=true)
	public void CloseURL() {
		System.out.println("Close URL");
	}
	
	@Test(groups="functional",priority=1)
	public void Login1() {
		System.out.println("Log In FB-1");
	}
	
	@Test(groups="sanity",priority=2)
	public void HomeScreen2() {
		System.out.println("HomeScreen FB-1");
	}
	@Test(groups="demo",priority=3)
	public void Logout3() {
		System.out.println("LogOut FB-1");
	}

}
