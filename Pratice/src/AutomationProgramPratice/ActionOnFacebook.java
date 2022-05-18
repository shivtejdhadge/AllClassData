package AutomationProgramPratice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ActionOnFacebook {
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C://Users//USER//Desktop//Selenium all Jar file//chromedriver (Version 99)//chromedriver.exe");
		
		
		WebDriver driver=new ChromeDriver();
		
		
		driver.get("https://www.facebook.com/");		
		//Thread.sleep(2000);
		WebElement createnewac = driver.findElement(By.xpath("//a[text()='Create New Account']"));
		
		createnewac.click();
		Thread.sleep(2000);
//		WebElement firstname = driver.findElement(By.xpath("//input[@name='firstname']"));
//		if(firstname.isEnabled()){
//			firstname.sendKeys("Shivtej");
//			System.out.println(" Enable");
//		}else {
//			System.out.println("Not Enable");
//		}
//		
		//Thread.sleep(2000);
		
		//gettext
		
//		String Gettext = driver.findElement(By.xpath("//div[@class='_52lr fsm fwn fcg']")).getText();
//		String actualtext="It's quick and easy.";
//
//		if(Gettext.equals(actualtext)) {
//			System.out.println("Is Equal");
//		}else {
//			System.out.println("Not Equal");
//		}
		
		//is Displayed
//		
//		WebElement fblogo = driver.findElement(By.xpath("//img[@class='fb_logo _8ilh img']"));
//		
//		System.out.println(fblogo.isDisplayed());
//		
//		
		//is slect
	//WebElement Custum = driver.findElement(By.xpath("//input[@value='1']"));
//		
//		System.out.println("Is Selctected==>"+Custum.isSelected());	
//		Custum.click();		
//		System.out.println("Is Selctected==>"+Custum.isSelected());
//		
		
		
		//atrribute
		
//		 String Custum = driver.findElement(By.xpath("//input[@value='1']")).getAttribute("type");
//		
//		System.out.println(Custum);
//		
//		
		//multiple
		
//		 List<WebElement> multiple = driver.findElements(By.xpath("//ul[@class='uiList pageFooterLinkList _509- _4ki _703 _6-i']/li/a"));
//		
//	     // driver.findElement(By.xpath("//a[text()='Sign Up']")).getText();
//		
//		 System.out.println(multiple.size());
//		
//		for(int i=0;i<multiple.size();i++) {
//		 String text =multiple.get(i).getText();
//		 String links=multiple.get(i).getAttribute("href");
//		 System.out.println(i+"."+text+"-->"+links);
//		}
//		
	
		////
		WebElement Dateofbirth = driver.findElement(By.xpath("//select[@name='birthday_day']"));
		
		Select s=new Select(Dateofbirth);
		
		s.selectByIndex(6);
		
		WebElement Month = driver.findElement(By.xpath("//select[@name='birthday_month']"));
		
		Select m=new Select(Month);
		
		m.selectByVisibleText("May");
		//m.selectByValue("5");
//		
		
		WebElement Year = driver.findElement(By.xpath("//select[@name='birthday_year']"));
		Select y=new Select(Year);
		
		y.selectByVisibleText("1995");
		
	String first = y.getFirstSelectedOption().getText();
		
		System.out.println(first);
		
		
		
		
		
		
		
		
		
		
	}

}
