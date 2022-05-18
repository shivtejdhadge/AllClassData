package AutomationProgramPratice;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptExecutorPratice {
	
public static void main(String[] args) throws InterruptedException {
	
	
	
	System.setProperty("webdriver.chrome.driver","C://Users//USER//Desktop//Selenium all Jar file//chromedriver (Version 99)//chromedriver.exe");

	WebDriver driver =new ChromeDriver();
	
	driver.get("https://www.w3schools.com/");

	//1.Drow Boundry 
	
//	JavascriptExecutor js=((JavascriptExecutor)driver);
//	
//	WebElement search = driver.findElement(By.xpath("//input[@placeholder='Search our tutorials, e.g. HTML']"));
//	
//	
//	js.executeScript("arguments[0].style.border='3px solid red'", search);
	
//	SeleniumUtility.jsdrowboundry(driver, search);
	
	
//	2.click element
	
//	JavascriptExecutor js=((JavascriptExecutor)driver);
//	WebElement login = driver.findElement(By.xpath("//a[text()='Log in']"));
//	js.executeScript("arguments[0].click();", login);
   // SeleniumUtility.jsClickElement(driver, login);	
	
	
	//popup
	
//	JavascriptExecutor js=((JavascriptExecutor)driver);
//	js.executeScript("alert('"+"Page Refresh Done"+"')");
	
//	SeleniumUtility.jsPopUp(driver, "W3 Launched");
	
	
	
	//get title
//	
//	JavascriptExecutor js= ((JavascriptExecutor)driver);
//	
//	String titlebyjs = js.executeScript("return document.title;").toString();
//	
//	System.out.println(titlebyjs);
//	
//	System.out.println(SeleniumUtility.jsTitle(driver));
	
	//refresh page
	
	//JavascriptExecutor js=((JavascriptExecutor)driver);
//	
//	js.executeScript("history.go(0)");
//	SeleniumUtility.jsRefresh(driver);
//	js.executeScript("alert('"+"Refresh done"+"')");
	
	
	// scroll
	
//	JavascriptExecutor js=((JavascriptExecutor)driver);
	
//	js.executeScript("scroll(0,7000)");
//	Thread.sleep(3000);
//	js.executeScript("scroll(0,500)");
//	SeleniumUtility.jsScroll(driver, 0, 5000);
	
	
	//scroll into view
	
//	JavascriptExecutor js=((JavascriptExecutor)driver);
	WebElement dark = driver.findElement(By.xpath("//a[text()='Try Frontend Editor (HTML/CSS/JS)']"));
//	js.executeScript("arguments[0].scrollIntoView(true);", dark);
//	//js.executeScript("arguments[0].scrollIntoView(true);", DisclaimerBtn);
//	dark.click();
	
	SeleniumUtility.jsScroolIntoView(driver, dark);
	
	
	
	
	
}

}
