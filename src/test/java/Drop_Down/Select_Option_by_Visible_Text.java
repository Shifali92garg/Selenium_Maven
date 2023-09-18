package Drop_Down;

import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Select_Option_by_Visible_Text 
{
	public static void main(String args[])
	{
		FirefoxDriver driver = new FirefoxDriver();
		
		driver.get("https://phppot.com/demo/jquery-dependent-dropdown-list-countries-and-states/");
		driver.manage().window().maximize();
		
		WebElement Dropdown = driver.findElement(By.id("country-list"));
		Dropdown.click();
		
		Select dp = new Select(Dropdown);
		dp.selectByVisibleText("India");
	}
}
