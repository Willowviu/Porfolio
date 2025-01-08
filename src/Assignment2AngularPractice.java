import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class Assignment2AngularPractice {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/angularpractice/");
		driver.findElement(By.name("name")).sendKeys("Francisco de Miguel");
		driver.findElement(By.name("email")).sendKeys("willowviu3@gmail.com");
		driver.findElement(By.id("exampleInputPassword1")).sendKeys("Lucila");
		driver.findElement(By.id("exampleCheck1")).click();
		
		WebElement staticDropdown = driver.findElement(By.id("exampleFormControlSelect1"));
		
		Select dropDown = new Select(staticDropdown);
		dropDown.selectByIndex(0);
				
		driver.findElement(By.id("inlineRadio2")).click();
		driver.findElement(By.name("bday")).sendKeys("01041982");
		driver.findElement(By.cssSelector("input[value='Submit']")).click();
		Thread.sleep(2000);
		System.out.println(driver.findElement(By.cssSelector(".alert-success")).getText());
		
		
	}

}
