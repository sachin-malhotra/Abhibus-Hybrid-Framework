package com.abhibus_User_Scripts;

import org.testng.annotations.Test;

import com.abhibus_Common_Library.ExcelLibrary;
import com.abhibus_Common_Library.SuperTestScript;
import com.abhibus_Common_Library.ValidationLibrary;
import com.abhibus_Pages.SuperPage;

public class LoginLogoutTC_101 extends SuperTestScript
{
	@Test
	public void testLoginLogoutTC_101()
	{
		String un = ExcelLibrary.readData("TC_101", 1, 0);
		String pwd = ExcelLibrary.readData("TC_101", 1, 1);
		String expMsg = ExcelLibrary.readData("TC_101", 1, 2);
		SuperPage sp = new SuperPage();
		sp.clickOnLoginRegisterLink();
		sp.enterEmailIdOrMobileNo(un);
		sp.enterPassword(pwd);
		sp.clickOnSignInButton();
		String actMsg = sp.fetchHelloMessege();
		ExcelLibrary.writeData("TC_101", 1, 3, actMsg);
		String status = ValidationLibrary.verifySucessMessage(expMsg, actMsg);
		ExcelLibrary.writeData("TC_101", 1, 4, status);
		sp.clickOnSignoutLink();
		
	}
}
