package Assignment_3;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Press_Enter_Key 
{
	public static void main(String args[]) throws InterruptedException
	{
		FirefoxDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		Thread.sleep(3000);
		driver.findElement(By.name("login")).sendKeys(Keys.ENTER);
	}
}
