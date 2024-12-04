package stepDefinitions;

import java.time.Duration;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import managers.TestContext;



public class AppHooks {
	//We will not create any obj in step definition pakage
	
	
	
	//We haave to declare testcontext obj globally
	private TestContext testcontext;
	//We passed argument in TestContext We have to create constructor related to Apphooks
	public AppHooks(TestContext context)
	{
		//all dat store in testcontext
		testcontext=context;
	}
	@Before
	public void setup()
	{
		//with the help of testcontext obj we will getWebDriverManager().getDriver()
		//returing driver because getDriver return type is WebDriver driver
		WebDriver driver	=testcontext.getWebDriverManager().getDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	}
	@After
	public void tearDown()
	{
		testcontext.getWebDriverManager().getDriver().quit();
	}
	

}
