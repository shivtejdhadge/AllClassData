package AutomationProgram;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class iFramePrograms {
	
	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver","C://Users//USER//Desktop//Selenium all Jar file//chromedriver (Version 99)//chromedriver.exe" );
		
		WebDriver driver=new ChromeDriver();
		//driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_intro_inner_html");
		
		//.1st select frame id for child frame
		driver.switchTo().frame("iframeResult");
		
		WebElement text = driver.findElement(By.xpath("//button[contains(@type,'button')]"));
		
		text.click();
//		driver.switchTo().defaultContent();
//		driver.switchTo().parentFrame();
//		WebElement theme = driver.findElement(By.xpath("//a[starts-with(@title,'Change Theme')]"));
//		
//		theme.click();
//		
		
		
		
		
		
		
		
	}

}
