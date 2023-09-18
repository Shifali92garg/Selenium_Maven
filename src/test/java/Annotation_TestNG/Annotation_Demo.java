package Annotation_TestNG;

//import org.testng.annotations.*;
import org.testng.annotations.Test;//for main method i.e. Search and Advance Search
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;


public class Annotation_Demo 
{
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
	
	@AfterMethod
	void logout()
	{
		System.out.println("This is Logout....");
	}
}

//Without mentioning priority Methods will run according to Alphabetically order
//We don't need to write all the methods in a specific order
//Methods will run according to Annotation and priorities i.e. 
//@BeforeMethod will call 1st and also run before every main method
//@AfterMthod will call last and also run after every main method
//Rest all the main methods will called alphabetically or priority order
