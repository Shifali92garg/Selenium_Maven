package Handle_Browser_Window;

import java.time.Duration;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Browser_Window_handling 
{
	public static void main(String args[])
	{
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.get("http://open-source-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//a[normalize-space()='OrangeHRM,Inc']")).click();
		
		//Capture the Window ids
		Set<String> WindowIDs = driver.getWindowHandles();
		
		//1st way
		//We can not use List directly so we Convert set into list

	//	List<String> WindowList = new ArrayList(WindowIDs);
	//	String parent = WindowList.get(0);
	//	String child = WindowList.get(1);
		
	//	System.out.println(parent);
	//	System.out.println(child);
	}
}
