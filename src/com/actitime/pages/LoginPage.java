package com.actitime.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage 
{
//Decleraton
	@FindBy(id="username")
	private WebElement user;
	
	@FindBy(name="pwd")
	private WebElement pword;
	
	@FindBy(xpath="//div[text()='Login ']")
	private WebElement lgn;
	
	public void verifyLoginPage(WebDriver driver)
	{
		String actualTitle = driver.getTitle();
		String expectedTitle = "actiTIME - Login";
		if(expectedTitle.equals(actualTitle))
		{
			System.out.println("You are on the right Login page of ActiTime--->"+expectedTitle);
		}
		else
		{
			System.out.println("You are on the wrong Login page of ActiTime and the right one is--->"+actualTitle);
		}
	}
	
	public LoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void setUserName(String un)
	{
		user.sendKeys(un);
	}
	
	public void setPassWord(String pw)
	{
		pword.sendKeys(pw);
	}
	
	public void clickLgnBtn()
	{
		lgn.click();
	}
}
