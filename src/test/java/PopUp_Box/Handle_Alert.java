package PopUp_Box;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Handle_Alert 
{
	public static void main(String args[]) throws InterruptedException
	{
		FirefoxDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//button[normalize-space()='Click for JS Confirm']")).click();
		Thread.sleep(3000);
		
		//To handle alert pop-up window use Alert
		Alert AlertWindow = driver.switchTo().alert();
		
		AlertWindow.getText();
		System.out.println(AlertWindow.getText());
		
		AlertWindow.accept();//This will click on OK Button in Alert Pop-up
		
		//AlertWindow.dismiss();
		//This will lick on Cancel Button in Alert Pop-up
	}
}
