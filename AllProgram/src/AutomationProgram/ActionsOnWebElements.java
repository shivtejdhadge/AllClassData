package AutomationProgram;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import net.bytebuddy.implementation.bytecode.Throw;

public class ActionsOnWebElements {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver",  "C://Users//USER//Desktop//Selenium all Jar file//chromedriver (Version 99)//chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		Thread.sleep(2000);//time for next action
		
		//Perform Action On webElement
		
		//1.send key()  ==> pass data in text filed
		
		
		
		WebElement username=driver.findElement(By.xpath("//input[@data-testid='royal_email']"));
		
		username.sendKeys("9975609899");
		
		WebElement password=driver.findElement(By.xpath("//input[@name='pass']"));
		
		password.sendKeys("Shivtej@9899");
		
		//2.click==> click on tab
		
		
		driver.navigate().refresh();
		try {
		username.sendKeys("9975609899");
		password.sendKeys("Shivtej@9899");
		}catch(Exception e){
			username=driver.findElement(By.xpath("//input[@data-testid='royal_email']"));
			
			username.sendKeys("9975609899");
			
			 password=driver.findElement(By.xpath("//input[@name='pass']"));
			
			password.sendKeys("Shivtej@9899");
		}
			
		
		
//		WebElement Login = driver.findElement(By.xpath("//button[@name='login']"));
//		
//		Login.click();
//		
//		WebElement CreateNewAccount = driver.findElement(By.xpath("//a[starts-with(@rel,'async')]"));
//		
//		CreateNewAccount.click();
////		
//		Thread.sleep(2000);
//		
//		WebElement Female = driver.findElement(By.xpath("//label[text()='Female']"));
//		
//		Female.click();
//		
		
		 //3.isEnable()==> check is element are Enable Or Disabl
		
		
		
		//WebElement username=driver.findElement(By.xpath("//input[@data-testid='royal_email']"));
	
//		if(username.isEnabled()==true) {
//			username.sendKeys("Enable");
//		}else{
//			System.out.println("Username Element is Disable");
//		}
		
		
//		
//		WebElement custom = driver.findElement(By.xpath("//label[text()='Custom']"));
//		custom.click();
//		Thread.sleep(2000);
//		WebElement Selectyourpronoun= driver.findElement(By.xpath("//select[@aria-label='Select your pronoun']"));
//		Selectyourpronoun.click();
//		Thread.sleep(2000);
//		WebElement selecthim = driver.findElement(By.xpath("//option[text()='He: \"Wish him a happy birthday!\"']"));
//		selecthim.click();
//		Thread.sleep(2000);
//		WebElement Signup = driver.findElement(By.xpath("//button[@name='websubmit']"));
//		Signup.click();
//		
		
		//For Cheking Element Enable Or Not
//		if(Selectyourpronoun.isEnabled()==true) {
//			System.out.println("Enable");
//		}else {
//			System.out.println("Disable");
//		}
		
		
		//4.is displayed==>Check img or Text display or not		
		//Boolean Type
		
		
		
		
//		WebElement FBLogo = driver.findElement(By.xpath("//img[starts-with(@class,'fb_logo')]"));
//		
//		if(FBLogo.isDisplayed()==true) {
//			System.out.println("FB logo Displayed");
//		}else{
//			System.out.println("FB logo NotDisplayed");
//		}
//		
//		WebElement fbtagline = driver.findElement(By.xpath("//h2[contains(text(),'connect ')]"));
//		if(fbtagline.isDisplayed()==true) {
//			System.out.println("FBtagline is available");
//		}else {
//			System.out.println("FBtagline is Notavailable");
//		}
//		
		
		
		
	//5.Is Selected ===> Checkbox/Radiobutton Select or Not Cross check
	// Boolan Output	
		
//		WebElement CreateNewAccount = driver.findElement(By.xpath("//a[starts-with(@rel,'async')]"));
//	    CreateNewAccount.click();
//		Thread.sleep(2000);
//		WebElement Female = driver.findElement(By.xpath("//input[@value='1']"));
//		System.out.println("Female Botton Selected="+Female.isSelected());
//	     Female.click();
//	 //	Thread.sleep(3000);
//	     System.out.println("Female Botton Selected=="+Female.isSelected());
		
		
		
		//6.get text() :- to get the text of any element. (for single)
		
//		String actualText = driver.findElement(By.xpath("//a[@title='Sign up for Facebook']")).getText();
//		String expecttext="Sign Up";
//		
//		if(actualText.equals(expecttext)) {
//			System.out.println("Test Case pass for sign up text verification");
//		}else {
//			System.out.println("Test Case Fail for sign up text verification");
//		}
	
		
		//7. get attribute.
//		
//		String GetAttributelink = driver.findElement(By.xpath("//a[contains(@title,'Watch')]")).getAttribute("href");
//		
//		System.out.println("Link==="+GetAttributelink);
		
		
		
		
		//8. multiple elements.
		
		
//		 List<WebElement> Multiple = driver.findElements(By.xpath("//ul[starts-with(@class,'uiList p')]/li/a"));
//		
//		System.out.println("Total Footer Links Availabel==>"+Multiple.size());
//		
//		for(int i=0;i<Multiple.size();i++) {
//			String Links = Multiple.get(i).getAttribute("href");
//			String Text = Multiple.get(i).getText();
//			System.out.println(i+".="+Text+"===>"+Links);
//		}
//		
		
		
		
           //9.ListBoxDropDown
		
//		
//		WebElement Birthdate = driver.findElement(By.xpath("//select[@name='birthday_day']"));
//		
//		
//		Select s=new Select(Birthdate);
		
//		//s.selectByIndex(6);
//		
//		//s.selectByValue("7");
//		//s.selectByVisibleText("7");
//	
//		List<WebElement> alldates = s.getOptions();
//		
//		System.out.println("All Dates=>"+alldates.size());
//		int j=1;
//		for(WebElement adv:alldates) {
//			System.out.println(j+"==>"+adv.getText());
//			j++;
//		}
//		
		
//	System.out.println("******************Year********************");
//	    Thread.sleep(2000);
//		WebElement Year = driver.findElement(By.xpath("//select[@name='birthday_year']"));
//		
//		Select s1=new Select(Year);
//		
//		List<WebElement> years = s1.getOptions();
//		System.out.println();
//		System.out.println("All YEars==>"+years.size());
////		
//		for(int i=0;i<years.size();i++) {
//			String pyears = years.get(i).getText();
//			System.out.println(i+" "+pyears);
//		}
//		
		
//		String first = s1.getFirstSelectedOption().getText();
//		System.out.println("Default Option==>"+first);
//		
//		
//		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
