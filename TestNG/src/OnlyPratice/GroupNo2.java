package OnlyPratice;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class GroupNo2 {
	
	@BeforeClass(alwaysRun=true)
	public void LunchBrowser() {
		System.out.println("Launch Browser");
	}
	
	@AfterClass(alwaysRun=true)
	public void CloseBrowser() {
		System.out.println("Close Browser");
	}
	
	@Test(groups="sanity",priority=1)
	public void LoginInsta() {
		System.out.println("Log In Insta-2");
	}
	
	@Test(groups="demo",priority=2)
	public void HomeScreenInsta() {
		System.out.println("HomeScreen Insta-2");
	}
	@Test(groups="functional",priority=3)
	public void LogoutInsta() {
		System.out.println("LogOut Insta-2");
	}

}
