package generic;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;

public abstract class BasePage {
	
	public WebDriver driver;
	
	public BasePage(WebDriver driver){
		
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	
	public void verifyTitle(String etitle){
		
		WebDriverWait wait=new WebDriverWait(driver,10);
		
		
		try{
			
			wait.until(ExpectedConditions.titleIs(etitle));
			
			Reporter.log("Title is matching",true);
		}
		
		catch(Exception e){
			
			Reporter.log("Reporter is not matching",true);
			Assert.fail();
		}
		
		
		
		
	}

	
	
}
