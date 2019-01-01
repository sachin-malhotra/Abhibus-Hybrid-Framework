package com.abhibus_Pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.abhibus_Common_Library.SuperTestScript;

public class SuperPage 
{
	@FindBy(linkText="Login / Register")
	private WebElement loginRegisterLink;
	@FindBy(id="EmailID")
	private WebElement emailIdOrMobileNoTextbox;
	@FindBy(id="LoginPassword")
	private WebElement passwordTextbox;
	@FindBy(id="SignINAjx")
	private WebElement signInButton;
	@FindBy(linkText="Sign out")
	private WebElement signoutLink;
	@FindBy(xpath="//*[text()='Hello Sachin,']")
	private WebElement helloMessege;
	
	public SuperPage()
	{
		PageFactory.initElements(SuperTestScript.driver,this);
	}
	public void clickOnLoginRegisterLink()
	{
		loginRegisterLink.click();
	}
	public void enterEmailIdOrMobileNo(String emailIdOrMobileNo)
	{
		emailIdOrMobileNoTextbox.sendKeys(emailIdOrMobileNo);
	}
	public void enterPassword(String password)
	{
		passwordTextbox.sendKeys(password);
	}
	public void clickOnSignInButton()
	{
		signInButton.click();
	}
	public void clickOnSignoutLink()
	{
		JavascriptExecutor js = (JavascriptExecutor)SuperTestScript.driver;
		js.executeScript("scroll(250, 0)");
		signoutLink.click();
	}
	public String fetchHelloMessege()
	{
		String actmsg=helloMessege.getText();
		return actmsg;
	}
}
