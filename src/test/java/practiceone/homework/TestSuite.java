package practiceone.homework;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import utils.Browsers;
import utils.BrowsersType;

public class TestSuite {
	protected  static Browsers browser =  new Browsers(BrowsersType.chrome);
	protected static WebDriver driver = browser.driver;
	
	@BeforeSuite
	public void initalizeSuite(){		
		driver.get("http://www.126.com/");		
		//user login 126.com
		driver.findElement(By.xpath("//input[@id='idInput']")).sendKeys("FireflyAutomation");
		driver.findElement(By.xpath("//input[@id='pwdInput']")).sendKeys("Firefly",Keys.ENTER);
		
	}
	
	@AfterSuite	
	public void finalizeeSuite(){
		driver.close();
		driver.quit();
		
	}
}
