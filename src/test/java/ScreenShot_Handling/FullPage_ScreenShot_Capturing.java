package ScreenShot_Handling;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.*;
import java.time.Duration;

import org.openqa.selenium.firefox.FirefoxDriver;

public class FullPage_ScreenShot_Capturing 
{
	public static void main(String args[]) throws IOException, InterruptedException
	{
		FirefoxDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.get("https://demo.nopcommerce.com/");
		driver.manage().window().maximize();
		
	//Capture Full Page ScreenShot --- This functionality is supported only by Selenium 3 and 4
	
	//Type Casting i.e. use it with WebDriver driver = new ChromeDriver();
	//TakesScreenshot ts = (TakesScreenshot)driver; 
		
		TakesScreenshot ts = driver;
		
		File src = ts.getScreenshotAs(OutputType.FILE);
		File targetLocation = new File("C:\\Users\\Shifali\\eclipse-workspace\\Selenium_Maven\\ScreenShots\\FullPageScreenShot.png");
		FileUtils.copyFile(src, targetLocation);
		
		Thread.sleep(3000);
		
		
	}
}
