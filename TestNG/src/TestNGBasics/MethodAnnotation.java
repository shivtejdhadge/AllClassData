package TestNGBasics;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class MethodAnnotation {
	
	@BeforeMethod
	public static void Login() {
		System.out.println("Login");
	}
	
	@AfterMethod
	public static void Logout() {
		System.out.println("Logout");
	}
	
	
	@Test(priority=1)
	public static void Homepage() {
		System.out.println("Home Page");
	}
	
	@Test(priority=2)
	public static void timeline() {
		System.out.println("Timeline");
	}
	
	@Test(priority=3)
	public static void Reels() {
		System.out.println("Reels");
	}

}
