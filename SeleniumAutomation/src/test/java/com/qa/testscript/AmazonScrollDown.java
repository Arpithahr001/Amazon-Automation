package com.qa.testscript;


	import org.openqa.selenium.By;
	import org.openqa.selenium.JavascriptExecutor;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;

	public class AmazonScrollDown {
		public static void main(String[] args) throws InterruptedException
		{
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.get("https://www.amazon.in/?ie=UTF8&ext_vrnc=hi&tag=googhydrabk-21&ascsubtag=_k_Cj0KCQjwsqmEBhDiARIsANV8H3aeDjeVT9y7naHGEs0HkLJmyxArFKCbpFMpkyYl-2JyzZGG3z7OrncaArQIEALw_wcB_k_&ext_vrnc=hi&gclid=Cj0KCQjwsqmEBhDiARIsANV8H3aeDjeVT9y7naHGEs0HkLJmyxArFKCbpFMpkyYl-2JyzZGG3z7OrncaArQIEALw_wcB");
			Thread.sleep(3000);
			JavascriptExecutor js=(JavascriptExecutor)driver;
			for(int i=0;i<3;i++)
			{
				js.executeScript("window.scrollBy(0,500)");
				driver.findElement(By.linkText("Careers"));
				driver.findElement(By.linkText("Careers")).click();
				driver.close();
			}
			
		}

}
