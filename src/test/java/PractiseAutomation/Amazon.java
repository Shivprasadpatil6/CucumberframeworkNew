package PractiseAutomation;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Set;

import javax.swing.text.html.HTMLDocument.Iterator;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Amazon {
	static WebDriverWait wait;
	public static void main(String[] args) throws InterruptedException {
		
//	WebDriver driver=new ChromeDriver();
//	driver.get("https://www.amazon.in/");
//	driver.manage().window().maximize();
//    driver.manage().timeouts().implicitlyWait(Duration.ofMillis(10));
//     driver.manage().deleteAllCookies();
//	  driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("iphone 15 Pro max");
//	  driver.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();
//    driver.findElement(By.linkText("Apple iPhone 15 Pro Max (256 GB) - Blue Titanium")).click();
//	  driver.findElement(By.xpath("(//input[@id='add-to-cart-button'])[2]")).click();
//	         Thread.sleep(2000);
//	 driver.findElement(By.xpath("//span[@id='attach-sidesheet-view-cart-button-announce']")).click();
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.ebay.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));
		//action class
		
		     WebElement electro=driver.findElement(By.xpath("(//a[text()='Electronics'])[2]"));
		     Actions act =new Actions(driver);
		     act.moveToElement(electro).build().perform();
		     driver.findElement(By.xpath("//a[text()='Smart home']")).click();
		     
//		WebElement electro=driver.findElement(By.xpath("(//li[@class='hl-cat-nav__js-tab'])[1]"));
//		Actions act =new Actions(driver);
//		act.moveToElement(electro).build().perform();
//		driver.findElement(By.xpath("//a[text()='Smart home']")).click();
//		        
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
//		
	

	}
	
}
