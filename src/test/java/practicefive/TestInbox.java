package practicefive;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import utils.Browsers;
import utils.BrowsersType;


public class TestInbox {

	protected  static Browsers browser =  new Browsers(BrowsersType.chrome);
	protected static WebDriver driver = browser.driver;
	
	@BeforeSuite
	public void initalizeSuite(){		
		driver.get("http://www.126.com/");		
		//user login 126.com
		driver.findElement(By.xpath("//input[@id='idInput']")).sendKeys("FireflyAutomation");
		driver.findElement(By.xpath("//input[@id='pwdInput']")).sendKeys("Firefly",Keys.ENTER);
		
	}
	
	
	
	@BeforeClass
	public void initalInbox(){
		boolean isSuccess = driver.findElement(By.xpath("//div[text()='首页']")).isDisplayed();
		if(!isSuccess)
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}
	
	
	@Test
	public void checkMailBox(){
		driver.findElement(By.xpath("//span[text()='收件箱']")).click();
	}
	
	
	
	@AfterClass
	public void backToHome(){
		driver.findElement(By.xpath("//div[text()='首页']")).click();
	}
	
	
	@AfterSuite	
	public void finalizeeSuite(){
	
		driver.quit();
		
	}

	
}
