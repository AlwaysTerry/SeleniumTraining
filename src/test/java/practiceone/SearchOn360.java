package practiceone;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SearchOn360 {
	
	@BeforeTest
	public void beofreTest(){
		System.out.println("Define browser type!");
		
	}
	
	@BeforeClass
	public void beforeClass(){		
		System.out.println("360login");
	}
	
	@BeforeMethod
	public void beforeMethod(){
		System.out.println("prepare for test data/connect to DB");
	}
	
	
	@Test
	public void searchSelenium(){
		System.out.println("Search on 360 for Selenium");
	}
	
	@Test
	public void searchWebDriver(){
		System.out.println("Search on 360 for WebDriver");
	}
	
	
	@AfterClass
	public void afterClass(){
		System.out.println("360logout");
		
	}
	
	
	@AfterMethod
	public void afterMethod(){
		System.out.println("realse test data/cut connection to DB");
	}
	
	@AfterTest
	public void afterTest(){
		System.out.println("close browser!");
		
	}
	

}
