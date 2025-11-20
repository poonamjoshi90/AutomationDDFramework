package com.LoginFuncation;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.qa.pages.HomePage;
import com.qa.pages.LoginAccountPage;
import com.qa.pages.MyAccountPage;
import com.qa.listeners.*;
import Utilities.utility;
import baseClass.baseclass;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Login extends baseclass{
	
	public Login()
	{
		super();
	}
	
	@BeforeMethod
	public void setUp()
	{
	
		
		driver=initialzeBrowserAndOpenapplicationURL("chrome");
		HomePage homepage= new HomePage(driver);
		homepage.clickMyAccount();
		homepage.clickLoginLink();
		
		
	}
	
	@AfterMethod
	public void tearDown()
	{
		
		driver.quit();
		
	}
	
	@Test (priority=1, retryAnalyzer=MyReTryAnalyzer.class)
	//@Test (priority=1,dataProvider="TestData")
	public void loginwithValidcredentials(String email,String password) throws InterruptedException
	{
		
		LoginAccountPage loginAccountPage= new LoginAccountPage(driver);
	
		loginAccountPage.enteremailAddress(email);
		loginAccountPage.enterepasswordAddress(password);
		loginAccountPage.clickLoginbutton();
		
		MyAccountPage myAccountPage = new MyAccountPage(driver);
		Assert.assertTrue(myAccountPage.isDisplayEdityouraccountinformation());
		
		
	}
	@DataProvider
	public Object [][]TestData()
	{
		Object [][]data= {{"poonam.joshiit2@gmail.com","password"},{"automationWed-Mar-13-11_23_00-IST-2024P@gmail.com","password"}};
		return data;
		
		
	}
	
	//getTestDataFromExcel
	
	@DataProvider(name="validcredentialsupplied")
	public Object [][]supplyTestDataExcel() throws IOException
	{
		Object [][]data= utility.getTestDataFromExcel("Login");
		return data;
		
		
	}
	
	@Test(priority=2,dataProvider="TestData")
	public void loginwithInValidcredentials(String email,String password) throws InterruptedException
	{
		LoginAccountPage loginAccountPage= new LoginAccountPage(driver);
		
		loginAccountPage.enteremailAddress(email);
		loginAccountPage.enterepasswordAddress(password);
		loginAccountPage.clickLoginbutton();
		loginAccountPage.warnningmessage();
			
		String ExpectedMesssage="Warning: No match for E-Mail Address and/or Password.";
		Assert.assertTrue(loginAccountPage.warnningmessage().contains(ExpectedMesssage), "Expected Message");
	}

}
