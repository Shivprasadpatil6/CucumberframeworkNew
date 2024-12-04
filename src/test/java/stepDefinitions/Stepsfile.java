package stepDefinitions;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.en.*;
import managers.PageObjectManager;
//import pageLayer.HomePage;
//import pageLayer.LoginPage;
//import pageLayer.ProductDetailPage;
//import pageLayer.RegisterPage;
//
//public class Stepsfile {
//	
////	WebDriver driver;
////	PageObjectManager pageobjectmanager;
////	HomePage homepage_obj;
////	LoginPage loginpage_obj;
////	RegisterPage registerpage_obj;
//	
//	//ProductDetailPage productdetailpage_obj;
//	
//	
//	@Given("user is on home page")
//	public void user_is_on_home_page() {
//		
//		//it is not good approach to write driver initilasation code here 
//		//We have to create seperate step class for every functionality
//	    driver=new ChromeDriver();
//		driver.get("https://demo-opencart.com/");
//		driver.manage().window().maximize();
//		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(20));
//		driver.manage().deleteAllCookies();
		//----------------------------------
//		//We have to create obj of homepage,loginpage,registreationpage
//		//We have to declare driver globally &We have to declare HomePage_obj & LoginPage loginpage_obj &RegisterPage register_obj globally
////		 homepage_obj=new HomePage(driver);
////		 loginpage_obj=new LoginPage(driver);
////		 registerpage_obj=new RegisterPage(driver) ;
////		 productdetailpage_obj=new ProductDetailPage(driver);
//		
//		//We have to create obj of PageObj Manager
//		
//		//We have not created object in step file we have created in page object manager
//		//if my object is created then page object manager will not created obj again
//		//instantisation of our obj from one single platform we can call as signle tone patten
//		//we will not create obj multiple times
//		 pageobjectmanager=new PageObjectManager(driver);
//		 //We have initilasation of all page to calling method
//		 homepage_obj= pageobjectmanager.getHomePage();
//		 loginpage_obj= pageobjectmanager.getLoginPage();
//		 registerpage_obj=pageobjectmanager.getRegisterPage();
//		 productdetailpage_obj= pageobjectmanager.ProductDetailPage();
//	           
//		 
//		 
//		
//	    
//	}
//	@When("user clicks on My account on register link")
//	public void user_clicks_on_my_account_on_register_link() {
//		
//		homepage_obj.clickOnMyAccountLink();
//		homepage_obj.clickOnRegisterLink();
//	    
//	}
//	@Then("user navigates to Register Account")
//	public void user_navigates_to_register_account() {
//		Assert.assertEquals(driver.getTitle(), "Register Account");
//	    
//	}
//	@When("user enter firstname and lastname and email and password and check marked Privacy Policy and clicked on continue")
//	public void user_enter_firstname_and_lastname_and_email_and_password_and_check_marked_privacy_policy_and_clicked_on_continue(io.cucumber.datatable.DataTable dataTable) throws InterruptedException {
//	               List<List<String>> userdetails=   dataTable.asLists(); 
//	               registerpage_obj.enterFirstName(userdetails.get(0).get(0));
//	               registerpage_obj.enterLastName(userdetails.get(0).get(1));
//	               registerpage_obj.enterEmail(userdetails.get(0).get(2));
//	               registerpage_obj.enterPassword(userdetails.get(0).get(3));
//	               registerpage_obj.clickOnPrivacyCheckbox();
//	               Thread.sleep(2000);
//	               registerpage_obj.clickOnContinueButton();
//	               Thread.sleep(2000);
//	               
////	}
////	@Then("account created successfully and shows {string}")
////	public void account_created_successfully_and_shows(String status_msg) {
////		Assert.assertEquals(driver.getTitle(), status_msg);
////	   
////	}
////	@Then("account not created and showing user already have account")
////	public void account_not_created_and_showing_user_already_have_account() {
////		Assert.assertEquals(driver.getTitle(), "Register Account");
////	    
////	}
////	
////	//-------------------------------------------------
////	
////	@When("Clicked on my account and login link")
////	public void clicked_on_my_account_and_login_link() {
////		
////		homepage_obj.clickOnMyAccountLink();
////		homepage_obj.clickOnLoginLink();
////		
////		
////	   
////	}
////	@Then("user navigates to account login")
////	public void user_navigates_to_account_login() {
////		Assert.assertEquals(driver.getTitle(), "Account Login");
////	   
////	}
////	@When("user enter email  as {string} and password as {string} and clicked on login")
////	public void user_enter_email_as_and_password_as_and_clicked_on_login(String email, String password) throws InterruptedException {
////		
////		loginpage_obj.enterEmailAddress(email);
////		loginpage_obj.enterPassword(password);
////		 Thread.sleep(2000);
////		loginpage_obj.clickOnloginButton();
////	    
////	}
////
////	
////	
////	@Then("logged in sucessfully")
////	public void logged_in_sucessfully() {
////		Assert.assertEquals(driver.getTitle(), "My Account");
////	   
////	}
////	
////	
////	@Then("not logged in as user details are not available")
////	public void not_logged_in_as_user_details_are_not_available() {
////		Assert.assertEquals(driver.getTitle(), "Account Login");
////	    
////	}
////	//---------------------------------------------------------------
////	
////	@When("user clicks on product")
////	public void user_clicks_on_product() {
////
////	    
////	}
////	
////	@When("user clicks product tab and click on product")
////	public void user_clicks_product_tab_and_click_on_product() {
////	    
////	}
////	
////	@When("enter quantity {string} and click on add to cart")
////	public void enter_quantity_and_click_on_add_to_cart(String string) {
////		
////		
////	   
////	}
////	@When("click on Shopping cart link")
////	public void click_on_shopping_cart_link() {
////		
////		
////	   
////	}
////	@When("click on checkout")
////	public void click_on_checkout() {
////	   
////	}
////	@When("fill all user details those are compulsory")
////	public void fill_all_user_details_those_are_compulsory() {
////	    
////	}
////	@When("click on confirm order")
////	public void click_on_confirm_order() {
////	    
////	}
////	@Then("user is able to buy product and shows {string}")
////	public void user_is_able_to_buy_product_and_shows(String string) {
////	    
////	}
////	
////	
////
////	
//
//}
