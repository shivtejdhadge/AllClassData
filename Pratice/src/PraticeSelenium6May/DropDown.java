package PraticeSelenium6May;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import net.bytebuddy.asm.Advice.AllArguments;

public class DropDown {
	
	public static void main(String[] args) throws InterruptedException {
		
System.setProperty("webdriver.chrome.driver", "C:\\Users\\USER\\Desktop\\Selenium all Jar file\\chromedriver (Version 99)\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/");
		
		WebElement create = driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']"));
		
		
		create.click();
		

		

		WebElement day = driver.findElement(By.xpath("//select[@aria-label='Day']"));
		
		int count = 0;
		Select s=new Select(day);
	//	s.selectByVisibleText("7");
		s.selectByIndex(9);
//		List<WebElement> all = s.getOptions();
//		System.out.println(all.size());
//		for(int i=0;i<all.size();i++) {
//			String list=all.get(i).getText();
//			count++;
//			System.out.println(count+"."+list);
//		}

	}

}
