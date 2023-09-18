package Assignment_1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Login_to_Facebook 
{
	public static void main(String args[]) throws InterruptedException
	{
		FirefoxDriver driver = new FirefoxDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.get("https://auth.geeksforgeeks.org/");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("luser")).sendKeys("user123");
		
		driver.findElement(By.id("password")).sendKeys("password456");
	}
}
