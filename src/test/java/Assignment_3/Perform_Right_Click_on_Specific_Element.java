package Assignment_3;

import java.time.Duration;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import java.util.ArrayList;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Perform_Right_Click_on_Specific_Element 
{
	public static void main(String args[]) throws InterruptedException
	{
		FirefoxDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		Thread.sleep(4000);
		
		WebElement Mobiles = driver.findElement(By.cssSelector("a.nav-a:nth-child(5)"));
		Thread.sleep(3000);
		
		
	//Performing right click on the element to open the link in new tab
		Actions action = new Actions(driver);
		
		action.moveToElement(Mobiles).contextClick().perform();
		System.out.println("Element right clicked");		
	}
}


