package Assignment_3;

import java.time.Duration;

import org.openqa.selenium.firefox.FirefoxDriver;

public class Get_Title_and_URL_and_Verify_both_with_Expected_Value 
{
	public static void main(String args[]) throws InterruptedException
	{
		FirefoxDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		System.out.println("The title of the page is : " +driver.getTitle());
		Thread.sleep(3000);
		String expTitle = "Online Shopping Site for Mobiles, Electronics, Furniture, Grocery, Lifestyle, Books & More. Best Offers!";
		String actTitle = driver.getTitle();
		
		if(actTitle.equals(expTitle))
		{
			System.out.println("Title Verification Successful");
		}
		else
		{
			System.out.println("Title Verification Failed");
		}
		
		Thread.sleep(3000);
		System.out.println("The current URL of the page is : " +driver.getCurrentUrl());
		String expURL = "https://www.flipkart.com/";
		String actURL = driver.getCurrentUrl();
		if(actURL.equals(expURL))
		{
			System.out.println("URL Verification Passed");
		}
		else
		{
			System.out.println("URL Verification Failed");
		}
		Thread.sleep(3000);
		System.out.println(driver.getPageSource());
		
		if ( driver.getPageSource().contains(driver.getTitle()))
		{
	         System.out.println("Title is present in the page source");
	      } 
		else 
		{
	         System.out.println("Title is not present");
	         Thread.sleep(2000);
	     }
		driver.close();
	}
}
