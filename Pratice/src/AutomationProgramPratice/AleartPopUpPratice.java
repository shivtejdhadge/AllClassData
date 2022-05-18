package AutomationProgramPratice;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class AleartPopUpPratice {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C://Users//USER//Desktop//Selenium all Jar file//chromedriver (Version 99)//chromedriver.exe");
		
		RemoteWebDriver driver=new ChromeDriver();
		
		driver.get("https://nxtgenaiacademy.com/alertandpopup/");
		
		WebElement popup = driver.findElement(By.xpath("//button[@name='confirmalertbox']"));
		popup.click();
		
		Alert alert = driver.switchTo().alert();
		
		
		System.out.println(alert.getText());
		
		alert.accept();
		//alert.dismiss();
	
		
		
		
	}

}
