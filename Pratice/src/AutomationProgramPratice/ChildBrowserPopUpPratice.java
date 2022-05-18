package AutomationProgramPratice;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChildBrowserPopUpPratice {
	
	Set<String> wind;
	Iterator<String> itr;
	
	
	
	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver","C://Users//USER//Desktop//Selenium all Jar file//chromedriver (Version 99)//chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.shopify.in/");
		
		Set<String> wind = driver.getWindowHandles();
		Iterator<String> itr = wind.iterator();
		
		String firstwindow = itr.next();
		System.out.println("1St Window Title="+	driver.getTitle());
		driver.switchTo().window(firstwindow);
		
		WebElement laptop = driver.findElement(By.xpath(""));
		
		laptop.click();
		
	
		
		wind=driver.getWindowHandles();
		itr=wind.iterator();
		itr.next();
		String secondwindow = itr.next();
		
		driver.switchTo().window(secondwindow);
		
		WebElement hdfc = driver.findElement(By.xpath("//div[@id='primary-links']"));
		
		hdfc.click();
		
		
		
		
		
		
	}

}
