package practiceone.homework;

import org.openqa.selenium.By;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;

public class SendBox extends Suite{
	
	
	
	@Test
	public void checkSendBox(){
		driver.findElement(By.xpath("//span[text()='�ѷ���']")).click();
	}
	
	
	@AfterClass
	public void backToHome(){
		driver.findElement(By.xpath("//div[text()='��ҳ']")).click();
	}
}
