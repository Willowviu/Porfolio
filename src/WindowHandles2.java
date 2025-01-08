import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;



public class WindowHandles2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver = new FirefoxDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get("https://www.barrabes.com");
				
		// Rechazar las cookies
		driver.findElement(By.xpath( "//a[contains(text(),'Configurar Cookies')]")).click();
		driver.findElement(By.cssSelector("div.modal-btn-group a.btn.btn-primary")).click();
		
		// Click en 'Hola, identificate'  
		driver.findElement(By.xpath("//span[contains(text(),'Hola, identifícate')]")).click();
		WebElement loginButton = driver.findElement(By.cssSelector("a.link.loginButton"));	
				
		// Simula Ctrl+Click
		Actions actions = new Actions(driver);
		actions.keyDown(Keys.CONTROL).click(loginButton).keyUp(Keys.CONTROL).build().perform();
		
		// Get the ids of the windows
		Set<String> windows = driver.getWindowHandles();  //[parentid,childid]
		
		// Select the child window
		Iterator<String> it = windows.iterator();
		String parentId = it.next();
		String childId = it.next();
		driver.switchTo().window(childId);
		Thread.sleep(1000);
		
		// Grab an imaginary emailId and store it in a variable (to paste it in your parentId window)  
		String emailId = driver.findElement(By.cssSelector("p.account--headline")).getText().split("para")[1].trim().split(" ")[0];		
		driver.switchTo().window(parentId);
		
		// Click in the search field
		driver.findElement(By.id("cSearch")).click();
			
		// Wait until the element appears
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		WebElement newSearchField = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("div[data-dfd-view='Search'] input")));
				
		// Paste the grabbed text 
		newSearchField.sendKeys(emailId);
		System.out.println(emailId);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
