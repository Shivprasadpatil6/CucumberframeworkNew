package managers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import pageLayer.HomePage;
import pageLayer.LoginPage;
import pageLayer.ProductDetailPage;
import pageLayer.RegisterPage;
import utility.UtilityClass;

public class PageObjectManager {
	
	
	private WebDriver driver;
	private HomePage homepage_obj;
	private LoginPage loginpage_obj;
	private RegisterPage registerpage_obj;
	private ProductDetailPage productdetailpage_obj;
	private UtilityClass util_obj;
	public PageObjectManager (WebDriver driver)
	{
		this.driver=driver;
		
	}

	
	 
	  public HomePage getHomePage() {
	   if(homepage_obj==null)
	   {
		    homepage_obj=new HomePage(driver);
	   }
	   return homepage_obj; 
	  }  
	   
	   public LoginPage getLoginPage()
	   {
		   if(loginpage_obj==null)
		   {
			   loginpage_obj=new LoginPage(driver);
		   }
		   return loginpage_obj;
	   }
	   
	   
	   
	   public RegisterPage getRegisterPage()
	   {
		   //We have to create obj when our obj is null
		   if(registerpage_obj==null)
		   {
			   registerpage_obj=new RegisterPage(driver);
		   }
		   return registerpage_obj;
	   }
	   
	   public pageLayer.ProductDetailPage ProductDetailPage()
	   {
		   if(productdetailpage_obj==null)
		   {
			   productdetailpage_obj=new ProductDetailPage(driver) ;
		   }
		   return productdetailpage_obj;
	   }
	   
	   public UtilityClass getUtilityClass() 
	   
	   {
		   if(util_obj==null)
		   {
			   util_obj=new UtilityClass(driver)  ;
		   }
		   return util_obj; 
	   }
	   
}



             

