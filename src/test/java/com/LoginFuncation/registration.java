package com.LoginFuncation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.pages.AccountsuccessPage;
import com.qa.pages.HomePage;
import com.qa.pages.RegisterPage;

import Utilities.utility;
import baseClass.baseclass;
import io.github.bonigarcia.wdm.WebDriverManager;

public class registration extends baseclass {
	//WebDriver driver;
	
	public registration()
	{
		super();
	}
	
	
	@BeforeMethod
	public void setUp()
	{
		
		driver=initialzeBrowserAndOpenapplicationURL("chrome");
		driver.manage().window().maximize();
		HomePage homepage= new HomePage(driver);
		homepage.clickMyAccount();
		homepage.clickRegisterLink();
		
	
		
	}
	
	@AfterMethod
	public void tearDown()
	{
		//driver.quit();
		
	}
	@Test (priority=2)
	public void registrationwithMandatryField() throws InterruptedException
	{
		RegisterPage registerPage = new RegisterPage(driver);
		
		registerPage.firstName("Poonam989");
		registerPage.lastName();
		registerPage.emailId();
		registerPage.telephone();
		registerPage.password();
		registerPage.confirmPassword();
		registerPage.agree();
		registerPage.ContinueButton();
		AccountsuccessPage accountsuccessPage= new AccountsuccessPage(driver);
		String actualMessage=	accountsuccessPage.sucessmessage();
		Assert.assertEquals(actualMessage, "Your Account Has Been Created!");
			
	}
	@Test(priority=1)
	public void registrationPagewithAllField() throws InterruptedException
	{
      RegisterPage registerPage = new RegisterPage(driver);
		
		registerPage.firstName("Poonam567");
		registerPage.lastName();
		registerPage.emailId();
		registerPage.telephone();
		registerPage.password();
		registerPage.confirmPassword();
		registerPage.agree();
		registerPage.newsletter();
		registerPage.ContinueButton();
		
		AccountsuccessPage accountsuccessPage= new AccountsuccessPage(driver);
	String actualMessage=	accountsuccessPage.sucessmessage();
	Assert.assertEquals(actualMessage, "Your Account Has Been Created!");
		
	}

}
