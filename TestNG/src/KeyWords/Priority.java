package KeyWords;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Priority {
	
	

	
	@BeforeClass()
	public void openUrl() {
		System.out.println("open URL");
	
	}
	
	
	@Test(priority=11)
	public static void Homepage() {
		System.out.println("Home Page");
	

	}
	
	
	
	@Test(priority=2)
	public static void timeline() {
		System.out.println("Timeline");
		
	}
	
	
	@Test(priority=34)
	public static void Reels() {
		System.out.println("Reels");
	}
	

	@AfterClass()
	public void CloseUrl() {
		System.out.println("Close URL");
	
	}
	
	
	
	
	
	
	

}
