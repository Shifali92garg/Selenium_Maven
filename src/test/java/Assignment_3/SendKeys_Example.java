package Assignment_3;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SendKeys_Example 
{
	public static void main(String args[])
	{
		FirefoxDriver driver = new FirefoxDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("email")).sendKeys("admin@facebook.com");
		driver.findElement(By.id("pass")).sendKeys("admin@123");
	}
}
