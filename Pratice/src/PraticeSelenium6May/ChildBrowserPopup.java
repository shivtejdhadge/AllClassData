package PraticeSelenium6May;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChildBrowserPopup {
	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\USER\\Desktop\\Selenium all Jar file\\chromedriver (Version 99)\\chromedriver.exe");
			
			WebDriver driver=new ChromeDriver();
	

			driver.get("https://www.facebook.com/");

			driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);

			WebElement pay=driver.findElement(By.xpath("//a[text()='Facebook Pay']"));
			pay.click();

			Set<String> id=driver.getWindowHandles();
			Iterator<String>itr=id.iterator();
			itr.next();
			String second=itr.next();
			
			driver.switchTo().window(second);
			System.out.println(second);
			Thread.sleep(5000);
			WebElement privacy=driver.findElement(By.xpath("//a[text()='Facebook Community Payments Terms']"));
			privacy.click();
			
}
}