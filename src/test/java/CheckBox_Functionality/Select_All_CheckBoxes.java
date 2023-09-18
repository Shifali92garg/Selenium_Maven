package CheckBox_Functionality;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Select_All_CheckBoxes 
{
	public static void main(String args[]) throws InterruptedException
	{
		FirefoxDriver driver = new FirefoxDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		
		
		
		//Handle single Check-Box
		//driver.findElement(By.xpath("//[@id='Sunday']")).click();
		
		
	List<WebElement> checkboxes = driver.findElements(By.xpath("//*[@class='form-check-input'][@type='checkbox']"));
		System.out.println("The total number of CheckBoxes are : " +checkboxes.size());
		
		//How to select all the check-boxes
		//for(int i=0;i<checkboxes.size();i++)
		//{
			//WE get the click operation on List
		//	checkboxes.get(i).click();
			
			//checkboxes[i].click();
			//It is not working bcoz its not an array
		//}
		
		//for each loop
		//for(WebElement chkb:checkboxes)
		//{
		//	chkb.click();
		//}
		
		//Select last 2 Check-boxes
	//	for(int i=5;i<checkboxes.size();i++)
		//{
		//	checkboxes.get(i).click();
		//}
		
	//	for(int i=0;i<3;i++)
	//	{
	//		checkboxes.get(i).click();
	//	}
		
		//Unchecked or Clear- Check-boxes//Select 1st 3, unselect these and select rest of the 4
		//for(int i=0;i<3;i++)
		//	{
		//		checkboxes.get(i).click();
		//	}	
		
		Thread.sleep(3000);
		
		
		for(int i=3;i<checkboxes.size();i++)
			{
				checkboxes.get(i).click();
			}
		
		//for(WebElement chkb:checkboxes)
		//{
		//	if(chkb.isSelected())
		//	{
		//		chkb.click();
		//		}
		//}
		
		
		//If not selected then selected the elements
		//for(WebElement chkb:checkboxes)
		//{
		//	if(!(chkb.isSelected()))
		//	{
		//		chkb.click();
		//	}
		
	}
}
