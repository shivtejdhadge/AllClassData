package AssertPratice;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertPratice {
	
	//Declare On Class Level
	SoftAssert soft=new SoftAssert();
	
	
	String s="Shiv";
	String s1="Shivtej";

	@Test
	public void M1() {
		System.out.println("hi");
		//Assert.assertEquals(s, s1);
		//System.out.println(s1);
		
		soft.assertEquals(s, s1);
		
		Assert.assertNotEquals(s1, s);
		System.out.println("hello");
		soft.assertAll();
	}


	@Test
	public void M2() {
	//	System.out.println("2nd TEst");
		soft.assertNotEquals(s, s1);
		//System.out.println("2nd TEst");
	}
	
	
	
	
	
	
	
	
//	@Test
//	public void M5() {
//		
//		
//	}

}
