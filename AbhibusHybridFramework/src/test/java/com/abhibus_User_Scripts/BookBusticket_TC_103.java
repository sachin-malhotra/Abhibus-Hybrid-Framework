package com.abhibus_User_Scripts;

import org.testng.annotations.Test;

import com.abhibus_Common_Library.ExcelLibrary;
import com.abhibus_Common_Library.SuperTestScript;
import com.abhibus_Pages.BusListPage;
import com.abhibus_Pages.Homepage;

public class BookBusticket_TC_103 extends SuperTestScript
{
	@Test
	public void testBookBusticket_TC_103()
	{
		//Fetch data from excel and store into variables
				String un = ExcelLibrary.readData("TC_103", 1, 0);
				String pwd = ExcelLibrary.readData("TC_103", 1, 1);
				String srcDestn = ExcelLibrary.readData("TC_103", 1, 2);
				String trgtDestn = ExcelLibrary.readData("TC_104", 1, 3);
				String brdgPnt = ExcelLibrary.readData("TC_104", 1, 4);
				
				//Create objects for all the Webpages
				Homepage hp = new Homepage();
				BusListPage blp = new BusListPage();
				
				//Perform actions
				hp.clickOnLoginRegisterLink();
				hp.enterEmailIdOrMobileNo(un);
				hp.enterPassword(pwd);
				hp.clickOnSignInButton();
				hp.enterSourceDestinationTextbox(srcDestn);
				hp.enterTargetDestinationTextbox(trgtDestn);
				hp.clickOnDateOfJourneyTextbox();
				hp.clickOnSearchButton();
				blp.selectBoardingDropdownFIlter(brdgPnt);
				blp.clickOnSelectSeatButton();
				blp.clickOnSeatIcon();
				blp.selectBoardingDropdown(brdgPnt);
				blp.clickOnContinueToPaymentButton();
	}
}
