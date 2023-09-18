package Page_Object_Model_Demo;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Login_Page_factory_Testing 
{
	WebDriver driver;
	Login_Using_Page_Factory lp;
	
	@BeforeClass
	void setup() throws InterruptedException
	{
		driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(5000);
	}
	
	@Test(priority=1)
	void TestLogo()
	{
		lp = new Login_Using_Page_Factory(driver);
		Assert.assertEquals(lp.Check_Logo_Present(), true);
	}
	
	@Test(priority=2)
	void TestLogin()
	{
		lp.SetUsername("Admin");
		lp.SetPassword("admin123");
		lp.click_Submit();
		
		Assert.assertEquals(driver.getTitle(), "OrangeHRM");
	}
	
	@AfterClass
	void close()
	{
		driver.close();
	}
}
