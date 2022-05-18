package OnlyPratice;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Class3 {
	
	@BeforeClass
	public void openTwitter(){
	System.out.println("Open Twitter 3 Tab");
	}
	
	@AfterClass
	public void CloseTwitter(){
	System.out.println("Close Twitter 3 Tab");
	}

	@Test(priority=3)
	public void HomeScreenTwitter(){
	System.out.println("HomeScreen Twitter 3");
	}
	
}
