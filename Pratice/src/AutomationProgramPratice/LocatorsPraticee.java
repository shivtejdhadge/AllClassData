package AutomationProgramPratice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsPraticee {
	//WebSite----IRCTC
	//1. id
	//2. name
	//3. linked text
	//4. partial link text
	//5. classname
	//6. tagname.
	
	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver","C://Users//USER//Desktop//Selenium all Jar file//chromedriver (Version 99)//chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		
		driver.get("https://www.irctc.co.in/nget/train-search");
		
		//1.id-Locators
		driver.findElement(By.id("29fb86795bb73d4"));//iframe
		
		//2.name
		driver.findElement(By.name("dateSpecific"));
		
		//3. linked text
		driver.findElement(By.linkText(" Click here to know more."));
		
		//3.partial linked text
		driver.findElement(By.partialLinkText("know more."));
		
		//5. classname
		
		driver.findElement(By.className("ng-tns-c58-8 ui-inputtext ui-widget ui-state-default ui-corner-all ui-autocomplete-input ng-star-inserted"));
		
		//6.tagName
		driver.findElement(By.tagName("button"));
	
		
		
		
		//WebSite----EPFO
		
		driver.get("https://unifiedportal-mem.epfindia.gov.in/memberinterface/");
		
		
		//1.Tag
		
		driver.findElement(By.id("icon-area"));
		
		//2.Name
			driver.findElement(By.name("userName"));
			
		//3.className
			driver.findElement(By.className("form-control"));
			
			//4.link text 
			driver.findElement(By.linkText("Forgot Password"));
			
			//5. partial lik text
			driver.findElement(By.partialLinkText("Password"));
			
			//6.tagname
			
			driver.findElement(By.tagName("button"));
			
		
		
		//3-------Amazon
			
			
			
			//1-ID
			
			driver.findElement(By.id("twotabsearchtextbox"));
			//2-class
			//driver.findElement(By.className("))
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
