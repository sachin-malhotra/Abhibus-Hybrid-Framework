package com.abhibus_Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.abhibus_Common_Library.SuperTestScript;

public class Homepage extends SuperPage
{
	@FindBy(xpath="/html/body/div[3]/div[1]/form/div[1]/div[1]/input")
	private WebElement leavingFromTextbox;
	@FindBy(xpath="/html/body/div[3]/div[1]/form/div[1]/div[2]/input")
	private WebElement goingToTextbox;
	@FindBy(xpath="//*[@id=\"datepicker1\"]")
	private WebElement startCalander;
	@FindBy(xpath="//*[@id=\"datepicker2\"]")
	private WebElement returnCalender;
	@FindBy(linkText="Search")
	private WebElement searchButton;
	
	public Homepage()
	{
		PageFactory.initElements(SuperTestScript.driver,this);
	}
	public void enterSourceDestinationTextbox(String destination)
	{
		leavingFromTextbox.sendKeys(destination);
		leavingFromTextbox.sendKeys(Keys.ENTER);
	}
	public void enterTargetDestinationTextbox(String destination)
	{
		goingToTextbox.sendKeys(destination);
		goingToTextbox.sendKeys(Keys.ENTER);
	}
	public void clickOnDateOfJourneyTextbox()
	{
		startCalander.click();
		SuperTestScript.driver.findElement(By.linkText("26")).click();
	}
	public void clickOnReturnDateTextbox()
	{
		returnCalender.click();
		SuperTestScript.driver.findElement(By.linkText("30")).click();
	}
	public void clickOnSearchButton()
	{
		searchButton.click();
	}
	
}

