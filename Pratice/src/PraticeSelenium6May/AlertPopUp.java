package PraticeSelenium6May;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPopUp {
	public static void main(String[] args) throws InterruptedException {
		
	
System.setProperty("webdriver.chrome.driver","C:\\Users\\USER\\Desktop\\Selenium all Jar file\\chromedriver (Version 99)\\chromedriver.exe");
	
	WebDriver driver=new ChromeDriver();
	
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);

	driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_alert");
	
	WebElement frmae = driver.findElement(By.xpath("//iframe[@allowfullscreen='true']"));


	driver.switchTo().frame(frmae);
	
	WebElement tr=driver.findElement(By.xpath("//button[text()='Try it']"));

	tr.click();

	Alert al=driver.switchTo().alert();

	System.out.println(al.getText());
	Thread.sleep(3000);
	al.accept();

	

	driver.switchTo().defaultContent();
	Thread.sleep(2000);
	WebElement theme=driver.findElement(By.xpath("//a[@onclick='retheme()']"));

	theme.click();


	}
	



	
	
	
	

}
