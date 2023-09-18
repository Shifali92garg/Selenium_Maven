package Assignment_3;

import java.io.IOException;
import java.time.Duration;
import java.net.URL;

import org.openqa.selenium.firefox.FirefoxDriver;

public class Navigate_Back_and_Forward 
{
	public static void main(String args[]) throws IOException, InterruptedException
	{
		FirefoxDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	
		URL url = new URL("https://www.facebook.com/");
		driver.navigate().to(url);
		System.out.println(driver.getCurrentUrl());
		Thread.sleep(3000);
		
		driver.navigate().to("https://www.amazon.in/");
		System.out.println(driver.getCurrentUrl());
		Thread.sleep(3000);
		
		driver.navigate().back();
		System.out.print("After back command, the current URL is : ");
		System.out.println(driver.getCurrentUrl());
		Thread.sleep(3000);
		
		driver.navigate().forward();
		System.out.print("After forward command, the current URL is :");
		System.out.println(driver.getCurrentUrl());
		
	}
}
