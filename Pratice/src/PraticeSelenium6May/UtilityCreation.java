package PraticeSelenium6May;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class UtilityCreation {
	
	
public static void main(String[] args) throws IOException {
	

	System.setProperty("webdriver.chrome.driver","C://Users//USER//Desktop//Selenium all Jar file//chromedriver (Version 99)//chromedriver.exe");	
	
	WebDriver driver=new ChromeDriver();
	//driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	driver.get("https://www.facebook.com/");
	
//	utility.getscreenshot(driver);
	WebElement email = driver.findElement(By.xpath("//input[@name='email']"));
	
	
	utility.drowBorder(driver, email);
	utility.alert(driver,"DOne");
	

//List<WebElement> links = driver.findElements(By.xpath("//ul[@class='uiList pageFooterLinkList _509- _4ki _703 _6-i']/li/a"));
//
//for(int i=0;i<links.size();i++){
//	 WebElement s = links.get(i);
//Actions a=new Actions(driver);
//a.moveToElement(s).build().perform();

//}
	
	
	
}
}