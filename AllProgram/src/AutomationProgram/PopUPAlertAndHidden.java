package AutomationProgram;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PopUPAlertAndHidden {
	public static void main(String[] args) {
			//popup are small window or seprate window which will be displayed when we perform action on any component present on web page 
	
		//Types--->1.Hidden Division Popup
		        //   2.Alter Popup
				//   3. Child Browser Popup
		        // 4.Authorization popup-module attched in UAT bcz its block testing
		        //5. File Upload and 6.Download- Selenium not supprt 
		
		
		
		//1.Hidden Divistion Popup-
//									==>These Popups are colorful
//									==> We Can inspect element present in popup.
//									==> We Cant drag and drop 

		
		System.setProperty("webdriver.chrome.driver","C://Users//USER//Desktop//Selenium all Jar file//chromedriver (Version 99)//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//		driver.get("https://www.flipkart.com/account/login?ret=/");
		driver.manage().window().maximize();
// String text = driver.findElement(By.xpath("//span[text()='Get access to your Orders, Wishlist and Recommendations']")).getText();		
//		System.out.println(text);
//		
//		WebElement email = driver.findElement(By.xpath("//input[@class='_2IX_2- VJZDxU']"));
//		
//		email.sendKeys("Shiv");
//			
//		WebElement pass = driver.findElement(By.xpath("//input[@class='_2IX_2- _3mctLh VJZDxU']"));
//
//		pass.sendKeys("1234567");
		
	
		
		
	      //   2.Alter Popup
	
//		==> We cant inspect element present in alert popup
//				==> We can drag and drop
//				==> This type of popups generally contains OK,CANCEL button and text also.
//				==> Some times it is observed that these popup will occur wigh question mark or exclametory mark.
//				==> To handle alert popup we need to use alert interface which contains abstract methods like accept to click on OK button, dismiss to click on cancel button and gettext() to get text in alert popup.
//		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_alert");
//		//Nedd to change Focus on I frame
//		driver.switchTo().frame("iframeResult");
//	    
//		WebElement ins = driver.findElement(By.xpath("//button[text()='Try it']"));	
//		ins.click();
//		
//		//use alert interface for action on alert popup bcz we cannot inspect
//		Alert alert = driver.switchTo().alert();
//		
//		String text = alert.getText();// for Get Text
//		
//		System.out.println(text);
//		
//		alert.accept();//  For Ok //Non static methode so object.methode
		
		
		
		
	//   3. Child Browser Popup
		
		
		
		
		
		
		
	}
}
