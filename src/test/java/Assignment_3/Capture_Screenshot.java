package Assignment_3;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Capture_Screenshot 
{
	public static void main(String args[]) throws IOException
	{
		FirefoxDriver driver = new FirefoxDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		driver.get("https://www.amazon.com/");
		driver.manage().window().maximize();
		
		TakesScreenshot screenshot = driver;
		
		File scrFile = screenshot.getScreenshotAs(OutputType.FILE);
		File targetLocation = new File("C:\\Users\\Shifali\\eclipse-workspace\\Selenium_Maven\\ScreenShots\\FullPageSS.png");
		FileUtils.copyFile(scrFile, targetLocation);
	}
}
