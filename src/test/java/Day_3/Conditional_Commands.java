package Day_3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Conditional_Commands 
{
	public static void main(String args[]) throws InterruptedException
	{
		ChromeDriver driver = new ChromeDriver();//Use to open the Chrome browser
		
		driver.manage().window().maximize();//Use to maximize the browser window
		
		//get method
		driver.get("https://demo.nopcommerce.com/register");
		
		//isDisplayed
		
		WebElement logo = driver.findElement(By.cssSelector("img[alt='nopCommerce demo store']"));
		System.out.println(logo.isDisplayed());
		
		//isDisplayed and isEnableds
		WebElement search_box = driver.findElement(By.name("q"));
		System.out.println("The element is displayed : " +search_box.isDisplayed());
		System.out.println("The element is enabled : "+search_box.isEnabled());
		
		//isSelector
		System.out.println("Before Selection......");
		WebElement male_RB = driver.findElement(By.xpath("//input[@id='gender-male']"));
		WebElement female_RB = driver.findElement(By.xpath("//input[@id='gender-female']"));
		
		System.out.println(male_RB.isSelected());
		System.out.println(female_RB.isSelected());
		
		male_RB.click();
		System.out.println("After Selection......");
	//WebElement Male_RB = driver.findElement(By.xpath("//input[@id='gender-male']"));
	//WebElement Female_RB = driver.findElement(By.xpath("//input[@id='gender-female']"));
		System.out.println(male_RB.isSelected());
		System.out.println(female_RB.isSelected());
		
	}
}
