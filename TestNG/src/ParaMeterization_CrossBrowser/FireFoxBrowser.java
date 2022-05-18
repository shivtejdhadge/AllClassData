package ParaMeterization_CrossBrowser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class FireFoxBrowser {
	
	@Test
	public void m1() {
		System.setProperty("webdriver.gecko.driver","C://Users//USER//Desktop//Selenium all Jar file//geckodriver-v0.31.0-win32//geckodriver.exe");
		
		WebDriver driver= new FirefoxDriver();
		driver.get("https://www.facebook.com/");
		
		
	}

}
