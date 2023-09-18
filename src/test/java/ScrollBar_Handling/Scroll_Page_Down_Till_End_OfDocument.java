package ScrollBar_Handling;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Scroll_Page_Down_Till_End_OfDocument 
{
	public static void main(String args[]) throws InterruptedException
	{
		FirefoxDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));
		
		driver.get("https://www.countries-ofthe-world.com/flags-of-the-world.html");
		driver.manage().window().maximize();
		
		JavascriptExecutor js = driver;
	
	//Scroll down till end of the document
	js.executeScript("window.scrollBy(0,document.body.scrollHeight)","");
	System.out.println(js.executeScript("return window.pageYOffset;", ""));
	
	Thread.sleep(2000);
	
	js.executeScript("window.scrollBy(0,-document.body.scrollHeight)","");
	System.out.println(js.executeScript("return window.pageYOffset;", ""));
	
	}
}
