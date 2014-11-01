package practiceeight;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import utils.Browsers;
import utils.BrowsersType;
import utils.Switch;
import utils.TestLinkAPIObject;
import utils.Wait;


public class TestTestLink {
	
	
	    //testlink parameters
	    private String url;
	    private String devKey;
	    private String projectName;
	    private String tl;
	    private String buildName;
	    private String platform;
	    private TestLinkAPIObject testlinkapi;
	    
	    private String caseName;
	    private StringBuffer caseID;
	    
		
		@Parameters({"url","devkey","project","plan","build","platform"})
		@BeforeClass
		public void startFirefox(@Optional("aaa") String url,String devkey,String project,String plan,String build,String platform){
			this.url = url;
	    	this.devKey = devkey;
	    	this.projectName = project;
	    	this.tl = plan;
	    	this.buildName = build;
	    	this.platform = platform;
	    	
	    	testlinkapi = new TestLinkAPIObject(url,devKey,projectName,tl,buildName,platform);
	    	
	    	
		}
		
		
		@Test
		public void login126DotCom(){
			//caseName = "case1";
		    caseID=new StringBuffer("case1");
		    Assert.assertEquals(false, true);
		}
		
		
		
		@Test
		public void loginislibDotCom(){
			//caseName = "case3";
			caseID=new StringBuffer("case3");
			Assert.assertEquals(true, true);
			
		}
		
		

		
		@AfterMethod
		public void import2TestLink(ITestResult result) throws Exception {  	
	    	testlinkapi.getAPI();
	    	testlinkapi.getTestCases();
	    	testlinkapi.executeTestCase(caseID.toString(),result.getStatus(),"");
		}
		
		@AfterClass
		public void end(){
			
		}
		
		
}
