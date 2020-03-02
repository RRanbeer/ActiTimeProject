package com.actitime.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class EnterTimeTrackPage 
{
	@FindBy(xpath="//div[contains(text(),'Settings')]")
	private WebElement settings;
	
	@FindBy(xpath="//a[(text()='Licenses')]")
	private WebElement licenses;
	
	public EnterTimeTrackPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void verifyEnterTimeTrackPage(WebDriver driver)
	{
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.titleContains("actiTIME - Enter Time-Track"));
		String actualTitle = driver.getTitle();
		String expectedTitle = "actiTIME - Enter Time-Track";
		if(expectedTitle.equals(actualTitle))
		{
			System.out.println("You are on the right Home page of ActiTime--->"+expectedTitle);
		}
		else
		{
			System.out.println("You are on the wrong Home page of ActiTime and the right one is--->"+actualTitle);
		}
	}
	
	public void clickSettings()
	{
		settings.click();
	}
	
	public void clickLicences()
	{
		licenses.click();
	}
	
}
