package com.qa.testscript;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstWebDriverProgram {
	public static void main(String[] args) {
		//invoking the browser
	System.setProperty("webdriver.chrome.driver","C:\\Users\\HP\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
	ChromeDriver driver = new ChromeDriver();
	driver.get("https://web.whatsapp.com/");
}
}