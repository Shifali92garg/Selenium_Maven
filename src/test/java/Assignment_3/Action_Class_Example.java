package Assignment_3;

import java.time.Duration;
import java.util.ArrayList;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Action_Class_Example 
{
	public static void main(String args[]) throws InterruptedException
	{
		FirefoxDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		
		//Locate the Search Field, enter data and press enter
		driver.findElement(By.name("field-keywords")).sendKeys("iphone 14 pro" +Keys.ENTER);
		System.out.println("Data Entered in Search Field");
		Thread.sleep(3000);

		//Locate the very first element of search result
		WebElement Result_FirstLink = driver.findElement(By.xpath("//span[text()='Apple iPhone 14 Pro (128 GB) - Deep Purple']"));
		System.out.println("Element Selected");
		Thread.sleep(3000);
		
		//Performing right click on the element to open the link in new tab
		Actions action = new Actions(driver);
			
		action.moveToElement(Result_FirstLink).click().perform();
		System.out.println("Element Clicked");
		Thread.sleep(3000);
		
		//Open new tab by using Window Handle methods
		ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tabs.get(0));
		
		System.out.println("Element opened in New Tab");
	}
}
