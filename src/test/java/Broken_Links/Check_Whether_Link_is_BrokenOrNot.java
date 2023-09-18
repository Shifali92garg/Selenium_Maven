package Broken_Links;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Check_Whether_Link_is_BrokenOrNot 
{
	public static void main(String args[]) throws IOException, InterruptedException
	{
		FirefoxDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		//http://www.deadlinkcity.com/
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
	//Find total number of links
		List <WebElement> links = driver.findElements(By.tagName("a"));
		System.out.println("The total number of links in this page are : " +links.size());
		
	//Find broken links by checking the <a href> attribute having null/empty value or not
		int brokenlinks = 0;
		
		for(WebElement linkElements:links)
		{
			String hrefAttributeValue = linkElements.getAttribute("href");
			//getAttribute is used to get the value of attribute
			
	//First condition for checking the broken links
			if(hrefAttributeValue == null || hrefAttributeValue.isEmpty())
			{
				System.out.println("href attribute is empty");
				continue;
			}
			
	//Second condition for Checking link is broken or not using Status Code
			
	//Send the request to server for ------- open and connect
	//We are doing Type Casting here i.e. converting String into URL and URL into HTTP URL Connection 
	//by using the method HttpURLConnection
			
			URL linkURL = new URL(hrefAttributeValue);//Converting String into URL format
			HttpURLConnection conn = (HttpURLConnection)linkURL.openConnection();//Converting URL inro HttpURL
			conn.connect();
			
			if(conn.getResponseCode()>=400)
			{
				System.out.println(hrefAttributeValue+ "  " + "======> Broken Link");
				brokenlinks++;
			}
			else
			{
				System.out.println(hrefAttributeValue+ "  " + "======> Not Broken Link");
			}
		}
		
		System.out.println("The total number of Broken Links are : " +brokenlinks);
		
		Thread.sleep(5000);
		
	}
}
