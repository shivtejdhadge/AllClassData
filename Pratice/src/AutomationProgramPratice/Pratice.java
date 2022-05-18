package AutomationProgramPratice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Pratice {
	public static void main(String[]args) {
		
		
		System.setProperty("webdriver.chrome.driver", "C://Users//USER//Desktop//Selenium all Jar file//chromedriver (Version 99)//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
	    driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://neostox.com/");
		
		WebElement signup = driver.findElement(By.xpath("//a[@id='ctl00_lnk_getstarted']"));
		
		signup.click();
		
		
		WebElement Name = driver.findElement(By.xpath("//input[@id='ctl00_ContentPlaceHolder1_txt_firstname']"));
		
		Name.sendKeys("sHIVTEJ");
		
		WebElement Sirname = driver.findElement(By.xpath("//input[@id='ctl00_ContentPlaceHolder1_txt_lastname']"));
		
		Sirname.sendKeys("Dhadge");
		
	}
	
	
	
	
	
	

}
