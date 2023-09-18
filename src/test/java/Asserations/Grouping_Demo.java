package Asserations;

import org.testng.annotations.Test;

public class Grouping_Demo 
{
	@Test(priority=1,groups= {"sanity","regression"})
	void LoginByEmail()
	{
		System.out.println("This is Login by Email");
	}
	
	@Test(priority=2,groups= {"sanity"})
	void LoginByFacebook()
	{
		System.out.println("This is Login by Facebook");
	}
	
	@Test(priority=3,groups= {"regression"})
	void LoginByWhatsApp()
	{
		System.out.println("This is Login by WhatsApp");
	}
	
	@Test(priority=4,groups= {"sanity","regression"})
	void LoginByInstagram()
	{
		System.out.println("This is Login by Instagram");
	}
	
	@Test(priority=5,groups= {"sanity"})
	void LoginBySnapchat()
	{
		System.out.println("This is Login by Snapchat");
	}
}
