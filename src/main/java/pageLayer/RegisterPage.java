package pageLayer;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RegisterPage {
	
	WebDriver driver;
	
	//we will not use initelement method here because we are following another approach
	//when all web element is on same page then we will go with this approach
	public RegisterPage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	//-----------Obj repo----------------
	
	  private By firstname_txtbox     = By.xpath("//input[@id='input-firstname']");
	  private By lastname_txtbox     = By.xpath("//input[@id='input-lastname']");
	  private By email_txtbox     = By.xpath("//input[@id='input-email']");
	  private By password_txtbox     = By.xpath("//input[@id='input-password']");
	  private By privacypolicy_checkbox    = By.xpath("(//input[@class='form-check-input'])[2]");
	  private By continue_button     = By.xpath("//button[text()='Continue']");
	  
	  public void enterFirstName(String firstname)
	  {
		  driver.findElement(firstname_txtbox).sendKeys(firstname);
	  }
	  public void enterLastName(String lastname)
	  {
		  driver.findElement(lastname_txtbox).sendKeys(lastname);
	  }
	  
	  public void enterEmail(String email)
	  {
		  driver.findElement(email_txtbox).sendKeys(email);
	  }
	 
	  public void enterPassword(String password)
	  {
		  driver.findElement(password_txtbox).sendKeys(password);
	  }
	  
	 
	  
	  public void clickOnPrivacyCheckbox()
	  
	  {
		  driver.findElement(privacypolicy_checkbox).click();
	  }
	  
	  public void clickOnContinueButton()
	  {
		  driver.findElement(continue_button).click();
	  }
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  

}
