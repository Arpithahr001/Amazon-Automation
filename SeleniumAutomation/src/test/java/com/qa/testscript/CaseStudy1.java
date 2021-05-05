package com.qa.testscript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CaseStudy1 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\HP\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driverChrome = new ChromeDriver();
		driverChrome.get("https://www.rediff.com/");
		String homeTitle = driverChrome.getCurrentUrl();
		System.out.println(homeTitle);
		driverChrome.findElement(By.className("signin")).click();
		Thread.sleep(1000);
		String loginTitle = driverChrome.getCurrentUrl();
		System.out.println(loginTitle);
		driverChrome.navigate().back();
		Thread.sleep(1000);
		String homeTitle2 = driverChrome.getCurrentUrl();
		if(homeTitle.equals(homeTitle2))
		{
			System.out.println("yup!!home title is same");
		}
		else
		{
			System.out.println("nope!! home title isn't same");
		}
		Thread.sleep(1000);
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
		Thread.sleep(1000);
		driverChrome.quit();
	}
}
