package PractiseAutomation;

import java.time.Duration;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Flipkart {

	public static void main(String[] args) throws InterruptedException {
   
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofMillis(10));
	    driver.manage().deleteAllCookies();
	    driver.findElement(By.xpath("//input[@name='q']")).sendKeys("iphone 15 Pro max");
	    driver.findElement(By.xpath("//button[@class='_2iLD__']")).click();
	             String mainpage=   driver.getWindowHandle();
	             System.out.println("main page="+mainpage);
		 driver.findElement(By.xpath("(//div[@class='KzDlHZ'])[2]")).click();
		 
		 Set<String> allpage=  driver.getWindowHandles();
		 
		 for(String page:allpage)
		 {
			 if(!page.equals(mainpage))
				  {
				   driver.switchTo().window(mainpage);
				   break;
				 
			 }
		 }
		 System.out.println(driver.getCurrentUrl());
		 
		List<WebElement> products= driver.findElements(By.className("_7eSDEz"));
		                 System.out.println(products.size());
		                  for(WebElement product:products)
		                 {
		                	 System.out.println(product.getText());
		                 }
		                  Thread.sleep(2000);
		           driver.findElement(By.xpath("//button[@class='QqFHMw vslbG+ In9uk2']")).click();
		        
		                 
		                 
		                  
		                    
		 
		 
	    
	     
	}

}
