package PraticeSelenium6May;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChildBrowserP {
	public static void main(String[] args) throws InterruptedException {
		
	
	System.setProperty("webdriver.chrome.driver","C://Users//USER//Desktop//Selenium all Jar file//chromedriver (Version 99)//chromedriver.exe");	
	
	WebDriver driver=new ChromeDriver();
	//driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	driver.get("https://www.facebook.com/");
	
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	WebElement pay=driver.findElement(By.xpath("//a[@href='https://pay.facebook.com/']"));
	pay.click();

	Set<String> id=driver.getWindowHandles();
		Iterator<String> itr = id.iterator();
	
	itr.next();
	String secondWindow=itr.next();

	driver.switchTo().window(secondWindow);

	System.out.println(secondWindow);
	Thread.sleep(3000);
	WebElement data=driver.findElement(By.xpath("//a[@href='https://www.facebook.com/payments_terms']"));

	data.click();

}
}