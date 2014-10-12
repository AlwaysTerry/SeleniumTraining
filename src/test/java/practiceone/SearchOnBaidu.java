package practiceone;

import org.testng.annotations.*;



public class SearchOnBaidu {

	@BeforeSuite
	public void beforeSuite(){
		System.out.println("Call windows bat.");
	}
	
	@BeforeClass
	public void beforeClass(){		
		System.out.println("baidu login");
	}
	
	//@BeforeMethod
	public void beforeMethod(){
		
	}
	
	
	@Test
	public void searchSelenium(){
		System.out.println("Search on Baidu for Selenium");
	}
	
	@Test
	public void searchWebDriver(){
		System.out.println("Search on Baidu for WebDriver");
	}
	
	
	@AfterClass
	public void afterClass(){
		System.out.println("baidu logout");	
	}
	
	
	//@AfterMethod
	public void afterMethod(){
		
	}
	
	
	@AfterSuite
	public void afterSuite(){
		System.out.println("Call windows bat.");
	}
	
}
