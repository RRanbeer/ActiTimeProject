package com.actitime.scripts;

import com.actitime.generic.BaseTest;
import com.actitime.pages.EnterTimeTrackPage;
import com.actitime.pages.LicensesPage;
import com.actitime.pages.LoginPage;

public class TestLicencesPage extends BaseTest
{
	public static void main(String[] args) throws InterruptedException 
	{
		BaseTest.openApp("chrome");
		
		LoginPage lp = new LoginPage(driver);
		
		lp.verifyLoginPage(driver);
		
		lp.setUserName("admin");
		lp.setPassWord("manager");
		lp.clickLgnBtn();
		
		EnterTimeTrackPage ent = new EnterTimeTrackPage(driver);
		
		ent.verifyEnterTimeTrackPage(driver);
		ent.clickSettings();
		ent.clickLicences();
		
		LicensesPage lnc = new LicensesPage(driver);
		lnc.verifyLicensesPage(driver);
		Thread.sleep(2000);
		lnc.verifyProductEdition();
		Thread.sleep(2000);
		lnc.verifyIssueDate();
		
		lnc.clickLogOut();

		closeApp();

	}

}
