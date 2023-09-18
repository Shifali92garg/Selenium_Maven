package Annotation_TestNG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Annotation_Demo2 
{
	@AfterClass
	void logout()
	{
		System.out.println("This is Logout....");
	}
	
	@BeforeClass
	void login()
	{
		System.out.println("This is Login....");
	}
	
	@Test(priority=1)
	void search()
	{
		System.out.println("This is Search....");
	}
	@Test(priority=2)
	void Advanced_Search()
	{
		System.out.println("This is Advance Search....");
	}
}

//Login will call only once i.e. at the starting
//Logout will call only once i.e. at the end
//Rest all the main methods will called alphabetically or priority order

//Difference between @Beforemethod and @Beforeclass is:
//@Beforemethod will execute before each and every method of the class & 
//@Beforeclass will execute only once before starting executing the methods
