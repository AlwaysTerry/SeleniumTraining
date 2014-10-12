package practicetwo.proerties;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.*;

import utils.Browsers;
import utils.BrowsersType;
import utils.ParseProperties;
import utils.TestData;
import utils.Wait;

public class Login126 {

	Browsers browser =  new Browsers(BrowsersType.chrome);
	WebDriver driver = browser.driver;
	ParseProperties pp = null;
	TestData td = null;
	Wait wa = null;
	
	@Parameters({"TestData"})
	@BeforeClass
	public void inital(@Optional("aaa") String testdata){
		pp = new ParseProperties(System.getProperty("user.dir")+testdata);		
		td = new TestData("G:/workspace/SeleniumTraining/src/test/resources/userinfo.csv");
		wa = new Wait(driver);
	}
	
	
	//@Test
	public void accessMailBoxWithPP(){
		 driver.get("http://www.126.com/");	
		for(int i=0;i<3;i++){		   	
		//user login 126.com
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		    driver.findElement(By.xpath("//input[@id='idInput']")).sendKeys(pp.getValue("username"+i));
		    driver.findElement(By.xpath("//input[@id='pwdInput']")).sendKeys(pp.getValue("password"+i));
		    //driver.findElement(By.xpath("//input[@id='pwdInput']")).submit();
		    
		}
	}
	
	
	@Test
	public void accessMailBoxWithCSV(){
		
		 driver.get("http://www.126.com/");	
		 driver.findElement(By.xpath("//input[@id='idInput']")).sendKeys(td.getTestData("username", "tc1"));
		 driver.findElement(By.xpath("//input[@id='pwdInput']")).sendKeys(td.getTestData("password", "tc1"),Keys.ENTER);
		 wa.waitForElementPresent("//div[text()='Ê×Ò³']");
		
		 boolean isdisp = driver.findElement(By.xpath("//div[text()='Ê×Ò³']")).isDisplayed();
         Assert.assertEquals(isdisp, true);
	}
	
	
	
	@AfterClass
	public void finalizeBrowser(){
		driver.quit();
	}
}
