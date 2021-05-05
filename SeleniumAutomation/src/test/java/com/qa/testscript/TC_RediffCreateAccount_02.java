package com.qa.testscript;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC_RediffCreateAccount_02{
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\HP\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		RediffPages RediffOR = new RediffPages(driver);
		driver.get("https://www.rediff.com/");
		RediffOR.getCreateAccountLink().click();
		RediffOR.getFullNameTextField().sendKeys("kim smith");
		RediffOR.getEmailIdTextField().sendKeys("sith@test.com");
		RediffOR.getCheckAvailabilityBtn().click();
		driver.close();
		
		
	}

	
}
