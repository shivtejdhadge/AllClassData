package KeyWords;

import static org.testng.Assert.fail;

import org.testng.Assert;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AllTogether {
	
	@Test(priority=1)
	public void m1() {
		System.out.println("Methode M1");

		
		
	}

	
	@Test(priority=2,dependsOnMethods="m1",invocationCount=3)
	public void m2() {
		System.out.println("Methode M2");
	}
	
	@Test(priority=3,dependsOnMethods="m1",timeOut= 5000)
	public void m3() {
		System.out.println("Methode M3");
		
	}

	@Test(priority=4,invocationCount=5,enabled=false)
	public void m4() {
		System.out.println("Methode M4");
	}
	
	
}
