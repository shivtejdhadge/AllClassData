package AutomationProgram;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChildBrowserPopUpExamples {

	Set<String> wind;
	
	Iterator<String> itr;
	
	public static void main(String[] args) throws InterruptedException {
		
		
	System.setProperty("webdriver.chrome.driver", "C://Users//USER//Desktop//Selenium all Jar file//chromedriver (Version 99)//chromedriver.exe");	
		
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/");
		
		Set<String> wind = driver.getWindowHandles();
		
		Iterator<String> itr = wind.iterator();
		
		//System.out.println(wind);//We can USe Directly for 1st Window
		
		String firstwindow = itr.next();
		
		driver.switchTo().window(firstwindow);
		
		System.out.println("title=>"+driver.getTitle());
		System.out.println("URL"+driver.getCurrentUrl());
		
		WebElement pay = driver.findElement(By.xpath("//a[contains(@title,' Facebook Pay' )]"));
	
		pay.click();
		
		wind=driver.getWindowHandles();
		
		itr=wind.iterator();
		
		itr.next();//1st windo
		String secondwindow = itr.next();//2nd Window
		driver.switchTo().window(secondwindow);//change foucs 2nd Window and then Click
		System.out.println(secondwindow);
		System.out.println(driver.getTitle());
		WebElement Privacy = driver.findElement(By.xpath("//a[text()='Facebook Payments Privacy Policy']"));
		Privacy.click();
		
		
		wind=driver.getWindowHandles();
		itr=wind.iterator();
		itr.next();
		itr.next();
		String thirdwindow = itr.next();
		
		driver.switchTo().window(thirdwindow);
		
		WebElement login = driver.findElement(By.xpath("//input[@name='email']"));
		
		login.sendKeys("Shiv");
		
		driver.switchTo().window(secondwindow);
		
		Thread.sleep(3000);
		WebElement payw = driver.findElement(By.xpath("//a[@href='https://www.messenger.com/']"));
		payw.click();
	
	
	}

}
