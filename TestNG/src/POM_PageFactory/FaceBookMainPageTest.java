package POM_PageFactory;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class FaceBookMainPageTest {
	
	WebDriver driver;
	
	@Test(priority=1)
	public void SetUp() {
		System.setProperty("webdriver.chrome.driver","C://Users//USER//Desktop//Selenium all Jar file//chromedriver (Version 99)//chromedriver.exe");
		
		 driver= new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	
	@Test(priority=1)
	public void link() {
		FaceBookMainPage main=new FaceBookMainPage(driver);
		main.Linkscheck();
	}

}
