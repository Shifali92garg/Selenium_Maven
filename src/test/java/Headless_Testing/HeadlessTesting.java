package Headless_Testing;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HeadlessTesting 
{
	public static void main(String args[]) throws InterruptedException
	{
		FirefoxOptions options = new FirefoxOptions();
		//options.setHeadless(true);//older method thats why it is crossed
		
		options.addArguments("--headless=new");
	
		//Open web browser
		//open URL
		//Enter username
		//enter password
		//click on login
		
		WebDriverManager.firefoxdriver().setup();
		
		//Open Firefox Browser
		FirefoxDriver driver = new FirefoxDriver();
		
		//Open URL
		//https://auth.geeksforgeeks.org/
		driver.get("https://auth.geeksforgeeks.org/");
		
		driver.findElement(By.id("luser")).sendKeys("shifali92garg@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.id("password")).sendKeys("tarunshefuu1219");
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div[1]/section[1]/form/button")).click();
		System.out.println("Button successfully clicked");
	}
}
