package AutomationProgramPratice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsByCustomizedXpathPratice {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C://Users//USER//Desktop//Selenium all Jar file//chromedriver (Version 99)//chromedriver.exe" );
		WebDriver driver=new ChromeDriver();
		
		
		//Website=IRCTC
		
		//1.basic
		driver.findElement(By.xpath("//input[@aria-controls='pr_id_1_list']"));//From input
	    driver.findElement(By.xpath("//input[@aria-expanded='true']"));//to input
		
		//by text
		
		 	driver.findElement(By.xpath("//label[text()='Flexible With Date']"));
		 	
		 	//by starts with
		 	driver.findElement(By.xpath("//button[starts-with(@class,'search_btn tra')]"));//
		 	driver.findElement(By.xpath("//p-dropdown[starts-with(@formcontrolname,'journeyQuota')]"));
		
		 	//by contains
		 	driver.findElement(By.xpath("//input[contains(@aria-controls,'pr_id_1_list')]"));
		
		
			//4.X-Path with Logical Operator[and]
		 	
		 	driver.findElement(By.xpath("//input[@aria-controls='pr_id_1_list' and @aria-haspopup='true']"));
		
		 	//4.X-Path with Logical Operator[or]
		
		
		
		
			//Website=Velocity
		 	
		 	// by basic
		 	driver.findElement(By.xpath("a[@aria-current='page']"));
		driver.findElement(By.xpath("//div[@data-height='66']"));
		
		//by text
		driver.findElement(By.xpath("//h2[text()='Velocity Branches']"));		
		
		//starts with
		
		driver.findElement(By.xpath("//img[starts-with(@alt,'whatsapp-icon')]"));
		
		
		//Contains 
		
		driver.findElement(By.xpath(""));
		
		
		//Website=Bookmyshow
		
		
		//Basic
		
		driver.findElement(By.xpath("//input[@id='search-input']"));
		
		//text
		
		driver.findElement(By.xpath("//div[text()='It All Starts Here!']"));
		
		//starts with
		
		driver.findElement((By.xpath("//div[starts-with(@class,'sc-eM')]")));
		
		//contain
		
		driver.findElement(By.xpath("//div[contains(@class,'ifGdHW')]"));
		
		//and
		
		driver.findElement(By.xpath("//meta[@name='viewport'and @content='width=device-width, height=device-height, initial-scale=1.0, user-scalable=no, minimum-scale=1.0, maximum-scale=1.0']"));
		
		
		//or
		
		driver.findElement(By.xpath("//meta[@name='mobile-web-app-capable' or @content='yes']"));
		
		
		
		//starts with
		driver.findElement(By.xpath("//label[starts-with(@for,'mob')]"));
		
		
		//contains
		driver.findElement(By.xpath("//label[contains(@for,'N')]"));
		
		
		
		
		
		
		
		
		
		
		
	}

}
