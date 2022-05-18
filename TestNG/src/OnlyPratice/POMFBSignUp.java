package OnlyPratice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class POMFBSignUp{
	
	
	// Declaration
		@FindBy(xpath="//img[@class='fb_logo _registrationPage__fbLogo img']") private WebElement reg_fblogo;
		@FindBy(xpath="//a[@aria-label='Already have an account?']") private WebElement already_acc;
		@FindBy(xpath="//a[@data-testid='open-registration-form-button']") private WebElement signuplink;
		@FindBy(name="firstname") private WebElement firstname;
		@FindBy(name="lastname") private WebElement surname;
		@FindBy(xpath="//input[@name='reg_email__']") private WebElement mob_email;
		@FindBy(xpath="//input[@name='reg_passwd__']") private WebElement password;
		@FindBy(name="birthday_day") private WebElement birthdate;
		@FindBy(name="birthday_month") private WebElement birthmonth;
		@FindBy(name="birthday_year") private WebElement birthyear;
		@FindBy(xpath="//input[@value='2']") private WebElement gender_male;
		@FindBy(xpath="//input[@value='1']") private WebElement gender_female;
		@FindBy(name="websubmit") private WebElement submitbtn;
		
		// Initialization
		
		public POMFBSignUp(WebDriver driver){
		PageFactory.initElements(driver, this);
		}
		
		
		// usage

		public void clickFacebookSignupLink() {
			signuplink.click();
		}
		
		public void verifyFacebookRegistrationPagefblogo() {
			Assert.assertTrue(reg_fblogo.isDisplayed(), "Facebook Logo is Not displayed on Regestration Page");
		}
		
		public void verifyFacebookRegistrationPageAlreadyAccount() {
			Assert.assertTrue(already_acc.isDisplayed(), "Already having an account is not displayed");
			Assert.assertEquals(already_acc.getText(), "Already have an account?");
		}
		
		
		
		public void setFacebookRegistrationPageFirstName() {
			firstname.sendKeys("ABC");
		}
		
		
		public void setFacebookRegistrationPageLastName() {
			surname.sendKeys("XYZ");
		}
		
		public void setFacebookRegistrationPageMobileEmail() {
			mob_email.sendKeys("123456789");
		}
		
		public void setFacebookRegistrationPagePassword() {
			password.sendKeys("Abc@123456789");
		}
		
		public void setFacebookRegistrationPageBirthDay() {
			
			Select bday = new Select(birthdate);
			Assert.assertTrue(birthdate.isDisplayed());
			Assert.assertFalse(birthdate.isSelected());
			bday.selectByVisibleText("19");
		}
		
		public void setFacebookRegistrationPageBirthMonth() {
			
			Select month = new Select(birthmonth);
			month.selectByVisibleText("Mar");
			Assert.assertEquals(month.getFirstSelectedOption().getText(), "Mar");
		}
		
		public void setFacebookRegistrationPageBirthYear() {
			Select year = new Select(birthyear);
			year.selectByVisibleText("1974");
		}
		
		public void setFacebookRegistrationPageGender( String gender) {
			if(gender.equalsIgnoreCase("male")) {
				gender_male.click();
			}else if(gender.equalsIgnoreCase("female")) {
				gender_female.click();
			}
		}
		
		public void clickFacebookRegistrationPageSubmitBtn() {
			submitbtn.click();
		}
		
		
	}


