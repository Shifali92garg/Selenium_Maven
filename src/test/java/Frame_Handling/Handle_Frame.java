package Frame_Handling;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Handle_Frame 
{
	public static void main(String args[])
	{
		
		FirefoxDriver driver = new FirefoxDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.get("https://www.selenium.dev/selenium/docs/api/java/index.html?overview-summary.html");
		driver.manage().window().maximize();
		
		//Switch from web page to Frame 1
		driver.switchTo().frame("packageListFrame");
		driver.findElement(By.linkText("org.openqa.selenium")).click();
		
		//We can not Switch from 1 Frame to another Frame directly
		driver.switchTo().defaultContent();
		driver.switchTo().frame("packageFrame");
		driver.findElement(By.linkText("ContextAware")).click();
		
		driver.switchTo().defaultContent();
		driver.switchTo().frame("classFrame");
		
		driver.findElement(By.xpath("/html/body/header/nav/div[1]/div[1]/ul/li[2]")).click();
	}
}
