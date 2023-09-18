package Assignment_2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import java.net.URL;

public class Locate_Element_and_Get_New_URL 
{
	public static void main(String args[]) throws InterruptedException
	{
		FirefoxDriver driver = new FirefoxDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		System.out.println(driver.getCurrentUrl());
		
		driver.findElement(By.xpath("/html/body/div[1]/header/div/div[5]/div[2]/div/div/a[4]")).click();
		
		Thread.sleep(5000);
		String NewPage = driver.getCurrentUrl();
		System.out.println(NewPage);
		
	}
}
