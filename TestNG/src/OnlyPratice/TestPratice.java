package OnlyPratice;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestPratice {
	
	@Test(priority=1)
	public static void test1() {
		System.out.println("Test No.1");
		Reporter.log("Test no.1 Passed");
	}
	
	@Test(priority=2)
	public static void test2() {
		System.out.println("TEst No.2");
		Reporter.log("Test no.2 Passed");
	}
	
	@Test(priority=3)
	public static void test3() {
		System.out.println("Test No.3");
		Reporter.log("Test no.3 Passed");
//		test1();
//		test2();
		TestPratice a= new TestPratice();
		a.test4();
	}
	
	@Test(priority=4)
	public void test4() {
		System.out.println("Test No.4 Non-STatic");
	}
	
	
	
	
	
	

}
