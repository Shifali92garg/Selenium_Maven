package Navigation_Commands;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Navigate_To_Url 
{
	public static void main(String args[]) throws InterruptedException, MalformedURLException
	{
		WebDriver driver = new FirefoxDriver();
		
		//Open the Amazon
		//driver.navigate().to("https://www.amazon.in/");
		
		//URL url = new URL("https://www.facebook.com/");
		driver.navigate().to("https://www.facebook.com/");
		System.out.println(driver.getCurrentUrl());
		Thread.sleep(2000);
		
		//Want o Open the Flipkart on the same window
		driver.navigate().to("https://www.flipkart.com/");
		System.out.println(driver.getCurrentUrl());
		Thread.sleep(2000);
		
		driver.navigate().back();
		System.out.println(driver.getCurrentUrl());
		Thread.sleep(2000);
		
		driver.navigate().forward();
		System.out.println(driver.getCurrentUrl());
		Thread.sleep(2000);
		
		driver.navigate().refresh();
		Thread.sleep(2000);
	}
}
