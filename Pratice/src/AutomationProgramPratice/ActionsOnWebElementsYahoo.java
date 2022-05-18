package AutomationProgramPratice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ActionsOnWebElementsYahoo {

	public static void main(String[] args) throws InterruptedException {
		
System.setProperty("webdriver.chrome.driver","C:\\Users\\USER\\Desktop\\Selenium all Jar file\\chromedriver (Version 99)\\chromedriver.exe" );

WebDriver driver=new ChromeDriver();
		
	driver.get("https://www.facebook.com/");	
		
		
	
	WebElement cut = driver.findElement(By.xpath("//div[@class='reg_layer_close']"));
		Thread.sleep(3000);
	     cut.click();
		
	   //8.selct w/m
		WebElement gender = driver.findElement(By.xpath("//div[text()='and mother tongue']"));
		
		Thread.sleep(3000);
	     

		Select s=new Select(gender);

		s.selectByValue("Hindi");
		
//		List<WebElement> allGenger = s.getOptions();
//		
//		System.out.println("All Gender Size="+allGenger.size());
//		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
