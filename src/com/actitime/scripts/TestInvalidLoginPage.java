package com.actitime.scripts;

import com.actitime.generic.BaseTest;
import com.actitime.pages.LoginPage;

public class TestInvalidLoginPage extends BaseTest
{
	public static void main(String[] args) throws InterruptedException 
	{
		openApp("chrome");
		
		LoginPage lp = new LoginPage(driver);
		lp.setUserName("admin");
		lp.clickLgnBtn();
		
		Thread.sleep(2000);
		lp.setPassWord("manager");
		lp.clickLgnBtn();
		
		Thread.sleep(2000);
		lp.clickLgnBtn();
		
		Thread.sleep(2000);
		lp.setUserName("admin1");
		lp.setPassWord("manager");
		lp.clickLgnBtn();
		
		Thread.sleep(2000);
		lp.setUserName("admin");
		lp.setPassWord("manger1");
		lp.clickLgnBtn();
		
		
		

	}

}
