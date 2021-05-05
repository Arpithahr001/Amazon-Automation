package com.qa.testscript;

	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.edge.EdgeDriver;
	import org.openqa.selenium.ie.InternetExplorerDriver;
	import org.testng.annotations.AfterClass;
	import org.testng.annotations.BeforeClass;
	import org.testng.annotations.Parameters;
	import org.testng.asserts.SoftAssert;

	import org.qa.pages.AmazonPages_02;
	//import com.qa.pages.GoogleBrowsergapges;
	//import com.qa.pages.RediffPages;

	public class BaseTestForAmazon{
		WebDriver driver;
		AmazonPages_02 Pages;
		SoftAssert SAssert;
		AmazonPages_02 Apage;
		@Parameters({"Browser", "Url"})
		@BeforeClass
		public void SetUp(String Browser, String Url)
		{
			
			if(Browser.equalsIgnoreCase("chrome"))
			{
			System.setProperty("webdriver.chrome.driver","C:\\Users\\HP\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
	       driver=new ChromeDriver();
	     // driver.get("https://www.google.com");
			}
			else if(Browser.equalsIgnoreCase("edge")){
	     
	     System.setProperty("webdriver.edge.driver","C:\\Users\\HP\\Downloads\\edgedriver_win64\\msedgedriver.exe");
	     driver=new EdgeDriver();
			}
			else
			{
	      System.setProperty("webdriver.ie.driver","C:\\Users\\HP\\Downloads\\geckodriver-v0.29.1-win64\\geckodriver.exe");
	       driver=new InternetExplorerDriver();
			}
			Pages =new AmazonPages_02(driver);
			driver.get(Url);
			
//			 Apage=new AmazonPages_02(driver);
//			 driver.get(Url);
	////	
		SAssert=new SoftAssert();
	}
		@AfterClass
		public void TearDown()
		{
			driver.close();
		}
		
			
	}


