package Wait_Commands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Thread_Sleep_Command 
{
	public static void main(String args[]) throws InterruptedException
	{
		WebDriver driver = new ChromeDriver();
		
		//Use to maximize the browser window
		
		//get method
		driver.get("http://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();//Use to maximize the browser window
		
		Thread.sleep(5000);
		driver.findElement(By.name("username")).sendKeys("Admin");
		Thread.sleep(5000);
		
		driver.findElement(By.name("password")).sendKeys("Admin123");
		
		Thread.sleep(5000);
		driver.close();
		
	}
}
