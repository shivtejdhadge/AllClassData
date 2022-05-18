package PraticeSelenium6May;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebElementMethods {

	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\USER\\Desktop\\Selenium all Jar file\\chromedriver (Version 99)\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/");
		
	//	Object login = driver.findElement(by.id="email");
//		WebElement login = driver.findElement(By.id("email"));
//
//		login.sendKeys("shivtej");
//		
//
//		WebElement pass=driver.findElement(By.id("pass"));
		
		
		
//		WebElement name=driver.findElement(By.xpath("//div[@class='_8ice']/img"));
//		
//		
//		System.out.println(name.isDisplayed());
		
//WebElement cr = driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']"));
//cr.click();

//WebElement sselect=driver.findElement(By.xpath("//label[@for='u_15_4_b+']]"));
//WebElement select = driver.findElement(By.xpath("//label[text()='Female']"));
//
//System.out.println(select.isEnabled());
//
//		
//		int count=0;
//
//		List<WebElement> links = driver.findElements(By.xpath("//ul[@class='uiList pageFooterLinkList _509- _4ki _703 _6-i']/li/a"));
//		for(int i=0;i<links.size();i++){
//			count++;
//		String link=links.get(i).getText();
//		String att=links.get(i).getAttribute("title");
//		System.out.println(count+"."+link+"===>"+att);
//}	
//		
//	}
//
//}
//
//		WebDriverWait wait=new WebDriverWait(driver,30);
//		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("")));
//		
		
		
		
	}
}
		