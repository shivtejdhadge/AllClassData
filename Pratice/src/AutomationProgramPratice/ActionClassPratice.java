package AutomationProgramPratice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionClassPratice {
	
	
	//Send Key
	
	
	public static void main(String[] args) {
		

		System.setProperty("webdriver.chrome.driver","C://Users//USER//Desktop//Selenium all Jar file//chromedriver (Version 99)//chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
	
//		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
//		WebElement create = driver.findElement(By.xpath("//a[@ajaxify='/reg/spotlight/']"));
//		
//		
//		create.click();
//		
//		WebElement fname = driver.findElement(By.xpath("//input[@name='firstname']"));
//		
//		WebElement Lname = driver.findElement(By.xpath("//input[@name='lastname']"));
//		
//	WebElement mobile = driver.findElement(By.xpath("//input[@name='reg_email__']"));
//		
//		WebElement pass = driver.findElement(By.xpath("//input[@autocomplete='new-password']"));
//		
//		
//		Actions a=new Actions(driver);
//		
//		a.keyDown(fname, Keys.SHIFT).sendKeys("shivtej").keyUp(Keys.SHIFT).build().perform();
//		
//		a.sendKeys(Lname, "Dhadge").build().perform();
//		a.keyDown(mobile, Keys.SHIFT).sendKeys("shivnd682@997").keyUp(Keys.SHIFT).build().perform();
//		
//		a.sendKeys(pass, "mnbfdg6578").build().perform();
//		a.sendKeys(Keys.ENTER).build().perform();
		
		
		
		//Drag
		
		
//		driver.get("https://jqueryui.com/draggable/");
//		
//		WebElement frame = driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
//		
//		driver.switchTo().frame(frame);
//		
//		WebElement drag = driver.findElement(By.xpath("//div[@id='draggable']"));
//		
//		
//		Actions a=new Actions(driver);
//		
//		a.dragAndDropBy(drag, 100, 150).build().perform();
//		
		
		//Drag and Drop
		
//		driver.get("https://jqueryui.com/droppable/");
////		
//		WebElement frame = driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
//		
//		driver.switchTo().frame(frame);
//		
//		WebElement src = driver.findElement(By.xpath("//div[@id='draggable']"));
//		
//		WebElement trgt = driver.findElement(By.xpath("//div[@id='droppable']"));
//		
//		Actions a=new Actions(driver);
//		a.dragAndDrop(src, trgt).build().perform();
//		
//		
		
		
//		driver.get("https://jqueryui.com/resizable/");
//		
//		WebElement frame = driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
//		driver.switchTo().frame(frame);
//		WebElement resize = driver.findElement(By.xpath("//div[@class='ui-resizable-handle ui-resizable-se ui-icon ui-icon-gripsmall-diagonal-se']"));
//		
//		Actions a=new Actions(driver);
//		
//		a.dragAndDropBy(resize, 120, 150).build().perform();
//		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
