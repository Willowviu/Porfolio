import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;


public class SortedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
		
		//Click on column
		driver.findElement(By.xpath("//tr/th[1]")).click();
			
		//Capture all WebElements into a list
		List<WebElement> elementList = driver.findElements(By.xpath("//tr/td[1]"));
		
		//Capture text of all WebElements into new(original) list
		List<String> originalList = elementList.stream().map(s->s.getText()).collect(Collectors.toList());
		
		//Sort on the original list of step 3 -> a sorted list
		List<String> sortedList = originalList.stream().sorted().collect(Collectors.toList());
		
		//Compare original list vs sorted list
		//Assert.assertTrue(elementList.equals(sortedList));
		
		//Get(print) prize of Wheat
		//Scan the name column with getText -> Rice -> print the price of the Wheat
		List<String> price;
		do
		{
		//1.Capture all WebElements into a list
		List<WebElement> rows = driver.findElements(By.xpath("//tr/td[1]"));	
		price = rows.stream().filter(s->s.getText().contains("Wheat")).
		map(s->getPriceVeggie(s)).collect(Collectors.toList());
		
		price.forEach(a->System.out.println(a));
		if(price.size()<1)
		{
			driver.findElement(By.cssSelector("[aria-label='Next']")).click();
		}	
		}while(price.size()<1);
	}
	
	private static String getPriceVeggie(WebElement s) {
		// TODO Auto-generated method stub
		String priceValue = s.findElement(By.xpath("following-sibling::td[1]")).getText();
		
		return priceValue;
	}
	}
	

