package TestNGBasics;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Introduction {
	
	//OpenURL,Login,Logout
	//For Every Action need separate method and uniq name(action name reflect)
	
	@Test(priority=1)
	public void openurl() {
		System.out.println("Open URL");
		Reporter.log("Open URL Sucessfully done");
	}
	@Test(priority=2)
	public void login() {
		System.out.println("Login");
		Reporter.log("Login Sucucess");
	}
	
	
	@Test(priority=4)
	public void logout() {
		System.out.println("LogOut");
		Reporter.log("Logout Sucess");
	}
	
	@Test(priority=3)
	public void notification() {
		System.out.println("notification");
	Reporter.log("Notification Sucessfully done");
	}
	
	
}
