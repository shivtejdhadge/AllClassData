package KeyWords;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class InvocationCount {
	
	@BeforeTest
	public static void OpenDatabase() {
		System.out.println("DataBaseOpen ");
	}
	
	@AfterTest
	public static void CloseDatabase() {
		System.out.println("CloseDataBase");
	}
//	@BeforeMethod
//	public static void Login() {
//		System.out.println("Login");
//	}
//	
//	@AfterMethod
//	public static void Logout() {
//		System.out.println("Logout");
//	}
//	
	
	@Test(priority=1,invocationCount = 5)
	public static void Homepage() {
		System.out.println("Home Page");
	}
	
	@Test(priority=2,invocationCount=10)
	public static void timeline() {
		System.out.println("Timeline");
	}
	
	
	@Test(priority=3,invocationCount=0)
	public static void Reels() {
		System.out.println("Reels");
	}

}
