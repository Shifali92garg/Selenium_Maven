package Day_3;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.*;

public class getMethods 
{
	public static void main(String args[]) throws InterruptedException
	{
		ChromeDriver driver = new ChromeDriver();//Use to open the Chrome browser
		
		driver.manage().window().maximize();//Use to maximize the browser window
		
		//get method
		driver.get("http://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		//get Title
		System.out.println("The title of the page is : " +driver.getTitle());
		
		//get Current URL
		String url = driver.getCurrentUrl();
		System.out.println("The URL of the page is : " +url);
		
		//get page source
		String ps = driver.getPageSource();
		System.out.println(ps.contains("html"));
		
		//getWindowHandle(); - Return the window id i.e. generated by Browser
		//Use to handle when multiple windows are opened in the browser
		
		System.out.println("The Window id is : " +driver.getWindowHandle());
		//The Window id is : 5CB5508F8F287CFE55431D9728C819DA
		//The Window id is : F67857C9E12E892C73B0B76C135CCDF2
		//We are getting different window id every time we run the project
		//Browser automatically generated these id's
		//We are getting the window id of that URL which we are using in driver.get
		
		Thread.sleep(5000);
		driver.findElement(By.xpath("//a[normalize-space()='OrangeHRM, Inc']")).click();
		
		//getWindowHandles();
		//Store multiple id of various windows
		//duplicate values are not allowed in set so we use only set not list
		Set<String> windowids = driver.getWindowHandles();
		for(String wid:windowids)
		{
			System.out.println("The Window ids are : " +wid);
		}
		//System.out.println(driver.getWindowHandles());
		
		//driver.close();
	}
}
