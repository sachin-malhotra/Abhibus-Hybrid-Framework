package com.abhibus_User_Scripts;

import org.testng.annotations.Test;

import com.abhibus_Common_Library.ExcelLibrary;
import com.abhibus_Common_Library.SuperTestScript;
import com.abhibus_Pages.LoginPage;

public class LoginLogoutTC_101 extends SuperTestScript
{
	@Test(invocationCount=5)
	public void testLoginLogoutTC_101()
	{
		String un = ExcelLibrary.readData("TC_101", 1, 0);
		String pwd = ExcelLibrary.readData("TC_101", 1, 1);
		LoginPage lp = new LoginPage();
		lp.clickOnLoginRegisterLink();
		lp.enterEmailIdOrMobileNo(un);
		lp.enterPassword(pwd);
		lp.clickOnSignInButton();
		lp.clickOnSignoutLink();
		
	}
}
