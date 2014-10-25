package practicesix;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.TerryJar.TestJar;

import pages.HomePage;
import pages.LoginPage;
import pages.RegisterPage;
import utils.Browsers;
import utils.BrowsersType;

import utils.Wait;

public class TestVist2 {
	
	
	
	//@Test
	public void visitBaidu(){		
		Browsers browser =  new Browsers(BrowsersType.chrome);
		WebDriver driver = browser.driver;
		Wait wa = new Wait(driver);
		driver.get("http://www.baidu.com");
		wa.waitFor(5000);
		driver.quit();
	}
	
	
	//@Test
	public void visit51buy(){	
		Browsers browser =  new Browsers(BrowsersType.chrome);
		WebDriver driver = browser.driver;
		Wait wa = new Wait(driver);
		driver.get("http://www.51buy.com");
		wa.waitFor(5000);
		driver.quit();
	}
	
	
	
	@Test
	public void testJ(){
		TestJar tj = new TestJar();
		//DemoA dema = new DemoA();
		//dema.test20141025();
	}
}
