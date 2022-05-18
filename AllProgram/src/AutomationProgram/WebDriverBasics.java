package AutomationProgram;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;


//1.how to launch browser 
//2.how to opne url
//3.how to close the browser
//4.how to quite the browser
//5.how to get current url
//6.how to get title of the page
//7.how to maximize the browser
//8.how to navigate diff page
//9.how to set size of the browser
//10.how to set the position of the browser
public class WebDriverBasics {
	
	public static void main(String[] args) throws InterruptedException{
		
		//1.how to launch browser 
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\USER\\Desktop\\Selenium all Jar file\\chromedriver (Version 99)\\chromedriver.exe");
		
		RemoteWebDriver driver=new ChromeDriver();
		
		//2.how to opne url
		driver.get("https://www.facebook.com/");
    //	driver.get("https://www.flipkart.com/");
		//driver.get("https://web.whatsapp.com/");
		//driver.get("https://www.google.com/");
		
		
		//3.how to close the browser
		//driver.close();
		
		//4.how to quite the browser
		
		//driver.quit();
		
		//5.how to get current url
//		String currenturl=driver.getCurrentUrl();
//		System.out.println("Current URL="+currenturl);
		
		
		//6.how to get title of the page
//		String title= driver.getTitle();
//		System.out.println("Title of WebPage="+title);
//		
		
		
		//7.how to maximize the browser
		//not support minimize the browser
		
		//driver.manage().window().maximize();
		
		
		//8.how to navigate diff page
		
		//driver.navigate().to("https://www.google.com/");
//		driver.navigate().to("https://www.facebook.com/");
//		driver.navigate().back();
//		driver.navigate().forward();
//		
		
		//9.how to set size of the browser
//		
//		Dimension d=new Dimension(400,400);
//		
//		driver.manage().window().setSize(d);
//		
		
		//10.how to set the position of the browser
//		
//		Point p=new Point(800,400);
//		
//		driver.manage().window().setPosition(p);
//		
//		
		
		
		
		
		
		
		
	}
	
	
	
	
	

}
