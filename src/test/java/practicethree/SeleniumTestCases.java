package practicethree;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.*;

import utils.Browsers;
import utils.BrowsersType;
import utils.Do;
import utils.Switch;
import utils.Wait;
import Locators.*;

public class SeleniumTestCases {

	private WebDriver driver;
	private Do du;
	private Wait wa;
	private Actions act;
	private Switch sw;
	 
	@BeforeClass
	public void initalize(){
		Browsers browser = new Browsers(BrowsersType.firefox);
		driver = browser.driver;
		wa = new Wait(driver);
		act = new Actions(driver);
		sw= new Switch(driver);
		du = new Do(driver);
	}
	
	@Test
	public void draw(){
		driver.get("http://jqueryui.com/slider/");
		wa.waitForElementPresent(Locators.JQUERYHOME);
		
		driver.switchTo().frame(driver.findElement(By.xpath(Locators.SLIDERIFRAME)));
		Point initialPoint= driver.findElement(By.xpath(Locators.SLIDER)).getLocation();
		System.out.println(initialPoint);
       
        
		act.dragAndDropBy(driver.findElement(By.xpath(Locators.SLIDER)), initialPoint.getX()+569, initialPoint.getY()).build().perform();
        initialPoint= driver.findElement(By.xpath(Locators.SLIDER)).getLocation();
        System.out.println(initialPoint);
        wa.waitFor(5000);

		
		
        driver.switchTo().defaultContent();
        driver.findElement(By.xpath(Locators.DRAGGABLE)).click();
        wa.waitFor(3000);

	}
	
	
	
	
	
	@Test
	public void dropDownList(){
		//登录jd官方网站
		driver.get("http://www.jd.com");
		wa.waitForElementPresent("//a[text()='[登录]']");
		driver.findElement(By.xpath("//a[text()='[登录]']")).click();		
	    //登录用户信息
		wa.waitForElementPresent("//input[@id='loginname']");
		driver.findElement(By.xpath("//input[@id='loginname']")).sendKeys("test201301@mailinator.com");
		driver.findElement(By.xpath("//input[@id='nloginpwd']")).sendKeys("admin123");
		driver.findElement(By.xpath("//input[@id='loginsubmit']")).click();
		//登录个人信息
		driver.findElement(By.xpath("//a[text()='我的订单']")).click();		
		act.moveToElement(driver.findElement(By.xpath("//span[text()='设置']"))).build().perform();
		wa.waitFor(2000);
		driver.findElement(By.xpath("//span[text()='个人信息']")).click();		
		//选择上海作为它的province
	    Select province = new Select(driver.findElement(By.xpath("//select[@id='province']")));
		province.selectByVisibleText("上海");
		wa.waitFor(3000);
		//打印上海下的所有区域
		Select city = new Select(driver.findElement(By.xpath("//select[@id='city']")));
		List<WebElement> allcitys = city.getOptions();
		for(WebElement eachcity:allcitys)
			System.out.println(eachcity.getText());
	}
	
	
	
	
	@Test
	public void changeWindow(){
		driver.get("http://www.baidu.com");
		driver.findElement(By.xpath("//input[@name='wd']")).sendKeys("oracle",Keys.ENTER);
		wa.waitFor(3000);
		//ffwb.findElement(By.xpath("//input[@id='kw1']")).submit();
		driver.findElement(By.xpath("//a[following-sibling::a[contains(text(),'官网')]]/em[contains(text(),'Oracle')]")).click();
		
		sw.toSpecificWindow("Oracle | Hardware and Software, Engineered to Work Together");
		driver.findElement(By.xpath("//h3[text()='Downloads']")).click();
		
		sw.toSpecificWindow("oracle_百度搜索");
		driver.findElement(By.xpath("//input[@id='kw']")).clear();
		driver.findElement(By.xpath("//input[@id='kw']")).sendKeys("eclipse");		
		wa.waitFor(5000);

	}
	
	
	@Test
	public void conclick(){
		driver.get("http://www.126.com/");		
		driver.findElement(By.xpath("//input[@id='idInput']")).clear();
		driver.findElement(By.xpath("//input[@id='idInput']")).sendKeys("FireflyAutomation");
		driver.findElement(By.xpath("//input[@id='pwdInput']")).sendKeys("Firefly");
		driver.findElement(By.xpath("//button[@id='loginBtn']")).click();			
		wa.waitFor(5000);
		
		act.contextClick(driver.findElement(By.xpath("//div/span[text()='收件箱']"))).build().perform();
		wa.waitFor(2000);
		driver.findElement(By.xpath("//div[contains(@id,'mail_menu')][last()]/descendant::span[text()='打开']")).click();
		wa.waitFor(2000);
		Assert.assertEquals(driver.findElement(By.xpath("//header[@class='frame-main-cont-head']/descendant::span[text()='举 报']")).isDisplayed(), true);

	}
	
	
	 @Test
	 public void scroll(){
	   driver.get("http://yixun.com");
	   Point shanghai = driver.findElement(By.xpath("//h2[contains(text(),'3F')]")).getLocation();
	   System.out.print(shanghai);
	   ((JavascriptExecutor) driver).executeScript("window.scrollBy("+shanghai.getX()+","+shanghai.getY()+")");
	   wa.waitFor(5000);     
	  }
	

	 

		
	 @Test
	 public void upload(){
		driver.get("http://www.126.com");
		du.what("username").sendKeys("FireflyAutomation");//FireflyAutomation
		du.what("password").sendKeys("Firefly");//Firefly
		du.what("submit").click();
		du.waitForElementPresent("inbox");
		du.waitFor(5000);
		du.what("sendbox").click();
		du.what("attachment").sendKeys("c:\\terry.txt");
		du.waitFor(5000);
	}

	 
	 
	@AfterClass
	public void realse(){
		driver.quit();
	}
	
}
