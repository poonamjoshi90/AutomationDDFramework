package com.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	
	public WebDriver driver;
	
	@FindBy(xpath="(//a[@class='dropdown-toggle'])[1]")
	private WebElement MyAccountDropDown;

	
	@FindBy(xpath="//a[text()='Login']")
	private WebElement loginLink;
	
	@FindBy(xpath="(//a[ text()='Register'])[1]")
	private WebElement RegisterLink;
	
	@FindBy(xpath="//input[@name='search']")
	private WebElement searchText;
	
	@FindBy(xpath="//*[@id='search']/span/button/i")
	private WebElement searchbutton;
	
	
	@FindBy(linkText="HP LP3065")
	private WebElement getsearch;
	
	@FindBy(xpath="//div[@id='content']/h2/following-sibling ::p")
	private WebElement validationmessage;


	
	
	public HomePage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void clickMyAccount()
	{
		MyAccountDropDown.click();
	}
	public void clickLoginLink()
	{
		loginLink.click();
	}
	
	public void searchText()
	{
		searchText.sendKeys("Poonam");
	}
	
	public void clickRegisterLink()
	{
		RegisterLink.click();
	}
	
	public void clicksearchbutton()
	{
		searchbutton.click();
	}
	
	public boolean getsearchdisplay()
	{
	boolean searchfind=	getsearch.isDisplayed();
	return searchfind;
	
	}
	
	public String validationmessage()
	{
		String validationmsg=validationmessage.getText();
		return validationmsg ;
	}
}
