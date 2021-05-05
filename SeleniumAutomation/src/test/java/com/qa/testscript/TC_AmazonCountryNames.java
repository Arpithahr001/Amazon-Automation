package com.qa.testscript;
	import java.util.List;

	import org.openqa.selenium.WebElement;
	import org.testng.Reporter;
	import org.testng.annotations.Test;

	public class TC_AmazonCountryNames extends BaseTestForAmazon{
		
		@Test
		public void Select()
		{
			List<WebElement> Countries = Pages.getAllOptions();
			for (WebElement Options : Countries) {
				Reporter.log(Options.getText()+"  "+Options.getAttribute("href"),true);
			}
		}

	}
