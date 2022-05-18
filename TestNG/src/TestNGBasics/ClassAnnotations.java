package TestNGBasics;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class ClassAnnotations {
	
	@BeforeClass
	public static void login() {
		System.out.println("Login");
	}
	
	@AfterClass
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
