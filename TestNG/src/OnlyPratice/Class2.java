package OnlyPratice;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Class2 {
	
	@BeforeClass
	public void openInsta(){
	System.out.println("Open Insta 2 Tab");
	}
	
	@AfterClass
	public void CloseInsta(){
	System.out.println("Close Insta 2 Tab");
	}
	@Test(priority=2)
	public void HomeScreenInsta(){
	System.out.println("HomeScreen Insta 2");
	}

}
