package steps;

import org.openqa.selenium.support.PageFactory;

import io.cucumber.java.Before;
import io.cucumber.java.en.When;
import page.DatabasePage;
import page.LoginPage;
import page.NewAccountPage;
import page.TestBasePage;

public class Steps extends TestBasePage {

	LoginPage loginpage;
	NewAccountPage newAccount;
	DatabasePage databasePage;

	
	@Before
	public void beforeRun() {
		initDriver();

		loginpage = PageFactory.initElements(driver, LoginPage.class);
		newAccount = PageFactory.initElements(driver, NewAccountPage.class);
		databasePage= new DatabasePage();
	}

//	@Given("User is on the techfios login page")
//	public void user_is_on_the_techfios_login_page() {
//		driver.get("https://www.techfios.com/billing/?ng=admin/");
//
//	}

	@When("User enters the {string} in the {string} field")
	public void user_enters_the_Logininfo_in_the_field(String logindata, String field) {
		if (field.equalsIgnoreCase("username")) {
			loginpage.insertUserNamed(logindata);
		} else if (field.equalsIgnoreCase("password")) {
			loginpage.insertPassword(logindata);
		} else {
			System.out.println("unable to enter userinfo: " + logindata + "in field" + field);
		}

	}

	//getting username & password from MySQl Database
	
//	
}