package com.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginAccountPage {
	
	public WebDriver driver;
	
	@FindBy(name="email")
	private WebElement accountemailId;
	
	@FindBy(name="password")
	private WebElement accountpassword;
	
	@FindBy(xpath="//input[@value='Login']")
	private WebElement loginbutton;
	
	@FindBy(xpath="//div[@class='alert alert-danger alert-dismissible']")
	private WebElement warnningmessage;
	
	
	public LoginAccountPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void enteremailAddress(String email)
	{
		accountemailId.sendKeys(email);
	}
	
	public void enterepasswordAddress(String password)
	{
		accountpassword.sendKeys(password);
	}
	
	public void clickLoginbutton()
	{
		loginbutton.click();
	}
	
	public String warnningmessage()
	{
	String warrningmsg=	warnningmessage.getText();
		return warrningmsg;
		
	}
	
	
	
	
	

}
