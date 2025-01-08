import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;


public class actionsDemo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver = new FirefoxDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get("https://www.barrabes.com/");
		
		// Reject the cookies
		driver.findElement(By.xpath( "//a[contains(text(),'Configurar Cookies')]")).click();
		driver.findElement(By.cssSelector("div.modal-btn-group a.btn.btn-primary")).click();
		
		// Define WebElements
		Actions a = new Actions(driver);
		WebElement ropaHombre=driver.findElement(By.xpath("//button[contains(text(),'Ropa Hombre')]"));
		WebElement ropaMujer=driver.findElement(By.xpath("//button[contains(text(),'Ropa Mujer')]"));
		WebElement calzado=driver.findElement(By.xpath("//button[contains(text(),'Calzado')]"));
		WebElement escalada=driver.findElement(By.xpath("//button[contains(text(),'Escalada')]"));
		WebElement esqui=driver.findElement(By.xpath("//button[contains(text(),'Esquí')]"));
		WebElement masMaterial=driver.findElement(By.xpath("//button[contains(text(),'Más material')]"));
		WebElement marcas=driver.findElement(By.xpath("//button[contains(text(),'Marcas')]"));
		
		Thread.sleep(1000);
		
		// Move the mouse towards all WebElements 
		a.moveToElement(ropaHombre).build().perform();
		Thread.sleep(1000);
		a.moveToElement(ropaMujer).build().perform();
		Thread.sleep(1000);
		a.moveToElement(calzado).build().perform();
		Thread.sleep(1000);
		a.moveToElement(escalada).build().perform();
		Thread.sleep(1000);
		a.moveToElement(esqui).build().perform();
		Thread.sleep(1000);
		a.moveToElement(masMaterial).build().perform();
		Thread.sleep(1000);
		a.moveToElement(marcas).build().perform();
		
		/*
		// Click on search bar
		driver.findElement(By.id("cSearch")).click();
		
		// Wait until the new component appears
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		WebElement newSearchField = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("div[data-dfd-view='Search'] input")));
		
		// Write on the new search field
		newSearchField.sendKeys("SACOS DE DORMIR");
		*/
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		// Scroll down on the WebPage
		// JavascriptExecutor js = (JavascriptExecutor)driver;
		// js.executeScript("window.scrollBy(0,5000)");
		
		// From the console we can use as well:
		// document.querySelector(".tableFixHead").scrollTop-Down-Left=5000
		
	}

}
