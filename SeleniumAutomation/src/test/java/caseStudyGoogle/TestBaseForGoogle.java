package caseStudyGoogle;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class TestBaseForGoogle {
	WebDriver driver;
	Gp g;
@BeforeClass
public void setup() {
System.setProperty("webdriver.chrome.driver","C:\\Users\\HP\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
 driver=new ChromeDriver();
 g=new Gp(driver);
		//launch the google url
	    driver.get("https://www.google.com./");
}
@AfterClass
public void TearDown() {
	driver.close();
}

}
