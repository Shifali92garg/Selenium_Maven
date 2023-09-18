package Assignment_3;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Find_Available_and_Broken_Links 
{
	public static void main(String args[]) throws IOException, InterruptedException
	{
		FirefoxDriver driver = new FirefoxDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		List <WebElement> AvailableLinks = driver.findElements(By.tagName("a"));
		System.out.println("The total number of links in this page are : " +AvailableLinks.size());
		
		int brokenlinks = 0;
		for(WebElement linkElements:AvailableLinks)
		{
			String hrefAttributeValue = linkElements.getAttribute("href");
			if(hrefAttributeValue == null || hrefAttributeValue.isEmpty())
			{
				System.out.println("href attribute is empty");
				continue;
			}
		
		URL linkURL = new URL(hrefAttributeValue);
		HttpURLConnection conn = (HttpURLConnection)linkURL.openConnection();
		conn.connect();
		}
	System.out.println("The total number of Broken Links are : " +brokenlinks);
	
	Thread.sleep(5000);	
	}
}
