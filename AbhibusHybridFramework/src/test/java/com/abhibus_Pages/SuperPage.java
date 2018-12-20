package com.abhibus_Pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.abhibus_Common_Library.SuperTestScript;

public class SuperPage 
{
	@FindBy(linkText="Sign out")
	private WebElement signoutLink;
	@FindBy(xpath="//*[text()='Hello  Sachin, ']")
	private WebElement helloMessege;
	
	public SuperPage()
	{
		PageFactory.initElements(SuperTestScript.driver,this);
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
