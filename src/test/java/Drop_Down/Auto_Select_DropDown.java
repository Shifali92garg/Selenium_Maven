package Drop_Down;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Auto_Select_DropDown 
{
	public static void main(String args[]) throws InterruptedException
	{
		FirefoxDriver driver = new FirefoxDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.name("q")).sendKeys("Selenium");
		
		Thread.sleep(3000);
		
	List <WebElement> options = driver.findElements(By.xpath("//div[contains(@class,'wM6W7d')]//span"));
		
		//Check number of available options
		System.out.println("The number of available options are : " +options.size());
	
	//Select option from the list
		//for(int i=0;i<options.size();i++)
		//{
		//	String text = options.get(i).getText();
			//System.out.println("The options are : " +text);
			
		//	if(text.equals("selenium ide"))
		//	{
		//		options.get(i).click();
		//		break;
		//	}
		//}
	
		for(WebElement op:options)
		{
			System.out.println(op.getText());
		}
	
	}
}
