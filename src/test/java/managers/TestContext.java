package managers;

public class TestContext {
	
	//text context class- obj we can pass anywhere we have to call in hooks fill then we have to pass driver there
 private WebDriverManager webdrivermanager;
 private PageObjectManager pageobjectmanager;
 
 
 public TestContext()
 {
	 webdrivermanager =new WebDriverManager();
	 //If my webdrivermanager pass in pageobjectmanager obj we will not get null point exception
	 //step definition file  we got null point exception  for avoid this we have testcontext approach resolve with picontainer dependcy
	 //with the help of testcontext we can give driver obj to all class
	 pageobjectmanager=new PageObjectManager(webdrivermanager.getDriver());
 }
 
 public WebDriverManager getWebDriverManager()
 {
	 //we have to change method type as void to WebDriverManager
	 return webdrivermanager;
	 
 }
 
 public PageObjectManager getPageObjectManager()
 {
	//we have to change method type as void to PageObjectManager
	 
	 return pageobjectmanager;
 }
}
