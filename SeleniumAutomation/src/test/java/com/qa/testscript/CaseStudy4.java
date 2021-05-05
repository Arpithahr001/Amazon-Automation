package com.qa.testscript;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CaseStudy4 
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\HP\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driverChrome = new ChromeDriver();
		driverChrome.get("https://www.amazon.in/");
		String title=driverChrome.getTitle();
		int upper=0,lower=0,num=0,spaces=0,special=0;
		for(int i=0;i<title.length();i++)
		{
			char ch=title.charAt(i);
			if(ch>='A' && ch<='Z')
			{
			  upper++;	
			}
			else if(ch>='a' && ch<='z')
			{
				  lower++;	
			}
			else if((int)ch>=1 && (int)ch<=9)
			{
				  num++;	
			}
			else if(ch==' ')
			{
				  spaces++;	
			}
			else
			{
				special++;
			}	
		}
		System.out.println("upper:"+upper);
		System.out.println("lower:"+lower);
		System.out.println("number:"+num);
		System.out.println("spaces:"+spaces);
		System.out.println("special:"+special);
		driverChrome.close();
	}
}