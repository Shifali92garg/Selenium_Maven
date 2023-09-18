package Wait_Commands;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Explicit_Wait 
{
	public static void main(String args[]) throws InterruptedException
	{
		WebDriver driver = new FirefoxDriver();
		
		//Declare & Usage
		
		//Declaration
		WebDriverWait ExplicitWait = new WebDriverWait(driver,Duration.ofSeconds(10));
		
		driver.get("https://www.facebook.com/");
		
		driver.manage().window().maximize();//Maximize the window
		
		//Usage
		ExplicitWait.until(ExpectedConditions.visibilityOfElementLocated(By.name("email")));
		WebElement UN = driver.findElement(By.name("email"));
		UN.sendKeys("Admin");
		
		ExplicitWait.until(ExpectedConditions.visibilityOfElementLocated(By.name("pass")));
		WebElement PW = driver.findElement(By.name("pass"));
		PW.sendKeys("Admin1234");
		
	}
		
}
