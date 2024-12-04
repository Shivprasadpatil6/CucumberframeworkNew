package ActionClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {
	
	public static void main(String[]args)
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://jqueryui.com/droppable/");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));
		
		///-handling of iframe-------
		
		WebElement iframe=driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
		driver.switchTo().frame(iframe);
		
	WebElement src=	driver.findElement(By.xpath("//div[@id='draggable']"));
	WebElement dec=driver.findElement(By.xpath("//div[@id='droppable']"));
	
	//-----------action class------------//
	Actions act =new Actions(driver);
	//act.clickAndHold(src).moveToElement(dec).release().build().perform();
	act.dragAndDrop(src, dec).build().perform();
		        
		 
		
	}

}
