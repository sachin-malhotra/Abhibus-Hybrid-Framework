package com.abhibus_Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.abhibus_Common_Library.SuperTestScript;

public class BusListPage 
{
	@FindBy(xpath="/html/body/div[3]/div[3]/div[1]/div[1]/div/div/div[1]/div[3]/div/span[2]/span[1]/img")
	private WebElement boardingPointFilterDropdown;
	@FindBy(xpath="/html/body/div[3]/div[3]/div[3]/div/div[2]/div[3]/div/div[1]/div[2]/div[3]/div[2]/a/span")
	private WebElement selectSeatButton;
	@FindBy(id="O7-11ZZ")
	private WebElement seatIcon;
	@FindBy(id="boardingpoint_id")
	private WebElement boardingPointDropdown;
	@FindBy(name="submit")
	private WebElement continueToPaymentButton;
	
	public BusListPage()
	{
		PageFactory.initElements(SuperTestScript.driver,this);
	}
	public void selectBoardingDropdownFIlter(String boardingPoint)
	{
		Select builder = new Select(boardingPointFilterDropdown);
		builder.selectByVisibleText(boardingPoint);
	}
	public void clickOnSelectSeatButton()
	{
		selectSeatButton.click();
	}
	public void clickOnSeatIcon()
	{
		seatIcon.click();
	}
	public void selectBoardingDropdown(String boardingPoint)
	{
		Select builder = new Select(boardingPointDropdown);
		builder.selectByVisibleText(boardingPoint);
	}
	public void clickOnContinueToPaymentButton()
	{
		continueToPaymentButton.click();
	}
	
}
