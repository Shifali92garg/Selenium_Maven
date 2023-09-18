package Drop_Down;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Select_Single_From_DropDown 
{
	public static void main(String args[]) throws InterruptedException
	{
		FirefoxDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.get("https://phppot.com/demo/jquery-dependent-dropdown-list-countries-and-states/");
		driver.manage().window().maximize();
		
//Click on Select Country option that shows all the dropdown available options
	
//1st way to selecting the element but it is complicated because if we use the same code again then we need to write all the things again
	//driver.findElement(By.name("country")).click();
	//Select dp = new Select(driver.findElement(By.name("country")));
	
//So, it's better to create a variable so that in future if we need the same thing or need to change then take only the variable. 
//No need to write everything again
//With the help of reference variable with type WebElement
		
		WebElement	DropDown = driver.findElement(By.name("country"));
		DropDown.click();
	
	Select dp = new Select(DropDown);
			
	
	//Check total number of Elements of the DropDown List
	List <WebElement> options = dp.getOptions();
	System.out.println("The total number of options in DropDown List are : " +options.size());
	
	//Now to print all the options in Console window
	//for(WebElement printlist:options)
	//{
	//	System.out.println(printlist.getText());
	//}
	
	for(int i=0;i<options.size();i++)
	{
		System.out.println(options.get(i).getText());
	}
	}
}
