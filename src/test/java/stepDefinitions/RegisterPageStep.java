package stepDefinitions;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import managers.PageObjectManager;
import managers.TestContext;
import pageLayer.HomePage;
import pageLayer.RegisterPage;
import utility.UtilityClass;

public class RegisterPageStep {

	WebDriver driver;
	RegisterPage registerpage_obj;
	UtilityClass util_obj;
	
	

	PageObjectManager pageobjectmanager;
	
	private TestContext testcontext;
	//We have to create constructor of homepage
	//We have to pass argument in constructor
	public RegisterPageStep(TestContext context)
	{
		testcontext=context;
		registerpage_obj=     testcontext.getPageObjectManager().getRegisterPage();
		
		util_obj= testcontext.getPageObjectManager().getUtilityClass();
	}
	
	
	
	


@When("user enter firstname and lastname and email and password and check marked Privacy Policy and clicked on continue")
public void user_enter_firstname_and_lastname_and_email_and_password_and_check_marked_privacy_policy_and_clicked_on_continue(io.cucumber.datatable.DataTable dataTable) throws InterruptedException {
               List<List<String>> userdetails=   dataTable.asLists(); 
               registerpage_obj.enterFirstName(userdetails.get(0).get(0));
               registerpage_obj.enterLastName(userdetails.get(0).get(1));
               registerpage_obj.enterEmail(userdetails.get(0).get(2));
               registerpage_obj.enterPassword(userdetails.get(0).get(3));
               registerpage_obj.clickOnPrivacyCheckbox();
               Thread.sleep(2000);
               registerpage_obj.clickOnContinueButton();
               Thread.sleep(2000);
               
               //registerpage_obj=     testcontext.getPageObjectManager().getRegisterPage();
               
}
@Then("account created successfully and shows {string}")
public void account_created_successfully_and_shows(String status_msg) {
	Assert.assertEquals(util_obj, status_msg);
   
}
@Then("account not created and showing user already have account")
public void account_not_created_and_showing_user_already_have_account() {
	Assert.assertEquals(driver.getTitle(), "Register Account");
    
}
}