package Asserations;

import org.testng.Assert;
import org.testng.annotations.*;
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Data_Providing_To_Method_Using_Assertions 
{
	FirefoxDriver driver;
	
	@Test
	void setup()
	{
		driver = new FirefoxDriver();
	}
	
	void Test_Login(String email,String pwd)
	{
		driver.get("https://demo.nopcommerce.com/login?returnUrl=%2F");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("Emai")).sendKeys(email);
		driver.findElement(By.id("Password")).sendKeys(pwd);
		driver.findElement(By.xpath("//button[normalize-space()='Log in']")).click();
		
		String exp_title = "nopCommerce demo store";
		String act_title = driver.getTitle();
		
		Assert.assertEquals(exp_title, act_title);
	}
	
	//@AfterClass
	//void Tear_Down()
	//{
	//	driver.close();
	//}
	
	@DataProvider(name="dp", indices= {0,2})
	String[][] logindata()
	{
		String[][] data = {{"abc@gmail.com","test123"},
						{"abc1@gmail.com","test123"},
					{"abc2@gmail.com","test123"},
					{"abc3@gmail.com","test123"}};
		
		return(data);
	}
}
