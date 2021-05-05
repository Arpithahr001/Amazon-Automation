package AmazonEndTOEnd;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.edge.EdgeDriver;
	import org.testng.annotations.AfterClass;
	import org.testng.annotations.BeforeClass;
	import org.testng.annotations.Parameters;

	public class TestBase {
			WebDriver driver;	
			AmazonPages page;
			@Parameters({"Browser","Url"})
			@BeforeClass
			public void setup(String Browser,String Url)
			{
				if(Browser.equalsIgnoreCase("Chrome"))
				{
					System.setProperty("webdriver.chrome.driver","C:\\Users\\HP\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");

					driver=new ChromeDriver();
					driver.manage().window().maximize();
				}
				if(Browser.equalsIgnoreCase("Edge"))
				{
					System.setProperty("webdriver.edge.driver", "C:\\Users\\HP\\Downloads\\edgedriver_win64\\msedgedriver.exe");
					driver=new EdgeDriver();
				}
				page=new AmazonPages(driver);
				ExcelUtility e=new ExcelUtility();
				driver.get(Url);
			}
			@AfterClass
			public void tearDown()
			{
				driver.quit();
			}

}
