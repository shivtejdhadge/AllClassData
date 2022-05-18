package AutomationProgramPratice;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActionONNextCo {
	public static void main(String[] args) {
		
	System.setProperty("webdriver.chrome.driver","C://Users//USER//Desktop//Selenium all Jar file//chromedriver (Version 99)//chromedriver.exe" );
	WebDriver driver=new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	driver.get("https://www.myntra.com/");
	//driver.manage().window().maximize();
//	driver.navigate().to("https://www.next.co.uk/");
//	driver.navigate().back();	
//	driver.navigate().refresh();
	Dimension d=new Dimension(200,300);
	driver.manage().window().setSize(d);
//	Point p=new Point(300,400);
//	driver.manage().window().setPosition(p);
	
//	WebElement search = driver.findElement(By.xpath("//input[@id='header-big-screen-search-box']"));
//	System.out.println(search.isEnabled());
//	search.sendKeys("Zebronic White Blootooth Mouse");
//	WebElement searchkey = driver.findElement(By.xpath("//img[@alt='Womens-dresses (1)']"));
//	searchkey.click();
//	
//		WebElement tag = driver.findElement(By.xpath("//img[@alt='new-in-banner-v3']"));
//		
//		System.out.println("Display-->"+tag.isDisplayed());
//		
//		String text = driver.findElement(By.xpath("//h3[@class='footer112 components__SocialTitle-sc-1h8wyu0-0 ioFgYV footer121']")).getText();
//		String atual="be In The Know";
//		
//		if(text.equalsIgnoreCase(atual)) {
//			System.out.println("Equal");
//		}else {
//			System.out.println("Not Equal");
//		}
//		
		List<WebElement> Links = driver.findElements(By.xpath("//div[@class='desktop-pSearchlinks']/a"));
		
		System.out.println("All links Size="+Links.size());
		
		
		for(int i=0;i<Links.size();i++) {
			String text = Links.get(i).getAttribute("href");
			String textl = Links.get(i).getText();
			System.out.println(i+"-->"+text+" "+textl);
		
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
