package Frame_Handling;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Inner_Frame_Handling 
{
	public static void main(String args[]) throws InterruptedException
	{
		FirefoxDriver driver = new FirefoxDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.get("https://ui.vision/demo/webtest/frames/");
		driver.manage().window().maximize();
		
		//Capture Frame 1
	WebElement frm1 = driver.findElement(By.xpath("/html/frameset/frame[1]"));
	driver.switchTo().frame(frm1);

	driver.findElement(By.name("mytext1")).sendKeys("1111");
	System.out.println("Value entered in 1st Frame");
	Thread.sleep(3000);
	driver.switchTo().defaultContent();
	
	//Capture Frame 3
	WebElement frm3 = driver.findElement(By.xpath("/html/frameset/frameset/frame[2]"));
	driver.switchTo().frame(frm3);
	driver.findElement(By.name("mytext3")).sendKeys("3333");
	System.out.println("Value entered in 3rd Frame");
	Thread.sleep(3000);
	
	driver.switchTo().frame(0);
	
	driver.findElement(By.xpath("//*[@id=\"i8\"]/div[3]/div")).click();
	System.out.println("Selected Inner Frame");
	driver.switchTo().defaultContent();
	Thread.sleep(3000);
	//driver.findElement(By.cssSelector("div.AB7Lab")).click(); 
	//cssSelector with tag name.class name 
	//Class name is same for all the elements that's why 
	//we use only xPath to locate single element
	
	//Capture Frame 2 
	WebElement frm2 = driver.findElement(By.xpath("/html/frameset/frameset/frame[1]"));
	driver.switchTo().frame(frm2);
	driver.findElement(By.name("mytext2")).sendKeys("2222");
	System.out.println("Value entered in 2nd Frame");
	}
}
