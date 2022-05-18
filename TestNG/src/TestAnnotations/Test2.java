package TestAnnotations;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Test2 {
	
	

	@Test(priority=3)
	public static void M1() {
		System.out.println("Test 2-Methode 1 ");
	}
	
	@Test(priority=4)
	public static void M2() {
		System.out.println("Test 2 -Methode 2");
	}
	
	
	
	
	
	
	
	
	
}
