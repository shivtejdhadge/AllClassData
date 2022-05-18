package AutomationProgram;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionClass {
	
	public static void main(String[] args) {
	
		
		System.setProperty("webdriver.chrome.driver","C://Users//USER//Desktop//Selenium all Jar file//chromedriver (Version 99)//chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		
		// hover the elements.
		
		
		//driver.get("https://www.next.co.uk/");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.manage().deleteAllCookies();
//		WebElement cookie = driver.findElement(By.xpath("//button[@aria-label='Close']"));
//		
//		cookie.click();
//		
//		List<WebElement> links = driver.findElements(By.xpath("//ul[@data-testid='snail-trail-container']/li/a"));
//		
//		for(int i=0;i<5;i++) {
//			WebElement link = links.get(i);
//			Actions action=new Actions(driver);
//			action.moveToElement(link);
//			action.build().perform();
//			System.out.println(link.getText()+"==>"+link.getAttribute("id")+"==>"+link.getAttribute("title"));
//			
//		}
//		
		
		
		// how to handle resizable items
		
		
		driver.get("https://jqueryui.com/resizable/");
		WebElement iframe = driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
		driver.switchTo().frame(iframe);
		System.out.println("iframe");
		WebElement drag = driver.findElement(By.xpath("//div[@class='ui-resizable-handle ui-resizable-e']"));
		Actions actions=new Actions(driver);
		actions.dragAndDropBy(drag, 250, 50).build().perform();
		//actions.build().perform();
		
		
		
         // drag and drop
		
		
//		driver.get("https://jqueryui.com/droppable/");
//		WebElement frame = driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
//		driver.switchTo().frame(frame);
//		System.out.println(frame);
//		WebElement source = driver.findElement(By.xpath("//div[@class='ui-widget-content ui-draggable ui-draggable-handle']"));
//		WebElement dest = driver.findElement(By.xpath("//div[@id='droppable']"));
//		
//		Actions action=new Actions(driver);
//		
//		action.dragAndDrop(source, dest).build().perform();
//		System.out.println(source.getText()+"==>"+dest.getText());
//		
//		
//		UtilityClass.jsPopUp(driver, "Drad and Drop Sucessfully done");
//	
		

		// draggable.
		
//		driver.get("https://jqueryui.com/draggable/");
//		
//		WebElement frame = driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
//		driver.switchTo().frame(frame);
//		
//		WebElement src = driver.findElement(By.xpath("//div[@id='draggable']"));
//		
//		Actions action=new Actions(driver);
//		action.dragAndDropBy(src, 50, 50).build().perform();
//		
//		
		
		
		// right click.
//		
//		driver.get("http://deluxe-menu.com/popup-mode-sample.html");
//		
//		WebElement image = driver.findElement(By.xpath("//img[@onclick='return dm_popup(1, 2000, event);']"));
//		
//		Actions action = new Actions(driver);
//		action.contextClick(image).build().perform();
		//action.click(image).build().perform();
		
		
		
		// sendkeys by using action.
		
		
//		driver.get("https://www.facebook.com/");
//		
//		WebElement login = driver.findElement(By.xpath("//input[@name='email']"));
//		
//		WebElement pass = driver.findElement(By.xpath("//input[@name='pass']"));
//		WebElement enter = driver.findElement(By.xpath("//button[@value='1']"));
//		Actions action =new Actions(driver);
//		action.keyDown(login, Keys.SHIFT).sendKeys("Shivtej").build().perform();
//		//action.sendKeys(login, "Shivtej");
//		action.keyUp(Keys.SHIFT).build().perform();
//		
//		action.sendKeys(pass, "!23456").build().perform();// Need to Key Up other wise next action not perform
//		action.sendKeys(Keys.ENTER).build().perform();// Enter Butoon
//		
	}
}
