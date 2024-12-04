package stepDefinitions;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import managers.PageObjectManager;
import managers.TestContext;
import pageLayer.HomePage;
import pageLayer.LoginPage;
import pageLayer.ProductDetailPage;
import pageLayer.RegisterPage;
import utility.UtilityClass;




public class HomePageStep {
	
	

	WebDriver driver;
	PageObjectManager pageobjectmanager;
	HomePage homepage_obj;
	 UtilityClass util_obj;
	private TestContext testcontext;
	//We have to create constructor of homepage
	//We have to pass argument in constructor
	public HomePageStep(TestContext context)
	{
		testcontext=context;
		//it is not good approach to write driver initilasation code here 
				//We have to create seperate step class for every functionality
			   
				//----We have to store all in homepage obj testcontext.getPageObjectManager().getHomePage()
				homepage_obj= testcontext.getPageObjectManager().getHomePage();
				util_obj= testcontext.getPageObjectManager().getUtilityClass();
	}
	
	
	
	ProductDetailPage productdetailpage_obj;
	
	
	@Given("user is on home page")
	public void user_is_on_home_page() {
		
		//it is not good approach to write driver initilasation code here 
		//We have to create seperate step class for every functionality
	   
		//----We have to store all in homepage obj testcontext.getPageObjectManager().getHomePage()
		//homepage_obj= testcontext.getPageObjectManager().getHomePage();
		
//		 pageobjectmanager=new PageObjectManager(driver);
//		 //We have initilasation of all page to calling method
//		 homepage_obj= pageobjectmanager.getHomePage();
//		 loginpage_obj= pageobjectmanager.getLoginPage();
//		 registerpage_obj=pageobjectmanager.getRegisterPage();
//		 productdetailpage_obj= pageobjectmanager.ProductDetailPage();
	           
		 
		 
		
	    
	}
	@When("user clicks on My account on register link")
	public void user_clicks_on_my_account_on_register_link() {
		
		homepage_obj.clickOnMyAccountLink();
		homepage_obj.clickOnRegisterLink();
	    
	}
	@Then("user navigates to Register Account")
	public void user_navigates_to_register_account() {
		Assert.assertEquals(util_obj.driver, "Register Account");

}
	
	@When("Clicked on my account and login link")
	public void clicked_on_my_account_and_login_link() {
		
		homepage_obj.clickOnMyAccountLink();
		homepage_obj.clickOnLoginLink();
		}
	

	@When("user clicks on product")
	public void user_clicks_on_product() {
	

	    
	}
	@When("click on Shopping cart link")
	public void click_on_shopping_cart_link() {
		
		
	   
	}
	
	
}
