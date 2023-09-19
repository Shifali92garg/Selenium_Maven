package Assignment_3;

import java.time.Duration;

import org.openqa.selenium.firefox.FirefoxDriver;

public class Get_Title_ofPage_and_Print_it 
{
	public static void main(String args[]) throws InterruptedException
	{
FirefoxDriver driver = new FirefoxDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		
		Thread.sleep(5000);
		System.out.println("The title of the page is : " +driver.getTitle());
		
		Thread.sleep(5000);
		driver.close();
	}
}
