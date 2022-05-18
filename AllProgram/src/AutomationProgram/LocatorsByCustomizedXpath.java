package AutomationProgram;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsByCustomizedXpath {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C://Users//USER//Desktop//Selenium all Jar file//chromedriver (Version 99)//chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		//Facebook.com
		// 1. BasicXPath
		//Format====> //tagname[@Attribute='Attribute Value']
		driver.findElement(By.xpath("//input[@data-testid='royal_email']"));
		
		
		// 2.XPath by Text()
		//Format====>//tagname[text()='Value']
		
		driver.findElement(By.xpath("//h2[text()='Facebook helps you connect and share with the people in your life.']"));
		driver.findElement(By.xpath("//a[text()='Create a Page']"));
		driver.findElement(By.xpath("//a[text()='Forgotten password?']"));
		
		
		//3.X-path with Starts-with====>When any attribute has longer attribute value we can pick up starting portion of it
		//format====>//tagname[starts-with(@attribute,'Starting value')]
		
		driver.findElement(By.xpath("//input[starts-with(@aria-label,'Email')]"));
		driver.findElement(By.xpath("//button[starts-with(@data-testid,'royal')]"));
		
		
		//3.X-path with Contains====>When any attribute has longer attribute value we can pick up any portion of it
				//format====>//tagname[contains(@attribute,'any value')]
		
		driver.findElement(By.xpath("//input[contains(@aria-label,'number')]"));
		driver.findElement(By.xpath("//a[contains(@data-testid,'form')]"));
		
		//4.X-Path with Logical Operator[and]
		//format====>//tagname[@attribute1='value' and @attribute2='value']
		//when want Exactly
		driver.findElement(By.xpath("//input[@type='text' and @name='email']"));
		driver.findElement(By.xpath("//a[@target='_blank' and @id='terms-link']"));//Term link
		
		//4.X-Path with Logical Operator[or]
		//format====>//tagname[@attribute1='value' or @attribute2='value']
		//Attribute1=Value Fix or Attribute 2=Value dynamic (Changing)
		driver.findElement(By.xpath("//input[@value='1' or @id='u_1p_4_Ji']"));
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
