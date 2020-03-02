package com.actitime.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LicensesPage
{
	@FindBy(xpath="//nobr[text()='Product Edition:']/../../td[2]")
	private WebElement ProductEdition;
	
	@FindBy(xpath="//nobr[text()='Issue Date:']/../../td[2]")
	private WebElement IssueDate;
	
	
	@FindBy(id="logoutLink")
	private WebElement lgOut;
	
	public LicensesPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void verifyLicensesPage(WebDriver driver)
	{
		String actualTitle = driver.getTitle();
		String expectedTitle = "actiTIME - Licenses";
		if(actualTitle.equals(expectedTitle))
		{
			System.out.println("You are on the right Licenses page of ActiTime--->"+expectedTitle);
		}
		else
		{
			System.out.println("You are on the wrong Lincenses page of ActiTime and the right one is--->"+actualTitle);
		}
	}
	
	public void verifyProductEdition()
	{
		String actualTitle = ProductEdition.getText();
		String expectedTitle = "actiTIME 2017.4";
		if(actualTitle.equals(expectedTitle))
		{
			System.out.println("Product Edition is Verified and Test Case is Pass--->"+expectedTitle);
		}
		else
		{
			System.out.println("Product Edition is NOT Verified and Test Case is Fail and the real Product Edition is--->"+actualTitle);
		}
		
	}
	
	public void verifyIssueDate()
	{
		String actualTitle = IssueDate.getText();
		String expectedTitle = "Jul 14, 2017";
		if(actualTitle.equals(expectedTitle))
		{
			System.out.println("ActiTime Issue Date is Verified and Test Case is Pass--->"+expectedTitle);
		}
		else
		{
			System.out.println("Issue Date is NOT Verified and Test Case is Fail and the actual ISsue Date is--->"+actualTitle);
		}
		
	}
	
	public void clickLogOut()
	{
		lgOut.click();
	}
	
}
