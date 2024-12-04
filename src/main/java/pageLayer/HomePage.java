package pageLayer;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	
	public HomePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		
	}
	
	//---------------------obj repo
	
	@FindBy(xpath="//span[text()='My Account']")
	private WebElement myaccount_link;
	
	@FindBy(xpath="//a[text()='Register']")
	private WebElement login_link;
	
	@FindBy(xpath="//a[text()='Login']")
	private WebElement register_link;
	
	
	private By product_link= By.xpath("//a[text()='HTC Touch HD']");
	private By add_to_cart_btn=By.xpath("(//i[@class='fa fa-shopping-cart'])[4]");
	private By shopping_cart_link=By.xpath("(//i[@class='fa fa-shopping-cart'])[1]");
	private By click_on_checout=By.xpath("//a[@class='btn btn-primary']");
	
	//-----------------Action Method
	public void clickOnMyAccountLink()
	{
		myaccount_link.click();
	}
	
	
	
	public void clickOnLoginLink()
	{
		login_link.click();
	}
	public void clickOnRegisterLink()
	{
		register_link.click();
	}
	
	
	
	

}
