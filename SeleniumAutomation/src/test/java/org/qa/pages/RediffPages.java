package org.qa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RediffPages {
	WebDriver driver;
	@FindBy(linkText="CreateAccount")
	WebElement CreateAccountLink;
	public WebElement getCreateAccountLink() {
		return CreateAccountLink;
	}
	@FindBy(xpath="//*[@id=\"tblcrtac\"]/tbody/tr[3]/td[3]/input")
	WebElement FullNameTextField;
	public WebElement getFullNameTextField() {
		return FullNameTextField;
	}
	@FindBy(xpath="//*[@id=\"tblcrtac\"]/tbody/tr[7]/td[3]/input[1]")
	WebElement EmailIdTextField;
	public WebElement getEmailIdTextField() {
		return EmailIdTextField;
	}
	@FindBy(className="btn_checkavail")
	WebElement CheckAvailabilityBtn;
	public WebElement getCheckAvailabilityBtn() {
		return CheckAvailabilityBtn;
	}
	public RediffPages(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}

}
