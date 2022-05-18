
package AutomationProgramPratice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsBYCSSSelectorsPratice {
	
	public static void main(String[]args) {
		
   System.setProperty("webdriver.chrome.driver", "C://Users//USER//Desktop//Selenium all Jar file//chromedriver (Version 99)//chromedriver.exe");
   WebDriver driver=new ChromeDriver();

	driver.findElement(By.cssSelector("input#email"));
	driver.findElement(By.cssSelector("div#fullname_field"));
	
	//2.tag and class
	
	driver.findElement(By.cssSelector("div._1ixn"));
	
	//3.tag and attribute
	
	driver.findElement(By.cssSelector("img[class='fb_logo _registrationPage__fbLogo img']"));
	
	
	//4.tag,class and attribute
	driver.findElement(By.cssSelector("div.uiContextualLayerParent[id='globalContainer']"));
	
		
		
		
	}
	

}
