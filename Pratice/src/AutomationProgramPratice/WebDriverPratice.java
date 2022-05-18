package AutomationProgramPratice;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverPratice {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\USER\\Desktop\\Selenium all Jar file\\chromedriver (Version 99)\\chromedriver.exe");
          
		WebDriver d=new ChromeDriver();
		
		
	d.navigate().to("https://www.google.com/");
//	d.navigate().to("https://www.facebook.com/");
//	d.navigate().back();
	

String title =	d.getTitle();
System.out.println(title);
		
String url=d.getCurrentUrl();
System.out.println(url);

//Dimension di=new Dimension(300,400);
//d.manage().window().setSize(di);
//		
   d.manage().window().maximize();
//	Point p=new Point(400,700);
//	d.manage().window().setPosition(p);
	//d.quit();

//d.navigate().to("https://in.bookmyshow.com/explore/movies-pune");
//d.navigate().to("https://www.google.com/search?gs_ssp=eJzj4tVP1zc0zDIzqjI2qCpQYDRgdGDw4igszczJScovAQBxLwgo&q=quillbot&oq=qui&aqs=chrome.1.69i57j46i131i199i433i465i512j46i199i291i433i512j46i199i433i465i512j0i131i433i512j0i433i512j46i199i433i465i512j0i433i512j0i131i433i512.6610j0j7&sourceid=chrome&ie=UTF-8");
//	d.navigate().back();
//	d.navigate().forward();	
   d.navigate().refresh();
   
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
