package POM_PageFactory;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class InstaNewAcTEst {
WebDriver driver;
	
	
	@BeforeClass
	public void setUp() {
		

		System.setProperty("webdriver.chrome.driver","C://Users//USER//Desktop//Selenium all Jar file//chromedriver (Version 99)//chromedriver.exe");
		
		 driver= new ChromeDriver();
		driver.get("https://www.instagram.com/accounts/emailsignup/");
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	@Test
	public void InstaRegestrainPageTest() {
		
		InstaNewAc In=new InstaNewAc(driver);
		In.verifyInstaNewAcInstaLogo();
//		In.verifyInstaNewAcSignupText();
//		In.verifyInstaNewAcAlreadyAcText();
//		In.verifyInstaNewAcLogInWithFBLink();
//		In.verifyInstaNewAcFullNAme();
//		In.verifyInstaNewAcMobNo();
//		In.verifyInstaNewAcUserName();
//		In.verifyInstaNewAcPassword();
//		In.verifyInstaNewAcSignUpLink();
//		In.verifyInstaNewAcAlreadyAcLink();
//		In.verifyInstaNewAcAllFooterLinks();
		In.verifyInstaNewAcaboutclick();
}
	@AfterClass
	public void QuitBrowser() {
		driver.close();
	}
	
}