package TestAnnotations;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Test4 {
	
	@BeforeClass
	public static void Openbrowser() {
		System.out.println("Browser is Open");
	}
	
	
	@AfterClass
	public static void Closebrowser() {
		System.out.println("Browser is close");
	}
	
	
	@Test(priority=3)
	public static void M1() {
		System.out.println("Test 4-Methode 1 ");
	}
	
	@Test(priority=4)
	public static void M2() {
		System.out.println("Test 4 -Methode 2");
	}

}
