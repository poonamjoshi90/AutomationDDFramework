package com.qa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AccountsuccessPage  {

	public WebDriver driver;
	
	@FindBy(xpath="//div[@id='content']/h1")
	private WebElement sucessmessage;
	
	
	public AccountsuccessPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements( driver,this);
	}
	
	public String  sucessmessage()
	{
	String msg=	sucessmessage.getText();
		return msg;
	}
	
	 
}
