package pom;

import generic.BasePage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.asserts.SoftAssert;

public class LoginPage extends BasePage{

	@FindBy(name="username")
	
	private WebElement unTB;

	@FindBy(name="pwd")
	
	private WebElement pwTB;
	
	@FindBy(id="loginButton")
	
	private WebElement loginBtn;
	
	@FindBy(xpath="//nobr[contains(.,'v.')]")
	
	private WebElement version;
	
	@FindBy(xpath="//span[contains(.,'invalid')]")
	
	private WebElement errMsg;
	
	public LoginPage(WebDriver driver){
		
		super(driver);
	
	}
	
	public void setUN(String un){
		
		unTB.sendKeys(un);
		
	
	}
	
	public void setPW(String pw){
		
		pwTB.sendKeys(pw);
	}
	
	public void clickLogin(){
		
		loginBtn.click();


	}
	
	
	public void verifyVersion(String eVersion){
		
		String aVersion=version.getText();
		
		Assert.assertEquals(aVersion,eVersion);
		
		
	}
	
	public void verifyErrMsg(SoftAssert s){
		
		WebDriverWait wait=new WebDriverWait(driver,10);
		
		try{
			
			wait.until(ExpectedConditions.visibilityOf(errMsg));
			
			Reporter.log("Error msg is dispalyed",true);
			
		}
		
		catch(Exception e){
			
			Reporter.log("Error msg is not displayed",true);
			s.fail();
		}
		
	}
}
