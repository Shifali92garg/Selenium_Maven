package Assignment_3;

import java.time.Duration;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class getText_VS_getAttribute 
{
	public static void main(String args[])
	{
		FirefoxDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		
		driver.get("https://www.tutorialspoint.com/about/about_careers.htm");
		driver.manage().window().maximize();
		
		// identify element
	      WebElement TWUbutton = driver.findElement(By.xpath("/html/body/div[1]/nav/ul/li[1]/a"));

	      //getText() to obtain text
	     System.out.println("Text content is : " +TWUbutton.getText());
	      
	      // get style attribute with getAttribute()
	   System.out.println("getAttribute() method:" + TWUbutton.getAttribute("style"));
	}
}
