package AutomationProgramPratice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitsPratice {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C://Users//USER//Desktop//Selenium all Jar file//chromedriver (Version 99)//chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.orangehrm.com/");
		//driver.get("https://www.cbssports.com/");
		//WebElement img = driver.findElement(By.xpath("//div[@id='click_through']"));
//		
//		WebDriverWait  wait= new WebDriverWait(driver, 30);
//		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[@class='narrow-icon icon-item icon-moon-nav-watch']"))).click();
	
//		WebElement signup = driver.findElement(By.xpath("//a[@class='button--base button--primary button--inverse outbound-link']"));
//		
//		signup.click();		
		
		
		
		
		WebElement bft = driver.findElement(By.xpath("//a[@class='btn-orange trial-btn pulse ']"));
		
		bft.click();
		
//		WebElement name = driver.findElement(By.xpath("//input[@name='FirstName']"));
//		
//		name.sendKeys("Shivtej");
//		
//		WebElement lastname = driver.findElement(By.xpath("//input[@name='LastName']"));
//		
//		lastname.sendKeys("Dhadge");
//		
//WebElement email = driver.findElement(By.xpath("//input[@name='Email']"));
//		
//		email.sendKeys("shivtejDhadge95@gmail.com");
//		
//		
//WebElement mobileno = driver.findElement(By.xpath("//input[@name='Contact']"));
//		
//mobileno.sendKeys("9975609899");
//		
		
        WebElement country = driver.findElement(By.xpath("//select[@name='Country']"));
		
		Select s=new Select(country);
		String d=s.getFirstSelectedOption().getText();
		System.out.println("links"+d);
		List<WebElement> get = s.getOptions();
		
		System.out.println(get.size());
		
		
//		List<WebElement> links = driver.findElements(By.xpath("//div[@class='col-xs-12 col-sm-6 col-md-3']/ul/li"));
//		
//		for(int i=0;i<links.size();i++) {
//			String sA=links.get(i).getText();
//			String dg=links.get(i).getAttribute("href");
//			System.out.println(sA+dg);
//		}
//		
		
		
		
		
		
			
		}
		
	}


