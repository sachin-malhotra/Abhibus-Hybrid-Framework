package com.abhibus_User_Scripts;

import org.testng.annotations.Test;

import com.abhibus_Common_Library.ExcelLibrary;
import com.abhibus_Common_Library.SuperTestScript;
import com.abhibus_Pages.Homepage;

public class SearchBus_TC_102 extends SuperTestScript
{
	@Test
	public void testSearchBus_TC_102()
	{
		//Fetch data from excel and store into variables
		String un = ExcelLibrary.readData("TC_102", 1, 0);
		String pwd = ExcelLibrary.readData("TC_102", 1, 1);
		String srcDestn = ExcelLibrary.readData("TC_102", 1, 2);
		String trgtDestn = ExcelLibrary.readData("TC_102", 1, 3);
		
		//Create objects for all the Webpages
		Homepage hp = new Homepage();
		
		//Perform actions
		hp.clickOnLoginRegisterLink();
		hp.enterEmailIdOrMobileNo(un);
		hp.enterPassword(pwd);
		hp.clickOnSignInButton();
		hp.enterSourceDestinationTextbox(srcDestn);
		hp.enterTargetDestinationTextbox(trgtDestn);
		hp.clickOnDateOfJourneyTextbox();
		hp.clickOnReturnDateTextbox();
		hp.clickOnSearchButton();
	}
}
