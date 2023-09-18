package Page_Object_Model_Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

//Page Object Class
public class Login_Page 
{	
	WebDriver driver;
	
	//Constructor
	Login_Page(WebDriver driver)//Passing the value to the variable driver
//We want, the value of this constructor driver will pass to the above variable & for this we use this keyword
	{
		this.driver = driver;//Assigning the value to the variable driver
		//this keyword is used to specify the variable of the class
		//this value we will initialize to the WebDriver driver
		
	}
	
	//Locators
	By img_logo_locator = By.xpath("//img[@alt='company-branding']");
	By text_Username_locator = By.name("username");
	By text_password_locator = By.name("password");
	By btn_submit_locator = By.xpath("//button[@type='submit']");
	
	
	//Actions
	public void SetUsername(String username)
	{
		driver.findElement(text_Username_locator).sendKeys(username);
	}
	
	public void SetPassword(String password)
	{
		driver.findElement(text_password_locator).sendKeys(password);
	}
	
	public void click_Submit()
	{
		driver.findElement(btn_submit_locator).click();;
	}
	
	public boolean Check_Logo_Present()
	{
		boolean LogoStatus = driver.findElement(img_logo_locator).isDisplayed();
		return(LogoStatus);
	}
}
