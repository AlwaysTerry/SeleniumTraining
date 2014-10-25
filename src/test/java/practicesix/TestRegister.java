package practicesix;

import java.text.SimpleDateFormat;
import java.util.Calendar;

import junit.framework.Assert;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import pages.HomePage;
import pages.LoginPage;
import pages.RegisterPage;
import utils.Browsers;
import utils.BrowsersType;
import utils.Do;
import utils.Wait;

public class TestRegister {

	protected  static Browsers browser =  new Browsers(BrowsersType.firefox);
	protected static WebDriver driver = browser.driver;
	protected static Wait wa;
	
	HomePage homepage;
	RegisterPage regpage;
	LoginPage loginpage;
	
	@BeforeClass
	public void initalizeSuite(){	
		homepage = new HomePage(driver);
		regpage = new RegisterPage(driver);
		loginpage = new LoginPage(driver);
		
		wa = new Wait(driver);
		
		homepage.navigateToJD("http://www.jd.com/");
	}
	

	//@Test
	public void registerJD(){
		
		SimpleDateFormat sdf = new SimpleDateFormat();
		String layout = "yyyyMMddHHmmss";
		sdf.applyPattern(layout);		
		Calendar cl = Calendar.getInstance();		
		String accountname = sdf.format(cl.getTime());		
		
		homepage.reg.click();		
		regpage.register("JD"+accountname, "passwd123");
	}
	
	
	@Test
	public void login(){
		String username = "testRD2015";
		String password = "admin123";
		
		wa.waitForElementPresent(homepage.login);
		
		homepage.login.click();
		
		loginpage.loginname.sendKeys(username);
		loginpage.password.sendKeys(password,Keys.ENTER);
		
		wa.waitFor(3000);
		Assert.assertEquals(homepage.getWebElement(homepage.username, username).isDisplayed(), true);
		
	}
	
	@AfterClass
	public void releaseSuite(){	
		driver.quit();
	}
	
}
