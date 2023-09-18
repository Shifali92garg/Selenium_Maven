package Assignment_2;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Open_New_Window_by_Clicking_Element 
{
	public static void main(String args[]) throws InterruptedException
	{
		FirefoxDriver driver = new FirefoxDriver();
	    driver.get("https://www.amazon.in/");
	    driver.manage().window().maximize();
	    System.out.println(driver.getCurrentUrl());
	    Thread.sleep(3000);
	    
	    driver.findElement(By.name("field-keywords")).sendKeys("iphone 14 pro" +Keys.ENTER);
	    Thread.sleep(3000);
	    
	WebElement firstlink = driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[1]/div[1]/div/span[1]/div[1]/div[3]/div/div/div/div/div/div/div/div[2]/div/div/div[1]/h2/a/span"));
	   
	Actions action = new Actions(driver);
	
		action.keyDown(Keys.CONTROL).moveToElement(firstlink).click().perform();
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		
		ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tabs.get(1));
		//driver.switchTo().window(tabs.get(2));//open new tabs with link but we still is on current page
		
	}
}
