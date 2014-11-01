package practiceseven;

import java.io.IOException;

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
import utils.Switch;
import utils.Wait;

public class TestAutoit {
	
	Browsers browser =  new Browsers(BrowsersType.firefox);
	WebDriver driver = browser.driver;
	Switch sw = new Switch(driver);
	Wait wa = new Wait(driver);
	
	
	@BeforeClass
	public void initalizeSuite(){		
		driver.get("http://music.baidu.com");		
		//user login 126.com
		driver.findElement(By.xpath("//a[contains(text(),'经典老歌')]")).click();
		driver.findElement(By.xpath("//li[1]//a[@title='下载']")).click();
		sw.toSpecificWindow("下载_百度音乐-听到极致");
		
	}
	
	
	
	@Test
	public void checkMailBox(){
		driver.findElement(By.xpath("//a[contains(@class,'actived')]//span[text()='下载']")).click();
		wa.waitFor(3000);
		try {
			Runtime.getRuntime().exec(System.getProperty("user.dir")+"\\src\\test\\resources\\download.exe");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.findElement(By.xpath("//input[@name='userName']")).sendKeys("fireflyautomation@126.com");
		driver.findElement(By.xpath("//input[@name='password' and preceding-sibling::label[text()='密码']]")).sendKeys("admin123",Keys.ENTER);
		wa.waitFor(20000);
	}
	
	
	
	@AfterClass
	public void backToHome(){
		driver.quit();
	}
	
	

}
