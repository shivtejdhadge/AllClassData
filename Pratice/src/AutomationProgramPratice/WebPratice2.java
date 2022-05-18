package AutomationProgramPratice;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebPratice2 {
	public static void main(String[] args) {
		
    //Launch
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\USER\\Desktop\\Selenium all Jar file\\chromedriver (Version 99)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
	
		//URrl
		
		//driver.get("https://www.google.com/");
		
		driver.manage().window().maximize();
		//driver.close();
		
		//navi
		
		driver.navigate().to("https://www.google.com/");
		driver.navigate().to("https://www.facebook.com/");
//		driver.navigate().back();
//		driver.navigate().forward();
//		
//		
		//dimen
//		Dimension d=new Dimension(300,700);
//		driver.manage().window().setSize(d);
//		
//		//point
//		
//		Point p=new Point (800,400);
//		driver.manage().window().setPosition(p);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
