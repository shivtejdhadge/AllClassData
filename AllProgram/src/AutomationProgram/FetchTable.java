package AutomationProgram;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FetchTable {

	public static void main(String[] args) {
	
		
System.setProperty("webdriver.chrome.driver", "C://Users//USER//Desktop//Selenium all Jar file//chromedriver (Version 99)//chromedriver.exe");	
		
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://money.rediff.com/gainers/bse/daily/groupa?src=gain_lose");
		
		
		int row = driver.findElements(By.xpath("//table[@class='dataTable']/tbody/tr")).size();
		
		int column = driver.findElements(By.xpath("//table[@class='dataTable']/thead/tr/th")).size();
		
		System.out.println(row);
		System.out.println(column);
		
		for (int r=1; r<=row;r++) {
			for (int c=1;c<=column;c++) {
	
			String value = driver.findElement(By.xpath("//table[@class='dataTable']/tbody/tr["+r+"]/td["+c+"]")).getText();
			System.out.print("==>"+ value);
			
			}
			System.out.println();
		}
		
		
		
		
		
		
		
		
		

	}

}
