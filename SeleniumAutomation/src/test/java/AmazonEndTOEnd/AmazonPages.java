package AmazonEndTOEnd;

	import java.util.List;

	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.FindAll;
	import org.openqa.selenium.support.FindBy;
	import org.openqa.selenium.support.PageFactory;

	public class AmazonPages {
		WebDriver driver;
		public AmazonPages(WebDriver driver)
		{
			this.driver= driver;
			PageFactory.initElements(driver,this);
		}

		@FindBy(xpath="//span[@id='nav-link-accountList-nav-line-1']")
	WebElement signin;
		public WebElement getSignin() {
			return signin;
		}
	@FindBy(id="createAccountSubmit")
	WebElement createAccount;
	public WebElement getCreateAccount() {
		return createAccount;
	}
	@FindBy(id="ap_customer_name")
	WebElement fullname;
	public WebElement getFullname() {
		return fullname;
	}
	@FindBy(id="ap_email")
	WebElement email;
	public WebElement getEmail() {
		return email;
	}
	@FindBy(id="ap_password")
	WebElement password;
	public WebElement getPassword() {
		return password;
	}
	@FindBy(id="ap_password_check")
	WebElement reEnterPassword;
	public WebElement getReEnterPassword() {
		return reEnterPassword;
	}
	@FindBy(id="continue")
	WebElement accountCreate;
	public WebElement getAccountCreate() {
		return accountCreate;
	}
	@FindBy(id="nav-search-submit-button")
	WebElement search;
	public WebElement getSearch() {
		return search;
	}
	@FindAll(@FindBy(tagName="input"))
	List<WebElement> allInputFeilds;
	public List<WebElement> getAllInputFeilds() {
		return allInputFeilds;
	}
	@FindAll(@FindBy(tagName="ul"))
	List<WebElement> inputs;
	public List<WebElement> getInputs() {
		return inputs;
	}
	@FindBy(id="twotabsearchtextbox")
	WebElement serchButton;
	public WebElement getSerchButton() {
		return serchButton;
	}
	public void clear() {
		// TODO Auto-generated method stub	
	}

}
