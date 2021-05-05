package org.qa.pages;


import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class AmazonPages_02 {
	
	WebDriver driver;
	
	
	@FindAll(@FindBy(xpath="//*[@id=\"navFooter\"]/div[4]/ul/li/a")) 
	List<WebElement> AllOptions;
	public List<WebElement> getAllOptions()
{
		return AllOptions;
	}
	
	public AmazonPages_02(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
}