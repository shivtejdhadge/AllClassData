package AutomationProgramPratice;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActionOnNaukri {
	
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C://Users//USER//Desktop//Selenium all Jar file//chromedriver (Version 99)//chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.naukri.com/registration/createAccount?othersrcp=22636");		
		
		//Thread.sleep(2000);
		
		//driver.manage().window().maximize();
		
//		System.out.println("URL-->"+driver.getCurrentUrl());
//		System.out.println("Title-->"+driver.getTitle());
//		driver.navigate().to("https://www.facebook.com/");
//		Thread.sleep(2000);
//		driver.navigate().back();
//		Thread.sleep(2000);
//		driver.navigate().forward();
//		
		Dimension d=new Dimension(300,400);
		driver.manage().window().setSize(d);
		
//		
//		Point p=new Point(400,500);
//		driver.manage().window().setPosition(p);
//		
		
//		Thread.sleep(2000);
//		WebElement Name = driver.findElement(By.cssSelector("input#name"));
//		//we can use css selector any
//		Name.sendKeys("Shivtej");
//		
//		Thread.sleep(2000);
//		WebElement Email = driver.findElement(By.cssSelector("input[id='email']"));
//		Email.sendKeys("Shivtej@gmail.com");
//		
		Thread.sleep(2000);
//		WebElement mobile = driver.findElement(By.xpath("//input[@type='text' and @placeholder='Mobile Number']"));
//		
//		mobile.sendKeys("1234");
//		
		
//		
//		WebElement pass = driver.findElement(By.xpath("//input[@id='password 'or @type='password']"));
//		
//		if(pass.isEnabled()==true) {
//			pass.sendKeys("sdfg");
//			System.out.println("Enable");
//		}else {
//			System.out.println("not Enable");
//		}
		
		
		
//		
//		WebElement exp = driver.findElement(By.xpath("//i[@class='main-6 resman-icon resman-icon-briefcase']"));
//		System.out.println(exp.isSelected());
//		exp.click();
//		
		
//		WebElement click = driver.findElement(By.xpath("//span[@class='chk-label']"));
//		System.out.println(click.isSelected());
//		click.click();
//		System.out.println(click.isSelected());
		
		
		//is enable
		
		//diapslky
//		
//		WebElement disply = driver.findElement(By.xpath("//h1[@class='global-title-1']"));
//		
//		System.out.println(disply.isDisplayed());
//	
//		
		
		
//		String text = driver.findElement(By.xpath("//h1[@class='global-title-1']")).getText();
//		
//		String atcual="Find a Job & grow your career";
//		
//		if(atcual.equalsIgnoreCase(text)) {
//			System.out.println("Same");
//		}else {
//			System.out.println("Not Same");
//		}
		
		
		
		
		
		String geta = driver.findElement(By.xpath("//h1[text()='Find a job & grow your career']")).getAttribute("class");
		
		
		System.out.println(geta);
		
		
		
		
		
		
		
		
	}

}
