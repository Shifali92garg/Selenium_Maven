package Utility_Methods_to_Decrease_Coding;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.firefox.FirefoxDriver;

public class Fixed_Deposit_Calculator 
{
	public static void main(String args[]) throws IOException
	{
		FirefoxDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.get("https://www.moneycontrol.com/fixed-income/calculator/state-bank-of-india-sbi/fixed-deposit-calculator-SBI-BSB001.html");
		driver.manage().window().maximize();
		
		
		String file = System.getProperty("user.dir")+"\\testdata\\Simple_Interest.xlsx";
		
		
	}
}
