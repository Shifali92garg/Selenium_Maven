package Assignment_3;

import java.time.Duration;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.*;

public class Dropdown 
{
	public static void main(String args[]) throws InterruptedException
	{
		FirefoxDriver driver = new FirefoxDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://phppot.com/demo/jquery-dependent-dropdown-list-countries-and-states/");
		driver.manage().window().maximize();
		
		WebElement dropdown = driver.findElement(By.id("country-list"));
		dropdown.click();
		
		Select dp = new Select(dropdown);
			
		Thread.sleep(3000);
		
		//dp.selectByValue("3");
		//dp.selectByIndex(0);
		dp.selectByVisibleText("India");
		
	}
}
