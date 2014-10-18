package practiceone.homework;

import org.openqa.selenium.By;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;

public class SendBox extends Suite{
	
	
	
	@Test
	public void checkSendBox(){
		driver.findElement(By.xpath("//span[text()='ÒÑ·¢ËÍ']")).click();
	}
	
	
	@AfterClass
	public void backToHome(){
		driver.findElement(By.xpath("//div[text()='Ê×Ò³']")).click();
	}
}
