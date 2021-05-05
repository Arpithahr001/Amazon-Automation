package com.qa.testscript;


	import org.openqa.selenium.By;
	import org.openqa.selenium.JavascriptExecutor;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.testng.annotations.Test;

	public class ScrollDown 
	{
		@Test
		public void setUp()
		{
			 System.setProperty("webdriver.chrome.driver","C:\\Users\\HP\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
			  WebDriver driver = new ChromeDriver();
			  driver.get("https://www.amazon.in");
			  JavascriptExecutor js =(JavascriptExecutor)driver;
			  WebElement flag = driver.findElement(By.linkText("Careers"));
			 js.executeScript("arguments[0].scrollIntoView();",flag);
			 flag.click();
			 String title = driver.getTitle();
			 
			 if(title.contains("jobs"))
				 System.out.println("You are on carreer page");
			 else
				 System.out.println("title not found");
			 driver.close();
		}
}
