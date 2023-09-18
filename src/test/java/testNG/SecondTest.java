package testNG;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SecondTest 
{
	WebDriver driver;
	//@Test(priority=11)
		//Run | Debug	
		void OpenApp()
		{
			FirefoxDriver driver = new FirefoxDriver();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
			
			driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
			
		}
		
		//@Test(priority=22)
		//Run | Debug	
		void login()
		{
			driver.findElement(By.name("username")).sendKeys("Admin");
			driver.findElement(By.name("password")).sendKeys("admin123");
			driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();
		}
		
		//@Test(priority=33)
		//Run | Debug
		void close()
		{
			driver.close();
		}
}
