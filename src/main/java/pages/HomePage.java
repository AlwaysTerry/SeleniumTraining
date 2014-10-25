package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class HomePage {

    private WebDriver driver;
	
    
	@FindBy(xpath = "//a[contains(text(),'���ע��')]")
	public WebElement reg;
	
	@FindBy(xpath = "//a[text()='��ҳ']")
	public WebElement main;
	
	
	@FindBy(xpath = "//a[contains(text(),'��¼')]")
	public WebElement login;
	
	public String username = "//li[contains(text(),'%1$s����ӭ����������')]";
	
	
	
	public HomePage(WebDriver driver){
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	
	
	public void navigateToJD(String url){
		driver.get(url);
	}
	
	
	
   public WebElement getWebElement(String var,String ...param){	     
	     return driver.findElement(By.xpath(String.format(var, param)));
   }

	
	
	
	
	
	
	
}
