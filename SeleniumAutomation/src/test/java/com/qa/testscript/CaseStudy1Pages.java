package com.qa.testscript;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.qa.pages.*;
public class CaseStudy1Pages
{
 public static void main(String[] args) 
  {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\HP\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
	WebDriver driverChrome = new ChromeDriver();
	Pages p1=new Pages(driverChrome);
	driverChrome.get("https://www.rediff.com/");
	driverChrome.manage().window().maximize();
	String homeTitle = driverChrome.getCurrentUrl();
	System.out.println(homeTitle);
	p1.getSignin().click();
	String loginTitle = driverChrome.getCurrentUrl();
	System.out.println(loginTitle);
	driverChrome.navigate().back();
	
	String homeTitle2 = driverChrome.getCurrentUrl();
	if(homeTitle.equals(homeTitle2))
	{
		System.out.println("yup!!home title is same");
	}
	else
	{
		System.out.println("nope!! home title isn't same");
	}
	driverChrome.navigate().forward();
	String loginTitle2 = driverChrome.getCurrentUrl();
	if(loginTitle.equals(loginTitle2))
	{
		System.out.println("yup!!login title is same");
	}
	else
	{
		System.out.println("nope!! login title isn't same");
	}
	driverChrome.quit();
    }

  }
