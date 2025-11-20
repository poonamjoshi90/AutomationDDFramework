package com.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utilities.utility;

public class RegisterPage {
	
public WebDriver driver;
	
	@FindBy(id="input-firstname")
	private WebElement FirstName;
	
	
	@FindBy(id="input-lastname")
	private WebElement LastName;
	
	@FindBy(id="input-email")
	private WebElement emailId;
	
	@FindBy(id="input-telephone")
	private WebElement telephone;
	
	@FindBy(id="input-password")
	private WebElement password;
	
	@FindBy(id="input-confirm")
	private WebElement confirmPassword;
	
	@FindBy(name="agree")
	private WebElement agree;
	
	@FindBy(xpath="//input[@value='Continue']")
	private WebElement ContinueButton;
	
	@FindBy(name="newsletter")
	private WebElement newsletter;
	
	
	public RegisterPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void firstName(String fName)
	{
		FirstName.sendKeys(fName);
	}
	
public void lastName()
	{
	LastName.sendKeys("User");
	}

	
	public void emailId()
	{
	String  email=	utility.generatetimestap();
		emailId.sendKeys(email);
		
	}
	
	public void telephone()
	{
		telephone.sendKeys("909909891");
	}
	
	public void confirmPassword()
	{
		confirmPassword.sendKeys("password12");
	}
	
	public void agree()
	{
		agree.click();
	}
	
	public void password()
	{
		password.sendKeys("password12");
	}
	
	public void ContinueButton()
	{
		ContinueButton.click();
	}
	
	public void newsletter()
	{
		newsletter.click();
	}
}
