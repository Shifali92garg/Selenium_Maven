package Asserations;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.*;



public class Parametrized_Test
{
	WebDriver driver;
	//We can also use @BeforeMethod here but the drawback is :
	//That method will execute before every other method also
	//We don't need to execute setup method again & again. So we use @BeforeClass here
	@BeforeClass
	@Parameters({"browser","url"})//br passes the value to the browser here
	void setup(String br, String url) throws InterruptedException
	{
		if(br.equals("firefox"))
		{
			driver = new FirefoxDriver();
		}
		else if(br.equals("edge"))
		{
			driver = new EdgeDriver();
		}
		else
		{
			driver = new ChromeDriver();
		}
		
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get(url);
		driver.manage().window().maximize();
		Thread.sleep(5000);
	}
	
	@Test(priority=2)
	void TestLog()
	{
		try
		{
		boolean status = driver.findElement(By.xpath("//img[@alt='company-branding']")).isDisplayed();
		//isDisplayed is used to check whether any element that we want to search is available or not
		Assert.assertEquals(status, true);
		}
		catch(Exception e)
		{
			Assert.fail();
		}
	}
	@Test(priority=1)
	void TestHomePageTitle() throws InterruptedException
	{
		Assert.assertEquals(driver.getTitle(),"OrangeHRM","Titles are not matched");
		Thread.sleep(5000);
	}
	
	@AfterClass
	void closeApp() throws InterruptedException
	{
		Thread.sleep(5000);
	driver.close();	
	}
}
