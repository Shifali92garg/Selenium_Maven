package Wait_Commands;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Fluent_Wait 
{
	public static void main(String args[]) throws InterruptedException
	{
		WebDriver driver = new ChromeDriver();
		
		//for its presence once every 5 seconds
		//Declaration
		
		FluentWait mywait = new FluentWait(driver);
				mywait.withTimeout(Duration.ofSeconds(30L));
				mywait.pollingEvery(Duration.ofSeconds(5));
				mywait.ignoring(NoSuchElementException.class);
				
				
				driver.get("http://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
				driver.manage().window().maximize();//Maximize the window
				
				//Usage	
				WebElement UN = (WebElement)mywait.until(ExpectedConditions.visibilityOfElementLocated(By.name("username")));
				UN.sendKeys("Adminn");
		
				WebElement PW = (WebElement)mywait.until(ExpectedConditions.visibilityOfElementLocated(By.name("password")));
				PW.sendKeys("Admin123");
	}				
}