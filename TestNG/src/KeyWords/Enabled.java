package KeyWords;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Enabled {
	@BeforeClass()
	public void OpenUrl() {
		System.out.println("Open URL");
		
	}

	@Test(priority=1,enabled = false)// Perticular testcase skip
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
	

	@AfterClass()
	public void CloseUrl() {
		System.out.println("Close URL");
	
	}
	
	

}
