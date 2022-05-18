package ParaMeterization_CrossBrowser;

import static org.testng.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.beust.jcommander.Parameter;

public class AllBrowserTseting {
	
	
	WebDriver driver;
	
	@Parameters("browser")
		
	@Test(priority=1)
	public void CrossBrowserTesting(String browser) {
		if(browser.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver",  "C://Users//USER//Desktop//Selenium all Jar file//chromedriver (Version 99)//chromedriver.exe");
			
			 driver= new ChromeDriver();
		}else if(browser.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver","C://Users//USER//Desktop//Selenium all Jar file//geckodriver-v0.31.0-win32//geckodriver.exe");
			
			 driver= new FirefoxDriver();
			
		}else {
			System.out.println("wrong Browser Selected");
		}
		
		driver.get("https://www.facebook.com/");
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		}
	
	
		
	@Test(priority=2)
	public void verifyCurrentURL() {
	Assert.assertEquals(driver.getCurrentUrl(), "https://www.facebook.com/");
	Reporter.log("verifyCurrentURL",true);
	}
	
	
	@Test(priority=3)
	public void verifyPageTitle() {
		Assert.assertEquals(driver.getTitle(), "Facebook – log in or sign up");
		Reporter.log("verifyPageTitle",true);
		
	}
	
	
	@Test(priority=4)
	public void verifyUsernameField() {
		WebElement username = driver.findElement(By.xpath("//input[@name='email']"));
		Assert.assertTrue(username.isDisplayed());
		Assert.assertTrue(username.isEnabled());
		username.sendKeys("Shivtej");
		Reporter.log("verifyUsernameField",true);
		
		
	}
	
	
	@Test(priority=5)
	public void verifyPasswordField() {
		WebElement password = driver.findElement(By.xpath("//input[@name='pass']"));
		Assert.assertTrue(password.isDisplayed());
		Assert.assertTrue(password.isEnabled());
		password.sendKeys("Shiv@12215");
		Reporter.log("verifyPasswordField",true);
		
	}
	
	
	@Test(priority=6)
	public void clickLoginButton() {
		WebElement loginbtn = driver.findElement(By.xpath("//button[@name='login']"));
		Assert.assertTrue(loginbtn.isEnabled());
		loginbtn.click();
		Reporter.log("clickLoginButton",true);
	}
	
	
	@Test(priority=7)
		public void quiteBrowser() {
			driver.quit();
		}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}	


