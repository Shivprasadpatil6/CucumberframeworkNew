package pageLayer;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class ProductDetailPage {
	
	public ProductDetailPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		
	}
	
	private By add_to_cart_btn=By.xpath("(//i[@class='fa fa-shopping-cart'])[4]");

}
