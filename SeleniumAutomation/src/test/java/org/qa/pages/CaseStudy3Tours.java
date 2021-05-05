package org.qa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
public class CaseStudy3Tours 
{
	 public CaseStudy3Tours(WebDriver driver)
	  {
		  this.driver=driver;
		  PageFactory.initElements(driver,this);
	  }
		   WebDriver driver;
		   //@FindBy(attribute="value")
		   //WebElement variableName;
		 @FindBy(name="userName")
		  WebElement userName;
		  public WebElement getUserName()
		  {
			  return userName;
		  }
		  @FindBy(name="password")
		  WebElement password;
		  public WebElement getPassword()
		  {
			  return password;
		  }
		  @FindBy(name="submit")
		  WebElement submit;
		  public WebElement getSubmit()
		  {
			  return submit;
		  }
		  @FindBy(linkText="Flights")
		  WebElement booking;
		  public WebElement getBooking()
		  {
			  return booking;
		  }
		  @FindBy(name="passCount")
		  WebElement passcount;
		  public WebElement getPassCount()
		  {
			  return passcount;
		  }
		  @FindBy(name="fromPort")
		  WebElement place;
		  public WebElement getPlace()
		  {
			  return place;
		  }
		  @FindBy(name="toDay")
		  WebElement comeDate;
		  public WebElement getComeDate()
		  {
			  return comeDate;
		  }
		  @FindBy(name="findFlights")
		  WebElement Continue;
		  public WebElement getContinue()
		  {
			  return Continue;
		  }  
}
