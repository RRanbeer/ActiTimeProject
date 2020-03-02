package com.actitime.scripts;

import com.actitime.generic.BaseTest;
import com.actitime.pages.EnterTimeTrackPage;
import com.actitime.pages.LoginPage;

public class TestLoginPage extends BaseTest
{
	
	public static void main(String[] args) 
	{
		openApp("chrome");
		
		LoginPage lp = new LoginPage(driver);
		
		lp.verifyLoginPage(driver);
		
		lp.setUserName("admin");
		lp.setPassWord("manager");
		lp.clickLgnBtn();
		
		EnterTimeTrackPage ent = new EnterTimeTrackPage(driver);
		
		ent.verifyEnterTimeTrackPage(driver);
		
		closeApp();

	}

}
