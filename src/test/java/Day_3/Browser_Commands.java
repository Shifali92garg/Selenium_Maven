package Day_3;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Browser_Commands 
{
	public static void main(String args[]) throws InterruptedException
	{
		ChromeDriver driver = new ChromeDriver();//Use to open the Chrome browser
		
		driver.manage().window().maximize();//Use to maximize the browser window
		
		//get method
		driver.get("http://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		Thread.sleep(3000);
		
		driver.get("http://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(3000);
		//driver.close();
		driver.quit();
	}
}
