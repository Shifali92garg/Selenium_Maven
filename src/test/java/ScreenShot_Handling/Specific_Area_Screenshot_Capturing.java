package ScreenShot_Handling;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Specific_Area_Screenshot_Capturing 
{
	public static void main(String args[]) throws IOException, InterruptedException
	{
		FirefoxDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.get("https://demo.nopcommerce.com/");
		driver.manage().window().maximize();
		
		TakesScreenshot ts = driver;
		
		WebElement FeaturedProducts = driver.findElement(By.xpath("//div[@class='product-grid home-page-product-grid']"));
		
		File src = FeaturedProducts.getScreenshotAs(OutputType.FILE);
		File targetLocation = new File("C:\\Users\\Shifali\\eclipse-workspace\\Selenium_Maven\\ScreenShots\\SpecificAreaScreenShot.png");
		FileUtils.copyFile(src, targetLocation);
		
		Thread.sleep(3000);
		
		
		
	}
}
