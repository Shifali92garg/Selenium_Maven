package Drop_Down;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelecrSingleOption_From_DropDown_WithDifferent_Ways 
{
	public static void main(String args[]) throws InterruptedException
	{
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://phppot.com/demo/jquery-dependent-dropdown-list-countries-and-states/");
		driver.manage().window().maximize();
		
//Click on Select Country option that shows all the dropdown available options
	

		WebElement	DropDown = driver.findElement(By.name("country"));
		DropDown.click();
	
	Select dp = new Select(DropDown);
			
	//Selecting any Visible option from DropDown List
	//1st way - Using Visible Text
	//dp.selectByVisibleText("India");
	
	//2nd way - Using Value of Element
	//dp.selectByValue("4"); //Select Country which is on 4th position
	
	//3rd way - Using Value of Index
	dp.selectByIndex(2);
	//Select Country which is on 3rd position because index starts from 0
	}
}
