package org.qa.pages;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.FindBy;
	import org.openqa.selenium.support.PageFactory;

	public class AmazonPage {
		WebDriver driver;

		public AmazonPage(WebDriver driver) {
			this.driver = driver;
			PageFactory.initElements(driver, this);
		}

		@FindBy(id="nav-link-accountList-nav-line-1")
		WebElement signin;
		@FindBy(id = "ap_email")
		WebElement email;
		@FindBy(id = "continue")
		WebElement cont;
		@FindBy(id = "ap_password")
		WebElement pass;
		@FindBy(id = "signInSubmit")
		WebElement submit;
		@FindBy(id = "twotabsearchtextbox")
		WebElement typetosearch;
		@FindBy(xpath="//*[@id=\"search\"]/div[1]/div/div[1]/div/span[3]/div[2]/div[9]/div/span/div/div/div[2]/div[1]/div/div/span/a/div/img")
		WebElement selecting;
		@FindBy(id = "add-to-cart-button")
		WebElement cartAdd;
		public WebElement getSelecting() {
			return selecting;
		}

		@FindBy(id = "nav-cart-count")
		WebElement cart;
		// *[@id="sc-buy-box-ptc-button"]/span/input
		@FindBy(xpath = "//*[@id=\"sc-buy-box-ptc-button\"]/span/input")
		WebElement buy;
		@FindBy(xpath = "//*[@id=\"address-book-entry-0\"]/div[2]/span/a")
		WebElement deliveryAdd;
		@FindBy(xpath="//*[@id=\"nav-hamburger-menu\"]/i")
		WebElement sideTab;
		@FindBy(xpath="//*[@id=\"nav-logo-sprites\"]")
		WebElement home;
		@FindBy(xpath="//*[@id=\"hmenu-content\"]/ul[1]/li[29]/a")
		WebElement signOut;

		public WebElement getHome() {
			return home;
		}
		public WebElement getSignOut() {
			return signOut;
		}
		public WebElement getSideTab() {
			return sideTab;
		}


		public WebDriver getDriver() {
			return driver;
		}

		public WebElement getSignin() {
			return signin;
		}

		public WebElement getEmail() {
			return email;
		}

		public WebElement getCont() {
			return cont;
		}

		public WebElement getPass() {
			return pass;
		}

		public WebElement getSubmit() {
			return submit;
		}

		public WebElement getTypetosearch() {
			return typetosearch;
		}

		public WebElement getCartAdd() {
			return cartAdd;
		}

		public WebElement getCart() {
			return cart;
		}

		public WebElement getBuy() {
			return buy;
		}

		public WebElement getDeliveryAdd() {
			return deliveryAdd;
		}
}
