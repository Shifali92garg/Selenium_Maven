package Asserations;

import org.testng.annotations.Test;
import org.testng.asserts.*;
import org.testng.Assert;

public class Asserations_Demo 
{
	@Test
	
	void test()
	{
		int x=10;
		int y=10;
		//if(x==y)
		//{
		//	System.out.println("Test Passed");
		//}
		//else
		//{
		//	System.out.println("Test Failed");
		//}
	
	//Assert.assertEquals(x,y);
	//Assert.assertTrue(true);
	//Assert.assertTrue(false);
	
	//Assert.assertEquals("actual","expected","description");
//Purpose of the description is to display/print in the console that the actual and expected are not same

	//Assert.assertEquals(x>y,true, "x is not greater than y");
	
	String s1 = "abc";
	String s2 = "abc";
	Assert.assertEquals(s1,s2, "s1 is not equals to s2");//Test Pass
	Assert.assertNotEquals(s1, s2);//Test Fail	
	
	String s3 = "abc";
	String s4 = "abc1";
	Assert.assertEquals(s1,s2, "s1 is not equals to s2");//Test Fail
	Assert.assertNotEquals(s1, s2);//Test Pass
	
	if(true)
	{
		Assert.assertTrue(true);
		//Assert.pass(); This method is not available in Assert
	}
	else
		//Assert.assertTrue(false);
		Assert.fail();//We can use this in place of the above method
		//This is a dead code because control will never reach to this code
	
	
	}
	
}
