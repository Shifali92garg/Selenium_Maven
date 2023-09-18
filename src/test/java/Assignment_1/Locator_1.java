package Assignment_1;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class Locator_1 
{
	public static void main(String args[]) throws InterruptedException
	{
		FirefoxDriver driver = new FirefoxDriver();
		
		
		driver.manage().window().maximize();
		
		driver.get("http://www.automationpractice.p1/index.php");
		
		driver.findElement(By.id("search_query_top")).sendKeys("T-shirts");
		
		driver.findElement(By.name("submit_search")).click();
		
		driver.findElement(By.linkText("Faded Short Sleeve T-shirts")).click();
		
		driver.findElement(By.partialLinkText("Faded Short")).click();
		
		Thread.sleep(3000);
		
		System.out.println("Code Executed Successfully");
		
		//driver.close();
		
	}
}
