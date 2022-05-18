package OnlyPratice;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Pratice2 {
	
	@BeforeClass()
	public void Maximize() {
		System.out.println(" Befoure Class");
	}
	
	@AfterClass()
	public void afterclass() {
		System.out.println("After class");
	}
	
	@BeforeMethod
	public void login() {
		System.out.println("Log-in Befoure Methgode");
	}
	
	
	@AfterMethod()
	public void Logout() {
		System.out.println("Logout-After Methode");
	}

	@Test(priority=2)
	public void Intraday2() {
		System.out.println("Intraday2");
	}

}
