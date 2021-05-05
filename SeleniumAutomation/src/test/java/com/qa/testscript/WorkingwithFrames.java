package com.qa.testscript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class WorkingwithFrames {
	WebDriver driver;
	@BeforeMethod
	public void setUp() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\HP\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://docs.oracle.com/javase/7/docs/api/");
	}
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
	@Test(priority=1)
	public void frameByIndex() {
		int size=driver.findElements(By.tagName("frame")).size();
		for(int i=0;i<size;i++) {
			WebDriver frame=driver.switchTo().frame(i);
			String title=frame.getTitle();
			int size2=frame.findElements(By.tagName("a")).size();
			System.out.println("Total no of hyperlinks present on the frame" +i +"with the title " +title + "are: " + size2);
			driver.switchTo().defaultContent();
		}
	}
	@Test(priority=2)
	public void frameByName() {
		WebElement frame=driver.findElement(By.xpath("html/frameset/frame"));
		String attribute=frame.getAttribute("name");
		Reporter.log(driver.switchTo().frame(attribute).getTitle(),true);
	}
	@Test(priority=3)
	public void frameByElement() {
		WebElement findElement=driver.findElement(By.xpath("//frame[@title='All Packages']"));
		WebDriver frame=driver.switchTo().frame(findElement);
		int size=frame.findElements(By.tagName("a")).size();
		String title=frame.getTitle();
		System.out.println("Total no of links present on the frame" + title + "is : "+size);
		
		
	}

}
