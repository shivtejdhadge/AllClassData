package Grouping;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class ClassNo1 {
	
	
	@BeforeSuite(alwaysRun = true)
	public void OpenDB() {
		System.out.println("Open DataBase");
	}
	
	
	@AfterSuite(alwaysRun = true)
	public void ClaseDB() {
		System.out.println("Close DataBase");
	}
	
	
	@BeforeClass(alwaysRun = true)
	public void LauchBrowser() {
		System.out.println("Launch Browser");
	}
	
	@AfterClass(alwaysRun = true)
	public void CloseBrowser() {
		System.out.println("Close Browser");
	}
	
	
	@Test(groups="smoke")
	public void Test1() {
		System.out.println("Test 1");
	}
	
	@Test(groups="sanity")
	public void Test2() {
		System.out.println("Test 2");
	}
	
	@Test(groups="regression")
	public void Test3() {
		System.out.println("Test 3");
		Assert.fail();
	}

}
