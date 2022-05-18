package March27SundayPratice;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Automation {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C://Users//USER//Desktop//Selenium all Jar file//chromedriver (Version 99)//chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		//driver.get("https://www.google.co.jp/");
//		
//		String s=driver.getCurrentUrl();
//		System.out.println(s);
//		String t=driver.getTitle();
//		System.out.println(t);
		
		driver.navigate().to("https://www.google.co.jp/");
//		driver.navigate().to("https://www.bing.com/");
//		//driver.quit();
//		driver.navigate().back();
//		driver.navigate().forward();
		
		//driver.manage().window().maximize();
		
		
//		Dimension d=new Dimension(300,400); 
//		driver.manage().window().setSize(d);
		
//		Point p=new Point(500,900);
//		driver.manage().window().setPosition(p);
//		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
