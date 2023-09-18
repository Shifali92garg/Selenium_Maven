package Annotation_TestNG;

import org.testng.annotations.BeforeClass;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;


public class All_Annotations 
{
	@BeforeSuite
	void BeforeSuite()
	{
		System.out.println("This is Before Suite Method....");
	}
	
	@AfterClass
	void Signout()
	{
		System.out.println("This is Signout Method of After Class....");
	}
	
	@BeforeClass
	void Sigin()
	{
		System.out.println("This is Sigin Method of Before Class....");
	}
	
	@BeforeMethod
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
	
	@BeforeTest
	void Before_Test()
	{
		System.out.println("This is Before Test Method....");
	}
	
	@AfterMethod
	void logout()
	{
		System.out.println("This is Logout....");
	}
	
	@AfterTest
	void After_Test()
	{
		System.out.println("This is After Test Method....");
	}
	
	@AfterSuite
	void AfterSuite()
	{
		System.out.println("This is After Suite Method....");
	}
}
