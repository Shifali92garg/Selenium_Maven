package Assignment_1;

import java.util.List;

import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Find_allTheLinks 
{
	public static void main(String args[])
	{
		WebDriver driver = new FirefoxDriver();
		
		//Open URL
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		//Find all the links
		List <WebElement> links= driver.findElements(By.tagName("a"));
				
		//Print text of all links
			for(WebElement link : links)
			{
			System.out.println(link.getText());
			}
	}
}
