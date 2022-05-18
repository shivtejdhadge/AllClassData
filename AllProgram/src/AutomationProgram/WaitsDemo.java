package AutomationProgram;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitsDemo {
     //it will go forward when element find not stop for total 10 sec
	//wait-wait command stop execution for some time for load elemet
	//1.implicit-Its wait directly to webdriver to stop execution
	//-applicable for all elements.
	//2.explicit-its wait only specific elememt those who naturally take a time for loading.
	//3.fluent-it will how frequently webdriver wiil check if condition appear befoure throwlinw  
	//not use in Company
	
	public static void main(String[] args) {
		
	System.setProperty("webdriver.chrome.driver", "C://Users//USER//Desktop//Selenium all Jar file//chromedriver (Version 99)//chromedriver.exe");
		
	WebDriver driver=new ChromeDriver();
	
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/");
		
		
//		
//		WebDriverWait wait=new WebDriverWait(driver, 20);
//		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@class='_8esh']"))).click();
		
		
		
		
//		WebElement Createpage = driver.findElement(By.xpath("//a[@class='_8esh']"));
//		
//		Createpage.click();
//		
		
	
//		WebElement Email = driver.findElement(By.xpath("//input[@id='email']"));
//		
//		Email.sendKeys("Shivtej");
		
		
//		WebElement signup = driver.findElement(By.xpath("//a[@tabindex='4']"));
//		
//		signup.click();
		
//		WebElement forgot=driver.findElement(By.xpath("//a[text()='Forgotten account?']"));
//		forgot.click();
//		
		
		//Fluent
		
//		Wait wait=new FluentWait(
//				);
//		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
}
