package AutomationProgram;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class LocatorsBasics {
	public static void main(String[] args) {
		// basic level locators:-facebook.
		//1. id
		//2. name
		//3. linked text
		//4. partial link text
		//5. classname
		//6. tagname.
		
		// Xpaths.
				//1. Absolute
				//2. Relative xpath.


		
		System.setProperty("webdriver.chrome.driver","C://Users//USER//Desktop//Selenium all Jar file//chromedriver (Version 99)//chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		
		
		driver.get("https://www.facebook.com/");
		
		//1. id
		//driver.findElement(By.id("id value from the  website"));
		
		driver.findElement(By.id("email"));// user name id value
		driver.findElement(By.id("pass"));// Password id 
		
		//2. name
		//driver.findElement(By.name("the value for the name attribute"));
		
		driver.findElement(By.name("pass"));//Pass Name 
		
		driver.findElement(By.name("email"));//User Name
		
		//3. linked text. (links==> a)
		//driver.findElement(By.linkText("full link text data"));
		
		driver.findElement(By.linkText("Forgotten password?"));//link text full name
		
		//4. partial link text.  (links=> a)

		driver.findElement(By.partialLinkText("password?"));//Partial name
		
		
		//5. classname
		//driver.findElement(By.className("the value for  the attribute  class from the  website"));
		driver.findElement(By.name("inputtext _55r1 _6luy _9npi"));//Pasword class name
		
	    driver.findElement(By.name("inputtext _55r1 _6luy"));//username class name
	 
	  //6.tagname (when find out multiple elements with a common tag or the unique element available on webpage)
		//only for button
	  //driver.findElement(By.tagName("tag name from the website"));
	    
	    driver.findElement(By.tagName("button"));//only for button
	    
	    
	 // Xpaths.
	  //1. Absolute-start from single slash-/
	   //one step down-Step by step
	    
	   driver.findElement(By.xpath("html/body/div[3]/a[2]")); 
	    driver.findElement(By.xpath("html/body/div[2]/input 2"));
	
	
	    // Xpaths.-Not follow in cpny 
		  //2. Relative-start from Double slash-// always
		   //directly to div
	    driver.findElement(By.xpath("//div[3]/a[2]"));
		    
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}
	
	
	

}
