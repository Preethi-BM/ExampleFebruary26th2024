package com.sgtesting.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeBrowserDemo {
    public static WebDriver obrowser=null;
	public static void main(String[] args) {
		launchBrowser();
		navigateURL();
		closeApplicationURL();

	}
	
	private static void launchBrowser()
	{
		try
		{
			obrowser=new ChromeDriver();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	private static void navigateURL()
	{
		try
		{
			obrowser.get("https://cetonline.karnataka.gov.in/kea/");
			Thread.sleep(5000);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	private static void closeApplicationURL()
	{
		try
		{
			obrowser.quit();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
