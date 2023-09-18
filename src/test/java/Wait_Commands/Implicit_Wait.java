package Wait_Commands;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Implicit_Wait 

{
	public static void main(String args[]) throws InterruptedException
	{
		WebDriver driver = new FirefoxDriver();
		
	//WebDriver is the parent of all the drivers like ChromeDriver, FirefoxDriver
	//We can't create the object of parent class
	//We can only use the reference of parent class
		
		//We can also use this command
		//ChromeDriver driver = new ChromeDriver();
		//Created object of Child class i.e. ChromeDriver class
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	//It will wait for the element to be loaded completely on the web page
	//If the element is still not loaded within 5 seconds then it throws exception
	//If the web element is loaded within 3 seconds then 
	//it will not wait for another 2 seconds like thread.sleep do and continue forward
		
		driver.get("http://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		
		driver.findElement(By.name("username")).sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("Admin123");
		
		Thread.sleep(5000);
		driver.close();
	}
}
