package com.abhibus_Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.abhibus_Common_Library.SuperTestScript;

public class LoginPage extends SuperPage
{
	@FindBy(linkText="Login / Register")
	private WebElement loginRegisterLink;
	@FindBy(id="EmailID")
	private WebElement emailIdOrMobileNoTextbox;
	@FindBy(id="LoginPassword")
	private WebElement passwordTextbox;
	@FindBy(id="SignINAjx")
	private WebElement signInButton;
	
	public LoginPage()
	{
		PageFactory.initElements(SuperTestScript.driver, this);
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
}
