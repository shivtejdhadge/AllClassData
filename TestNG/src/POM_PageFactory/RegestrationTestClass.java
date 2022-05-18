package POM_PageFactory;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class RegestrationTestClass {
	
	WebDriver driver;
	
	
	@BeforeClass
	public void setUp() {
		
		System.setProperty("webdriver.chrome.driver", "C://Users//USER//Desktop//Selenium all Jar file//chromedriver (Version 99)//chromedriver.exe");
		 driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.manage().timeouts().implicitlyWait(110, TimeUnit.SECONDS);
	}
	
	@Test
	public void RegestrationPageTest() {
		
		
		
		RegestrationPage Rp=new RegestrationPage(driver);
		Rp.clickOnSignUpLink();
		Rp.verifyRegestrationPageFbLogo();
		Rp.verifyRegestrationPageAlreadyAccount();
		Rp.verifyRegestrationPageFirstName();
		Rp.verifyRegestrationPageSurName();
		Rp.verifyRegestrationPageMobNum();
		Rp.verifyRegestrationPagepassword();
		Rp.verifyRegestrationPageBirthdate();
		Rp.verifyRegestrationPageBirthMonth();
		Rp.verifyRegestrationPageBirthYear();
		Rp.verifyRegestrationPageGender("MAle");
		Rp.verifyRegestrationPageSignUpBtn();
	}

	
	@AfterClass
	public void sestUp() {
			
	}
	
	
}
