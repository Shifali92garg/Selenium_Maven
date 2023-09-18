package Assignment_1;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.*;

public class Opening_URL_and_Get_Title 
{
	public static void main(String args[])
	{
		//Open Firefox Browser
		WebDriver driver = new FirefoxDriver();
		
		//Open web page by using URL
		driver.get("https://www.example.com");
		driver.manage().window().maximize();
		
		//Get the Title of the Web Page
		System.out.println(driver.getTitle());
		
		//Verifying Title of the Web Page
		String actual_title= driver.getTitle();
		String expected_title= "Example Domain";
		
		if(actual_title.equals(expected_title))
		{
		System.out.println("Test passed");
		}
		else
		{
		System.out.println("Test failed");
		}
		
	}
}
