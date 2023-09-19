package Assignment_3;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.JavascriptExecutor;	

public class JavaScript_Executor_Example 
{
	public static void main(String[] args) throws InterruptedException 
	{
		FirefoxDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		
		driver.get("https://demo.nopcommerce.com/login?returnUrl=%2F");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		driver.findElement(By.id("Email")).sendKeys("shifali92garg@gmail.com");
		driver.findElement(By.id("Password")).sendKeys("shifali@92");
		System.out.println("Id and Password entered successfully");
		Thread.sleep(3000);
		
		WebElement LoginButton = driver.findElement(By.xpath("//button[normalize-space()='Log in']"));
		
		//Creating the JavascriptExecutor interface object by Type casting		
        JavascriptExecutor js = (JavascriptExecutor)driver;	
        
		//Perform Click on LOGIN button using JavascriptExecutor	
		js.executeScript("arguments[0].click();", LoginButton);
		Thread.sleep(3000);
		//To generate Alert window using JavascriptExecutor. Display the alert message 			
        js.executeScript("alert('Welcome to nopCommerce');");   
        System.out.println("Login Successful");
	}
}
