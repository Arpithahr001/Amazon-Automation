package com.qa.testscript;

import org.qa.pages.ClassStudy2Page;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CaseStudy2Pages 
{
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\HP\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driverChrome = new ChromeDriver();
		ClassStudy2Page page = new ClassStudy2Page(driverChrome);
		driverChrome.manage().window().maximize();
		driverChrome.get("https://www.google.co.in/?gws_rd=ssl");
		String passTitle="automation testing";
		page.getSearch().sendKeys(passTitle);
		page.getSearch().sendKeys(Keys.ENTER);
		String title = driverChrome.getTitle();
		System.out.println(title);
		String title2=passTitle+" - Google Search";
		if(title2.equals(title))
		{
			System.out.println("yes both are same");
		}
		else
		{
			System.out.println("nope they aren't");
		}
		driverChrome.close();
		
	}
}
