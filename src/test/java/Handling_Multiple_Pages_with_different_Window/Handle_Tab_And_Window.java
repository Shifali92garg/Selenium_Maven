package Handling_Multiple_Pages_with_different_Window;

import java.time.Duration;

import org.openqa.selenium.WindowType;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Handle_Tab_And_Window 
{
	public static void main(String args[]) throws InterruptedException
	{
		WebDriver driver = new FirefoxDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://www.facebook.com/");
		
		driver.manage().window().maximize();
		Thread.sleep(10000);
		
		driver.switchTo().newWindow(WindowType.TAB);//Open new window tab
		driver.get("https://demo.guru99.com/test/newtours/");
		
		//driver.get("https://demo.guru99.com/test/newtours/");//Open new Window
		driver.switchTo().newWindow(WindowType.WINDOW);
		
	}
}
