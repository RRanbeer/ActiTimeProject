package com.actitime.generic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BaseTest implements AutoConstant
{
	static
	{
		System.setProperty(Chrome_Key, Chrome_Value);
		System.setProperty(Firefox_Key, Firefox_Value);
	}
	
	public static WebDriver driver;
	
	public static void openApp(String browser) 
	{
		if(browser.contains("chrome"))
		{
			driver = new ChromeDriver();
		}
		else
		{
			
			driver = new FirefoxDriver();
		}
		driver.manage().timeouts().implicitlyWait(ITO, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get(Url);
	}
	
	public static void timeOut()
	{
	WebDriverWait wait = new WebDriverWait(driver, 10);	
	}
	
	public static void closeApp()
	{
		driver.close();
	}
}
