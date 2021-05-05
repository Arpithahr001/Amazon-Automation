package com.qa.testscript;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CaseStudy5
{
	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\HP\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driverChrome = new ChromeDriver();
		driverChrome.get("https://www.amazon.in/");
		Select drop = new Select(driverChrome.findElement(By.id("searchDropdownBox")));
		List<WebElement> count = drop.getOptions();
		System.out.println(count.size());
		for(WebElement temp:count)
		{
			System.out.println(temp.getText());
		}
		driverChrome.close();
	}

}
