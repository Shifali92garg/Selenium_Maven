package Asserations;

import org.testng.Assert;
import org.testng.annotations.*;
import org.openqa.selenium.By;

public class Invocation_Count_Demo 
{
	@Test(invocationCount=5)
	void Test()
	{
		System.out.println("Testing");
	}
}
