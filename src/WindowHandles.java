import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class WindowHandles {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new FirefoxDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get("https://www.barrabes.com");
		
		// Reject the cookies
		driver.findElement(By.xpath( "//a[contains(text(),'Configurar Cookies')]")).click();
		driver.findElement(By.cssSelector("div.modal-btn-group a.btn.btn-primary")).click();
		
		// Leave the mouse over "Men clothes"
		Actions a = new Actions(driver);
		WebElement ropaHombre=driver.findElement(By.xpath("//button[contains(text(),'Ropa Hombre')]"));
		a.moveToElement(ropaHombre).build().perform();
		
		// WebDriverWait to wait until the WebElement "Monos" can be eligible
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.attributeContains(By.cssSelector("li.nav-link.has_children"), "class", "megamenu-open"));

        // Localize el WebElement "Monos" and click on it
        WebElement monosOption = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[contains(text(),'Monos')]")));
        monosOption.click();
        
        // Once click on "Monos", scroll down
        a.scrollByAmount(0, 500).build().perform();
		
		
		
		
		
	}

}
