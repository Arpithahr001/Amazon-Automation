package com.qa.testscript1;
import java.io.IOException;
import java.util.Set;

import org.openqa.selenium.Keys;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.qa.utility1.ExcelUtility;

public class Amazon2 extends Amazon
{
	@Test(dataProvider="getData")
  public void amazonShop(String input) throws InterruptedException
  {
	 // Thread.sleep(3000);
	  page.getTypetosearch().sendKeys(input);
	  page.getTypetosearch().sendKeys(Keys.ENTER);
	 
      page.getSelecting().click();
      
      Set<String> window=driver.getWindowHandles();
      String handle=null;
      for(String shift : window)
      {
    	  handle=shift;
      }
      driver.switchTo().window(handle);
      
	  page.getCartAdd().click();
	  page.getHome().click();
	  
  }
	@DataProvider
	public Object[][] getData() throws IOException
	{
		String xlPath="C:\\Users\\HP\\eclipse-workspace\\SeleniumAutomation\\src\\test\\java\\com\\qa\\testdata\\testdata.xlsx";
		String xlSheet="Sheet1";
	   int rowCount=ExcelUtility.getRowCount(xlPath, xlSheet);
	   int cellCount=ExcelUtility.getCellCount(xlPath, xlSheet, rowCount);
	   String[][] data= new String[rowCount][cellCount];
	   for(int i=1;i<=rowCount;i++)
	   {
		   for(int j=0;j<cellCount;j++)
		   {
			   data[i-1][j]=ExcelUtility.getcellData(xlPath, xlSheet, i, j);
		   }
	   }
	   return data;
		
	}
}