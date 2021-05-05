package com.qa.testscript1;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.qa.pages.AmazonPage;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

		public class Amazon
		{
			WebDriver driver;
			AmazonPage page;

			@Parameters({"Browser"})
			@BeforeClass
			public void SetUp(String Browser)
			{
				
				if(Browser.equalsIgnoreCase("chrome"))
				{
					System.setProperty("webdriver.chrome.driver","C:\\Users\\HP\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
				 driver = new ChromeDriver();
				}
				else if(Browser.equalsIgnoreCase("edge")){
				     
				     System.setProperty("webdriver.ie.driver","C:\\Users\\HP\\Downloads\\edgedriver_win64\\edgedriver_win64.exe");
		     driver=new EdgeDriver();
				}
				else
				{
					System.setProperty("webdriver.gecko.driver","C:\\Users\\HP\\Downloads\\geckodriver-v0.29.1-win64\\geckodriver.ex");
				      driver=new FirefoxDriver();
				}
				page =new AmazonPage(driver);
				driver.get("https://www.amazon.in/");
				driver.manage().window().maximize();
				  page.getSignin().click();
				  page.getEmail().sendKeys("arpitha.hr001@gmail.com");
				  page.getCont().click();
				  page.getPass().sendKeys("Chandragiri@11");
				  page.getSubmit().click();
				}
			
			@AfterClass
			public void TearDown()
			{
				page.getCart().click();
				  page.getBuy().click();
				  driver.navigate().back();
				  page.getHome().click();
				page.getSideTab().click();
				page.getSignOut().click();
				driver.quit();
			}
			
		}
		
	    