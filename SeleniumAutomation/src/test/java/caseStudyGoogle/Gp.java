package caseStudyGoogle;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Gp {
	 WebDriver driver;
	@FindBy(name="q")
	WebElement inputField;
	public  WebElement getinputField()
	{
		return inputField;
	}
	@FindBy(name="btnK")
	WebElement SearchButton;
	public WebElement getSearchButton()
	{
		return SearchButton;
	}
	public Gp( WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	}