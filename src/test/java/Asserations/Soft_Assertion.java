package Asserations;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
//import org.testng.

public class Soft_Assertion 
{
	@Test
	void Soft_Asserations()
	{
		System.out.println("Testing.....");
		System.out.println("Testing.....");
		System.out.println("Testing.....");
		System.out.println("Testing.....");

		//Assert.assertEquals(1,1);//Pass
		
		SoftAssert SA = new SoftAssert();
		SA.assertEquals(1,2);//Fail
		
		System.out.println("Soft Asserations completed");//This will also executed even after failed assertion
		SA.assertEquals(1,1);//
		
		SA.assertAll();//Mandatory method to use
		//This method will run/execute all the assertions
		//If a single Assertion is failed form all the Assertions then our method is failed
		
	}
}
