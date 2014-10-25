package pages;


import java.util.List;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;




public class RegisterPage {

	private WebDriver driver;
	
	
	@FindBy(xpath = "//input[@id='regName']")
	private WebElement accountname;
	
	@FindBys(@FindBy(xpath = "//input[@id='pwd']|//input[@id='pwdRepeat']"))
	private List<WebElement> passwds;
	
	@FindBy(xpath="//input[@id='registsubmit']")
	private WebElement submit;
	
	
	public RegisterPage(WebDriver driver){
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	

	public void register(String username,String password){
		accountname.sendKeys(username);
		for(WebElement passwd:passwds){
        	passwd.sendKeys(password);
        }
		submit.click();		
		
	}

    public WebElement getWebElement(String var,String ...param){	     
		     return driver.findElement(By.xpath(String.format(var, param)));
	   }
	

	
}
