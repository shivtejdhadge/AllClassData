package POM_PageFactory;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.Reporter;

public class RegestrationPage {
	
	
	//xpayh and Verification Method
	
	//1.Declaration-by@findby
	//2.Inistilization
	//3.usage
	
	
	
	@FindBy(xpath="//img[@class='fb_logo _registrationPage__fbLogo img']") private WebElement Reg_fblogo;
	@FindBy(xpath="//a[text()='Already have an account?']") private WebElement already_acc;
	@FindBy(xpath="//a[text()='Sign Up']") private WebElement signup_link;
	@FindBy(name="firstname") private WebElement firstname;
	@FindBy(name="lastname") private WebElement surname;
	@FindBy(name="reg_email__") private WebElement mob_email;
	@FindBy(name="reg_passwd__") private WebElement password;
	@FindBy(name="birthday_day") private WebElement birthday;
	@FindBy(name="birthday_month") private WebElement birth_month;
	@FindBy(name="birthday_year") private WebElement birth_year;
	@FindBy(xpath="//input[@value='2']") private WebElement gender_male;
	@FindBy(xpath="//input[@value='1']") private WebElement gender_female;
	@FindBy(name="websubmit") private WebElement signupbtn;
	
	
	
	//2.Initialization-Using Constructor
	
	
	public RegestrationPage(WebDriver driver) {	
		PageFactory.initElements(driver, this);
	}
	
	
	
	//Use
	
	
	public void clickOnSignUpLink() {
		signup_link.click();
		Reporter.log("clickOnSignUpLink",true);
	}
	
	public void verifyRegestrationPageFbLogo() {
		Assert.assertTrue(Reg_fblogo.isDisplayed(), "Facebook Logo of RegestrationPage is Not Displayed ");
		Reporter.log("verifyRegestrationPageFbLogo",true);
	}
		
	
	
	public void verifyRegestrationPageAlreadyAccount() {
		Assert.assertTrue(already_acc.isDisplayed(),"Already have Ac is not displayed On RegestrationPage ");
		Assert.assertEquals(already_acc.getText(),"Already have an account?");
		Reporter.log("verifyRegestrationPageAlreadyAccount",true);
	
	}
	
	
	public void verifyRegestrationPageFirstName() {
		Assert.assertTrue(firstname.isEnabled(), "FirstName field is not Enabled from RegestrationPage");
		firstname.sendKeys("FirstName");
		Reporter.log("verifyRegestrationPageFirstName",true);
	}

	
	public void verifyRegestrationPageSurName() {
		Assert.assertTrue(surname.isDisplayed(), "Surname field is not displyed on RegestrationPage");
		surname.sendKeys("SurName");
		Reporter.log("verifyRegestrationPageSurName",true);
	}
	
	
	public void verifyRegestrationPageMobNum() {
		Assert.assertTrue(mob_email.isDisplayed(), "Mobno field is not displyed on RegestrationPage");
		mob_email.sendKeys("1234567890");
		Reporter.log("verifyRegestrationPageMobNum",true);
	}
	
	
	
	public void verifyRegestrationPagepassword() {
		Assert.assertTrue(password.isEnabled(), "email_Mob field is not Enabled from RegestrationPage");
		password.sendKeys("Shivtej@1234567788");
		Reporter.log("verifyRegestrationPagepassword",true);
	}
	
	
	
	
	
	public void verifyRegestrationPageBirthdate() {
		Assert.assertTrue(birthday.isDisplayed(), "Birthdate is not Displayed on RegestrationPage");
		Assert.assertFalse(birthday.isSelected(),"Birthdate is  selected from RegestarionPage");		
		Select bday=new Select(birthday);
		bday.selectByVisibleText("17");
		Reporter.log("verifyRegestrationPageBirthdate",true);
	}
		
	
	
	
	public void verifyRegestrationPageBirthMonth() {
		Assert.assertTrue(birth_month.isDisplayed(), "BirthMonth is not Displayed on RegestrationPage");
		Assert.assertFalse(birth_month.isSelected());
		
		Select bMonth=new Select(birth_month);
		bMonth.selectByVisibleText("Mar");
		Reporter.log("verifyRegestrationPageBirthMonth",true);
	}
		
	
	
	
	
	public void verifyRegestrationPageBirthYear() {
		Assert.assertTrue(birth_year.isDisplayed(),"BirthYear is not Displayed on RegestrationPage");
		Assert.assertFalse(birth_year.isSelected());
//		
		Select BYear=new Select(birth_year);
		BYear.selectByVisibleText("1997");
		Reporter.log("verifyRegestrationPageBirthYear",true);
	
	}
	
	
	public void verifyRegestrationPageGender(String gender) {
		
		if(gender.equalsIgnoreCase("male")) {
			gender_male.click();
			
		}else if(gender.equalsIgnoreCase("female")){
			gender_female.click();
			
		}
		
		Reporter.log("verifyRegestrationPageGender",true);
	
	}
	
	
	public void verifyRegestrationPageSignUpBtn() {
		
		signupbtn.click();
		
	}

}
