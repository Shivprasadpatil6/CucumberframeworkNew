package ActionClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MOuseOver {

	public static void main(String[] args) {
		
		WebDriver driver =new ChromeDriver();
		
		driver.get("https://www.ebay.com/");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));
		WebElement ele=  driver.findElement(By.xpath("(//li[@class='vl-flyout-nav__js-tab'])[2]"));
		  
		  Actions act=new Actions(driver);
		  act.moveToElement(ele).build().perform();
		    driver.findElement(By.xpath("//a[text()='Motorcycle parts']")).click();
		    
		  

		
		// TODO Auto-generated method stub

	}

}
