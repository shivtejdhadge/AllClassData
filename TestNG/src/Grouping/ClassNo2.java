package Grouping;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class ClassNo2 {
	@BeforeClass(alwaysRun = true)
	public void LauchBrowser() {
		System.out.println("Launch Browser");
	}
	
	@AfterClass(alwaysRun = true)
	public void CloseBrowser() {
		System.out.println("Close Browser");
	}
	
	
	@Test(groups={"smoke","regression"})
	public void Test4() {
		System.out.println("Test 4");
	}
	
	@Test(groups={"smoke","sanity"})
	public void Test5() {
		System.out.println("Test 5");
	}
	
	@Test(groups="regression")
	public void Test6() {
		System.out.println("Test 6");
	}

}
