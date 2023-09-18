package Interaction;

import java.time.Duration;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.JavascriptExecutor;


public class Interaction_With_Elements_Using_JS 
{
	public static void main(String args[])
	{
		FirefoxDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));
		
		//WebDriver driver= new FirefoxDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		
		driver.manage().window().maximize();
		
		
		//JavaScriptExecutor js = (JavaScriptExecutor) driver;//Type Casting
		
		JavascriptExecutor js = driver;
		
		//Enter Value in Input Box using JavaScript
		WebElement InputBox = driver.findElement(By.xpath("//input[@id='name']"));
		js.executeScript("arguments[0].setAttribute('value','Shef')", InputBox);
		
		//Select element in RadioButton
		WebElement Male_RB = driver.findElement(By.id("male"));
		//Male_RB.click(); //using selenium
		js.executeScript("arguments[0].click();",Male_RB);
		
		//Select element from CheckBox
		WebElement CheckBox = driver.findElement(By.id("Sunday"));
		//CheckBox.click();
		js.executeScript("arguments[0].click();",CheckBox);
	}
}
