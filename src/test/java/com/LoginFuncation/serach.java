package com.LoginFuncation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

import com.qa.pages.HomePage;

import baseClass.baseclass;

public class serach extends baseclass{
	
	public serach()
	{
		super();
	}
	HomePage homepage;
	
	
//WebDriver driver;


	
	@BeforeMethod
	public void setUp()
	{
		
		driver=initialzeBrowserAndOpenapplicationURL("chrome");
		driver.manage().window().maximize();
		 homepage= new HomePage(driver);
		
		
			
	}
	
	@AfterMethod
	public void tearDown()
	{
		driver.quit();
		
	}
	
  @Test (priority=1)
	public void verifyserachpwithvalidproduct()
	{
	  
	  homepage.searchText();
	  homepage.clicksearchbutton();
	
		Assert.assertTrue(homepage.getsearchdisplay());
	}
  
  @Test(priority=2)
 	public void verifyserachpwithInvalidproduct() throws InterruptedException
 	{
 		
	 
	  homepage.searchText();
	  Thread.sleep(1000);
	  homepage.clicksearchbutton();
	  String actualvalidationmsg =  homepage.validationmessage();
	  	Assert.assertEquals(actualvalidationmsg, "There is no product that matches the search criteria.");
 	}
 // @Ignore
  @Test(priority=3)
	public void verifyserachpwithoutproduct() throws InterruptedException
	{
	 
	  homepage.searchText();
	  homepage.searchText();
	  Thread.sleep(1000);
	  homepage.clicksearchbutton();
	  String actualvalidationmsg =  homepage.validationmessage();
	  	Assert.assertEquals(actualvalidationmsg, "There is no product that matches the search criteria.");
	}
}
