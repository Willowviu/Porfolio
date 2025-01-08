import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;



public class Scope {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver = new FirefoxDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get("https://www.barrabes.com");
		
		// Rechazar las cookies
		driver.findElement(By.xpath( "//a[contains(text(),'Configurar Cookies')]")).click();
		driver.findElement(By.cssSelector("div.modal-btn-group a.btn.btn-primary")).click();
		
		// 1. Get the count of the links on the page (a)
		
		System.out.println(driver.findElements(By.tagName("a")).size());
		
		// 2. Get the count of the links - footer section of the page (limiting WedDriver scope)
		
		WebElement footerDriver =  driver.findElement(By.id("container"));
		System.out.println(footerDriver.findElements(By.tagName("a")).size());
		
		// 3. Get the count of the links - only the 1st column of the footer section of the page (limiting WedDriver scope)
		
		WebElement columnDriver = footerDriver.findElement(By.cssSelector(".footer--row > .footer--col.accordion:nth-child(1)"));
		System.out.println(columnDriver.findElements(By.tagName("a")).size());
		
		// 4. Click on each link in the column and check if the pages are opening (Printing the title of each tab)
		
		for(int i=1;i<columnDriver.findElements(By.tagName("a")).size();i++)
		{
			
			String clickOnLinkTab = Keys.chord(Keys.CONTROL,Keys.ENTER);
			
			columnDriver.findElements(By.tagName("a")).get(i).sendKeys(clickOnLinkTab);
			Thread.sleep(5000L);
		}	
			Set<String> abc = driver.getWindowHandles();
			Iterator<String> it = abc.iterator();		
			
			while(it.hasNext())
			{
				
			driver.switchTo().window(it.next()); 	
			System.out.println(driver.getTitle());	
			
			}
			
			
			
		
		
		
		
	}

}
