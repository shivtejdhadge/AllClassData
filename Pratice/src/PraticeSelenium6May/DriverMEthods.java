package PraticeSelenium6May;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverMEthods {
	
	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\USER\\Desktop\\Selenium all Jar file\\chromedriver (Version 99)\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		
		
		
		

		driver.getTitle();
		driver.getCurrentUrl();

		driver.manage().window().maximize();
		driver.navigate().to("https://www.facebook.com/");
		driver.navigate().forward();
		driver.navigate().back();
		driver.navigate().refresh();

Dimension d=new Dimension(100,200);

driver.manage().window().setSize(d);

Point p=new Point(50,100);

driver.manage().window().setPosition(p);



		
		
		
		
		
		
		
		
		
		
		
	}

}
