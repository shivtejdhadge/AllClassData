package AutomationProgram;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import SeleniumUtils.SeleniumUtils;

public class JavaScriptExecutor {

	public static void main(String[] args) throws InterruptedException {
		
		
//		1. Creating the Border to the webelements. (Some times it is important before capturing the screen shot to highlight the error)
//		2. Capturing the title of the webpage.
//		3. Clicking on the webelements.
//		4. Generating the run time popups.
//		5. Refresh the page
//		6. Scrolling the page. :- Scroll Up, Scroll down, Scrollintoview

		
		
//		1. Creating the Border to the webelements. (Some times it is important before capturing the screen shot to highlight the error)
		
		
		System.setProperty("webdriver.chrome.driver","C://Users//USER//Desktop//Selenium all Jar file//chromedriver (Version 99)//chromedriver_win32 (1)//chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/");
		
		WebElement pass = driver.findElement(By.xpath("//input[@type='password']"));

		JavascriptExecutor js=((JavascriptExecutor)driver);
		
		js.executeScript("arguments[0].style.border='6px solid red'",pass);
		
		SeleniumUtils.jsborder(driver, pass);
		
		
//		2. Capturing the title of the webpage.
		
		
//		JavascriptExecutor js=((JavascriptExecutor)driver);
//		
//		String titlebyjs = js.executeScript("return document.title;").toString();
//		
//		System.out.println(titlebyjs);
//		
//	System.out.println(	SeleniumUtils.jscapturetitile(driver));
		
		
		//3. Clicking on the webelements.
		
		
//		JavascriptExecutor js=((JavascriptExecutor)driver);
//		
//		WebElement login = driver.findElement(By.xpath("//button[@value='1']"));
//		
//		js.executeScript("arguments[0].click();",login);
		
//		SeleniumUtils.jsclickElement(driver, login);		
		
		
//		4. Generating the run time popups.
		
		
//		JavascriptExecutor js=((JavascriptExecutor)driver);
//		js.executeScript("alert('" + "The facebook Site is launched" + "')");
//		SeleniumUtils.jsalertPopUp(driver, "Facebook Site Launched");
		
		
//		5. Refresh the page
//		Thread.sleep(2000);
//		JavascriptExecutor js=((JavascriptExecutor)driver);
//		js.executeScript("history.go(0)");
//		SeleniumUtils.jsRefreshPage(driver);
//		SeleniumUtils.jsalertPopUp(driver, "Page Refresh Done");
		//js.executeScript("alert('" + "The facebook Site is refresh" + "')");

		
		
//		6. Scrolling the page. :- Scroll down and up

//		
       // 	driver.get("https://pay.facebook.com/");
//		
//		JavascriptExecutor js=((JavascriptExecutor)driver);
//		js.executeScript("scroll(0,4000)");//1st Scroll downm
//		Thread.sleep(2000);
//		js.executeScript("scroll(0,500)");// then we can scroll up		
		
//        	SeleniumUtils.jsScrolling(driver, 0, 5000);
//        	SeleniumUtils.jsScrolling(driver, 0, 500);
        	
        	
        	
//		6. Scrolling the page. :- Scroll into view	
		
//		
//		JavascriptExecutor js=((JavascriptExecutor)driver);
//	
//		WebElement pay = driver.findElement(By.xpath("//a[text()='Facebook Payments Privacy Policy']"));
//		
//		
//		js.executeScript("arguments[0].scrollIntoView(true);", pay);
//		
//		pay.click();
//      SeleniumUtils.jsScrollintoView(driver, pay);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
