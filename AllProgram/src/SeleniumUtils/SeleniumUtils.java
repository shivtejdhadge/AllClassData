package SeleniumUtils;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SeleniumUtils {
	
	
public static void jsborder(WebDriver driver, WebElement element){
	
	JavascriptExecutor js=((JavascriptExecutor)driver);
	
	js.executeScript("arguments[0].style.border='6px solid red'",element);
	
}
	
	
public static String jscapturetitile(WebDriver driver) {
	
	JavascriptExecutor js=((JavascriptExecutor)driver);
	String titlebyjs = js.executeScript("return document.title;").toString();
	return titlebyjs;
	
}


public static void jsclickElement(WebDriver driver,WebElement element) {
	
	JavascriptExecutor js=((JavascriptExecutor)driver);	
	js.executeScript("arguments[0].click();",element);
	
	
}



public static void jsalertPopUp(WebDriver driver,String Message) {
	JavascriptExecutor js=((JavascriptExecutor)driver);
	js.executeScript("alert('" + Message + "')");

}


public static void jsRefreshPage(WebDriver driver) {
	
	JavascriptExecutor js=((JavascriptExecutor)driver);
	js.executeScript("history.go(0)");
	
}
	

public static void jsScrolling(WebDriver driver,int x,int y) {
	
	JavascriptExecutor js=((JavascriptExecutor)driver);
	js.executeScript("scroll("+ x + "," + y +")");
	
}

public static void jsScrollintoView(WebDriver driver,WebElement element) {
	JavascriptExecutor js=((JavascriptExecutor)driver);

		js.executeScript("arguments[0].scrollIntoView(true);", element);
		
		element.click();
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
