package AutomationProgramPratice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActionsOnWebElementsPratice {

	public static void main(String[] args) throws InterruptedException {
		
System.setProperty("webdriver.chrome.driver","C:\\Users\\USER\\Desktop\\Selenium all Jar file\\chromedriver (Version 99)\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
		
	 driver.get("https://www.redbus.in/");	
		
		WebElement From = driver.findElement(By.xpath("//input[@id='src']"));
		
		From.sendKeys("Pune");
		Thread.sleep(2000);
		
		WebElement To = driver.findElement(By.xpath("//input[@id='dest']"));
		
		To.sendKeys("Bhopal");		
		Thread.sleep(2000);
		WebElement Date = driver.findElement(By.xpath("//input[@id='onward_cal']"));
		Date.click();
		WebElement Selectdate = driver.findElement(By.xpath("//td[text()='5']"));
		Selectdate.click();
		Thread.sleep(2000);
		WebElement Search = driver.findElement(By.xpath("//button[@id='search_btn']"));
		Search.click();
	
		
//		WebElement viewbus = driver.findElement(By.xpath("//div[@class='button view-seats fr']"));
      	Thread.sleep(2000);
//		viewbus.click();
		//WebElement Modify = driver.findElement(By.xpath("//div[starts-with(@class,'onward-modify')]"));
		//Thread.sleep(2000);
		
//		if(Modify.isEnabled()==true) {
//		  Modify.click();
//		}else {
//			System.out.println("Not Enable");
//		}
		
//		WebElement imagedisplayed = driver.findElement(By.xpath("//div[@class='fr-strts-frm']"));
//		Thread.sleep(2000);
//		System.out.println(imagedisplayed.isDisplayed());
//		
		
//		WebElement slip = driver.findElement(By.xpath("//label[text()='SLEEPER']"));
//		Thread.sleep(2000);
//		
//		
//		System.out.println(slip.isSelected());
//		
//		slip.click();
//		Thread.sleep(10000);
//		System.out.println(slip.isSelected());
//		
//		
		
//		String text= driver.findElement(By.xpath("//div[@class='fr-strts-frm']")).getText();
//		
//		String Expectedtext = "Fare Starts from INR 1300";
//		
//		if(Expectedtext.equals(text)) {
//			System.out.println("pass");
//		}else {
//			System.out.println("Fail");
//		}
		
//	 String text2 = driver.findElement(By.xpath("//div[contains(@class,'gNjOAz')]")).getText();
//		
//		
//		String Result = "All bus ratings include safety as a major factor";
//		
//		if(Result.equals(text2)) {
//			System.out.println("Both Are Equal");
//		}else {
//			System.out.println("Not Equal");
//		}
//		
//		WebElement image = driver.findElement(By.xpath("//img[@image-id='1']"));
//		
//		System.out.println(image.isDisplayed());
//		
		
//		String geta = driver.findElement(By.xpath("//img[@image-id='1']")).getAttribute("alt");
//		
//		System.out.println(geta);
//		
		
//		
//		 List<WebElement> links = driver.findElements(By.xpath("//div[@class='D109_footerLinkContainer']/section/ul/li"));
//		
//		System.out.println("Total Link Size==>"+links.size());
//     	Thread.sleep(2000);
//		for(int i=0;i<links.size();i++) {
//			String ftext=links.get(i).getText();
//			String flinks=links.get(i).getAttribute("href");
//			System.out.println(i+" "+ftext+"-->"+flinks);
//		}
	
//	List<WebElement> travelslist = driver.findElements(By.xpath("//section[@class='D159_main']/span/a"));
//	System.out.println("Total Links="+travelslist.size());
//	
//	for(int i=0;i<travelslist.size();i++) {
//		String textlink = travelslist.get(i).getText();
//		String links=travelslist.get(i).getAttribute("href");
//		System.out.println(i+"."+textlink+"-->"+links);
//	}
//	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}

}
