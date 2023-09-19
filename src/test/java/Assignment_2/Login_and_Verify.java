package Assignment_2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.*;
public class Login_and_Verify 
{
	public static void main(String args[]) throws InterruptedException
	{
		FirefoxDriver driver = new FirefoxDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		driver.get("https://demo.nopcommerce.com/login?returnUrl=%2F");
		driver.manage().window().maximize();
		
		////Locate UserName and Password fields
		driver.findElement(By.id("Email")).sendKeys("shifali92garg@gmail.com");
		driver.findElement(By.id("Password")).sendKeys("shifali@92");
				
		////Locate the Login Button
		driver.findElement(By.xpath("//button[normalize-space()='Log in']")).click();
		
		Thread.sleep(5000);
		
		//After Login - Locate My account to verify that Login is successful
		driver.findElement(By.className("ico-account")).click();
		
		System.out.println("Login Successful");
		
	}
}
