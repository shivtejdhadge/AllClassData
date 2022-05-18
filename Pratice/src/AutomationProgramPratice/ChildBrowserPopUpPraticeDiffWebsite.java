package AutomationProgramPratice;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChildBrowserPopUpPraticeDiffWebsite {
	
	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver","C://Users//USER//Desktop//Selenium all Jar file//chromedriver (Version 99)//chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		System.out.println("+++++++++++ 1st Window ++++++++++");
		Set<String> wind = driver.getWindowHandles();
		System.out.println(driver.getTitle());
		
		
		Iterator<String> itr = wind.iterator();
		
		String fisrtwindow = itr.next();
		System.out.println(fisrtwindow);
		driver.switchTo().window(fisrtwindow);
		
		
		WebElement insta = driver.findElement(By.xpath("//a[contains(@title,'Ins')]"));
		
		
		insta.click();
		System.out.println("+++++++++++++++++++ 2nd Window+++++++++++");
		wind=driver.getWindowHandles();
		itr=wind.iterator();
		itr.next();//1st
		String secondwindow = itr.next();//2nd
		
		driver.switchTo().window(secondwindow);		
		System.out.println(secondwindow);
		System.out.println("2ndWebPageTitle==>"+driver.getTitle());
		System.out.println("2ndWebpageURL==>"+driver.getCurrentUrl());
		
		WebElement playstore = driver.findElement(By.xpath("//a[@aria-label='Get it on Google Play']"));
		
		playstore.click();
		
		wind=driver.getWindowHandles();
		itr=wind.iterator();
		
		itr.next();
		itr.next();
		String thirdwindow = itr.next();
		
		driver.switchTo().window(thirdwindow);
		
		WebElement search = driver.findElement(By.xpath("//input[@id='gbqfq']"));
		
		search.sendKeys("Whatapp for laptop");
		
		System.out.println("++++++++++++++ 3rd Window +++++++++++");
		System.out.println(thirdwindow);
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		
		System.out.println("++++++++Again 2nd Window+++++++++");
		
		driver.switchTo().window(secondwindow);
		
		WebElement applestore = driver.findElement(By.xpath("//img[starts-with(@alt,'Download')]"));
		
		applestore.click();
		
		System.out.println(secondwindow);
		
		
	}

}
