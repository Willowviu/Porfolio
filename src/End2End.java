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

		// Explicit Wait
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));

		// Refuse cookies
		WebElement rejectCookiesButton = wait.until(ExpectedConditions.elementToBeClickable(By.id("onetrust-reject-all-handler")));
		rejectCookiesButton.click();

		// Insert origin 
		 WebElement flightOrigin = driver.findElement(By.id("flight_origin1"));
		 flightOrigin.sendKeys("Madrid");
		
		// Insert destination
		WebElement flightDestiny = driver.findElement(By.id("flight_destiny1"));
		flightDestiny.sendKeys("Ibiza");
		
		Thread.sleep(1000);

		// Open the calendar to select the departure date
		WebElement date1Label = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//label[@for='flight_round_date1']")));
		date1Label.click();

		// Select the departure date (23rd)
		WebElement date23 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@id='searcher-calendar-1']//a[text()='23']")));
	    date23.click();

	    // Select the return date (27th)
        WebElement date27 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@id='searcher-calendar-end-1']//a[text()='27']")));
        date27.click();
        
        // Select 5 adults
        driver.findElement(By.id("flight_passengers1")).click();
        for(int i=1;i<5;i++)
        {	
        		driver.findElement(By.xpath("//li[contains(@class, 'ibe-people-counter__list-item') and "
        		+ ".//span[@id='adult1']]//button[@data-people-counter-button='more' and contains(@class, 'fc-people-counter-active')]\r\n"
        		+ "")).click();
        }       
        
        // Select "pay with avios"
        driver.findElement(By.xpath("//div[@class='ibe-form__checkbox inte-avioscheck']")).click();
        
        // Confirm and search
        WebElement searchButton = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("span[class='ibe-button__text']")));
        searchButton.click();

        System.out.println("Has completado tu compra con éxito.");
        //driver.quit();
    }
	
}