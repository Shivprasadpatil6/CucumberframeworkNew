package stepDefinitions;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import managers.PageObjectManager;
import managers.TestContext;
import pageLayer.HomePage;
import pageLayer.LoginPage;
import utility.UtilityClass;

public class LoginPageStep {
	
	
	LoginPage loginpage_obj;
	 UtilityClass util_obj;

	WebDriver driver;
	
	PageObjectManager pageobjectmanager;
	
	private TestContext testcontext;
	//We have to create constructor of homepage
	//We have to pass argument in constructor
	public LoginPageStep(TestContext context)
	{
		testcontext=context;
		loginpage_obj=testcontext.getPageObjectManager().getLoginPage();
		util_obj= testcontext.getPageObjectManager().getUtilityClass();
	}
	
	
	@Then("user navigates to account login")
	public void user_navigates_to_account_login(Object util_obj) {

		//it is not good approach to write driver initilasation code here 
		//We have to create seperate step class for every functionality
	   
		//----We have to store all in login obj testcontext.getPageObjectManager().getHomePage()
	
		Assert.assertEquals(driver.getCurrentUrl(), "Account Login");
	   
	}
	@When("user enter email  as {string} and password as {string} and clicked on login")
	public void user_enter_email_as_and_password_as_and_clicked_on_login(String email, String password) throws InterruptedException {
		
		loginpage_obj.enterEmailAddress(email);
		loginpage_obj.enterPassword(password);
		 Thread.sleep(2000);
		loginpage_obj.clickOnloginButton();
	    
	}

	
	
	@Then("logged in sucessfully")
	public void logged_in_sucessfully() {
		Assert.assertEquals(driver.getTitle(), "My Account");
	   
	}
	
	
	@Then("not logged in as user details are not available")
	public void not_logged_in_as_user_details_are_not_available() {
		Assert.assertEquals(driver.getTitle(), "Account Login");

}
}
