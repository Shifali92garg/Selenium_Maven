package CheckBox_Functionality;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CheckBox 
{
	public static void main(String args[]) 
	{
		FirefoxDriver driver = new FirefoxDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		
		//Handle single Check Box
		
		WebElement checkbox1 = driver.findElement(By.id("sunday"));
		if(checkbox1.isDisplayed())
		{
			checkbox1.click();
		}
		if(checkbox1.isSelected())
		{
			System.out.println("Checkbox is selected");
		}
		
	}
}
