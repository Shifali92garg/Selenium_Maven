package Assignment_3;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Extract_Text_using_getText_method 
{

	public static void main(String[] args) 
	{
		FirefoxDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		
		driver.get("https://demo.nopcommerce.com/login?returnUrl=%2F");
		driver.manage().window().maximize();
		
		// identify Login Button
		WebElement LoginButton = driver.findElement(By.xpath("//button[normalize-space()='Log in']"));

	      //getText() to obtain text
	     System.out.println("Text content of Login Button is : " +LoginButton.getText());
	}
}
