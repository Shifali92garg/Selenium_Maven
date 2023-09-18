package Assignment_2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Select_Element_from_Dropdown_by_Visible_Text 
{
	public static void main(String args[]) throws InterruptedException
	{
		FirefoxDriver driver = new FirefoxDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
		
		driver.get("https://phppot.com/demo/jquery-dependent-dropdown-list-countries-and-states/");
		driver.manage().window().maximize();
		
		WebElement Dropdown = driver.findElement(By.id("country-list"));
		Dropdown.click();
		
		Thread.sleep(5000);
		Select dp = new Select(Dropdown);
		dp.selectByVisibleText("India");
		
		System.out.println("Selected Country is India");
	}
}
