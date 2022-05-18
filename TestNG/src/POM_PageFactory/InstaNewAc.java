	package POM_PageFactory;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.Reporter;

public class InstaNewAc {
	
	
	//dec
	//ini
	//use
	
	
	
	@FindBy(xpath="//img[@class='s4Iyt']") private WebElement insta_logo;
	@FindBy(xpath="//h2[text()='Sign up to see photos and videos from your friends.']") private WebElement signup_text;
	@FindBy(xpath="//p[text()='Have an account? ']") private WebElement already_ac;
	@FindBy(xpath="//button[@type='button']") private WebElement login_withFb;
	@FindBy(name="emailOrPhone") private WebElement mobile_no;
	@FindBy(name="fullName") private WebElement full_name;
	@FindBy(name="username") private WebElement username;
	@FindBy(name="password") private WebElement password;
	@FindBy(xpath="//a[text()='Log in']") private WebElement already_ac_login;
	@FindBy(xpath="//button[text()='Sign up']") private WebElement sign_up;
	@FindBys({@FindBy(xpath="//footer[@class='Zx5PI  burfB vfoLd ']/div/div/div/div")}) private List<WebElement> footerlink;
	@FindBy(xpath="//div[text()='About']") private WebElement About;
	
			
	//Initialization
	
	public InstaNewAc(WebDriver driver) {
		PageFactory.initElements(driver, this);
		
	}
	
	
	
	//use
	
	public void verifyInstaNewAcInstaLogo() {
		
		Assert.assertTrue(insta_logo.isDisplayed(), "Insta Logo not Displyed on InstaNewAc");
		Reporter.log("verifyInstaNewAcInstaLogo",true);
		
	}
	
	public void verifyInstaNewAcSignupText() {
		Assert.assertEquals(signup_text.getText(),"Sign up to see photos and videos from your friends.");
		Reporter.log("verifyInstaNewAcSignupText",true);
	}
	
	
	public void verifyInstaNewAcAlreadyAcText() {
		Assert.assertEquals(already_ac.getText(), "Have an account? Log in");
		Reporter.log("verifyInstaNewAcAlreadyAcText",true);
		
	}
	
	
	
	public void verifyInstaNewAcLogInWithFBLink() {
		Assert.assertTrue(login_withFb.isDisplayed(), "Login With Fb is not Displyed on InstaNewAc");
		Reporter.log("verifyInstaNewAcLogInWithFBLink",true);
	}
	
	
	public void verifyInstaNewAcMobNo() {
		Assert.assertTrue(mobile_no.isDisplayed(),  "Mobile No is not Displyed on InstaNewAc");
		mobile_no.sendKeys("1234567890");
		Reporter.log("verifyInstaNewAcMobNo",true);
	}
	
	public void verifyInstaNewAcFullNAme() {
		Assert.assertTrue(full_name.isDisplayed(),  "Full Name is not Displyed on InstaNewAc");
		full_name.sendKeys("FullName");
		Reporter.log("verifyInstaNewAcFullNAme",true);;
	}
	
	public void verifyInstaNewAcUserName() {
		Assert.assertTrue(username.isDisplayed(),  "UserName is not Displyed on InstaNewAc");
		username.sendKeys("UserName");
		Reporter.log("verifyInstaNewAcUserName",true);
	}
	
	public void verifyInstaNewAcPassword() {
		Assert.assertTrue(password.isDisplayed(), "NewAcPassword is not Displyed on InstaNewAc");
		password.sendKeys("Password1243");
		Reporter.log("verifyInstaNewAcPassword",true);
	}
	

	
	public void verifyInstaNewAcAlreadyAcLink() {
		Assert.assertTrue(already_ac_login.isDisplayed(),"Already HAve AC is not Displyed on InstaNewAc");	
		Reporter.log("verifyInstaNewAcAlreadyAcLink",true);
		
	}
	
	 
	public void verifyInstaNewAcSignUpLink() {
		Assert.assertTrue(sign_up.isDisplayed(), "Sign_up  is not Displyed on InstaNewAc");
		Reporter.log("verifyInstaNewAcSignUpLink",true);
	}
	
	
	public void verifyInstaNewAcAllFooterLinks() {
	//	Assert.assertEquals(Footer_Links.getSize(),Footer_Links.getSize()>10);
		for(int i=0;i<footerlink.size();i++) {
			String link=footerlink.get(i).getText();
			System.out.println(link);
			
		}
		Reporter.log("verifyInstaNewAcAllFooterLinks",true);
		
	}
	
	public void verifyInstaNewAcaboutclick() {
		About.click();
	}
	

}
