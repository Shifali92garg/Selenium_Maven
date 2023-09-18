package Asserations;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Hard_VS_Soft_Asserations 
{
	@Test
	void Hard_Asserations()
	{
		System.out.println("Testing.....");
		System.out.println("Testing.....");
		System.out.println("Testing.....");
		System.out.println("Testing.....");

		//Assert.assertEquals(1,1);//Pass
		
		Assert.assertEquals(1,2);//Fail
		
		System.out.println("Hard Asserations completed");
		
		//If our Assertion is failed then every code after the Failed Assertion will not executed
		//This is the major drawback of Hard Assertion
		//To overcome from this drawback we will use Soft Assertion
		
	}
}
