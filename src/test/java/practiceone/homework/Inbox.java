package practiceone.homework;

import org.openqa.selenium.By;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;




public class Inbox extends TestSuite{

	
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
	
	
}
