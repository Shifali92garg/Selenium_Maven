package Radio_Button_Demo;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Radio_Button 
{
	public static void main(String args[]) throws InterruptedException
	{
		FirefoxDriver driver = new FirefoxDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://demo.guru99.com/test/radio.html");
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		driver.findElement(By.id("vfb-7-1")).click();
		System.out.println("Radio Button Option 1 Selected");	

		Thread.sleep(3000);
		
		driver.findElement(By.id("vfb-7-2")).click();
		System.out.println("Radio Button1 is de-selected and Radio Button2 is selected");
	}
}
