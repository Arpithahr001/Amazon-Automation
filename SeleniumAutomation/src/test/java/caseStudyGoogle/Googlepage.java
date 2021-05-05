package caseStudyGoogle;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
public class Googlepage extends TestBaseForGoogle  {
	@Test
	public void Google () {
	//	System.setProperty("webdriver.chrome.driver","C:\Users\HP\Downloads\chromedriver_win32 (1)\\chromedriver.exe");
		//WebDriver driver=new ChromeDriver();
		
				//Gp g=new Gp(driver);
				
				//launch the google url
			    //driver.get("https://www.google.com./");
			    String Title1="Automation Testing";
			    g.getinputField().sendKeys(Title1);
			    g.getSearchButton().submit();
			    String Title2=driver.getTitle();
			    System.out.println(Title2);
			    if(Title1.equals(Title2))
			    	System.out.println("same");
			    else
			    	
			    	System.out.println("different");
	}
	}