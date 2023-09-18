package Drop_Down;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Select_MultipleOptions_From_DropDown 
{
	public static void main(String args[]) throws InterruptedException
	{
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.get("https://www.jquery-az.com/boots/demo.php?ex=63.0_2");
		driver.manage().window().maximize();
		
	List <WebElement> options = driver.findElements(By.xpath("//ul[contains(@class,'multiselect')]//label"));
		
		System.out.println("The total number of available options : " +options.size());
		
		for(int i=0;i<options.size();i++)
		{
			System.out.println(options.get(i).getText());
		}
		
		//for(int i=0;i<options.size();i++)
		//{
		//	if(options.get(i).getText().equals("Java"))
		//	{
		//		options.get(i).click();
		//	}
		//}
		
		//Selecting multiple options
		for(int i=0;i<options.size();i++)
				{
					String op = options.get(i).getText();
					if(op.equals("Java")||op.equals("Python")||op.equals("C#"))
					{
						options.get(i).click();
					}
				}
				
		//for(WebElement op:options)
		//{
		//	String Text = op.getText();
		//	if(Text.equals("Java")||Text.equals("Python")||Text.equals("C#"))
		//	{
		//		op.click();
		//	}
			
		//}
	}
}
