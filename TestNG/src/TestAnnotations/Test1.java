package TestAnnotations;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Test1 {
	
	@BeforeTest
	public static void OpenDatabase() {
		System.out.println("DataBaseOpen ");
	}
	
	@AfterTest
	public static void CloseDatabase() {
		System.out.println("CloseDataBase");
	}
	
	

	@Test(priority=1)
	public static void M1() {
		System.out.println("Test 1-Methode 1 ");
	}
	
	@Test(priority=2)
	public static void M2() {
		System.out.println("Test 1-Methode 2 ");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	

}
