package OnlyPratice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class FBSIhnUpTEst{
	WebDriver driver;
	
	@BeforeClass
	public void setup() {
		System.setProperty("webdriver.chrome.driver", "C://Users//USER//Desktop//Selenium all Jar file//chromedriver (Version 99)//chromedriver.exe");
		 driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	
	
	@Test
	public void FacebookRegistrationPageTest() {
	
		POMFBSignUp rgPage= new POMFBSignUp(driver);
		rgPage.clickFacebookSignupLink();
		Assert.assertEquals(driver.getCurrentUrl(), "https://www.facebook.com/reg/");
		rgPage.verifyFacebookRegistrationPagefblogo();
		rgPage.verifyFacebookRegistrationPageAlreadyAccount();
		rgPage.setFacebookRegistrationPageFirstName();
		rgPage.setFacebookRegistrationPageLastName();
		rgPage.setFacebookRegistrationPageMobileEmail();
		rgPage.setFacebookRegistrationPagePassword();
		rgPage.setFacebookRegistrationPageBirthDay();
		rgPage.setFacebookRegistrationPageBirthMonth();
		rgPage.setFacebookRegistrationPageBirthYear();
		rgPage.setFacebookRegistrationPageGender("Male");
		rgPage.clickFacebookRegistrationPageSubmitBtn();
	
	}
	
	
	  @AfterClass 
	  public void tearDown() { 
	 // driver.quit(); 
	  }
	


	
	
	
}

