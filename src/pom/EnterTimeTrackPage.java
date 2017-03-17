package pom;

import generic.BasePage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class EnterTimeTrackPage extends BasePage{
	
	@FindBy(xpath="//a[contains(.,'Logout')]")
	
	private WebElement LogoutLink;
	
	public EnterTimeTrackPage(WebDriver driver){
		
		super(driver);
		
	}
			
	public void clickLogout(){
		
		LogoutLink.click();
		
	}

}
