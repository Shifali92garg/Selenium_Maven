package Assignment_3;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class findElement_VS_findElements 
{
	public static void main(String args[])
	{
		FirefoxDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		
		driver.get("https://demo.nopcommerce.com/");
		driver.manage().window().maximize();
		
		//findElement() --> Returns single WebElement
		
	//1st Scenario -- Search single element and locate single element
		WebElement SearchBox = driver.findElement(By.xpath("//*[@id=\"small-searchterms\"]"));
		SearchBox.sendKeys("Mobiles");
		
	//2nd Scenario -- Search multiple elements but locate the very first element/single element from all the elements
		//Searching elements from bottom of the page
		WebElement FirstElement = driver.findElement(By.xpath("//div[@class='footer-upper']//a"));
		System.out.println(FirstElement.getText());
		
		//findElements() --> Returns multiple WebElements
		List <WebElement> MultipleElements = driver.findElements(By.xpath("//div[@class='footer-upper']//a"));
		System.out.println("Total number of links available on bottom of the page are : " +MultipleElements.size());
		for(WebElement op:MultipleElements)
		{
			System.out.println(op.getText());
		}
	}
}
