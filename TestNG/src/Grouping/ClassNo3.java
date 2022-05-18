package Grouping;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class ClassNo3 {
	
	@BeforeClass(alwaysRun = true)
	public void LauchBrowser() {
		System.out.println("Launch Browser");
	}
	
	@AfterClass(alwaysRun = true)
	public void CloseBrowser() {
		System.out.println("Close Browser");
	}
	
	
	@Test(groups="sanity")
	public void Test7() {
		System.out.println("Test 7");
	}
	
	@Test(groups="regression")
	public void Test8() {
		System.out.println("Test 8");
	}
	
	@Test(groups="smoke")
	public void Test9() {
		System.out.println("Test 9");
	}

}
