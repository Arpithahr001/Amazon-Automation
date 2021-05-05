package com.qa.testscript;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.qa.pages.*;
class CaseStudy3 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\HP\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driverChrome = new ChromeDriver();
		CaseStudy3Tours page = new CaseStudy3Tours(driverChrome);
		driverChrome.manage().window().maximize();
		driverChrome.get("http://demo.guru99.com/test/newtours/index.php");
		page.getUserName().sendKeys("mercury");
		page.getPassword().sendKeys("mercury");
		Thread.sleep(2000);
		page.getSubmit().click();
		Thread.sleep(2000);
		page.getBooking().click();
		Thread.sleep(2000);
		Select drop = new Select(page.getPassCount());
		drop.selectByIndex(3);
		Thread.sleep(2000);
		Select drop1 = new Select(page.getPlace());
		drop1.selectByIndex(3);
		Thread.sleep(2000);
		Select drop2 = new Select(page.getComeDate());
		drop2.selectByIndex(19);
		Thread.sleep(2000);
		page.getContinue().click();
		driverChrome.close();
	}
}