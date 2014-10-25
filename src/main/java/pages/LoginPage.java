package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	private WebDriver driver;
		
	    
	@FindBy(xpath = "//input[@name='loginname']")
	public WebElement loginname;
	
	@FindBy(xpath = "//input[@name='nloginpwd']")
	public WebElement password;
	
	
	
	
	public LoginPage(WebDriver driver){
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
}
