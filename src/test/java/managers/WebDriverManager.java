package managers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import utility.ReadConfig;

public class WebDriverManager {
	
	private ReadConfig read_config; 
	private WebDriver driver;
	public WebDriverManager()
	{
		read_config=new ReadConfig();
		
	}
	
	private WebDriver createDriver()
	{
		String browser_name=read_config.getBrowserName();
		if(browser_name.equalsIgnoreCase("Chrome"))
		{
			driver=new ChromeDriver();
		}
		else if(browser_name.equalsIgnoreCase("Edge"))
		{
			driver=new EdgeDriver();
		}
		
		else if(browser_name.equalsIgnoreCase("Fire"))
		{
			driver=new FirefoxDriver();
		}
		else
		{
			System.out.println("please provide correct browser name");
		}
		driver.get(read_config.getApplicationUrl());
		return driver;
	}
	
	//it is single ton process 
//We have above method private we have to create public method below which will help to call driver
	
	public WebDriver getDriver()
	{
		//when our driver is null then you can initilise
		if(driver==null)
		{
			driver=createDriver();
		}
		//instead of void it will be WebDRiver
		return driver;
	}
}
