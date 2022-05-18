package AutomationProgramPratice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActionsOnWebElementsAmazon {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\USER\\Desktop\\Selenium all Jar file\\chromedriver (Version 99)\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.amazon.in/");
		//sendkey And Click
		
//		WebElement Serach = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
//		
//		Serach.sendKeys("Zebronics Blootooth Mouse white");
//		WebElement Sbutton = driver.findElement(By.xpath("//input[contains(@id,'submit')]"));
//		
//		Sbutton.click();
//		Thread.sleep(2000);	
//		
		//Is Enable\
		
//WebElement Mouse = driver.findElement(By.xpath("//span[text()='Zebronics Zeb-Shine Wireless Mouse(White)']"));
//		
//		System.out.println(Mouse.isEnabled());
//		
		
		//-----------Is displayed
		
//		WebElement MouseImage = driver.findElement(By.xpath("//img[@src='https://m.media-amazon.com/images/I/71p+Teo-qBL._AC_UY218_.jpg']"));
//
//		System.out.println(MouseImage.isDisplayed());
//		
		
		//---------is selected
		
//		Thread.sleep(2000);	
//WebElement language = driver.findElement(By.xpath("//span[@class='icp-nav-flag icp-nav-flag-in']"));
//		
//		
//language.click();
//Thread.sleep(2000);	
//WebElement selectl = driver.findElement(By.xpath("//span[text()='MR']"));
//
//        //Thread.sleep(2000);	
//		System.out.println("Is Select"+selectl.isSelected());
//		
//		selectl.click();
//		// Thread.sleep(7000);	
//		System.out.println("Is Select"+selectl.isSelected());
//		
		
		
		//---------Get TExt
		
		
//		String text = driver.findElement(By.xpath("//span[@id='glow-ingress-line2']")).getText();
//		
//		System.out.println(text);
//		
//		//-------Get Attributeee
//		String att = driver.findElement(By.xpath("//span[@id='glow-ingress-line2']")).getAttribute("class");
//		
//		System.out.println(att);
		
		
		
		List<WebElement> Flinks = driver.findElements(By.xpath("//div[@class='navFooterVerticalRow navAccessibility']//div/ul/li/a"));
		
		System.out.println("Total Size==>"+Flinks.size());
		Thread.sleep(2000);	
		for(int i=0;i<Flinks.size();i++) {
			String ftext = Flinks.get(i).getText();
			String link = Flinks.get(i).getAttribute("href");
			//String fclass = Flinks.get(i).getAttribute("class");
			System.out.println(i+"."+ftext+"----->"+link);
		}
		
		
		
		
		
		
		
	}

}
