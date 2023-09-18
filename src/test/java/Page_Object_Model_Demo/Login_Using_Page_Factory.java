package Page_Object_Model_Demo;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

//Using Page Factory - Page Object Class creating -- Login
public class Login_Using_Page_Factory 
{
	WebDriver driver;
	
	//Constructor
	Login_Using_Page_Factory(WebDriver driver)//Passing the value 
	{
		this.driver = driver;//Assigning the value
		PageFactory.initElements(driver, this);
	}
	
	//Locators
	@FindBy(xpath = "img[@alt='company-branding']")
	WebElement Logoo;
	
	//2nd way to locate the element using How i.e. how we can locate the element
	//@FindBy(how=How.xpath,using = "img[@alt='company-branding']")
	//WebElement Logo;
	
	@FindBy(name = "username")
	WebElement UserName;
	
	@FindBy(name = "password")
	WebElement Password;
	
	@FindBy(xpath = "//button[@type='submit']")
	WebElement Submit_Button;
	
	@FindBy(xpath = "//img[@alt='company-branding']")
	WebElement Img_Logo;
	
	//@FindBy(tagName = "a")
	//List <WebElement>links;
	//Use for multiple web elements i.e. list of elements
	
	//Actions
	public void SetUsername(String username)
	{
		UserName.sendKeys(username);
	}
	
	public void SetPassword(String password)
	{
		Password.sendKeys(password);
	}
	
	public void click_Submit()
	{
		Submit_Button.click();;
	}
	
	public boolean Check_Logo_Present()
	{
		boolean LogoStatus = Img_Logo.isDisplayed();
		return(LogoStatus);
	}
}
