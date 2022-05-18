package AutomationProgram;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsBYCSSSelectors {
	
	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver","");
		
		
		WebDriver driver=new ChromeDriver();
		
           //Website Facebook
		// Element Location by CSS Selectors.

		//1. tag and id
		//css=> tag#id
		
		driver.findElement(By.cssSelector("input#email"));
		driver.findElement(By.cssSelector("button#u_0_d_ax"));
		
		//2. tag and  class
		// css=> tag.class
		
		driver.findElement(By.cssSelector("div._58mk"));
		
		//3. tag and atrribute
		//css=> tagname[attribute=value]
		
		driver.findElement(By.cssSelector("input[name=email"));
		driver.findElement(By.cssSelector(""));
		
		//4. tag class and attribute
		// css==> tag.class[attribute='value']
		
		driver.findElement(By.cssSelector("div.uiContextualLayerParent[id='globalContainer']"));
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
