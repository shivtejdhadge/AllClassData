package AutomationProgram;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class UtilityClass {
	
	public static void jsdrowboundry(WebDriver driver,WebElement element) {
		JavascriptExecutor js=((JavascriptExecutor)driver);
	
		js.executeScript("arguments[0].style.border='3px solid red'", element);
	}
	
	
	public static void jsClickElement(WebDriver driver,WebElement element) {
		
	JavascriptExecutor js=((JavascriptExecutor)driver);

	js.executeScript("arguments[0].click();", element);
		
	}
	
	
	public static void jsPopUp(WebDriver driver,String Message) {
		JavascriptExecutor js=((JavascriptExecutor)driver);
		js.executeScript("alert('"+Message+"')");
	}
	
	
	public static String jsTitle(WebDriver driver) {
		JavascriptExecutor js= ((JavascriptExecutor)driver);
		String titlebyjs = js.executeScript("return document.title;").toString();
		return titlebyjs;
	}
	
	public static void jsRefresh(WebDriver driver) {
		JavascriptExecutor js=((JavascriptExecutor)driver);
		js.executeScript("history.go(0)");
		
	}
	
	
	public static void jsScroll(WebDriver driver,int x,int y) {
		
		JavascriptExecutor js=((JavascriptExecutor)driver);
		js.executeScript("scroll("+ x + "," + y +")");
		
	}
	
	
	public static void jsScroolIntoView(WebDriver driver,WebElement element) {
		JavascriptExecutor js=((JavascriptExecutor)driver);
		js.executeScript("arguments[0].scrollIntoView(true);", element);
		element.click();
		
		
		
	}

}

