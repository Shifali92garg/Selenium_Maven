package Assignment_2;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Handle_Dynamic_Dropdown 
{
	public static void main(String args[]) throws InterruptedException
	{
		FirefoxDriver driver = new FirefoxDriver();
		//Set the implicit wait to 10 seconds
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		
		//Navigate to the Bing website
		driver.get("https://www.bing.com");
		driver.manage().window().maximize();
		
		//How to select an element from auto-select drop down list
		
		//Locate the search field
		WebElement	searchInput = driver.findElement(By.name("q"));
		Thread.sleep(5000);
		//Enter data in search field
		searchInput.sendKeys("Selenium WebDriver");
		Thread.sleep(5000);
		
	//Move the cursor down to the very first suggestion of the drop down list and press enter on the selected one
		searchInput.sendKeys(Keys.ARROW_DOWN + "" + Keys.ENTER);
		
		//2nd way - Click enter on the first selected option
		//searchInput.sendKeys(Keys.ENTER);	
	}
}
