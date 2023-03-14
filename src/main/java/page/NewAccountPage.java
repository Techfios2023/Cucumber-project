package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public  class NewAccountPage extends TestBasePage {


	WebDriver driver;
	NewAccountPage newAccount;

	public NewAccountPage(WebDriver driver) {
		this.driver = driver;
	}


	@FindBy(how = How.XPATH, using = "//input[@id='username']")
	WebElement USERNAME_ELEMENT;
	@FindBy(how = How.XPATH, using = "//input[@id='password']")
	WebElement PASSWORD_ELEMENT;
	@FindBy(how = How.XPATH, using = "//button[@name='login']")
	WebElement SIGNIN_BUTTON_ELEMENT;

	@FindBy(xpath = "//span[contains(text(), 'Bank & Cash')]")
	WebElement BANKCASH_ELEMENT;

	@FindBy(xpath = "//a[contains(text(), 'New Account')]")
	WebElement NEW_ACCOUNT;
	@FindBy(xpath = "//input[@name='account']")
	WebElement ACCOUNT_TITLE;
	@FindBy(xpath = "//input[@name='description']")
	WebElement ACCOUNT_DESCRIPTION;
	@FindBy(xpath = "//input[@name='balance']")
	WebElement INITIAL_BALANCE;
	@FindBy(xpath = "//input[@name='account_number']")
	WebElement ACCOUNT_NUMBER;
	@FindBy(xpath = "//input[@name='contact_person']")
	WebElement CONTACT_PERSON;
	@FindBy(xpath = "//input[@name='contact_phone']")
	WebElement PHONE_NUMBER;
	@FindBy(xpath = "//input[@name='ib_url']") WebElement BANK_URL;
	
	@FindBy(xpath = "//button[@class='btn btn-primary']")
	WebElement SUBMITBUTTON_ELEMENT;



	public void insertUserNamed(String userName) {
		USERNAME_ELEMENT.sendKeys(userName);

	}

	public void insertPassword(String password) {
		PASSWORD_ELEMENT.sendKeys(password);

	}

	public void clickOnSigninButton() {
		SIGNIN_BUTTON_ELEMENT.click();
	}

	public void ClickOnBankAndCash() {
		BANKCASH_ELEMENT.click();
	}

	public void CliclOnNewAccount() {
		NEW_ACCOUNT.click();
	}
	public void InsertAccountTitle(String accountTitle) {
		ACCOUNT_TITLE.sendKeys(accountTitle);
	}
	public void InsertAccountDescription(String description) {
		ACCOUNT_DESCRIPTION.sendKeys(description);
	}
	public void InsertInitialBalance(String initialBalance ) {
		INITIAL_BALANCE.sendKeys(initialBalance);
	}
	public void InsertAccountNumber(String accountNumber ) {
		ACCOUNT_NUMBER.sendKeys(accountNumber + generateRandumNum(999));
	}
	public void InsertContactPerson(String contactPerson ) {
		CONTACT_PERSON.sendKeys(contactPerson);
	}
	public void InsertPhoneNumber(String Phone ) {
		PHONE_NUMBER.sendKeys(Phone);
	}
	public void InsertBankURL(String internetBankingURL ) {
		BANK_URL.sendKeys(internetBankingURL);
	}
	
	public void clickOnSubmitButton() {
		SUBMITBUTTON_ELEMENT.click();
}
}
