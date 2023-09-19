package Assignment_3;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;


public class Print_Name_and_Number_ofAvailable_Options_in_DropDown 
{
	public static void main(String args[]) throws InterruptedException
	{
		FirefoxDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.get("https://www.bing.com/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		WebElement	DropDown = driver.findElement(By.name("q"));
		DropDown.click();
		System.out.println("Search field clicked");
		
		//Select dp = new Select(DropDown);
		
		//List <WebElement> options = driver.findElements(By.xpath("//*[@id=\"sb_form_q\"]"));
		List <WebElement> options = driver.findElements(By.xpath("//div[contains(@class,'sa_tm_mainText')]"));
		System.out.println("The total number of options in DropDown List are : " +options.size());
		
		for(WebElement op:options)
		{
			System.out.println(op.getText());
		}
	}
}
