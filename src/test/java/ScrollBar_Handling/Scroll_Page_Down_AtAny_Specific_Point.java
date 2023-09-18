package ScrollBar_Handling;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Scroll_Page_Down_AtAny_Specific_Point 
{
		public static void main(String args[])
		{
			FirefoxDriver driver = new FirefoxDriver();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));
			
			driver.get("https://www.countries-ofthe-world.com/flags-of-the-world.html");
			driver.manage().window().maximize();
			
			JavascriptExecutor js = driver;
			
		
	//Scroll page down at any specific point -> eg- Scroll page till India Flag Appears
			WebElement India = driver.findElement(By.xpath("//img[@alt='Flag of India']"));
			js.executeScript("arguments[0].scrollIntoView();", India);
		
			//System.out.println(js.executeScript("return window.pageYOffset;", ""));//Vertical Scrolling
			//js.executeScript("return window.pageXOffset;", "");//Horizontal Scrolling
			
		}
}
