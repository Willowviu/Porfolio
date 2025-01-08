import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class End2End {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.iberia.com");

		// Espera explícita
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));

		// Rechazar cookies
		WebElement rejectCookiesButton = wait.until(ExpectedConditions.elementToBeClickable(By.id("onetrust-reject-all-handler")));
		rejectCookiesButton.click();

		// Hacer click en pagar with avios
        //driver.findElement(By.id("paywithAvios")).click();
        		
		// Ingresar origen 
		 WebElement flightOrigin = driver.findElement(By.id("flight_origin1"));
		 flightOrigin.sendKeys("Madrid");
		
		// Ingresar destino
		WebElement flightDestiny = driver.findElement(By.id("flight_destiny1"));
		flightDestiny.sendKeys("Ibiza");
		
		Thread.sleep(1000);

		// Abrir el calendario para seleccionar la fecha de ida 
		WebElement date1Label = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//label[@for='flight_round_date1']")));
		date1Label.click();

		// Seleccionar fecha de ida (dia 23)
		WebElement date23 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@id='searcher-calendar-1']//a[text()='23']")));
	    date23.click();

	    // Seleccionar fecha de vuelta (día 27)
        WebElement date27 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@id='searcher-calendar-end-1']//a[text()='27']")));
        date27.click();
        
        // Seleccionar 5 adulto
        driver.findElement(By.id("flight_passengers1")).click();
        for(int i=1;i<5;i++)
        {	
        		driver.findElement(By.xpath("//li[contains(@class, 'ibe-people-counter__list-item') and "
        		+ ".//span[@id='adult1']]//button[@data-people-counter-button='more' and contains(@class, 'fc-people-counter-active')]\r\n"
        		+ "")).click();
        }       
        
        // Seleccionar pagar con avios
        driver.findElement(By.xpath("//div[@class='ibe-form__checkbox inte-avioscheck']")).click();
        
        // Confirmar y buscar
        WebElement searchButton = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("span[class='ibe-button__text']")));
        searchButton.click();

        System.out.println("Has completado tu compra con éxito Lu mi amoggg.");
        //driver.quit();
    }
	
}