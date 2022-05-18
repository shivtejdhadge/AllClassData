package POM_PageFactory;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class FaceBookMainPage {
	
	@FindBys({@FindBy(xpath="//ul[@class='uiList pageFooterLinkList _509- _4ki _703 _6-i']/li/a")}) private List<WebElement> links;

	
	
	
	public FaceBookMainPage(WebDriver Driver) {
		PageFactory.initElements(Driver, this);
	}
	
	
	public void Linkscheck() {
		Assert.assertEquals(links.size(), 30);
		for(int i=0;i<links.size();i++) {
			String link=links.get(i).getText();
			System.out.println(link);
		}
		
		
		
	}
	
	
	
	
	
	
	
}
